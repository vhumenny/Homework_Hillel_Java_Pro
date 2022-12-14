package lesson3.homework6.obstacles;

import lesson3.homework6.participants.Participant;

public class Wall extends Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean overcome(Participant participant) {
        return height <= participant.getJumpHeight();
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Wall";
    }
}
