public class Task1 {
    public static void main(String[] args) {
        Pack pack = new Pack("pack1", 3.4);
        System.out.println(pack);

        Product product = new Product("product", "nothing interesting");
        System.out.println(product);

        WeightProduct product1 = new WeightProduct("weight prod", "interesting!");
        System.out.println(product1);

        PackedWeightProduct packedWeightProduct = new PackedWeightProduct("Paper", 0.1,
                "Fruits", "fresh", 4.5);
        System.out.println(packedWeightProduct);

    }

}
