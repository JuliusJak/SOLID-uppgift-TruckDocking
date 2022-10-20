public class SmallTruck extends Vehicle{
    public SmallTruck(int weight) {
        super(weight);
    }
    @Override
    public int getWeight() {
        return super.getWeight();
    }

    @Override
    public String getType() {
        return "Small truck";
    }
}
