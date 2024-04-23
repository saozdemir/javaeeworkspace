package com.example.javaeefundamentals.sesionbeans;

/**
 * @author saozdemir
 * @project javaeeworkspace
 * @date 23 Apr 2024
 * <p>
 * @description:
 */
import com.example.javaeefundamentals.annotations.ServiceMan;
import com.example.javaeefundamentals.interfaces.Salute;

import javax.ejb.Stateful;
import java.io.Serializable;
import java.text.MessageFormat;

@Stateful
@ServiceMan(value = ServiceMan.ServiceType.POLICE)
@com.example.javaeefundamentals.annotations.Police
public class Police implements Salute, Serializable {
    @Override
    public String salute(String name) {
        return MessageFormat.format("Yes sir! {0}", name);
    }
}
