package com.pb.shapovalova.homework7;

import jdk.nashorn.internal.ir.CaseNode;

public enum Size {

    XXS,
    XS,
    S,
    M,
    L;

    String description;
    int euroSize;

    Size(String description, int euroSize) {
        this.description = description;
        this.euroSize = euroSize;
    }

    public void getDescription () {
        switch () {
            case XS:
            case S:
            case M:
            case L:
                System.out.println("Взрослый размер");
                break;
            case XXS:
                System.out.println("Детский размер");
                break;
        }
    }

    public void getEuroSize () {
        switch () {
            case XXS:
                System.out.println("32");
                break;
            case XS:
                System.out.println("34");
                break;
            case S:
                System.out.println("36");
                break;
            case M:
                System.out.println("38");
                break;
            case L:
                System.out.println("40");
                break;
        }
    }
}
