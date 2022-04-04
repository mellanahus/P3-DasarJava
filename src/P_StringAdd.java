/* percobaan menambahkan elemen string
 melalui parameter fungsi String
 */

public class P_StringAdd {
    public static void main(String[] args) {

        String s = "Hell";
        amethod(s);
    }

    public static void amethod(String s) {
        char c = 'o';
        s += c;
        System.out.println(s);
    }
}
