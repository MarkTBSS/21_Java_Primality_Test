import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) {
        String n = "6513516734600035718300327211250928237178281758494417357560086828416863929270451437126021949850746381";
        BigInteger bigInt = new BigInteger(n);
        Boolean primBoolean = bigInt.isProbablePrime(100);

        String result = "";
        if (primBoolean == true) {
            result = "prime";
        }
        if (primBoolean == false) {
            result = "not prime";
        }
        System.out.println(result);
    }
}
