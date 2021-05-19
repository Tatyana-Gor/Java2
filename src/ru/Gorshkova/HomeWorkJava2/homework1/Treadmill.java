package ru.Gorshkova.HomeWorkJava2.homework1;

public class Treadmill implements Obstacle {
    String name;
    private int distance;

    public Treadmill(String name, int distance){
        this.name = name;
        this.distance = distance;
    }


    @Override
    public boolean chek(JumpAndRun z) {
        return z.getMaxRun() > distance;
    }

    public String toString() {
        return "Беговая дорожка длиной " + distance + " м";
    }

}
