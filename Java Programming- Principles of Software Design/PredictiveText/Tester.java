
/**
 * Write a description of class Tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import edu.duke.*;

public class Tester {
    public void testGetFollows() {
       // FileResource fr = new FileResource();
       String st =  "this is a test yes this is a test.  ";
       MarkovOne m1 = new MarkovOne();
       System.out.println(m1.getFollows("t") + "size = " + m1.getFollows(st).size());
       
    }
    
    public  void testGetFollowsWithFile() {
        FileResource fr = new FileResource("data/confucius.txt");
        String st = fr.asString();
        st = st.replace('\n', ' ');
        MarkovOne markov = new MarkovOne();
        markov.setRandom(88);
        markov.setTraining(st);
        ArrayList<String> list = markov.getFollows("he");
        System.out.println(list.size());
    }

}
