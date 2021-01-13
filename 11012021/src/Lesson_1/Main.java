package Lesson_1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // К заданию №1
//        Actions[] actions = {
//                new Human(),
//                new Cat(),
//                new Robot()
//        };
//        for (Actions a : actions){
//            a.jump();
//            a.run();
//        }
//
//    }
        Random r = new Random();
        Actions[] actions = new Actions[3];

        int distance = r.nextInt(10);
        int heigth = r.nextInt(5);
        actions[0] = new Human(distance, heigth);

        distance = r.nextInt(7);
        heigth = r.nextInt(6);
        actions[1] = new Robot(distance, heigth);

        distance = r.nextInt(15);
        heigth = r.nextInt(7);
        actions[2] = new Cat(distance, heigth);

        Barrier[] barriers = new Barrier[6];

        boolean isTrack;
        for (int i = 0; i < barriers.length; i++) {
            distance = r.nextInt(7);
            isTrack = r.nextBoolean();
            if (isTrack) {
                barriers[i] = new Track("Беговая дорожка " + i, distance);
            } else {
                barriers[i] = new Wall("Стена " + i, distance);
            }
        }

        for (int i = 0; i < actions.length; i++) {
            boolean result = true;
            for (int j = 0; j < barriers.length; j++) {
                result = barriers[j].moving(actions[i]);
                if (!result) {
                    break;
                }
            }
            if (result) {
                System.out.println("Успешно!");
            } else {
                System.out.println("Неуспешно");
            }
        }
    }
}
