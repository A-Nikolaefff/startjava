public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.sex = true;
        wolf.name = "Волк";
        wolf.weight = 30;
        wolf.age = 7;
        wolf.color = "gray";
        System.out.println("Name: " + wolf.name + "\nIs male: " + wolf.sex + "\nWeight: " + wolf.weight + "\nAge: " + wolf.age + "\nColor: " + wolf.color);
        wolf.walk();
        wolf.run();
        wolf.sit();
        wolf.howl();
        wolf.hunt();
    }
}