package com.company;

public abstract class Pet {

    private String myName;

    public Pet(String myName)
    {
        this.myName = myName;
    }

    public String getMyName() {
        return myName;
    }

    public abstract String speak();
}
