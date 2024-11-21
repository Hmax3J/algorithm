package coding_LV2;

public class DeliveryAndCollectionOfParcels {
    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
        long distance = 0;
        int deliverRemain = 0;
        int pickupRemain = 0;

        for (int i = n - 1; i >= 0; i--) {
            deliverRemain += deliveries[i];
            pickupRemain += pickups[i];

            while (deliverRemain > 0 || pickupRemain > 0) {
                distance += (i + 1) * 2;
                deliverRemain -= cap;
                pickupRemain -= cap;
            }
        }

        return distance;
    }
}
