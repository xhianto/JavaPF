package be.vdab.jpfhfdst21;

public class OptionalMain {
    private static Integer eersteCijfer(String string){
        for (int index = 0; index != string.length(); index++){
            var teken = string.charAt(index);
            if (Character.isDigit(teken)) {
                return Character.getNumericValue(teken);
            }
        }
        return null;
    }
    public static void main(String[] args) {
        System.out.println(eersteCijfer("all4you") * 10);
        System.out.println(eersteCijfer("wrong") * 10);
    }
}
