package coding_basic_training;

public class ReverseString {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string);

        for (int[] query : queries) {
            int s = query[0],
                    e = query[1];

            sb.replace(s, e + 1, new StringBuilder(sb.substring(s, e + 1)).reverse().toString());
        }

        return sb.toString();
    }
    /**
     char[] arr;

     public String solution(String my_string, int[][] queries) {

        arr = my_string.toCharArray();

         for (int[] query : queries) {
         reverse(query[0], query[1]);
         }

        return new String(arr);
     }

     private void reverse(int s, int e) {
         while (s < e) {
             char temp = arr[s];
             arr[s++] = arr[e];
             arr[e--] = temp;
         }
     }
     **/
}
