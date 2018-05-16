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
    
//To avod ambiguity the implementing class should explicitly specify which default method is to be used.

    public void play(){
        Piano.super.play();
        Guitar.super.play();
    }
    
    public static void main(String []args){
        Instrument I = new Instrument();
        I.play();
    }
}