package TurkcellStaj.SOLID;

// solidin son prensibi olan dependency injeciton üzierden duralım

public class Dependency_InjectionPrinciple {


    class MySQLDatabase {
        void save() {}
    }

    class UserService {
        private MySQLDatabase db = new MySQLDatabase();
    }
    // User service Mysql database bagımllı olmuş duurmda yeni bir db gelidğinde sapıtabilir





    interface Database {
        void save();
    }

    class MySQLDatabaseNew implements Database {
        public void save() {}
    }

    // örnek farklı bri db geldi

    class OracleSql implements Database {
        public void save() {}

    }

    class UserServiceNew {
        private final Database database;

        public UserServiceNew(Database database) {
            this.database = database;
        }
    }




}
