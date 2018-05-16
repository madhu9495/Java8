interface Piano{
    
    default void play(){
        System.out.println("Playing Piano");
    }
}
interface Guitar{
    
    default void play(){
        System.out.println("Playing Guitar");
    }
}

public class Instrument implements Piano,Guitar{
    
  //To resolve ambiguity we can override the default method.
  
    public void play(){
        System.out.println("Playing Instrument");
    }
    
    public static void main(String []args){
        Instrument I = new Instrument();
        I.play();
    }
}