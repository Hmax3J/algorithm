package coding_LV2;

import java.util.*;
public class OpenChatRoom {
    public String[] solution(String[] record) {
        HashMap<String, String> map = new HashMap<>();
        List<String[]> list = new ArrayList<>();

        for (String value : record) {
            String[] str = value.split(" ");

            if (str[0].equals("Enter") || str[0].equals("Change")) {
                map.put(str[1], str[2]);
            }

            if (str[0].equals("Enter")) {
                list.add(new String[] {str[1], "님이 들어왔습니다."});
            } else if (str[0].equals("Leave")) {
                list.add(new String[] {str[1], "님이 나갔습니다."});
            }

        }

        String[] result = new String[list.size()];

        for (int i = 0; i < list.size(); i++) {
            String[] strValue = list.get(i);

            result[i] = map.get(strValue[0]) + strValue[1];
        }

        return result;
    }
}
