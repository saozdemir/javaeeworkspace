package com.example.javaeefundamentals.annotations;

import javax.inject.Qualifier;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * @author saozdemir
 * @project javaeeworkspace
 * @date 23 Apr 2024
 * <p>
 * @description: @Police ve @Soldier anotasyonlarını tek tek kullanmak yerine bir enum içerisine tanımlama yapılarak kullanıldı.
 */

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE, ElementType.METHOD})
public @interface ServiceMan {

    ServiceType value();

    public enum ServiceType{
        SOLDIER, POLICE
    }
}
