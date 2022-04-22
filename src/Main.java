public class Main {
    public static void main(String[] args) {

        // 1 Задание
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке____");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке _____");

        }

        // Задание 2

        int clientDeviceYear = 2014;

        if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке ____");
        }
        if (clientDeviceYear <= 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке_____");
        }

        if (clientDeviceYear <= 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Андроид  по ссылке_____");
        }
        if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите  версию приложения для Андроид по ссылке_____");
        }




        // Задание 3

        int year = 2024;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " является високосным");
        }
        else {
            System.out.println( year + " не является високосным");
        }

        // Задание 4

        int deliveryDistance = 95;
        int deliveryTime = 1;

        if (deliveryDistance <=20)  {
            System.out.println("Потребуется дней: " + deliveryTime);
        }

         if (deliveryDistance >20 && deliveryDistance <= 60) {
            deliveryTime = deliveryTime + 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        }
        if (deliveryDistance >60 && deliveryDistance <= 90) {
            deliveryTime = deliveryTime + 2;
            System.out.println("Потребуется дней: " + deliveryTime);
        }
        if (deliveryDistance >90 && deliveryDistance <= 100) {
            deliveryTime = deliveryTime + 3;
            System.out.println("Потребуется дней: " + deliveryTime);
        }


        // 5 Задание


       int monthNumber = 13;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Такого дня не существует");





        }











    }
}












