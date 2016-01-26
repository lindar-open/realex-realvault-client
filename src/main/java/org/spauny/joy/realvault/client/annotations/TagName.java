package org.spauny.joy.realvault.client.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.TYPE,ElementType.FIELD})
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface TagName {
	public String name(); 
	public String isSuffixIncremental() default "not-incremental"; 
}
