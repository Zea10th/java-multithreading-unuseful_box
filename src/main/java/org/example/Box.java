package org.example;

public class Box implements Runnable {
    private Trigger trigger;

    public Box(Trigger trigger) {
        this.trigger = trigger;
    }

    @Override
    public void run() {
        while (trigger.isInUse()) {
            if (trigger.isTurnedOn()) {
                trigger.setTurnedOn(false);
            }
        }
    }
}
