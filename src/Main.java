public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientDeviceYear = 2016;
        int clientOS = 0;
        if (clientOS == 0) {
            if (clientDeviceYear > 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear > 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 2025;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является высокосным ");
        } else {
            System.out.println(year + " год является не высокосным");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 19;
        int deliveryDays = 1;
        if (deliveryDistance<=20) {
            System.out.println("Потребуется дней : " + deliveryDays);
        }
         else if (deliveryDistance > 20 && deliveryDistance<=60 ) {
            System.out.println("Потребуется дней : " + (deliveryDays+1));
        }
        else if (deliveryDistance > 60 && deliveryDistance<=100) {
            System.out.println("Потребуется дней : " + (deliveryDays+2));
        }
        else  {
            System.out.println("доставки нет");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 6;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("принадлежит к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("принадлежит к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("принадлежит к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("принадлежит к сезону осень");
                break;
            default:
                System.out.println("Такого месяца не сущетсвует");
        }
    }
}
