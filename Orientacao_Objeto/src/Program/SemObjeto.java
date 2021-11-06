package Program;

import java.util.Locale;
import java.util.Scanner;

public class SemObjeto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double lx1, lx2, lx3, ly1, ly2, ly3;

        System.out.println("Type the measures of triangle X: ");
        lx1 = sc.nextDouble();
        lx2 = sc.nextDouble();
        lx3 = sc.nextDouble();

        System.out.println("Type the measures of triangle Y: ");
        ly1 = sc.nextDouble();
        ly2 = sc.nextDouble();
        ly3 = sc.nextDouble();

        double p = (lx1 + lx2 + lx3) / 2;
        double areax = Math.sqrt(p * (p - lx1) * (p - lx2) * (p - lx3));

        p = (ly1 + ly2 + ly3) / 2;
        double areay = Math.sqrt(p * (p - lx1) * (p - lx2) * (p - lx3)); 

        System.out.printf("Triangle X area: %.4f%n", areax);
        System.out.printf("Triangle Y area: %.4f%n", areay);

        if (areax > areay) {
            System.out.println("Large area: X");
        } else {
            System.out.println("Large area: Y");
        }

        sc.close();
    }
}
