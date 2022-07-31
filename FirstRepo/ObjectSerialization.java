import java.io.Serializable;

public class ObjectSerialization implements Serializable{
    int age;
    String name;
    Boolean salary;
    int weight;
    public int getAge() {
        return age;
    }
    public ObjectSerialization(int age, String name, Boolean salary, int weight) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.weight = weight;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Boolean getSalary() {
        return salary;
    }
    public void setSalary(Boolean salary) {
        this.salary = salary;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    
}