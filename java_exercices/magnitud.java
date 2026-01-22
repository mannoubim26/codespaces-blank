import java.util.Scanner;
class Main {
        public static String magnitude_R(double magnitude) {
            int category = 0;
            if (magnitude < 2.0) {
                category = 1; // Micro
            } else if (magnitude < 4.0) {
                category = 2; // Minor
            } else if (magnitude < 5.0) {
                category = 3; // Light
            } else if (magnitude < 6.0) {
                category = 4; // Moderate
            } else if (magnitude < 7.0) {
                category = 5; // Strong
            } else if (magnitude < 8.0) {
                category = 6; // Major
            } else {
                category = 7; // Great
            }
            switch (category){
                case 0:
                case 1:
                    return "micro";
                case 2 :
                    return "minor";
                case 3:
                    return "light";
                case 4:
                    return "moderate";
                case 5:
                    return "strong";
                case 6:
                    return "major";
                case 7:
                    return "great";
            }
        return "" + magnitude;
        }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double magnitude;
        do {
            System.out.println("Enter magnitude:");
            magnitude = scanner.nextDouble();
            if (magnitude < 0) {
                System.out.println("Magnitude cannot be negative. Please try again.");
            }
        } while (magnitude < 0);

        String result = magnitude_R(magnitude);
        System.out.println(result);

        scanner.close();
    }
}
