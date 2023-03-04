public class Main {
    public static void main(String[] args) {
        Autor levTolstoy = new Autor("Лев", "Толстой");
        Book voynaIMir = new Book("Война и мир", levTolstoy, 1863);
        voynaIMir.printInfo();
        voynaIMir.setDatePublication(1869);
        voynaIMir.printInfo();
        Autor alexandrPushkin = new Autor("Александр", "Пушкин");
        Book eugeniyOnegin = new Book("Евгений Онегин", alexandrPushkin, 1831);
        eugeniyOnegin.printInfo();
        eugeniyOnegin.setDatePublication(1832);
        eugeniyOnegin.printInfo();
    }
}