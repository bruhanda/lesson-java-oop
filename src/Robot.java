/**
 * Created by bruhanda on 17.12.16.
 */
public class Robot {
    private final String name;
    private  int power;
    private  int health;

    public Robot(String name) {
        this.name = name;
        this.power = 100;
        this.health = 100;
    }

    public String getName() {
        return this.name;
    }

    public int getPower() {
        return this.power;
    }

    public int getHealth() {
        return this.health;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
