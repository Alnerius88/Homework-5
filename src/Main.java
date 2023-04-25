public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        System.out.println("Глокая куздра достала глок.");
    }
    public static void task1 (){
        System.out.println("Задача 1");
        int clientOS = 1;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Неизвестная оперативная система.");
        }
    }
    public static void task2 (){
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2015;
        boolean androidLite = (clientOS == 1 && clientDeviceYear < 2015);
        boolean iOSLite = (clientOS == 0 && clientDeviceYear < 2015);
        boolean iOSUsual = (clientOS == 0 && clientDeviceYear >= 2015);
        boolean androidUsual = (clientOS == 1 && clientDeviceYear >= 2015);
        if (androidLite) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        else if (iOSLite) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if (iOSUsual) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (androidUsual) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else {
            System.out.println("Неизвестная оперативная система.");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int year = 2021;
        boolean leapYear = (year % 400 == 0 || year % 4 == 0 && year % 100 != 0);
        if (leapYear) {
            System.out.println(year + " - високосный год.");
        }
        else {
            System.out.println(year + " - не високосный год.");
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int deliveryTime = 0;
        if (deliveryDistance < 20) {
            deliveryTime = deliveryTime + 1;
        }
        else if (20 < deliveryDistance && deliveryDistance < 60) {
            deliveryTime = deliveryTime + 2;
        }
        else if (60 < deliveryDistance && deliveryDistance < 100) {
            deliveryTime = deliveryTime + 3;
        }
        else {
            System.out.println("Доставка на такое расстояние не осуществляется.");
        }
        System.out.println("Потребуется дней: " + deliveryTime);
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Месяц " + monthNumber + " принадлежит к сезону Зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц " + monthNumber + " принадлежит к сезону Весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц " + monthNumber + " принадлежит к сезону Лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц " + monthNumber + " принадлежит к сезону Осень.");
                break;
            default:
                System.out.println("Такого месяца нет");
        }
    }
}