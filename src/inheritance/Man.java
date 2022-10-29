package inheritance;

public class Man {
    protected String name;
    protected int age;
    protected double weight;
    public enum Sex{
        MAN,
        WOMEN
    }
    protected Sex sex;

    protected Man(String name, int age, double weight, Sex sex){
        this.name = name;
        this.age= age;
        this.weight = weight;
        this.sex = sex;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

}
