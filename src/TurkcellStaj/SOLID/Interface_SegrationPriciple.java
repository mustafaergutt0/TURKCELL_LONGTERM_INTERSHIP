package TurkcellStaj.SOLID;

// I maddesi olan interface segration principle maddesine bakıyouz
// temel mantık interfacleri de ayırmak bagımlığı düşmek aşagıdaki örnkete bir class olsa robot eat ihtiyac olmayack



public class Interface_SegrationPriciple {
    interface Worker {
        void work();
        void eat();
    }

    class robot implements Worker {
        public void work() {

        }
        public void eat() {
            // burası anlamsız oldu yani böyle değil
        }
    }


    interface Workable {
        void work();
    }

    interface Eatable {
        void eat();
    }

    class Human implements  Eatable,Workable {
        public void eat() {}
        public void work() {}
        // burası mantıklı oldu şimdi robota bakalım
    }

    class robotYeni implements  Workable{
        public void work() {}
        // evet yani eablte ayırmış olduk
        // şişman interface ynai gereksi interface hem kullnamadık hemde gereksi methotu c
        // Client kullanmadığı methodu zorla eklemedik

    }





}
