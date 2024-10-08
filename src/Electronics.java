public class Electronics extends product{
    @Override
    public int getPrice() {
        return price+10;
    }
    @Override
    public String getName() {
        return name+"s";
    }
    @Override
    public String getDescription() {
        return description+"d";
    }
}
