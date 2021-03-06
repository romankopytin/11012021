package Lesson_1;

public class Cat implements Actions {
    private String name;
    private int runDistance;
    private int jumpHeight;

    public Cat(int distance, int jumpHeight) {
        this.runDistance = distance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void run() {
        System.out.println("Кот " + "пробежал " + this.getRunDistance());
    }

    @Override
    public void jump() {
        System.out.println("Кот " + "прыгнул " + this.getJumpHeight());

    }

    @Override
    public int getRunDistance() {
        return this.runDistance;
    }

    @Override
    public int getJumpHeight() {
        return this.jumpHeight;
    }
}
