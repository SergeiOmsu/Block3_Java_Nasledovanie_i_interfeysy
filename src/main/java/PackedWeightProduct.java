public class PackedWeightProduct extends Pack{
    private WeightProduct weightProduct; // Весовой товар
    private double productWeight; // Вес товара

    public PackedWeightProduct(String packName, double packWeight, String productName,
                               String productDescription, double productWeight){
        super(packName, packWeight);
        weightProduct = new WeightProduct(productName, productDescription);
        this.productWeight = productWeight;
    }

    public double getNetWeight(){
        return productWeight;
    }

    public double getGrossWeight(){
        return this.getNetWeight() + this.getWeight();
    }

    @Override
    public String toString(){
        return this.getName() + " " + this.getWeight() + " " + weightProduct.getName() + " "
                + weightProduct.getDescription() + " " + this.productWeight;
    }

}
