package TurkcellStaj.DesingPattern;

/*/

Kendisi bir creational desing pattern sınıfından

//   interfaces for creating objes but lets subclass which object to instatiate

loose coupling
scability
flexbility

testebility moockkk

a way to create object without exposing the creation logic to client

nesne oluştumra işini merkezlişteririr
new anahtarı izolo eder



/*** OPen closed pricniple destekler

 */




// 1. Ürün Arayüzü
interface Bildirim {
    void mesajGonder();
}

// 2. Somut Ürünler
class EmailBildirim implements Bildirim {
    public void mesajGonder() { System.out.println("E-posta gönderildi."); }
}

class SMSBildirim implements Bildirim {
    public void mesajGonder() { System.out.println("SMS gönderildi."); }
}

// 3. Factory Sınıfı
class BildirimFabrikasi {
    // Nesne üretiminden sorumlu olan metod
    public Bildirim olustur(String tip) {
        if (tip == null || tip.isEmpty()) return null;

        return switch (tip.toLowerCase()) {
            case "email" -> new EmailBildirim();
            case "sms" -> new SMSBildirim();
            default -> throw new IllegalArgumentException("Bilinmeyen tip: " + tip);
        };
    }
}

// 4. Kullanım (Main Class)
public class Factory {
    public static void main(String[] args) {
        BildirimFabrikasi fabrika = new BildirimFabrikasi();

        // İstemci, somut sınıfları (new SMSBildirim) bilmek zorunda değil
        Bildirim b1 = fabrika.olustur("email");
        b1.mesajGonder();

        Bildirim b2 = fabrika.olustur("sms");
        b2.mesajGonder();
    }
}