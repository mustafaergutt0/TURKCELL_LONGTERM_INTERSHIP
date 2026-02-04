package TurkcellStaj.Kafka;

import org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import java.util.Collections;
import java.util.Properties;

public class KafkaManager {

    public static void topicOlustur(String topicAdi) {
        Properties props = new Properties();
        props.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");

        try (AdminClient adminClient = AdminClient.create(props)) {
            NewTopic yeniTopic = new NewTopic(topicAdi, 3, (short) 1); // kaç portion olacagı
            adminClient.createTopics(Collections.singletonList(yeniTopic));
            System.out.println("Topic hazır: " + topicAdi);
        } catch (Exception e) {
            // Topic zaten varsa hata verebilir, projeyi durdurmaya gerek yok
            System.out.println("Topic zaten mevcut veya oluşturulamadı.");
        }
    }
}
