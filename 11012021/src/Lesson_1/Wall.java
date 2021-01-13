package Lesson_1;

public class Wall extends Barrier {

    private int heigth;

    public Wall(String name, int heigth) {
        super(name);

        this.heigth = heigth;
    }

    public int getHeigth() {
        return heigth;
    }

    @Override
    protected boolean moving(Actions a) {
        System.out.println(super.getName() + " высота: " + this.heigth);

        a.jump();

        if (getHeigth() <= a.getJumpHeight()) {
            System.out.println("Прыжок успешный!");

            return true;
        } else {
            System.out.println("Не смог прыгнуть");

            return false;
        }
    }
}
