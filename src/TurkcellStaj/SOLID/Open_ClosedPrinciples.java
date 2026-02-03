package TurkcellStaj.SOLID;

public class Open_ClosedPrinciples {

    //SOLİD ikinci presnibi olan O üzerinde örnek geliştirdik
    // open close değşiime açık hataya kapalı olmalı


// Kötü örnek yeni iş kuralı geldiğinde kod üzierden değişim olacak
    class PaymentService {
        public void pay(String type) {
            if (type.equals("CREDIT")) {
                // kredi kartı
            } else if (type.equals("PAYPAL")) {
                // paypal
            }
        }
    }



    interface Payment {
        void pay();
    }

    class CreditCardPayment implements Payment {
        public void pay() { }
    }

    class PaypalPayment implements Payment {
        public void pay() { }
    }



    // yeni bir  yöntem çıktığında idre  class xxx implement payment dedin ve bitti


}
