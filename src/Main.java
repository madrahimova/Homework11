import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void printIsLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2021;

        printIsLeapYear(year);
    }

    public static void printAppVersion(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();

        if (clientOS == 0) {
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static void task2() {
        System.out.println("Задача 2");

        int clientOS = 0;
        int clientDeviceYear = 2015;

        printAppVersion(clientOS, clientDeviceYear);
    }

    public static int getDeliveryDays(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance <= 100) {
            return 3;
        } else {
            return -1;
        }
    }

    public static void task3() {
        System.out.println("Задача 3");

        int deliveryDistance = 95;
        int deliveryDays = getDeliveryDays(deliveryDistance);

        if (deliveryDays == -1) {
            System.out.println("Нет доставки");
        } else {
            System.out.println("Потребуется дней: " + deliveryDays);
        }
    }
}