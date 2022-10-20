public class Van extends Vehicle{
    public Van(int weight) {
        super(weight);
    }
    @Override
    public int getWeight() {
        return super.getWeight();
    }

    @Override
    public String getType() {
        return "Van";
    }
}
