package be.vdab.jpfhfdst13;

import javax.security.sasl.SaslException;
import java.util.zip.DeflaterOutputStream;

public class TestExceptions {
    public static void main(String[] args) {
        var test = "yes";
        try {
            System.out.println(("start try"));
            doRisky(test);
            System.out.println("end try");
        }
        catch (ScaryException ex) {
            System.out.println("scary exception");
        }
        finally {
            System.out.println("finally");
        }
        System.out.println("end of main");
    }
    static void doRisky(String test) throws ScaryException {
        System.out.println("start risky");
        if ("yes".equals(test)){
            throw new ScaryException();
        }
        System.out.println("end risky");
    }
}
