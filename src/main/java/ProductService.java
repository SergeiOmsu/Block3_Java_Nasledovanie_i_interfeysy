public class ProductService {
    public int countByFilter(ProductsBatch productsBatch, BeginStringFilter beginStringFilter){
        int count = 0;
        BeginStringFilter filter = new BeginStringFilter("Fruits");
        for (PackedWeightProduct item: productsBatch.getWeightProducts()){
            if (beginStringFilter.apply(item.getName()))
                count++;
            }
        return count;
        }
}
