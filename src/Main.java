public class Main {
    public static void main(String[] args) {
        int clientOs = 1;
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        int clientDeviceYear=2014;
        if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }else if (clientOs == 0 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else if (clientOs==1 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке ");
        }else  {
            System.out.println("Установите версию приложения для Android по ссылке");
        }


        int year = 2024;
        if (year % 4 == 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else if (year % 100 == 0) {
            System.out.println(year + " год не является високосным");
        }

        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
            return;
        }
        if (deliveryDistance > 20) {
            deliveryDays++;
        } else if (deliveryDistance > 60) {
            deliveryDays++;
        } {
        System.out.println("Доставка займет " + deliveryDays + " суток");
    }

        int monthNumber = 12;
        if (monthNumber > 12)
            System.out.println("Недопустимое число");
        switch (monthNumber) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
        }


    }

}