package com.example.javaeefundamentals.scopes;

/**
 * @author saozdemir
 * @project javaeeworkspace
 * @date 23 Apr 2024
 * <p>
 * @description: Tüm uygulama boyunce bir tek bean nesnesi oluşturur.
 */
import javax.enterprise.context.ApplicationScoped;
import java.io.Serializable;

@ApplicationScoped
public class ApplicationScope implements Serializable {

    private static final long serialVersionUID = 27080464521478L;

    public String getHashCode() {
        return this.hashCode() + " ";
    }
}
