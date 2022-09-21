public class Flag {

  private String color;
  private String country;
  private Boolean wave;
  

  public Flag() {
    color = "blank ";
    country = "none ";
    wave = false;
    
  }

  public Flag(Boolean yWave){
    this();
    wave = yWave;
   
    
  }
  public Flag(String nCountry, String nColor, Boolean yWave){
    wave = yWave;
    country = nCountry;
    color = nColor;
    
  }
  public String toString(){
    return "Colors: " + color + " Country: " + country + " Waves: " + wave;
  }
  public void fold() {
    System.out.println("My contry is " + country + ".");
    System.out.println("");
    System.out.println("I fold my " + country + " flag at the end of the day.");
    System.out.println("");
  }
  public void wind() {
    System.out.println("True or False Flags wave when there is no wind: " + wave);
    
    
    
  }
  public void Ccolors() {
     System.out.println("The colors of the " + country + " flag are " + color + ".");
    System.out.println("");
    System.out.println("True or false Flags wave in the wind: " + wave);
    System.out.println("");
  }

  public String getColor() { return color; }
  public void setColor( String c) { color = c;}
  public String getCountry() { return country; }
  public void setCountry( String co) { country = co;}
  public boolean getWaver() { return wave; }
  public void setWave( boolean w) { wave = w;}
  
}