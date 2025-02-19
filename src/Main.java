public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");

        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }
        System.out.println("Задание 2");

        int temperature = 3;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        }
        System.out.println("Задание 3");

        int speed = 65;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно.");
        }

        System.out.println("Задание 4");

        int age1 = 20;
        if (age1 >= 2 && age1 <= 6) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в детский сад.");
        } else if (age1 >= 7 && age1 <= 17) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в школу.");
        } else if (age1 >= 18 && age1 <= 24) {
            System.out.println("Если возраст человека равен " + age1 + ", то его место в университете.");
        } else if (age1 > 24) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему пора ходить на работу.");
        } else {
            System.out.println("Если возраст человека равен " + age1 + ", то ему пока рано куда-либо ходить.");
        }

        System.out.println("Задание 5");

        int age2 = 10;
        if (age2 < 5) {
            System.out.println("Если возраст ребенка равен " + age2 + ", то ему нельзя кататься на аттракционе.");
        } else if (age2 >= 5 && age2 < 14) {
            System.out.println("Если возраст ребенка равен " + age2 + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else {
            System.out.println("Если возраст ребенка равен " + age2 + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }

        System.out.println("Задание 6");

        int passengers = 110;
        int totalSeats = 60;
        System.out.println("Сидячии места " + totalSeats);
        int totalCapacity = 102;
        System.out.println("Общая вместимомсть вагона " + totalCapacity);

        if (passengers < totalSeats) {
            System.out.println("Есть сидячие места.");
        } else if (passengers < totalCapacity) {
            System.out.println("Есть стоячие места.");
        } else {
            System.out.println("Вагон полностью забит.");
        }

        System.out.println("Задание 7");

        int one = 10;
        int two = 25;
        int three = 15;

        if (one >= two && one >= three) {
            System.out.println("Наибольшее число: " + one);
        } else if (two >= one && two >= three) {
            System.out.println("Наибольшее число: " + two);
        } else {
            System.out.println("Наибольшее число: " + three);
        }



    }
}