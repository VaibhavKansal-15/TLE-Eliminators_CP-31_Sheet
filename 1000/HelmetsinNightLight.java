import java.util.*;

public class HelmetsinNightLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong(); // Number of test cases

        while (t-- > 0) {
            long n = sc.nextLong(); // Number of residents
            long r = sc.nextLong(); // Cost for direct notification

            // Create a list of pairs to store (b_i, a_i)
            List<Pair<Long, Long>> residents = new ArrayList<>();
            for (int p = 0; p < n; p++) {
                long a = sc.nextLong(); // a_i
                residents.add(new Pair<>(0L, a)); // Placeholder for b_i
            }
            for (int p = 0; p < n; p++) {
                long b = sc.nextLong(); // b_i
                residents.get(p).setKey(b); // Update b_i in the pair
            }

            // Sort residents by b_i (sharing cost) in ascending order
            residents.sort(Comparator.comparing(Pair::getKey));

            long rem = n - 1; // Remaining residents to notify (excluding the first)
            long total = r; // Start with the cost of directly notifying the first resident

            // Use the cheapest sharing options
            for (Pair<Long, Long> resident : residents) {
                long b_i = resident.getKey(); // Sharing cost
                long a_i = resident.getValue(); // Maximum number of shares

                if (b_i >= r) break; // No point in using this resident if sharing cost >= r

                long cnt = Math.min(rem, a_i); // Number of residents to notify using this resident
                total += cnt * b_i; // Add the cost of sharing
                rem -= cnt; // Update remaining residents

                if (rem == 0) break; // All residents notified
            }

            // Add the cost of directly notifying the remaining residents
            total += r * rem;

            System.out.println(total);
        }
        sc.close();
    }

    // Pair class to store (b_i, a_i)
    static class Pair<K, V> {
        private K key;
        private V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }
}