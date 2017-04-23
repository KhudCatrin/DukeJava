
/**
 * Write a description of class MarkovFour here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Random;
import java.util.ArrayList;

public class MarkovFour {

    private String myText;
	private Random myRandom;
	
	public MarkovFour() {
		myRandom = new Random();
	}
	
	public void setRandom(int seed){
		myRandom = new Random(seed);
	}
	
	public void setTraining(String s){
		myText = s.trim();
	}
	
	public String getRandomText(int numChars){
		if (myText == null){
			return "";
		}
		StringBuilder sb = new StringBuilder();
		int index = myRandom.nextInt(myText.length() - 5);
		String key = myText.substring(index, index + 4);
		sb.append(key);
		for(int k=0; k < numChars - 4; k++){
		    ArrayList<String> follows = getFollows(key);
		    if (follows.size() == 0) {
		        break;
		      }
			index = myRandom.nextInt(follows.size());
			String next = follows.get(index);
			sb.append(next);
			key = next;
		}
		
		return sb.toString();
	}
	
	public ArrayList<String> getFollows(String key) {
	    ArrayList<String> follows = new ArrayList<String>();
	    try {
	     for (int i = 0; i < myText.length() - 4; i++) {
             if (key.equals(myText.substring(i, i + 4))){
                 follows.add(myText.substring(i + 4, i + 5));
             }
         }
        }
        catch (NullPointerException ex) {
            System.out.println(":c");
        }

	       return follows;
	   }
}


