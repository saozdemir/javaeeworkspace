package com.example.javaeefundamentals.annotations;

import javax.enterprise.inject.Stereotype;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
/**
 * @author saozdemir
 * @project javaeeworkspace
 * @date 23 Apr 2024
 * <p>
 * @description: Bir anotasyon grubu oluşturuldu. Her sınıf öncesinde tek tek tanımlama yerine @Web anotasyonu ile standart hale getirildi.
 */


@Stereotype
@RequestScoped
@Named
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Web {
}
