package coding_basic_training;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> result = new ArrayList<String>();

        for(int i = 0; i < finished.length; i++) {
            if(!finished[i]) {
                result.add(todo_list[i]);
            }
        }

        return result.toArray(String[]::new);
    }
}
