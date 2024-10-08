public class Clothing extends product{
    @Override
    public int getPrice() {
        return price+30;
    }
    @Override
    public String getName() {
        return name+"r";
    }
    @Override
    public String getDescription() {
        return description+"f";
    }
}
