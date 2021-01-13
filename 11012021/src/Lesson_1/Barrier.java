package Lesson_1;

public abstract class Barrier {
    private String name;
    public Barrier(String name) {
        this.name = name;
    }

    protected abstract boolean moving(Actions a);
    public String getName() {
        return name;
    }
}
