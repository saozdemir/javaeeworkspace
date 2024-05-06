package com.example.javaeefundamentals.sesionbeans;

/**
 * @author saozdemir
 * @project javaeeworkspace
 * @date 23 Apr 2024
 * <p>
 * @description:
 */
import com.example.javaeefundamentals.annotations.Logged;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.logging.Level;
import java.util.logging.Logger;

@Stateless
public class AuditedService {

    @Inject
    private Logger logger;

    @PostConstruct
    private void init() {

    }

    //Bu yöntem yalnızca Kayıtlı Durdurucu geri döndükten sonra çağrılacaktır, yani InvokasyonContext#proceed
    //Bu açıklama aynı zamanda sınıfa da yerleştirilebilir ve sınıfın her yönteminin ele geçirilmesi sağlanır.
    @Logged
    public void auditedMethod() {
        logger.log(Level.INFO, "OK so we are able to call this method after auditing took place");
    }
}