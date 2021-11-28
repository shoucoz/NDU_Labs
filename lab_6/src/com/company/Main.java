package com.company;

public class Main {

    public static void main(String[] args) {
        Clinic clinic = new Clinic();
        clinic.addClient(new Client(1, "Surname1", "Dog1"));
        clinic.addClient(new Client(2, "Surname2", "Dog2"));
        clinic.addClient(new Client(3, "Surname3", "Dog3"));
        clinic.addClient(new Client(4, "Surname4", "Dog4"));
        clinic.addClient(new Client(5, "Surname5", "Dog5"));

        String client = clinic.findClientByPetName("Dog1");
        System.out.print(client);
        System.out.print(" - Результат поиска клиента по имени питомца;" + "\n");

        String petName = clinic.findPetByClientName("Surname2");
        System.out.print(petName);
        System.out.print(" - Результат поиска имени питомца по имени клиента;"  + "\n");

        String invalidName = clinic.findPetByClientName("Surname212");
        System.out.print(invalidName);
        System.out.print(
          " - Результат поиска имени питомца по имени клиента. " +
          "Введено невалидное значение. Выше должна отображаться ошибка"  + "\n"
        );

        Client changedClient = clinic.changeClientName("Surname1", "Surname100");
        System.out.print(changedClient.name);
        System.out.print(" - Имя клиента после изменений. Должно быть Surname100;" + "\n");

        Client ChangedPet = clinic.changePetName("Dog4", "Dog400");
        System.out.print(ChangedPet.petName);
        System.out.print(" - Имя питомцп после изменений. Должно быть Dog400;");
    }
}
