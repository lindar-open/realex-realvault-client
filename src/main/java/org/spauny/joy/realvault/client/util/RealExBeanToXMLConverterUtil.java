package org.spauny.joy.realvault.client.util;

import com.google.common.base.Strings;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Node;
import org.spauny.joy.realvault.client.annotations.TagAttribute;
import org.spauny.joy.realvault.client.annotations.TagName;
import org.spauny.joy.realvault.client.annotations.TagValue;
import org.spauny.joy.realvault.client.model.internal.RealExBean;
import org.spauny.joy.realvault.client.model.response.RealExResponse;

public class RealExBeanToXMLConverterUtil {

    public static String toXML(RealExBean bean) throws Exception {
        //return toXML_V_2(bean);
        Document document = DocumentHelper.createDocument();
        //Element root = document.addElement( getClassAnnotationValue(bean.getClass(), TagName.class, "name") );
        document.add(getElementFromBean(bean));
        String retVal = document.asXML();
        return retVal;
    }

    private static Element getElementFromBean(Object obj) throws Exception {
        Element ele = DocumentHelper.createElement(getClassAnnotationValue(obj.getClass(), TagName.class, "name"));
        for (Field f : getFields(obj.getClass())) {
            f.setAccessible(true);

            if (f.isAnnotationPresent(TagAttribute.class) && f.get(obj) != null) {

                ele.addAttribute(getFieldAnnotationValue(f, TagAttribute.class, "name"), Strings.nullToEmpty((String) f.get(obj)).toString());
            } else if (f.get(obj) instanceof RealExBean && f.isAnnotationPresent(TagValue.class)) {

                if (f.get(obj) != null) {
                    ele.add(getElementFromBean(f.get(obj)));
                }
            } else if (f.get(obj) instanceof List && f.isAnnotationPresent(TagName.class) && f.get(obj) != null && ((List) f.get(obj)).get(0).getClass().isAssignableFrom(RealExBean.class)) {
                for (Object ob : (List) f.get(obj)) {
                    if (ob != null) {
                        ele.add(getElementFromBean(ob));
                    }
                }

            } else if (f.get(obj) instanceof List && f.isAnnotationPresent(TagName.class) && f.get(obj) != null && !((List) f.get(obj)).get(0).getClass().isAssignableFrom(RealExBean.class)) {
                if (getFieldAnnotationValue(f, TagName.class, "isSuffixIncremental") != null && !getFieldAnnotationValue(f, TagName.class, "isSuffixIncremental").equals("not-incremental")) {

                    int count = 1;
                    for (Object ob : (List) f.get(obj)) {
                        if (ob != null) {
                            ele.add(DocumentHelper.createElement(getFieldAnnotationValue(f, TagName.class, "name") + getFormattedNumber(count)).addText(Strings.nullToEmpty(f.get(ob).toString()).toString()));
                        }

                        count++;
                    }

                }

            } else if (f.get(obj) instanceof Map && f.isAnnotationPresent(TagValue.class)) {

                for (String ob : ((Map<String, String>) f.get(obj)).keySet()) {
                    if (ob != null) {
                        ele.add(DocumentHelper.createElement(ob).addText(((Map<String, String>) f.get(obj)).get(ob)));
                    }
                }

            } else if (f.isAnnotationPresent(TagName.class) && f.get(obj) != null && !f.get(obj).getClass().isAssignableFrom(RealExBean.class)) {

                ele.add(DocumentHelper.createElement(getFieldAnnotationValue(f, TagName.class, "name")).addText(Strings.nullToEmpty((String) f.get(obj)).toString()));
            } else if (!f.isAnnotationPresent(TagName.class) && !f.isAnnotationPresent(TagAttribute.class) && !f.isAnnotationPresent(TagValue.class) && !f.get(obj).getClass().isAssignableFrom(RealExBean.class) && f.get(obj) != null) {
                ele.addText(((!Strings.nullToEmpty(ele.getText()).isEmpty()) ? ele.getText() + ";" : "") + Strings.nullToEmpty((String) f.get(obj)).toString());
            }
        }
        return ele;
    }

    private static Field getField(Class clazz, String fieldName)
            throws NoSuchFieldException {
        try {
            return clazz.getDeclaredField(fieldName);
        } catch (NoSuchFieldException e) {
            Class superClass = clazz.getSuperclass();
            if (superClass == null) {
                throw e;
            } else {
                return getField(superClass, fieldName);
            }
        }
    }

    private static Field[] getFields(Class clazz)
            throws Exception {
        return clazz.getDeclaredFields();
    }

    private static String getClassAnnotationValue(Class classType, Class annotationType, String attributeName) {
        String value = null;

        Annotation annotation = classType.getAnnotation(annotationType);
        if (annotation != null) {
            try {
                value = (String) annotation.annotationType().getMethod(attributeName).invoke(annotation);
            } catch (Exception ex) {
            }
        }

        return value;
    }

    private static String getFieldAnnotationValue(Field f, Class annotationType, String attributeName) {
        String value = null;

        Annotation annotation = f.getAnnotation(annotationType);
        if (annotation != null) {
            try {
                value = (String) annotation.annotationType().getMethod(attributeName).invoke(annotation);
            } catch (Exception ex) {
            }
        }

        return value;
    }

    public static RealExResponse toResponseBean(String xml) throws Exception {
        RealExResponse retVal = null;
        Document document = DocumentHelper.parseText(xml);
        Node response = document.selectSingleNode("/response");
        if (response != null) {
            String timestamp = (document.selectSingleNode("/response") != null) ? document.selectSingleNode("/response").valueOf("@timestamp") : null;
            String merchantId = (document.selectSingleNode("/response/merchantid") != null) ? document.selectSingleNode("/response/merchantid").getText() : null;
            String account = (document.selectSingleNode("/response/account") != null) ? document.selectSingleNode("/response/account").getText() : null;
            String orderId = (document.selectSingleNode("/response/orderid") != null) ? document.selectSingleNode("/response/orderid").getText() : null;
            String result = (document.selectSingleNode("/response/result") != null) ? document.selectSingleNode("/response/result").getText() : null;
            String message = (document.selectSingleNode("/response/message") != null) ? document.selectSingleNode("/response/message").getText() : null;
            String pasref = (document.selectSingleNode("/response/pasref") != null) ? document.selectSingleNode("/response/pasref").getText() : null;
            String authcode = (document.selectSingleNode("/response/authcode") != null) ? document.selectSingleNode("/response/authcode").getText() : null;
            String batchId = (document.selectSingleNode("/response/batchid") != null) ? document.selectSingleNode("/response/batchid").getText() : null;
            String timetaken = (document.selectSingleNode("/response/timetaken") != null) ? document.selectSingleNode("/response/timetaken").getText() : null;
            String processingtimetaken = (document.selectSingleNode("/response/processingtimetaken") != null) ? document.selectSingleNode("/response/processingtimetaken").getText() : null;
            String md5hash = (document.selectSingleNode("/response/md5hash") != null) ? document.selectSingleNode("/response/md5hash").getText() : null;
            String sha1hash = (document.selectSingleNode("/response/sha1hash") != null) ? document.selectSingleNode("/response/sha1hash").getText() : null;

            retVal = new RealExResponse(timestamp, merchantId, account, orderId, result, message, pasref, authcode, batchId, timetaken, processingtimetaken, md5hash, sha1hash);
        }

        return retVal;
    }

    private static String getFormattedNumber(int num) {
        return (num < 10) ? "0" + num : "" + num;
    }

    private RealExBeanToXMLConverterUtil() {
    }

}
