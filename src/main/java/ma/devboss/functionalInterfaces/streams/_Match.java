package ma.devboss.functionalInterfaces.streams;


public class _Match {
    public static void main(String[] args) {
        boolean anyMatch = ProductDataProvider.productList.stream().anyMatch(p->"HP Laser E65".equals(p.getName()));
        boolean allMatch = ProductDataProvider.productList.stream().allMatch(p->"HP Laser E65".equals(p.getName()));
        boolean noneMatch = ProductDataProvider.productList.stream().noneMatch(p->"HP Laser ".equals(p.getName()));
        System.out.println(anyMatch); // true if at last one match
        System.out.println(allMatch); // true if all match
        System.out.println(noneMatch); // true if no one match
        Product p = ProductDataProvider.getProductById(18);
        System.out.println(p);

    }
}
