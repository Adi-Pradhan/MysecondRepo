package Stream8;

public class Aditya1 {
    int height;
    double sal;
    String job;
    int weight;
    public Aditya1(int height, double sal, String job, int weight) {
        this.height = height;
        this.sal = sal;
        this.job = job;
        this.weight = weight;
    }
    public int getHeight() {
        return height;
    }
    @Override
    public String toString() {
        return "Aditya1 [height=" + height + ", job=" + job + ", sal=" + sal + ", weight=" + weight + "]";
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public double getSal() {
        return sal;
    }
    public void setSal(double sal) {
        this.sal = sal;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
}
