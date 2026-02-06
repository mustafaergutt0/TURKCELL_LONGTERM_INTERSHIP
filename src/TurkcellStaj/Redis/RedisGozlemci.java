package TurkcellStaj.Redis;

import redis.clients.jedis.Jedis;
import java.io.*;
import java.util.Scanner;


// Jedis Redis cache mechanicsm

// fakrını görmek için normaal txt den veriyi alıp okuyoruz birde redisten cachelenmiş veriyi aradak fark muazzam
// birde bunun milyonlarca veri olan db geldiğin düşünsene


public class RedisGozlemci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mustafa Ergut Hoşgeldiniz burda süre farkını görmek için varız ");
        System.out.println( "***********************");
        System.out.print("Kaydedilecek Kullanıcı Adı: ");
        String kullaniciAdi = scanner.nextLine();

        // 1. ADIM: KAYIT (YAZMA)
        // Redis'e Yazma
        try (Jedis jedis = new Jedis("localhost", 6379)) {
            jedis.set("kullanici", kullaniciAdi);



            // Dosyaya Yazma
            FileWriter writer = new FileWriter("veritabani.txt");
            writer.write(kullaniciAdi);
            writer.close();

            System.out.println("\n--- Kayıt Başarılı! Okuma Testi Başlıyor ---\n");

            // 2. ADIM: DOSYADAN OKUMA VE SÜRE ÖLÇÜMÜ
            long dosyaBaslangic = System.nanoTime();
            BufferedReader reader = new BufferedReader(new FileReader("veritabani.txt"));
            String dosyaVeri = reader.readLine();
            reader.close();
            long dosyaBitis = System.nanoTime();
            long dosyaSure = dosyaBitis - dosyaBaslangic;

            // 3. ADIM: REDIS'TEN OKUMA VE SÜRE ÖLÇÜMÜ
            long redisBaslangic = System.nanoTime();
            String redisVeri = jedis.get("kullanici");
            long redisBitis = System.nanoTime();
            long redisSure = redisBitis - redisBaslangic;

            // SONUÇLARI KARŞILAŞTIRMA
            System.out.println("Dosyadan Okunan: " + dosyaVeri + " | Süre: " + dosyaSure + " ns");
            System.out.println("Redis'ten Okunan: " + redisVeri + " | Süre: " + redisSure + " ns");

            if (redisSure < dosyaSure) {
                double kat = (double) dosyaSure / redisSure;
                System.out.printf("\nSonuç: Redis, Dosyadan %.2f kat daha hızlı!\n", kat);
            }

        } catch (Exception e) {
            System.out.println("Hata: " + e.getMessage());
        }
    }
}