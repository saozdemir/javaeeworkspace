package com.example.javaeefundamentals.scopes;

/**
 * @author saozdemir
 * @project javaeeworkspace
 * @date 23 Apr 2024
 * <p>
 * @description: Inject edildiği bean scope tanımlamasına bağımlıdır. Herhangi bir anotasyon kullanılmazsa default olarak gelir.
 */
import java.io.Serializable;

public class DependentScope implements Serializable {

    public String getHashCode() {
        return this.hashCode() + " ";
    }
}
