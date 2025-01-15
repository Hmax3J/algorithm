package bronzeII;

import java.math.BigInteger;
import java.util.*;

public class BinaryAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        scanner.close();

        BigInteger binary1 = new BigInteger(input[0], 2);
        BigInteger binary2 = new BigInteger(input[1], 2);
        BigInteger sum = binary1.add(binary2);

        System.out.println(sum.toString(2));
    }
}
