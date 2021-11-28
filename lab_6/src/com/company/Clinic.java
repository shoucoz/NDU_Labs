package com.company;
import java.util.*;

public class Clinic {
    List<Client> clientList = new ArrayList();

    public void addClient (Client client) {
        this.clientList.add(client);
    }

    public Client findClientByName(String name) {
        Client result = null;
        for (int i = 0; i < clientList.size(); i++) {
            if(name == clientList.get(i).name) {
                result = clientList.get(i);
            }
        }
        if (result == null) {
            System.out.print("No such pet or client" + "\n");
        }

        return result;
    }

    public Client findPetByName(String petName) {
        Client result = null;
        for (int i = 0; i < clientList.size(); i++) {
            if(petName == clientList.get(i).petName) {
                result = clientList.get(i);
            }
        }
        if (result == null) {
            System.out.print("No such pet or client" + "\n");
        }

        return result;
    }

    public String findClientByPetName (String petName) {
        String result = null;
        Client client = this.findPetByName(petName);
        if (client != null) {
            result = client.name;
        }

        return result;
    }

    public String findPetByClientName (String clientName) {
        String result = null;
        Client client = this.findClientByName(clientName);
        if (client != null) {
            result = client.petName;
        }

        return result;
    }

    public Client changeClientName (String clientName, String newName) {
        Client client = this.findClientByName(clientName);
        client.changeName(newName);

        return client;
    }

    public Client changePetName (String petName, String newPetName) {
        Client client = this.findPetByName(petName);
        client.changePetName(newPetName);

        return client;
    }
}
