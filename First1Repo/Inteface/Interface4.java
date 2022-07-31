public class Interface4 {
    String name;
    double height_in_inches;
    public Interface4(String name, double height_in_inches, double weight) {
        this.name = name;
        this.height_in_inches = height_in_inches;
        this.weight = weight;
    }
    double weight;
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Interface4 [height_in_inches=" + height_in_inches + ", name=" + name + ", weight=" + weight + "]";
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getHeight_in_inches() {
        return height_in_inches;
    }
    public void setHeight_in_inches(double height_in_inches) {
        this.height_in_inches = height_in_inches;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    
}
