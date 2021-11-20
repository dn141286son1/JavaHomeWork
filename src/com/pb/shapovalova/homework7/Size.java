package com.pb.shapovalova.homework7;

import jdk.nashorn.internal.ir.CaseNode;

enum Size {
    XXS("Детский размер", 32),
    XS( 34),
    S( 36),
    M( 38),
    L( 40);

    private String description;
    private int euroSize;

    Size(String description, int euroSize) {
        this.description = description;
        this.euroSize = euroSize;
    }

    Size(int euroSize) {
        this.description = "Взрослый размер";
        this.euroSize = euroSize;
    }

    public String getDescription() {
        return description;
    }

    public int getEuroSize() {
        return euroSize;
    }
}