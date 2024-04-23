package com.example.javaeecdi.scopes;

import javax.enterprise.context.RequestScoped;


@RequestScoped
public class RequestScope {

    public String getHashCode() {
        return this.getHashCode() + " ";
    }
}