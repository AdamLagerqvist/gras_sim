public class typ {
    double growthRate;
    double eatRate;

    public typ(double growthRate, double eatRate) {
        this.growthRate = growthRate;
        this.eatRate = eatRate;
    }

    public double getFinalGrowthRate(){
        return growthRate;
    }

    public double getFinaleatRate(){
        return eatRate;
    }
}
