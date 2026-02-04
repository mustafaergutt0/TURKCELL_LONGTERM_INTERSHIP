package TurkcellStaj.Kafka;

import org.apache.kafka.clients.admin.TopicDescription;
import org.apache.kafka.clients.producer.*;
import org.apache.kafka.common.serialization.StringSerializer;
import java.util.Properties;

public class SiparisProducer {
    private KafkaProducer<String, String> producer;


    public SiparisProducer() {
        Properties props = new Properties();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        this.producer = new KafkaProducer<>(props);
    }

    public void siparisGonder(String id, String icerik) {
        // ID'yi key olarak veriyoruz ki Kafka bunu Partition'lara dağıtsın
        ProducerRecord<String, String> record = new ProducerRecord<>("siparis-takip", id, icerik);

        producer.send(record, (metadata, e) -> {
            if (e == null) {
                System.out.printf("Gönderildi -> Partition: %d | Offset: %d | Sipariş: %s%n",
                        metadata.partition(), metadata.offset(), icerik);
            }
        });
    }
}