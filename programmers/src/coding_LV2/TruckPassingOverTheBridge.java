package coding_LV2;

import java.util.*;

public class TruckPassingOverTheBridge {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>();
        int time = 0;
        int currentWeight = 0;
        int index = 0;

        for (int i = 0; i < bridge_length; i++) {
            bridge.add(0);
        }

        while (index < truck_weights.length) {
            time++;
            currentWeight -= bridge.poll();

            if (currentWeight + truck_weights[index] <= weight) {
                bridge.add(truck_weights[index]);
                currentWeight += truck_weights[index];
                index++;
            } else {
                bridge.add(0);
            }
        }

        time += bridge_length;

        return time;
    }
}
