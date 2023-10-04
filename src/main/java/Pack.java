import java.util.Objects;

public class Pack {
    private String name;
    private double weight;

    public Pack(String name, double weight){
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pack that)) return false;
        return Double.compare(that.getWeight(), getWeight()) == 0 && getName().equals(that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getWeight());
    }

    @Override
    public String toString() {
        return getName() + ": " + getWeight();
    }
}
