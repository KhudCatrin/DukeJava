
/**
 * Write a description of class DistanceFilter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DistanceFilter implements Filter{
    private Location location;
    private double maxDist;
    private String name = "Distance filter";
    public Location getLocation(){
        return location;
    }
    public double getMaxDist(){
        return maxDist;
    }
    public DistanceFilter(Location loc, double max) {
        location = loc;
        maxDist = max;
    }
    public boolean satisfies(QuakeEntry qe) {
        return (qe.getLocation().distanceTo(location) < maxDist);
    }
    public String getName(){
        return name;
    }

}
