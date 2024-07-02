package coding_introduction;

public class OXQuiz {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            String[] slice = quiz[i].split(" ");
            for (int j = 0; j < slice.length; j++) {
                switch (slice[j]) {
                    case "+" -> {
                        int result = Integer.parseInt(slice[0]) + Integer.parseInt(slice[2]);
                        answer[i] = Integer.parseInt(slice[4]) == result ? "O" : "X";
                    }

                    case "-" -> {
                        int result = Integer.parseInt(slice[0]) - Integer.parseInt(slice[2]);
                        answer[i] = Integer.parseInt(slice[4]) == result ? "O" : "X";
                    }
                }
            }
        }

        return answer;
    }
    /*
    public String[] solution(String[] quiz) {
        for(int i=0; i<quiz.length; i++){
            String[] text = quiz[i].split(" ");
            int result = Integer.parseInt(text[0]) + ( Integer.parseInt(text[2]) * ( text[1].equals("+") ? 1:-1) );
            quiz[i] = result == Integer.parseInt(text[4])? "O": "X";
        }
        return quiz;
    } 다른 사람이 한 코드
     */
}
