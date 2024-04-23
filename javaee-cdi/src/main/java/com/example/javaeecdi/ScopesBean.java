package com.example.javaeecdi;

import com.example.javaeecdi.annotations.Web;
import com.example.javaeecdi.scopes.RequestScope;

import javax.inject.Inject;
import java.io.Serializable;

@Web //Container
public class ScopesBean implements Serializable {

    @Inject
    private RequestScope requestScope;

}