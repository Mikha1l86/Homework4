public class Main {
    public static void main(String[] args) {
        // Задача 1
        int age = 10;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " он совершенолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать.");
        }
    }
    //Задача 2
    static {
        int temperature = -1;
        if (temperature >= 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        } else {
            System.out.println("На улице " + temperature + " нужно надеть шапку.");        }
    }
    //Задача 3
    static {
        int speed = 10;
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + " то можно ездить спокойно.");
        } else {
            System.out.println("Если скорость " + speed + " придется заплатить штраф.");
        }
    }

    //Задача 4
    static {
        int year = 2;
        if (year >= 2 && year <= 6) {
            System.out.println("Если возраст человека равен " + year + " то ему нужно ходить в детский сад.");
        }
        if (year >= 7 && year <= 17) {
            System.out.println("Если возраст человека равен " + year + " то ему нужно ходить в школу.");
        }
        if (year >= 18 && year <= 24) {
            System.out.println("Если возраст человека равен " + year + " то ему нужно ходить в университет.");
        }
        if (year >= 25) {
            System.out.println("Если возраст человека равен " + year + " то ему нужно ходить на работу.");
        }
    }

    //Задача 5
    static {
        int year = 5;
        if (year < 5) {
            System.out.println("Если возраст ребенка равен " + year + " то ему нельзя кататься на аттракционе.");
        } else if (year >= 5 && year < 14) {
            System.out.println("Если возраст ребенка равен " + year + " то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else if (year >= 14) {
            System.out.println("Если возраст ребенка равен " + year + " то ему можно кататься на аттракционе без сопровождении взрослого.");
        }
    }

    //Задача 6
    static {
        int wagone = 59;
        if (wagone < 60) {
            System.out.println("В вагоне есть сидячие места.");}
        if (wagone >= 60 && wagone < 102) {
            System.out.println("В вагоне есть стоячие места.");
        }
        if (wagone >= 102) {
            System.out.println("В вагоне нет мест.");
        }
    }

    //Задача 6
    static {
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two) {
            System.out.println("Наибольшее число one");
        } else if (two > three) {
            System.out.println("Наибольшее число two");
        } else {
            System.out.println("Наибольшее число three");
        }
    }
}