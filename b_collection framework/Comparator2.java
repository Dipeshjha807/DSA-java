public class Comparator2 implements Comparable<Comparator2> {

    private int age;
    private String name;
    private int weight;

    // Constructor
    public Comparator2(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for weight
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
@Override
public String toString() {
    return "Comparator2{" +
            "age=" + age +
            ", name='" + name + '\'' +
            ", weight=" + weight +
            '}';
}

@Override
public int compareTo(Comparator2 that) {
    return this.age - that.age;
}
}