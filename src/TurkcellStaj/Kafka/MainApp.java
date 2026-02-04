package TurkcellStaj.Kafka;

import TurkcellStaj.Kafka.KafkaManager;
import TurkcellStaj.Kafka.SiparisConsumer;
import TurkcellStaj.Kafka.SiparisProducer;

public class MainApp {
    public static void main(String[] args) throws InterruptedException {
        // 1. Topic Oluştur
        KafkaManager.topicOlustur("siparis-takip");

        // 2. Consumer'ı ayrı bir Thread'de başlat (Uygulama donmasın)
        Thread consumerThread = new Thread(() -> {
            new SiparisConsumer().dinlemeyeBasla();
        });
        consumerThread.start();

        Thread.sleep(2000); // Sistemin oturması için kısa bir bekleme

        // 3. Producer ile mesajlar gönder
        SiparisProducer producer = new SiparisProducer();
        String[] urunler = {"Laptop", "Telefon", "Klavye", "Mouse", "Monitör"};

        for (int i = 0; i < 10; i++) {
            producer.siparisGonder("ID-" + i, urunler[i % urunler.length]);
            Thread.sleep(1000);

        }
    }
}