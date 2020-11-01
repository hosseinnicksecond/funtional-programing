package home.train;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> someBingo= Arrays.asList(
                "N40","N36","B12","B6","G53","G49","g69",
                "G60","G50","I26","I17","I29","O71"
        );

        List<String> gNumber=new ArrayList<>();

        {//without Stream
            someBingo.forEach(n -> {
                if (n.toUpperCase().startsWith("G")) {
                    gNumber.add(n);
                }
            });

            gNumber.sort((String s1, String s2) -> s1.compareTo(s2));
            gNumber.forEach(s -> System.out.println(s));
        }
    }
}
