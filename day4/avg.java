public class avg {
    public static void main(String[] args) {
        int[][] scores = {
            {85, 78, 90, 88},
            {76, 85, 83, 80},
            {91, 89, 92, 94}
        };
        for (int i = 0; i < scores.length; i++) {
            double total = 0;
            for (int j = 0; j < scores[i].length; j++) {
                total += scores[i][j];
            }
            double average = total / scores[i].length;
            System.out.printf("Student %d: %.2f%n", i + 1, average);
        }
        if (scores.length > 0) {
            int numSubjects = scores[0].length;
            double[] totals = new double[numSubjects];

            for (int j = 0; j < numSubjects; j++) {
                double total = 0;
                for (int i = 0; i < scores.length; i++) {
                    total += scores[i][j];
                }
                totals[j] = total / scores.length;
            }
            System.out.println("Average scores for each subject:");
            String[] subjects = {"Math", "Science", "English", "History"};
            for (int j = 0; j < numSubjects; j++) {
                System.out.printf("%s: %.2f%n", subjects[j], totals[j]);
            }
        }
    }
}