package com.pedroacbg.rest.webservices.restfulwebservices.filtering;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonIgnoreProperties({"field1", "field2"})
@JsonFilter("SomeBeanFilter")
public class SomeBean {

    private String field1;

    //@JsonIgnore
    private String field2;

    private String field3;

    public SomeBean(String field1, String field2, String field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    public String getField1() {
        return field1;
    }

    public String getField2() {
        return field2;
    }

    public String getField3() {
        return field3;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SomeBean{");
        sb.append("field1='").append(field1).append('\'');
        sb.append(", field2='").append(field2).append('\'');
        sb.append(", field3='").append(field3).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
