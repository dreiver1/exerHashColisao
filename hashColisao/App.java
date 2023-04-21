package hashColisao;

public class App {
  public static void main(String[] args) {
    EstruturaHashTable ha = new EstruturaHashTable();
    // System.out.println(ha.search(10));
    // ha.insert(10);
    // System.out.println(ha.search(10));

    ha.insert(10);
    ha.insert(1010);
    ha.insert(2010);

    System.out.println(ha.search(2010));
    System.out.println(ha.delete(10));
    System.out.println(ha.delete(2010));
    System.out.println(ha.delete(3010));


  }
}
