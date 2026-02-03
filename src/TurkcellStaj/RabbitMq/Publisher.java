package TurkcellStaj.RabbitMq;


import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;


public class Publisher {




    private final static String KUYRUK_ADI = "deneme_kuyrugu";

    public static void main(String[] args) {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost"); // Docker'da çalıştığı için localhost

        try (Connection connection = factory.newConnection();
             Channel channel = connection.createChannel()) {

            // Kuyruğu oluştur (yoksa açar, varsa dokunmaz)
            channel.queueDeclare(KUYRUK_ADI, false, false, false, null);
            int i =0;
            while(true){
                String mesaj =  i  + ". ci mesaj gidiyor  Merhaba RabbitMQ! IntelliJ'den geldim.";
                channel.basicPublish("", KUYRUK_ADI, null, mesaj.getBytes());


                System.out.println(" Mesaj başarıyla gönderildi: " + mesaj);
                i++;
                Thread.sleep(1000);  // 1 saniye beklesin o zaman
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
