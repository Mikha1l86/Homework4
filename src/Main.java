public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");

        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }

        //Задача 2
        System.out.println("Задача 2");

        clientOS = 1;
        int clientDeviceYear = 2014;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }

        //Задача 3
        System.out.println("Задача 3");

        int year = 2021;
        if (year > 1584 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            System.out.println(year + " год является высокосным.");
        } else {
            System.out.println(year + " год не является высокосным");
        }

        //Задача 4
        System.out.println("Задача 4");

        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Для доставки карты потребуется: 1 день.");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Для доставки карты потребуется: 2 дня.");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Для доставки карты потребуется: 3 дня.");
        } else {
            System.out.println("Доставки нет!");
        }

        //Задача 5
        System.out.println("Задача 5");

        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Время года зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Время года весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Время года лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Время года осень.");
                break;
            default:
                System.out.println("Неверный номер месяца.");
        }
    }
}
