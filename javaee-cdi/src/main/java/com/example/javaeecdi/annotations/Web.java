package com.example.javaeecdi.annotations;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Stereotype;
import javax.inject.Named;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author ${data.author}
 * @version ${data.version}
 * @project ${data.project}
 * @package ${data.packageValue}
 * @date ${data.date}
 * <p>
 * @description:
 */
@Stereotype
@RequestScoped
@Named
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Web {
}
