import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final String input01 = br.readLine();
        System.out.print(solution(input01));
    }

    private static String solution(String input01) {
        final int LIMIT = 3;
        final List<Integer> coordinateList = Arrays.stream(input01.split(" "))
                .map(Integer::parseInt)
                .sorted()
                .collect(Collectors.toList());

        List<Integer> abcList = new ArrayList<>();
        abcList.add(coordinateList.get(0));
        abcList.add(coordinateList.get(1));
        abcList.add(coordinateList.get(coordinateList.size() - 2) - coordinateList.get(1));

        StringBuilder sb = new StringBuilder();
        IntStream.range(0, LIMIT).forEach(idx ->
                sb.append(abcList.get(idx)).append(" ")
        );

        sb.setLength(sb.length() - 1);
        return sb.toString();
    }
}