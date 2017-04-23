
/**
 * Write a description of class DepthFilter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DepthFilter implements Filter {
    private double minDepth;
    private double maxDepth;
    private String name = "Depth filter";
    public DepthFilter(double min, double max) {
        minDepth = min;
        maxDepth = max;
    }
    public double getMinDepth() {
        return minDepth;
    }
    public double getMaxDepth() {
        return maxDepth;
    }
    public boolean satisfies(QuakeEntry qe) {
        return (qe.getDepth() >= minDepth && qe.getDepth() <= maxDepth);
    }
    public String getName(){
        return name;
    }

}