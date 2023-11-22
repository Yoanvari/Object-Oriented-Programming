package Tugas;

public class WalkingZombie extends Zombie {
    public WalkingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal() {
        if (level == 1) {
            health += ((health * 10) / 100);
        } else if (level == 2) {
            health += ((health * 30) / 100);
        } else if (level == 3) {
            health += ((health * 40) / 100);
        }
    }

    @Override
    public void destroyed() {
        health -= health * 0.19;
    }

    @Override
    public String getZombieInfo() {
        String info = "Walking " + super.getZombieInfo() + "\n";
        info += "Health = " + health + "\n";
        info += "Level = " + level + "\n";
        return info;
    }
}
