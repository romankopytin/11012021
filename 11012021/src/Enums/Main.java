package Enums;
// Требуется реализовать enum DayOfWeek, который будет представлять дни недели.
//С его помощью необходимо решить задачу определения кол-ва рабочих часов до конца недели по заданному текущему дню.
//
// Возвращает кол-во оставшихся рабочих часов до конца
// недели по заданному текущему дню. Считается, что
// текущий день ещё не начался, и рабочие часы за него
// должны учитываться.
// Если заданный день выходной то вывести "Сегодня выходной"
//
//
//public class DayOfWeekMain {
//
// public static void main(String[] args) {
// System.out.println(getWorkingHours(DayOfWeek.MONDAY));

public class Main {
    public static void main(String[] args) {
//        System.out.println(getWorkingHours(DayOfWeek.MONDAY));
        int num = getWorkingHours(DayOfWeek.SUNDAY);

        switch (num){
            case 0:
                System.out.println("Сегодня выходной!");break;
            default:
                System.out.println(String.format("До конца рабочей недели осталось %d часов.", num));break;
        }
    }

    public static int getWorkingHours(DayOfWeek dayOfWeek){
        int sum = 0;
        for (int i = dayOfWeek.ordinal(); i < dayOfWeek.values().length; i++)
            sum += dayOfWeek.values()[i].getHours();
        return sum;
    }
}
