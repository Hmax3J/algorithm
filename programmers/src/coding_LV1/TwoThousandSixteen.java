package coding_LV1;

import java.time.*;

public class TwoThousandSixteen {
    public String solution(int a, int b) {

        return LocalDate.of(2016, a, b).getDayOfWeek().toString().substring(0, 3);
    }
}
