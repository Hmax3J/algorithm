package coding_LV2;

import java.util.*;

public class ParkingFeeCalculation {
    public int[] solution(int[] fees, String[] records) {
        int basicTime = fees[0];
        int basicFee = fees[1];
        int unitTime = fees[2];
        int unitFee = fees[3];

        Map<String, Integer> inTimes = new HashMap<>();
        Map<String, Integer> totalTimes = new HashMap<>();

        for (String record : records) {
            String[] parts = record.split(" ");
            String time = parts[0];
            String carNumber = parts[1];
            String action = parts[2];

            int minutes = convertToMinutes(time);

            if (action.equals("IN")) {
                inTimes.put(carNumber, minutes);
            } else if (action.equals("OUT")) {
                int inTime = inTimes.remove(carNumber);
                int parkedTime = minutes - inTime;

                totalTimes.put(carNumber, totalTimes.getOrDefault(carNumber, 0) + parkedTime);
            }
        }

        for (String carNumber : inTimes.keySet()) {
            int inTime = inTimes.get(carNumber);
            int parkedTime = convertToMinutes("23:59") - inTime;

            totalTimes.put(carNumber, totalTimes.getOrDefault(carNumber, 0) + parkedTime);
        }

        List<String> sortedCarNumbers = new ArrayList<>(totalTimes.keySet());
        Collections.sort(sortedCarNumbers);

        int[] answer = new int[sortedCarNumbers.size()];
        for (int i = 0; i < sortedCarNumbers.size(); i++) {
            String carNumber = sortedCarNumbers.get(i);
            int totalParkedTime = totalTimes.get(carNumber);
            answer[i] = calculateFee(totalParkedTime, basicTime, basicFee, unitTime, unitFee);
        }

        return answer;
    }

    private int convertToMinutes(String time) {
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        return hours * 60 + minutes;
    }

    private int calculateFee(int time, int basicTime, int basicFee, int unitTime, int unitFee) {
        if (time <= basicTime) {
            return basicFee;
        }

        return basicFee + (int)Math.ceil((double)(time - basicTime) / unitTime) * unitFee;
    }
}
