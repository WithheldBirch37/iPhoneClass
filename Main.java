class Main {
  public static void main(String[] args) {

    iPhone i1 = new iPhone();
    iPhone i2 = new iPhone("portait");
    iPhone i3 = new iPhone("Ethan", "Atem", "portrait");
    Flag whatColor = new Flag();
    iPhone c1 = new iPhone(whatColor);

    System.out.println(i1);
    System.out.println(i2);
    System.out.println(i3);
    System.out.println(c1);
    


    i3.call();
    c1.conversation();
    


  }
}
