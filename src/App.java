import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.print.attribute.SetOfIntegerSyntax;

public class App {
    static LucasNumbers ln = new LucasNumbers();

    public static void main(String[] args) throws Exception {
        // WHAT WAS LUCAS KNOWN FOR:
        // Lucas was a french mathematician and a professor of mathematics at the Lycée
        // Saint Louis and the Lycée Charlemagne in Paris. While mostly being known for
        // his work on fibonacci numbers he was also an artillery
        // officer in the French Army during the Franco-Prussian War of 1870–1871.

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please input to what index you would like your lucas numbers: ");
        int n = Integer.parseInt(reader.readLine());
        System.out.print("Lucas numbers from 0 to n = " + n + ": ");
        for (int i = 0; i <= n; i++) {
            long startTime = System.nanoTime();
            int lucasnum = LucasNumbers.lucasNumberAns(i);
            long endTime = System.nanoTime();
            long dur = endTime - startTime;
            System.out.println("The answer for n = " + i + " is " + lucasnum + ", this index ran for " + dur
                    + " nanoseconds");
        }
        System.exit(0);

    }
}
