package TurkcellStaj;


// stream api was introduced in java 8

// way of express and process of collection of object


// Filter filtrelemeye
//map her birinde işlem yapmamıza  izin verir

// reduce agrreta işlemler


/*Collector.toLİST   VS TOLİST

List<Integer> list1 =
    nums.stream().collect(Collectors.toList());  Mutable ****

List<Integer> list2 =
    nums.stream().toList();



groupingBy nedir?

Elemanları bir anahtara göre gruplar ve genelde sonuç Map<K, List<V>> olur.



partitioningBy nedir?

Sadece iki gruba ayırır: true ve false.


*/
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        // Stream api
        List<String> names = List.of("Ali", "Veli", "Ayşe","MEHMET ","AHMET","SONER ","Mustafa");

        Stream<String> stream = names.stream();
        stream.forEach(System.out::println);
        System.out.println("   ");

        names.stream()
                .filter(n -> n.startsWith("A"))  ///  filtere a ile bşalyanalrı
                .map(String::toLowerCase)
                .map(s -> s + "hey dude")// map işlem yptıyor aryıca
                .forEach(System.out::println)

        ;


        names.stream()
                .filter(n -> n.startsWith("A"))  ///  filtere a ile bşalyanalrı
                .map(String::toLowerCase)
                .map(s -> s + "hey dude")

                // map işlem yptıyor aryıca
                .collect(Collectors.toSet()) // collect ile yeni bir şeye koy dedik sonucu ne istiyotsak ona çevirp verdik

        ;

        System.out.println(names);


// flat map kullanımıa bakabriliz



    }
}
