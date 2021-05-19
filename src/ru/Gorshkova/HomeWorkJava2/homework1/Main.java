package ru.Gorshkova.HomeWorkJava2.homework1;

public class Main {

    public static void main(String[] args) {
        JumpAndRun[] participants = {
                new Cat("Мурзик", 2, 10),
                new Human("Иван", 1, 100),
                new Robot("Железяка", 5, 50),
        };


        Obstacle[] tasks = {
                new Treadmill("Дорожка", 100),
                new Wall("Стена", 1),
        };


        for (Obstacle t : tasks) {
            for (JumpAndRun p : participants) {
                System.out.println(t.toString() + " " + p.toString() + " " + t.chek(p));
            }


        }

    }
}
