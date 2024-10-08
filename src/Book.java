public class Book extends product{
    @Override
    public int getPrice() {
        return price+20;
    }
    @Override
    public String getName() {
        return name+"p";
    }
    @Override
    public String getDescription() {
        return description+"s";
    }
}
