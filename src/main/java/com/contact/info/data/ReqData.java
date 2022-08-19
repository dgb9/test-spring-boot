package com.contact.info.data;

import java.util.List;

public class ReqData {
    private String val1;
    private String val2;

    private List<Integer> ids;
    private List<String> vals;

    public ReqData() {
    }

    public String getVal1() {
        return val1;
    }

    public void setVal1(String val1) {
        this.val1 = val1;
    }

    public String getVal2() {
        return val2;
    }

    public void setVal2(String val2) {
        this.val2 = val2;
    }

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    public List<String> getVals() {
        return vals;
    }

    public void setVals(List<String> vals) {
        this.vals = vals;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ReqData{");
        sb.append("val1='").append(val1).append('\'');
        sb.append(", val2='").append(val2).append('\'');
        sb.append(", ids=").append(ids);
        sb.append(", vals=").append(vals);
        sb.append('}');
        return sb.toString();
    }
}
