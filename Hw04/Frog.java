public class Frog {
  private String name;
  private int age;
  private double tongueSpeed;
  private boolean isFroglet;

  //static variables
  private static String species = "Rare Pepe";


  //constructors
  public Frog(String name) {
    this(name, 5, 5);
  }

  public Frog(String name, double ageInYears, double tongueSpeed) {
    this(name, (int) (ageInYears * 12) , tongueSpeed);
  }

  public Frog(String name, int age, double tongueSpeed) {
    this.name = name;
    this.age = age;
    this.tongueSpeed = tongueSpeed;
    this.isFroglet = this.isFroglet();

  }

  public static String getSpecies() {
    return species;
  }

  public static void setSpecies(String newSpecies) {
    species = newSpecies;
  }


  //methods
  private boolean isFroglet() {
    if (this.age > 1 && this.age < 7) {
      return true;
    }
    return false;
  }

  public void grow() {
    this.grow(1);
  }

/**
  public void grow(int month) {
    int totalAge = this.age + month;
    if (this.age < 12) {
      for (int i = this.age; this.age < ; i++ ) {
        this.tongueSpeed++;
        //System.out.println("12 " + this.tongueSpeed);
        this.age++;
      }
    }
    if (this.age < 30) {
      while (this.age < totalAge) {
        this.age++;
        continue;
      }

    }
    if (this.age >= 30) {
      while (this.age < totalAge) {
        if (this.tongueSpeed > 5)
          this.tongueSpeed--;
        this.age++;
        continue;
      }
    }
    this.isFroglet = this.isFroglet();
    //System.out.println(this.tongueSpeed);
  }
*/

  public void grow(int month) {
    int totalAge = this.age + month;
    while (this.age < totalAge) {
      if (this.age < 12) {
        this.tongueSpeed++;
        this.age++;
      } else if (this.age < 30) {
        this.age++; 
      } else if (this.age >= 30) {
        if (this.tongueSpeed > 5) this.tongueSpeed--;
        this.age++;
      }
    }
    this.isFroglet = this.isFroglet();
    //System.out.println(this.tongueSpeed);
  }

  public void eat(Fly fly) {
    if (fly.isDead() == true) {
      return;
    } else if (this.tongueSpeed > fly.getSpeed()) {
        fly.setMass(0);
        if (fly.getMass() > 0.5 * this.age) {
          this.grow();
      }
    } else {
        fly.grow(1);
    }
  }

  public String toString() {
    if (this.isFroglet == true) {
      return String.format("My name is %s and I’m a rare froglet! I’m %d months old and my tongue has a speed of %.2f.", this.name, this.age, this.tongueSpeed);
    } else {
      return String.format("My name is %s and I’m a rare frog. I’m %d months old and my tongue has a speed of %.2f.", this.name, this.age, this.tongueSpeed);
    }
  }

  //public static void main(String args[]) {
    //Frog little = new Frog("Little");
    //little.grow(8);
  //}

}
