public class MilhasDistance implements DistanceInterface{
    private double distance;

    @Override
    public double getDistance() {
        return this.distance;
    }

    @Override
    public void setDistance(double distance) {
        this.distance = distance;
    }
}