public class gräs extends typ{
    double suportRate;

    public gräs(double growthRate, double eatRate, double suportRate) {
        super(growthRate, eatRate);
        this.suportRate = suportRate;
    }

    @Override
    public double getFinalGrowthRate(){
        return growthRate * suportRate * getNearbyGras();
    }

    public double getFinaleatRate(){
        return growthRate * suportRate * getNearbyGras();
    }
}
