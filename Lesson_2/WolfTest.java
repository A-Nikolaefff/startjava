public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.walk();
        wolf.run();
        wolf.sit();
        wolf.howl();
        wolf.hunt();
        wolf.setSex(true);
        wolf.setName("The Big Bad Wolf");
        wolf.setWeight(30);
        wolf.setAge(7);
        wolf.setColor("gray");
        System.out.println("Name: " + wolf.getName());
        System.out.println("Is male: " + wolf.getSex());
        System.out.println("Weight: " + wolf.getWeight());
        System.out.println("Age: " +wolf.getAge());
        System.out.println("Color: " + wolf.getColor());
    }
}