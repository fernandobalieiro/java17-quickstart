package org.acme.sealed;

public sealed class Animal permits Dog, Cat, Bird {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
