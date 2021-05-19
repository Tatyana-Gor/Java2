package ru.Gorshkova.HomeWorkJava2.homework1;

public class Wall implements Obstacle{
    private int height;

    public Wall(String name, int height) {

        this.height = height;
    }
    public int getHeight(){
        return this.height;
    }


    @Override
    public boolean chek(JumpAndRun z) {
        return z.getMaxJump() > height;
    }

    public String toString() {
        return "Стена высотой " + height + " м";
    }

}
