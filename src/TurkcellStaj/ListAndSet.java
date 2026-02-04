package TurkcellStaj;


import java.util.*;


//
 /*


 Mülakatçı seni köşeye sıkıştırmak için şunu sorabilir:
"Peki, Arrays.asList ile List.of arasındaki fark nedir?"

Bu soru "Junior" ile "Mid-level" yazılımcıyı ayıran sorudur:

Arrays.asList: İçindeki bir elemanı güncelleyebilirsin (set metodu çalışır), ama yeni eleman ekleyemezsin. Ayrıca null elemana izin verir.

List.of: Tamamen "salt okunur"dur. Hiçbir şeyi değiştiremezsin, güncelleyemezsin. null eleman eklersen anında hata fırlatır.


 Arras.asList
 List.of

*/

// list ve set farkı
public class ListAndSet {

    static void main() {
        List<String> mystrin=new ArrayList<String>();

        List<Integer> myint=new ArrayList<>(Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9,10}));
        mystrin.add("1");
        mystrin.add("3");
        mystrin.add("2");

        mystrin.add("4");
        System.out.println(mystrin);


        Set<String> mySet=new HashSet<String>();
        mySet.add("1");
        mySet.add("2");
        mySet.add("2");
        mySet.add("4");
        mySet.add("3");

        mySet.add("125");

        System.out.println(mySet);


        List<String> kilitliListe = Arrays.asList("A", "B");
        kilitliListe.add("C"); // HATA! (Runtime Error)


        List<String> esnekListe = new ArrayList<>(Arrays.asList("A", "B"));
        esnekListe.add("C"); // ÇALIŞIR! Liste ["A", "B", "C"] olur.

         ///  hast set


        HashSet<StringBuilder> set = new HashSet<>();
        StringBuilder sb = new StringBuilder("Java");

        set.add(sb);
        sb.append("Kursu"); // Objeyi içerden değiştirdik!

        System.out.println(set.contains(sb));
        // çıktı java kursu olacak


        // Hash set için mülakat sorusu

        class Ogrenci {
            String isim;
            int id;
            Ogrenci(int id, String isim) { this.id = id; this.isim = isim; }
        }

// Mülakat Kodu:
        HashSet<Ogrenci> MulakaSet = new HashSet<>();
        MulakaSet.add(new Ogrenci(1, "Ali"));
        MulakaSet.add(new Ogrenci(1, "Ali"));

        System.out.println(MulakaSet.size());
        // çıktı iki olacak




    }




    ArrayList<Integer> liste = new ArrayList<>(10);
   // elemanları boşra on tane depolayabilri demek

    // HASH SET İÇİN






}
