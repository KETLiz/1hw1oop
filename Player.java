public class Player {
    //static long idCounter;
    static long id;
    protected String name;
    protected double damage;
    protected double hp;

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, double damage, double hp) {
        this(name);
        this.damage = damage;
        this.hp = hp;
    }

    public long idInfo() {
        id++;
        return id;
    }

    public void getInfo() {
        System.out.println("Это персонаж с именем: " + name + " его id: " + idInfo());
    }

    public void getDamage(double damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
            System.out.println("Осталось здоровья: " + hp);
        } else {
            System.out.println("die");
        }
    }
    
    public void attack(Player player) {
        player.getDamage(damage);
    }
}
