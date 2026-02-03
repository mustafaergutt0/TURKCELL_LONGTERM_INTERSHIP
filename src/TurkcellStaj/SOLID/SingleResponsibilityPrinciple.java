package TurkcellStaj.SOLID;

public class SingleResponsibilityPrinciple {

    class UserDto{
        private String name;
    }
    class UserServiceAnormal {

        public void register(UserDto user) {
            // kullanıcı kaydı
        }

        public void sendEmail(UserDto user) {
            // email gönderme
        }

        public void saveToDatabase(UserDto useruser) {
            // DB işlemi
        }
    }


    class UserServiceNormal {
        public void register(UserDto user) {
            // iş kuralı
        }
    }

    class EmailService {
        public void send(UserDto user) { }
    }

    class UserRepository {
        public void save(UserDto user) { }
    }


}
