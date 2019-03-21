package com.zipcodewilmington.preassessment2;

public enum AliceBobEnum {
    ALICE("Alice"), BOB("Bob"),
    ;

    private final String name;

    AliceBobEnum(String name) {
        this.name = name;
    }

    public String getCatchPhrase() {
        return "Hey, my name is " + name.toUpperCase()+ "!";
    }

    public boolean isAlice() {
        return this.name.equalsIgnoreCase(ALICE.name);
    }

    public boolean isBob() {
        return this.name.equalsIgnoreCase(BOB.name);
    }
}
