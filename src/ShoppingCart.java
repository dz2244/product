public class ShoppingCart extends  product{
    int sum = 0;
    product [] list = new product[10];
    public  void calculateTotal(){
        for(product i: list)
        {
            sum += i.getPrice();
        }

    }
}
