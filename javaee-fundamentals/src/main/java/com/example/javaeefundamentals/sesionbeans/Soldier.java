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

import javax.ejb.Stateless;
import java.text.MessageFormat;

@Stateless
@ServiceMan(value = ServiceMan.ServiceType.SOLDIER)
@com.example.javaeefundamentals.annotations.Soldier
public class Soldier implements Salute {

    @Override
    public String salute(String name) {
        return MessageFormat.format("Aye Aye Capt {0}", name);
    }

}
