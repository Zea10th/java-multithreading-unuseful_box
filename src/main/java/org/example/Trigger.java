package org.example;

public class Trigger {

    private volatile boolean isInUse = true;
    private volatile boolean isTurnedOn = false;

    public boolean isInUse() {
        return isInUse;
    }

    public void setInUse(boolean inUse) {
        isInUse = inUse;
        System.out.println("Наскучило играть с коробкой.");
    }

    public boolean isTurnedOn() {
        return isTurnedOn;
    }

    public void setTurnedOn(boolean turnedOn) {
        isTurnedOn = turnedOn;
        String status = (turnedOn) ? "ВКЛ" : "ВЫКЛ";
        System.out.println("Тумблер установлен в положение \"" + status + "\"");
    }
}
