package com.pedroacbg.rest.webservices.restfulwebservices.filtering;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonIgnoreProperties({"field1", "field2"})
public class SomeBean {

    private String field1;

    @JsonIgnore
    private String filed2;

    private String field3;

    public SomeBean(String field1, String filed2, String field3) {
        this.field1 = field1;
        this.filed2 = filed2;
        this.field3 = field3;
    }

    public String getField1() {
        return field1;
    }

    public String getFiled2() {
        return filed2;
    }

    public String getField3() {
        return field3;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SomeBean{");
        sb.append("field1='").append(field1).append('\'');
        sb.append(", filed2='").append(filed2).append('\'');
        sb.append(", field3='").append(field3).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
