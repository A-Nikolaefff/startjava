public class Wolf {
    private boolean sex;
    private String name;
    private int weight;
    private int age;
    private String color;

    public boolean getSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("������������ �������");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void walk() {
        System.out.println("����");
    }

    public void run() {
        System.out.println("�����");
    }

    public void sit() {
        System.out.println("�����");
    }

    public void howl() {
        System.out.println("����");
    }

    public void hunt() {
        System.out.println("���������");
    }
}