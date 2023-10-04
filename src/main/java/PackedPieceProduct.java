public class PackedPieceProduct extends Pack{
    private PieceProduct pieceProduct;
    private double productCount;

    public PackedPieceProduct(String packName, double packWeight, String productName,
                               String productDescription, double productWeight, int productCount){
        super(packName, packWeight);
        pieceProduct = new PieceProduct(productName, productDescription, productWeight);
        this.productCount = productCount;
    }

    public double getProductCount() {
        return productCount;
    }

    public double getNetWeight(){
        return pieceProduct.getWeight() * productCount;
    }

    public double getGrossWeight(){
        return this.getNetWeight() + this.getWeight();
    }
}
