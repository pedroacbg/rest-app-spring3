package com.pedroacbg.rest.webservices.restfulwebservices.versioning;

public class PersonV2 {

    private Name name;

    public PersonV2(Name name) {
        this.name = name;
    }

    public Name getName() {
        return name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonV2{");
        sb.append("name=").append(name);
        sb.append('}');
        return sb.toString();
    }
}
