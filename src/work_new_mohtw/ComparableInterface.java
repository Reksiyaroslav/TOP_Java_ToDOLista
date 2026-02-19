package work_new_mohtw;



public class ComparableInterface {
    public static void main(String[] args) {
        Product product1 = new Product("banan",10);
        Product product2 = new Product("banan",10);
        Product product3 = new Product("aple",20);
        String name = "gas";
        String name_ = "gas";
        Product2 product5 = new Product2("banan",10);
        Product product4;
        product4 = (Product) product5;
//        boolean r = product1==product2;
//        System.out.println(r);
        boolean e = product1.equals(product2);
        boolean e1= product1.equals(product4);
        System.out.println(e);
        System.out.println(e1);
        System.out.print("product1 "+" "+product1.getPrise()
                +" product2 "+product2.getPrise()+" product3 "+product3.getPrise() );

    }
}
