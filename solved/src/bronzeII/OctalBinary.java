package bronzeII;

import java.math.BigInteger;
import java.util.*;

public class OctalBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        BigInteger octalNumber = new BigInteger(input, 8);
        String binaryOutput = octalNumber.toString(2);

        System.out.println(binaryOutput);

        scanner.close();
    }
}