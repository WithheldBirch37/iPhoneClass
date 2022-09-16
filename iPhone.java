public class iPhone {
    private String call;
    private String text;
    private String photo;

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