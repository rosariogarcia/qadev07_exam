package org.fundacionjala.exam;

/**
 * @author RosarioGarcia.
 */
public class EANValidator {


    public static boolean validate(String code) {
        final int beginIndex = 0;
        int twelveIndex = 12;
        String code12 = code.substring(beginIndex, twelveIndex);
        int endIndex = 13;
        String suposedChecksum = code.substring(twelveIndex, endIndex);
        int realChecksum = checksum(code12);
        return Integer.toString(realChecksum).equals(suposedChecksum);
    }

    private static int checksum(String code12) {
        final int result = 0;
        int sum = result;
        int digitPosition = 1;
        for (char digit : code12.toCharArray()) {
            char charZero = '0';
            int partialSum = digit - charZero;
            if (digitPosition % 2 == result) {
                final int evenMultiplier = 3;
                sum += partialSum * evenMultiplier;
            } else {
                sum += partialSum;
            }
            digitPosition++;
        }
        final int factorFormula = 10;
        return (sum % factorFormula == result) ? result : factorFormula - (sum % factorFormula);
    }
}
