package com.company;

public class Client {
    int id;
    String name;
    String petName;

    Client(int id, String name, String petName) {
        this.id = id;
        this.name = name;
        this.petName = petName;
    }

    public void changeName(String name) {
        this.name = name;
    }

    public void changePetName(String petName) {
        this.petName = petName;
    }
}
