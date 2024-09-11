package coding_LV2;

import java.util.*;

public class DoTheAssignment {
    class Plan {
        String name;
        int start;
        int playTime;

        public Plan(String name, String start, String playTime) {
            this.name = name;
            String[] time = start.split(":");
            this.start = Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]); // 시간 * 60 + 분
            this.playTime = Integer.parseInt(playTime);
        }

        public Plan(String[] plan) {
            this(plan[0], plan[1], plan[2]);
        }

        public int getEndTime() {
            return start + playTime;
        }
    }

    public String[] solution(String[][] plans) {
        Plan[] planArr = new Plan[plans.length];

        for(int i = 0; i < plans.length; i++) {
            planArr[i] = new Plan(plans[i]);
        }

        Arrays.sort(planArr, (a, b) -> a.start - b.start);

        ArrayDeque<Plan> stop = new ArrayDeque<>();
        List<String> answer = new ArrayList<>();

        for(int i = 0; i < plans.length - 1; i++) {
            Plan curPlan = planArr[i];
            Plan nextPlan = planArr[i + 1];

            if(curPlan.getEndTime() > nextPlan.start) {
                curPlan.playTime = curPlan.getEndTime() - nextPlan.start;
                stop.push(curPlan);
                continue;
            }

            answer.add(curPlan.name);

            int restTime = nextPlan.start - curPlan.getEndTime();

            while(restTime > 0 && !stop.isEmpty()) {
                Plan stoppedPlan = stop.peek();
                int timeDiff = stoppedPlan.playTime - restTime;
                stoppedPlan.playTime = timeDiff;
                restTime = timeDiff * -1;

                if(timeDiff > 0) {
                    break;
                }

                answer.add(stop.pop().name);
            }
        }

        answer.add(planArr[planArr.length - 1].name);

        while(!stop.isEmpty()) {
            answer.add(stop.pop().name);
        }

        return answer.toArray(new String[answer.size()]);
    }
}
