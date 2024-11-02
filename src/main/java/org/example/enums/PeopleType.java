package org.example.enums;

public enum PeopleType {
    KID("kid"), ADULT("Adult"), OLDER("Older");
    private final String name;

    private PeopleType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
