package TurkcellStaj.DesingPattern;

class Singleton {
    private static Singleton obj = new Singleton();   // bir kere oluşturudk  // static olutşturan bunu
    // direk class verdik yoksa
    private Singleton() {}     // dışardan erişime kapadık

    public static Singleton getInstance() {
        // sadece tek oluşturlan objeyi ver yeni oluşturmasını engelledik



        return obj; }
}