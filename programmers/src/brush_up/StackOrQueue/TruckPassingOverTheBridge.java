package brush_up.StackOrQueue;

import java.util.*;

public class TruckPassingOverTheBridge {
    static class Truck {
        int weight;
        int position;

        Truck(int weight, int position) {
            this.weight = weight;
            this.position = position;
        }
    }

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Truck> bridge = new LinkedList<>();
        int time = 0;
        int totalWeight = 0;
        int index = 0;

        while (index < truck_weights.length || !bridge.isEmpty()) {
            time++;

            if (!bridge.isEmpty() && bridge.peek().position == bridge_length) {
                totalWeight -= bridge.poll().weight;
            }

            if (index < truck_weights.length && totalWeight + truck_weights[index] <= weight) {
                bridge.add(new Truck(truck_weights[index], 0));
                totalWeight += truck_weights[index];
                index++;
            }

            for (Truck truck : bridge) {
                truck.position++;
            }
        }

        return time;
    }
}
