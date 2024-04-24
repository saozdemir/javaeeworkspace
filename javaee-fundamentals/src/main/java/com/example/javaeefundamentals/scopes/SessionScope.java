package com.example.javaeefundamentals.scopes;

/**
 * @author saozdemir
 * @project javaeeworkspace
 * @date 23 Apr 2024
 * <p>
 * @description: Her HTTP oturumunda yeni bir bean nesnesi oluşur ve oturum sonlandığında sonlanır.
 */
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

@SessionScoped
public class SessionScope implements Serializable {
    private static final long serialVersionUID = 440804699990999L;

    public String getHashCode() {
        return this.hashCode() + " ";
    }
}
