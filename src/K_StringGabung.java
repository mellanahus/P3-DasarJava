// percobaan menggabungkan dua buah String

public class K_StringGabung {
    public static void main(String[] args) {

        // menggabungkan 2 buah string
        String str1 = "RPL";
        String str2 = "POLBENG";
        String str3 = str1+str2;
        System.out.println(str3);

        String str4 = str3.concat("2020");
        System.out.println(str4);

        str3 += str2;
        System.out.println(str3);
    }
}
