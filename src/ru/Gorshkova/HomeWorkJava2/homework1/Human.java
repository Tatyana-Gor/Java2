package ru.Gorshkova.HomeWorkJava2.homework1;

public class Human implements JumpAndRun {
    private String name;
    private int maxJump;
    private int maxRun;

    public Human(String name, int maxJump, int maxRun){
        this.name = name;
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }




    @Override
    public int getMaxJump() {

        return this.maxJump;
    }

    @Override
    public void jump() {
        System.out.printf("Человек %s прыгает %d м\n", this.name, this.getMaxJump());

    }

    @Override
    public int getMaxRun() {

        return this.maxRun;
    }

    @Override
    public void run() {
        System.out.printf("Человек %s пробегает %d м\n", this.name, this.getMaxRun());

    }
    public String toString() {
        return "Человек " + name;
    }

}
