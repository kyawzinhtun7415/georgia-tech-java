

public class Fly {
  private double mass;
  private double speed;

  public Fly() {
    this(5, 10);
  }

  public Fly(double mass) {
    this(mass, 10);
  }

  public Fly(double mass, double speed) {
    this.mass = mass;
    this.speed = speed;
  }

  public double getMass() {
    return this.mass;
  }

  public double getSpeed() {
    return this.speed;
  }

  public void setMass(double mass) {
    this.mass = mass;
  }

  public void setSpeed(double speed) {
    this.speed = speed;
  }

  @Override
  public String toString() {
    if (this.mass == 0) {
      return String.format("I’m dead, but I used to be a fly with a speed of %.2f.", this.speed);
    } else {
      return String.format("I’m a speedy fly with %.2f speed and %.2f mass.", this.speed, this.mass);
    }
  }

  public void grow(int addMass) {
    int totalMass = (int) this.mass + addMass;
    for (int i = (int)this.mass; i < totalMass; i++) {
      if (this.mass < 20) {
        this.speed++;
      } else if (this.mass >=  20) {
        this.speed -= 0.5;
      }
      this.mass++;
    }
  }

  public boolean isDead() {
    if (this.mass == 0) {
      return true;
    }
    return false;
  }
}
