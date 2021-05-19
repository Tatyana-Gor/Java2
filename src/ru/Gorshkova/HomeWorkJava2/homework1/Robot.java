package ru.Gorshkova.HomeWorkJava2.homework1;

public class Robot implements JumpAndRun {
    private String name;
    private int maxJump;
    private int maxRun;

    public Robot(String name, int maxJump, int maxRun) {
        this.name = name;
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }
    public String getName(){
        return name;
    }


    @Override
    public int getMaxJump() {

        return this.maxJump;
    }

    @Override
    public void jump() {
        System.out.printf("Робот %s прыгает %d м\n", this.name, this.getMaxJump());

    }

    @Override
    public int getMaxRun() {

        return this.maxRun;
    }

    @Override
    public void run() {
        System.out.printf("Робот %s пробегает %d м\n", this.name, this.getMaxRun());

    }
    public String toString() {
        return "Робот " + name;
    }

}
