package com.contact.info.controller;

import com.contact.info.component.Comp1;
import com.contact.info.data.RespData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class Start {

    private Comp1 comp1;

    @Autowired
    public void setComp1(Comp1 comp1) {
        this.comp1 = comp1;
    }

    @RequestMapping(path="/", method = RequestMethod.GET)
    public String getRootResource() {
        comp1.setInfo(comp1.getInfo() + "|");
        return "welcome to our service: " + comp1.getInfo();
    }

    @RequestMapping(path="/info1", method = RequestMethod.GET)
    public String getInfo(@RequestParam String query1, @RequestParam(required = false) String query2) {
        return "this is getinfo: query1=" + query1 + ", and query2 = " + query2;
    }

    @RequestMapping(method = RequestMethod.GET, path="/info2/{id1}/another")
    public String getUrl(@PathVariable String id1) {
        return "info2: " + id1;
    }

    @RequestMapping(method = RequestMethod.GET, path="/info3")
    public String getList(@RequestParam(name = "id", required = false) List<String> ids) {
        return "items:  " + ids;
    }

    @RequestMapping(method = RequestMethod.GET, path="/info4", produces = "application/json")
    public RespData getAllItems() {
        return new RespData("value for first", "second1", Arrays.asList("item1", "item2", "item3"));
    }
}
