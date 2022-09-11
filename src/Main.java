public class Main {
    public static void main(String[] args) {
        task3();
    }

    public static void Year(int newYear) {
        if ((newYear % 4 == 0) && (newYear % 100 != 0) || (newYear % 400 == 0)) {
            System.out.println(newYear + " год является високосным");
        } else {
            System.out.println(newYear + " год является не високосным");
        }
    }

    public static void task1() {
        int year = 2020;
        Year(year);
    }

    public static void ClientOS(int newClientOS) {
        if (newClientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (newClientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

    }

    public static void task2() {
        int ClientOS = 0;
        int currentYear = 2023;
        if ((ClientOS == 1) && (currentYear < 2022)) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            if ((ClientOS == 0) && (currentYear < 2022)) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                ClientOS(ClientOS);
            }
        }
    }

    public static void deliveryDistance() {
        int newDeliveryDistance = 20;
        int newDeliveryDiaes = 1;
        if (newDeliveryDistance > 20) {
            newDeliveryDiaes++;
        }
        if (newDeliveryDistance > 60) {
            newDeliveryDiaes++;
        }
        System.out.println("Потребуется дней " + newDeliveryDiaes);
    }
    public static void task3 () {
        deliveryDistance();
    }
}
