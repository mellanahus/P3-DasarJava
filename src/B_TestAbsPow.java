/* percobaan menggunakan fungsi nilai absolut(abs),
perpangkatan(pow) dan akar(sqrt)
 */

import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class B_TestAbsPow {
    public static void main(String[] args) {

        // abs() and signum()
        // sin(), cos(), tan(), acos(), asin(), atan()
        // pow() and sqrt()
        System.out.println("Nilai absolut -5 adalah "+abs(-5));
        System.out.println("Nilai 2 pangkat 3 adalah "+pow(2, 3));
        System.out.println("Nilai 8 pangkat 1/3 adalah "+pow(8, (1/3.0)));
        System.out.println("Akar kuadrat dari 64 adalah "+sqrt(64));
    }
}
