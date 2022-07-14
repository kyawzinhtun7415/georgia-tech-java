public class Pond {
  public static void main(String args[]) {
    Frog peepo = new Frog("Peepo");
    Frog pepe = new Frog("Pepe", 10, 15);
    Frog peepaw = new Frog("Peepaw", 4.6, 5);
    Frog ricky = new Frog("Ricky");

    Fly fly1 = new Fly(1, 3);
    Fly fly6 = new Fly(6);
    Fly fly2 = new Fly(2);

    Frog.setSpecies("1331 Frogs");
    System.out.println(peepo);
    peepo.eat(fly6);
    System.out.println(fly6);
    peepo.grow(8);
    peepo.eat(fly6);
    System.out.println(fly6);
    System.out.println(peepo);
    System.out.println(ricky);
    peepaw.grow(4);
    System.out.println(peepaw);
    System.out.println(pepe);
  }
}
