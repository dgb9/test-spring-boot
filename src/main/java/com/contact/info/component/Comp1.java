package com.contact.info.component;

import org.springframework.stereotype.Component;

@Component
public class Comp1 {
    private String info;

    public Comp1() {
        setInfo("starter value");
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
