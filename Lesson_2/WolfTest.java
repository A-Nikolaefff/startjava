public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setSex(true);
        wolf.setName("Новый волк");
        wolf.setWeight(20);
        wolf.setAge(4);
        wolf.setColor("black");
        System.out.println("Name: " + wolf.getName());
        System.out.println("Is male: " + wolf.getSex());
        System.out.println("Weight: " + wolf.getWeight());
        System.out.println("Age: " + wolf.getAge());
        System.out.println("Color: " + wolf.getColor());
    }
}