package SecondTask;

import java.util.ArrayList;
import java.util.Comparator;

/* Решение задания V из ClassesBlock */
public class TaskV {
    static class Client {
        int id;
        String surname;
        String name;
        String patronymic;
        String address;
        int numberOfCreditCard;
        int debet;
        int credit;
        int timeIntercity;
        int timeCity;

        public Client(int id, String surname, String name, String patronymic, String address, int numberOfCreditCard,
                      int debet, int credit, int timeIntercity, int timeCity) {
            this.id = id;
            this.surname = surname;
            this.name = name;
            this.patronymic = patronymic;
            this.address = address;
            this.numberOfCreditCard = numberOfCreditCard;
            this.debet = debet;
            this.credit = credit;
            this.timeIntercity = timeIntercity;
            this.timeCity = timeCity;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPatronymic() {
            return patronymic;
        }

        public void setPatronymic(String patronymic) {
            this.patronymic = patronymic;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public int getNumberOfCreditCard() {
            return numberOfCreditCard;
        }

        public void setNumberOfCreditCard(int numberOfCreditCard) {
            this.numberOfCreditCard = numberOfCreditCard;
        }

        public int getDebet() {
            return debet;
        }

        public void setDebet(int debet) {
            this.debet = debet;
        }

        public int getCredit() {
            return credit;
        }

        public void setCredit(int credit) {
            this.credit = credit;
        }

        public int getTimeIntercity() {
            return timeIntercity;
        }

        public void setTimeIntercity(int timeIntercity) {
            this.timeIntercity = timeIntercity;
        }

        public int getTimeCity() {
            return timeCity;
        }

        public void setTimeCity(int timeCity) {
            this.timeCity = timeCity;
        }

        public void showInfo() {
            System.out.println(this.surname + " " + this.name + " " + this.patronymic + " " + this.id + " "
                    + this.address + " " + this.debet + " " + this.credit + " " + this.numberOfCreditCard + " "
                    + this.timeCity + " " + this.timeIntercity);
        }
    }

    public static void task1(ArrayList<Client> clientList, int value) {
        for (Client client : clientList) {
            if (client.timeCity >= value) {
                client.showInfo();
            }
        }
    }

    public static void task2(ArrayList<Client> clientList) {
        for (Client client : clientList) {
            if (client.timeIntercity > 0) {
                client.showInfo();
            }
        }
    }

    static class ClientComparator implements Comparator<Client> {

        @Override
        public int compare(Client o1, Client o2) {
            return o1.getSurname().compareTo(o2.getSurname());
        }
    }

    public static void task3(ArrayList<Client> clientList) {
        Comparator<Client> comp = new ClientComparator();
        clientList.sort(comp);
        for (Client client : clientList) {
            client.showInfo();
        }
    }

    public static void start() {
        ArrayList<Client> clientList = new ArrayList<>();
        clientList.add(new Client(1, "Иванов", "Иван", "Иванович", "Ульяновск",
                1, 100, 100, 0, 20));
        clientList.add(new Client(2, "Петров", "Иван", "Иванович", "Ульяновск",
                2, 180, 200, 100, 120));
        clientList.add(new Client(3, "Сидоров", "Иван", "Иванович", "Москва",
                3, 10, 300, 30, 60));
        clientList.add(new Client(4, "Долгов", "Иван", "Иванович", "Пенза",
                4, 110, 140, 0, 70));
        clientList.add(new Client(5, "Рыбкин", "Иван", "Иванович", "Самара",
                5, 102, 170, 10, 220));
        System.out.println("Время городских переговоров превышает заданное");
        TaskV.task1(clientList, 100);
        System.out.println("Абоненты, которые пользовались междугородней связью");
        TaskV.task2(clientList);
        System.out.println("Абоненты в алфавитном порядке");
        TaskV.task3(clientList);
    }
}
