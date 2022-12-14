package lesson3.homework6.participants;

import lesson3.homework6.obstacles.Obstacle;

public class Man extends Participant {

    public Man(int runLength, int jumpHeight) {
        super(runLength, jumpHeight);
    }

    @Override
    public void run(Obstacle treadmill) {
        System.out.println("Man runs");
    }

    @Override
    public void jump(Obstacle wall) {
        System.out.println("Man jumps");
    }

    @Override
    public String toString() {
        return "Man";
    }
}
