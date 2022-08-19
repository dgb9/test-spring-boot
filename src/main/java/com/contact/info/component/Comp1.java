package com.contact.info.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Comp1 {
    private String info;

    @Value("${info.alfa}")
    private String alfa;

    public Comp1() {
        setInfo("starter value");
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getAlfa() {
        return alfa;
    }
}
