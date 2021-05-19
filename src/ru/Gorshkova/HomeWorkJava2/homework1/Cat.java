package ru.Gorshkova.HomeWorkJava2.homework1;

public class Cat implements JumpAndRun{
    String name;
    int maxJump;
    int maxRun;

    public Cat(String name, int maxJump, int maxRun) {
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
        System.out.printf("Кот %s прыгает %d м\n", this.name, this.getMaxJump());

    }

    @Override
    public int getMaxRun() {

        return this.maxRun;
    }

    @Override
    public void run() {
        System.out.printf("Кот %s пробегает %d м\n", this.name, this.maxRun);

    }


    public String toString() {
        return "Кот " + name;
    }

}
