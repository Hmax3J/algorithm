package coding_basic_training;

public class EnlargeThePicture {
    public String[] solution(String[] picture, int k) {
        int newHeight = picture.length * k;
        int newWidth = picture[0].length() * k;

        String[] answer = new String[newHeight];

        int rowIndex = 0;
        for (String row : picture) {
            StringBuilder sb = new StringBuilder();
            for (char ch : row.toCharArray()) {
                for (int i = 0; i < k; i++) {
                    sb.append(ch);
                }
            }

            String rowString = sb.toString();
            for (int j = 0; j < k; j++) {
                answer[rowIndex++] = rowString;
            }
        }

        return answer;
    }
}
