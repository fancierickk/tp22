package tp2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<IBarrier> barriers = new ArrayList<>();
        barriers.add(new Wall(1));
        barriers.add(new Treadmill(100));
        barriers.add(new Wall(2));
        barriers.add(new Treadmill(200));
        barriers.add(new Wall(3));
        barriers.add(new Treadmill(300));


        List<Runner> runners = new ArrayList<>();
        runners.add(new Human());
        runners.add(new Cat());
        runners.add(new Robot());

        for (Runner runner : runners) {
            for (IBarrier barrier : barriers) {
                int capability = runner.capability(barrier.getKind());
                if (barrier.getDuration() > capability) {
                    System.out.println("Участник " + runner.getClass().getSimpleName() + " не справился с препятствием продолжительностью " + barrier.getDuration() + "м");
                    System.out.println(' ');break;
                } else {
                    System.out.println("Участник " + runner.getClass().getSimpleName() + " справился с препятствием продолжительностью " + barrier.getDuration() + "м");
                    }
            }
        }
    }


}
