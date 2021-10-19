package org.example;

public class App {
    public static void main(String[] args) {
        Trigger trigger = new Trigger();
        Box box = new Box(trigger);
        Player player = new Player(trigger);

        new Thread(box).start();
        new Thread(player).start();

        while (true) {
            if (!trigger.isInUse()) {
                break;
            }
        }
    }
}
