package com.example.javaeefundamentals.scopes;

/**
 * @author saozdemir
 * @project javaeeworkspace
 * @date 23 Apr 2024
 * <p>
 * @description:
 */
import javax.enterprise.context.RequestScoped;

@RequestScoped
public class RequestScope {


    public String getHashCode() {

        return this.hashCode() + " ";
    }


}
