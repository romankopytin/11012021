package Lesson_1;

public class Track extends  Barrier {

    private int length;

    public Track(String name, int length) {
        super(name);

        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    protected boolean moving(Actions a) {
        System.out.println(super.getName() + " длина: " + this.length);

        a.run();

        if (getLength() <= a.getRunDistance()) {
            System.out.println("Пробежал!");

            return true;
        } else {
            System.out.println("Не смог пробежать");

            return false;
        }
    }
}
