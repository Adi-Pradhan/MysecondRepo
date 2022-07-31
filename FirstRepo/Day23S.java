public class Day23S {
    int age;
    String name;
    int salary;
    public int getAge() {
        return age;
    }
    public Day23S(int age, String name, int salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Day23S [age=" + age + ", name=" + name + ", salary=" + salary + "]";
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
