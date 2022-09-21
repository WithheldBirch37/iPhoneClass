public class iPhone {
    private String call;
    private String text;
    private String photo;
    private Flag color;

    public iPhone() {
        call = "Nobody";
        text = "nobody";
        photo = "nothing";
        
    }  
    
    public iPhone(String whatType) {
        call = "Nobody";
        text = "nobody";
        photo = whatType;
        
    }

    public iPhone(String whoCallin, String whoTextin, String whatType) {
        call = whoCallin;
        text = whoTextin;
        photo = whatType;
    }

    public iPhone(Flag theFlag){
       this();
        color = theFlag;
    }

    public void conversation(){
        System.out.println("I'm going to send you a photo of this flag, will you tell me what flag it is?");
        System.out.println("The flag colors are " + color + " and the " + photo + " you sent me show the flag colors in vertical stripes so it's Belgium. ");
        System.out.println("Thank you " + text + "! ");
    }

    public void call() {
        System.out.println("You are receiving a call from " + call);
        System.out.println("You are receiving a text from " + text);
        System.out.println("You are taking a " + photo + " photo");
    }

    public void text() {
        System.out.println("You just got a text from ");
        System.out.print("Atem");
    }

    public void photo() {
        System.out.println("You are taking a ");
        System.out.print("selfie");
        
    }

    public String whoCallin() {return call;}

    public void setwhoCallin(String whoCallin) {call = whoCallin;}

    public String whoTextin() {return text;}

    public void setwhoTextin(String whoTextin) {text = whoTextin;}

    public String whatType() {return photo;}

    public void setwhatType(String whatType) {photo = whatType;}

    

    @Override
    public String toString() {
        return call + " is calling, while " + text + " is texting, and you are taking a " + photo + ".";
    }
}