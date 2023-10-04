import java.util.ArrayList;

public class ProductsBatch {
    private ArrayList<PackedWeightProduct> weightProducts;
    private ArrayList<PackedPieceProduct> pieceProducts;

    public ProductsBatch(ArrayList<PackedWeightProduct> weightProducts, ArrayList<PackedPieceProduct> pieceProducts){
        this.weightProducts = weightProducts;
        this.pieceProducts = pieceProducts;
    }

    public ArrayList<PackedWeightProduct> getWeightProducts() {
        return weightProducts;
    }

    public ArrayList<PackedPieceProduct> getPieceProducts() {
        return pieceProducts;
    }

    public double getSumWeight(){
        double sum = 0;
        for (PackedWeightProduct item: weightProducts){
            sum += item.getGrossWeight();
        }
        for (PackedPieceProduct item: pieceProducts){
            sum += item.getGrossWeight();
        }
        return sum;
    }
}
