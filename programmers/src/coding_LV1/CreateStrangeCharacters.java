package coding_LV1;

public class CreateStrangeCharacters {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split(" ", -1);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                if (j % 2 == 0) {
                    sb.append(Character.toUpperCase(arr[i].charAt(j)));
                } else {
                    sb.append(Character.toLowerCase(arr[i].charAt(j)));
                }
            }

            if (i != arr.length - 1) {
                sb.append(" ");
            }

        }

        return sb.toString();
    }
}
