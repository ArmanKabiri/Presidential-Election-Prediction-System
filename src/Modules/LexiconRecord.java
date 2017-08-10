/**
 * @author : Arman Kabiri
 * @Email : "arman73k@gmail.com"
 * @Linked in : https://www.linkedin.com/in/armankabiri73
 * @Created at Oct 21, 2016 , 5:18:40 PM
 */
package Modules;

public class LexiconRecord {

    public int id;
    public String word;
    public int score;

    public LexiconRecord(LexiconRecord lexRec) {
        this.id = lexRec.id;
        this.word = lexRec.word;
        this.score = lexRec.score;
    }

    public LexiconRecord() {
    }
    
    public LexiconRecord get() {
        return this;
    }
}
