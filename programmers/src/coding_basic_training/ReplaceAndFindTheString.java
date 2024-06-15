package coding_basic_training;

public class ReplaceAndFindTheString {
    public int solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder(myString);

        for(int i = 0; i < myString.length(); i++) {
            if(sb.charAt(i) == 'A') {
                sb.setCharAt(i, 'B');
            }
        }

        for(int i = 0; i < myString.length(); i++) {
            if(myString.charAt(i) == 'B') {
                sb.setCharAt(i, 'A');
            }
        }

        return sb.toString().contains(pat) ? 1 : 0;
    }
    /* 다른 사람의 풀이
    myString = myString.replace("A", "a").replace("B", "A").replace("a", "B");
       return myString.contains(pat) ? 1 : 0;
     */
}
