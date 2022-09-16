class Main {
  public static void main(String[] args) {

    iPhone i1 = new iPhone();
    iPhone i2 = new iPhone("portait");
    iPhone i3 = new iPhone("Ethan", "Atem", "portrait");

    System.out.println(i1);
    System.out.println(i2);
    System.out.println(i3);
    System.out.println("");
    


    i3.call();
    


  }
}
