import java.util.Objects;

public class WeightProduct extends Product{

    public WeightProduct(String name, String description){
        super(name, description);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WeightProduct product)) return false;
        return getName().equals(product.getName()) && getDescription().equals(product.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getDescription());
    }

    @Override
    public String toString() {
        return getName() + ": " + getDescription();
    }
}
