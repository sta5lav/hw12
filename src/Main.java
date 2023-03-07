public class Main {
    public static void main(String[] args) {
        Autor levTolstoy = new Autor("Лев", "Толстой");
        Autor levTolstoy2 = new Autor("Лев", "Толстой");
        Book voynaIMir = new Book("Война и мир", levTolstoy, 1863);
        Book voynaIMir2 = new Book("Война и мир", levTolstoy, 1863);
        System.out.println(voynaIMir);
        voynaIMir.setDatePublication(1869);
        System.out.println(voynaIMir);
        Autor alexandrPushkin = new Autor("Александр", "Пушкин");
        Book eugeniyOnegin = new Book("Евгений Онегин", alexandrPushkin, 1831);
        System.out.println(eugeniyOnegin);
        eugeniyOnegin.setDatePublication(1832);
        System.out.println(eugeniyOnegin);
        System.out.println(levTolstoy2.equals(levTolstoy));
        System.out.println(voynaIMir2.hashCode());
        System.out.println(voynaIMir.hashCode());

    }
}