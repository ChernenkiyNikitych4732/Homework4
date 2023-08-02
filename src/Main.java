public class Main {
    public static void main(String[] args) {
        // Задача №1
        System.out.println("Задача №1");
        int age = 22;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", нужно немного подождать");
        }
        // Задача №2
        System.out.println("Задача №2");
        int summer = 22;
        int winter = -15;
        if (summer > 5) {
            System.out.println("Сегодня тепло " + summer + " , можно идти без шапки");
        }
        if (winter < 5) {
            System.out.println("На улице холодно " + winter + " , нужно надеть шапку");
        }
        // Задача №3
        System.out.println("Задача №3");
        int highSpeed = 90;
        int lowSpeed = 30;
        if (highSpeed > 60) {
            System.out.println("Если скорось " + highSpeed + " , то придется заплатить штраф");
        }
        if (lowSpeed < 60) {
            System.out.println("Если скорость " + lowSpeed + " , то можно ездить спокойно");
        }
        // Задача №4
        System.out.println("Задача №4");
        age = 21;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить в детский сад");
        }
        if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить в школу");
        }
        if (age > 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить в университет");
        }
        if (age >= 24) {
            System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить на работу");
        }
        // Задача №5
        System.out.println("Задача №5");
        if (age >= 5) {
            System.out.println("Ребенок не может кататься на аттракционе ");
        } else if (age >= 5 && age < 14) {
            System.out.println("Ребенок может кататься на аттракционе только в сопровождении взрослого ");
        } else if (age <= 14) {
            System.out.println("Ребенок может кататься на аттракционе ");
        }
        // Задача №6
        System.out.println("Задача №6");
        int trainWagon = 102;
        int placePerWagon = 60;
        int placePerWagonStand = trainWagon - placePerWagon;
        if (placePerWagon < 60 && placePerWagonStand == 42) {
            System.out.println("В вагоне есть сидячие места");
        } else if (placePerWagon == 60 && placePerWagonStand < 42) {
            System.out.println("В вагоне есть стоячие места");
        } else if (placePerWagon < 60 && placePerWagonStand < 42) {
            System.out.println("В вагоне есть и сидячие места,  и стоячие места");
        } else {
            System.out.println("Вагон забит полностью");
        }
        // Задача №7
        System.out.println("Задача №7");
        int one = 1;
        int two = 3;
        int three = 5;
        if (one > two) {
            if (one > three) {
                System.out.println("Максимальное число " + one);
            } else if (three > one) {
                System.out.println("Максимальное число " + three);
            } else {
                System.out.println("Числа " + one + "и " + three + "равны");
            }
        } else if (two > one) {
            if (two > three) {
                System.out.println("Максимальное число " + two);
            } else if (three > two) {
                System.out.println("Максимальное число " + three);
            } else {
                System.out.println("Числа" + two + "и " + three + "равны");
            }
        } else {
            if (one > three) {
                System.out.println("Максимальное число " + one);
            } else if (three > one) {
                System.out.println("Максимальное число " + three);
            } else {
                System.out.println("Все числа равны ");
            }
        }
    }
}