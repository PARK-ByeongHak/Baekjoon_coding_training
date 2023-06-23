import java.util.*;

class Main {
    static class Vote implements Comparable<Vote> {
        int idx;
        int sum;
        int weightedSum;

        public Vote(int idx) {
            this.idx = idx;
            this.sum = 0;
            this.weightedSum = 0;
        }

        @Override
        public int compareTo(Vote other) {
            if (this.sum > other.sum) {
                return -1;
            } else if (this.sum < other.sum) {
                return 1;
            } else {
                if (this.weightedSum > other.weightedSum) {
                    return -1;
                } else if (this.weightedSum < other.weightedSum) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        List<Vote> candidates = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            candidates.add(new Vote(i + 1));
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                int weight = scanner.nextInt();
                Vote candidate = candidates.get(j);

                candidate.sum += weight;

                switch (weight) {
                    case 2:
                        weight *= 10;
                        break;
                    case 3:
                        weight *= 100;
                        break;
                }

                candidate.weightedSum += weight;
            }
        }

        Collections.sort(candidates);

        if (candidates.get(0).weightedSum == candidates.get(1).weightedSum) {
            System.out.println(0 + " " + candidates.get(0).sum);
        } else {
            System.out.println(candidates.get(0).idx + " " + candidates.get(0).sum);
        }
    }
}
