import java.util.Objects;

public class PieceProduct extends Product{
    private double weight;

    public PieceProduct(String name, String description, double weight){
        super(name, description);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PieceProduct that)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(that.getWeight(), getWeight()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getWeight());
    }
}
