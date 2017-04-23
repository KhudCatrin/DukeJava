
/**
 * Write a description of class PhraseFilter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PhraseFilter implements Filter {
     private String request;
     private String phrase;
     private String name = "Phrase filter";
     public PhraseFilter(String req, String ph){
         request = req;
         phrase = ph;
        }
     public boolean satisfies(QuakeEntry qe) {
         if (request.equals("start")) {
             return (qe.getInfo().startsWith(phrase));
            }
          if (request.equals("end")) {
             return (qe.getInfo().endsWith(phrase));
            }
             if (request.equals("any")) {
             return (qe.getInfo().contains(phrase));
            }
            return false;
        }
        public String getName(){
        return name;
    }
}
