package com.zipcodewilmington.preassessment2;

public class AliceBobEvaluator {
    String name;
    public AliceBobEvaluator(String name) {
        this.name = name;

    }

    public boolean isAlice() {
        return name.equalsIgnoreCase(AliceBobEnum.ALICE.name());
    }

    public boolean isBob() {
        return name.equalsIgnoreCase(AliceBobEnum.BOB.name());
    }
}
