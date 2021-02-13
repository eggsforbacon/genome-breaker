package ui;
import model.*;

public class Main {
  public static void main(String[] args) {
    Genome huntingtons = new Genome();
    System.out.println(huntingtons.getEveryCodon().toString());
    System.out.println("-------------");
    System.out.println("Head: " + huntingtons.getHead());
    System.out.println("Tail: " + huntingtons.getTail());
  }
}
