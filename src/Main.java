public class Main {
    public static void main(String[] args) {
        task3();
    }

    public static void isTheYearALeapYear (int newLeapYear) {
        if ((newLeapYear % 4 == 0) && (newLeapYear % 100 != 0) || (newLeapYear % 400 == 0)) {
            System.out.println(newLeapYear + " год является високосным");
        } else {
            System.out.println(newLeapYear + " год является не високосным");
        }
    }

    public static void task1() {
        int newLeapYear = 2020;
        isTheYearALeapYear (newLeapYear);
    }

    public static void checkTheVersion(int newClientOS) {
        if (newClientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (newClientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

    }

    public static void task2() {
        int clientOS = 0;
        int currentYear = 2023;
        if ((clientOS == 1) && (currentYear < 2022)) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            if ((clientOS == 0) && (currentYear < 2022)) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                checkTheVersion(clientOS);
            }
        }
    }

    public static void checkTheDistance() {
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
        checkTheDistance();
    }
}
