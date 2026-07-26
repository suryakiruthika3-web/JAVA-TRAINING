public class KokoEatingBananas {

    static boolean canEat(int[] piles, int speed, int h) {

        int hours = 0;

        for (int bananas : piles) {
            hours += (bananas + speed - 1) / speed;
        }

        return hours <= h;
    }

    public static int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = 0;

        for (int bananas : piles)
            high = Math.max(high, bananas);

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (canEat(piles, mid, h))
                high = mid;
            else
                low = mid + 1;
        }

        return low;
    }

    public static void main(String[] args) {

        int[] piles = {3,6,7,11};
        int h = 8;

        System.out.println(minEatingSpeed(piles, h));
    }
}