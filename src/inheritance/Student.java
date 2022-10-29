package inheritance;

public class Student extends Man{
    protected int year;
    public Student(String name, int age, double weight, Sex sex, int year){
        super(name, age, weight, sex);
        this.year = year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int increaseYear(int number){
        year+=number;
        return year;
    }

}
