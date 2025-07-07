public class Main {
    public static void main(String[] args) {
        Hero h = new Hero(40,"ミナト");
        System.out.println(h.getName() + "の現在のHP: " + h.getHp());

        King k = new King();
        k.talk(h);

        Inn i = new Inn();
        i.checkIn(h);
        h.sleep();
        System.out.println(h.getName() + "の現在のHP: " + h.getHp());
        System.out.println(h.getName() + "は、眠って回復した！");

        Matango m = new Matango("お化けキノコ",'A');
        h.attack(m);

    }
}