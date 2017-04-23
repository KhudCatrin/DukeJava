
/**
 * Write a description of class MarkovFour here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Random;
import java.util.ArrayList;

public class MarkovFour extends AbstractMarkovModel {

	public MarkovFour() {
		super(4);
	}

	public String getRandomText(int numChars) {
		if (myText == null) {
			return "";
		}
		StringBuilder sb = new StringBuilder();
		int index = myRandom.nextInt(myText.length() - 4);
		String key = myText.substring(index, index + 4);
		sb.append(key);

		for (int k = 0; k < numChars - 4; k++) {
			ArrayList<String> follows = getFollows(key);
			String followsRandom = follows.get(myRandom.nextInt(follows.size()));
			sb.append(followsRandom);
			key = followsRandom;
		}

		return sb.toString();
	}
}