// implmentasi HashMap

import java.util.HashMap;
import java.util.Map;

public class X_BukuHashMap {
    public static void main(String[] args) {

        // Percobaan mengisi value HashMap dengan objek Buku

         class Buku {

            private String title;
            private String author;

            public Buku(String title, String author) {
                this.title = title;
                this.author = author;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
            }
        }

        // membuat objek hashmap
        HashMap<String, Buku> books = new HashMap<>();

        // membuat objek buku
        Buku bukuJava  = new Buku("Tutorial Java", "Petani Kode");
        Buku bukuKotlin = new Buku("Pemrograman  Kotlin", "Petani Kode");
        Buku bukuAndroid  = new Buku("Pemrograman  Android", "Petani Kode");

        // mengisi objek hashmap dengan objek buku
        books.put("java", bukuJava);
        books.put("kotlin", bukuKotlin);
        books.put("android", bukuAndroid);

        // Print keys
        System.out.println("\nDaftar  key :   ");
        for (String i   :   books.keySet()) {
            System.out.println(i);
        }

        // Print values
        System.out.println("\nDaftar values :  ");
        for (Buku aBook: books.values()) {
            System.out.println("Title :   " + aBook.getTitle() + ",Author:" + aBook.getAuthor());
        }

        // cetak semua buku
        for (Map.Entry b :   books.entrySet())  {
            Buku buku = (Buku) b.getValue();
            System.out.println(b.getKey()  + ": "+ buku.getTitle());

        }
}
}