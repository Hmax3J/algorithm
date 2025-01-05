package bronzelll;

import java.util.*;

public class ListOfNumberThatBiteEachOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        int xWidth = (X - 1) / 4;
        int yWidth = (Y - 1) / 4;

        int xHeight = (X - 1) % 4 + 1;
        int yHeight = (Y - 1) % 4 + 1;

        int width = Math.abs(xWidth - yWidth);
        int height = Math.abs(xHeight - yHeight);

        System.out.println(width + height);
    }
}
