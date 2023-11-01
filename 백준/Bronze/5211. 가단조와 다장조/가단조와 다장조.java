import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        String[] line = input.split("\\|");

        String[] adeMinor = {"A", "D", "E"};
        String[] cfgMajor = {"C", "F", "G"};

        int adeMinorCount = 0;
        int cfgMajorCount = 0;

        for (String segment : line) {
            if (segment.charAt(0) == 'A' || segment.charAt(0) == 'D' || segment.charAt(0) == 'E') {
                adeMinorCount++;
            }
            if (segment.charAt(0) == 'C' || segment.charAt(0) == 'F' || segment.charAt(0) == 'G') {
                cfgMajorCount++;
            }
        }

        if (adeMinorCount == cfgMajorCount) {
            if (line[line.length - 1].charAt(line[line.length - 1].length() - 1) == 'C'
                    || line[line.length - 1].charAt(line[line.length - 1].length() - 1) == 'F'
                    || line[line.length - 1].charAt(line[line.length - 1].length() - 1) == 'G') {
                cfgMajorCount++;
            }
            if (line[line.length - 1].charAt(line[line.length - 1].length() - 1) == 'A'
                    || line[line.length - 1].charAt(line[line.length - 1].length() - 1) == 'D'
                    || line[line.length - 1].charAt(line[line.length - 1].length() - 1) == 'E') {
                adeMinorCount++;
            }
        }

        if (adeMinorCount < cfgMajorCount) {
            System.out.println("C-major");
        } else {
            System.out.println("A-minor");
        }
    }
}
