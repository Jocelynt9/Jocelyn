abstract class Monster {
  public abstract void attack();
  public abstract void defend();
}
class SeaMonster extends Monster {
  public void attack() {
    System.out.println( " SeaMonster attacks with water blast");
  }
  public void defend() {
  System.out.println( " SeaMonster defends with its strong scalest. " );
  }
}
class Main {
 public static void main(String[] args ) {
   SeaMonster sean = new SeaMonster();
   sean.attack();
   sean.defend();
 }
}