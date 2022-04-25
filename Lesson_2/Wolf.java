public class Wolf {
    public boolean sex;
    public String name;
    public int weight;
    public int age;
    public String color;

    public void walk() {
        System.out.println(name + " идет");
    }

    public void run() {
        System.out.println(name + " бежит");
    }

    public void sit() {
        System.out.println(name + " cидит");
    }

    public void howl() {
        System.out.println(name + " воет");
    }

    public void hunt() {
        System.out.println(name +" охотится");
    }
}