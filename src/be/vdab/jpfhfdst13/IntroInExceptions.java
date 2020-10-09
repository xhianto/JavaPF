package be.vdab.jpfhfdst13;

public class IntroInExceptions {
    public static void main(String[] args) {
//        try{
//            var result = 7 / 0;
//            System.out.println(result);
//        }
//        catch (ArithmeticException ex){
//            System.out.println(ex.getMessage());
//        }
        try{
            var cijfers = new int[]{12, 5, 28, 37};
            System.out.println("Het 7e element is " + cijfers[6]);
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("Dit is een poging voor the tonen van de " +
                    "waarde van een element");
        }
    }
}
