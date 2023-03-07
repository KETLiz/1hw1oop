public class Program {
    public static void main(String[] args) {
        Infantryman p1 = new Infantryman("Tom");
        p1.getInfo();
        Bowman p2 = new Bowman("Bob");
        p2.getInfo();
        p1.attack(p2);
    }
}