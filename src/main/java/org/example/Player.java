package org.example;

public class Player implements Runnable {

    private Trigger trigger;
    private final int turns = 10;
    public static final int DELAY = 2_000;

    public Player(Trigger trigger) {
        this.trigger = trigger;
    }

    @Override
    public void run() {

        for (int i = 0; i < turns; i++) {
            try {
                Thread.sleep(DELAY);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            trigger.setTurnedOn(true);
        }

        trigger.setInUse(false);
    }
}
