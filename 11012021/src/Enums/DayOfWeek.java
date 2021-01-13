package Enums;

public enum DayOfWeek {
    MONDAY("Понедельник", 1, 8),
    TUESDAY("Вторник", 2, 8),
    WEDNESDAY("Среда", 3, 8),
    THURSDAY("Четверг", 4, 8),
    FRIDAY("Пятница", 5, 8),
    SATURDAY("Суббота", 6, 0),
    SUNDAY("Воскресенье", 7, 0);
// 
    private String name;
    private int number;
    private int hours;

    DayOfWeek(String name, int number, int hours){
        this.name = name();
        this.number = number;
        this.hours = hours;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getNumber(){
        return number;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public int getHours(){
        return hours;
    }

    public void setHours(int hours){
        this.hours = hours;
    }
}
