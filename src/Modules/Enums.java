/**
 * @author : Arman Kabiri
 * @Email : "arman73k@gmail.com"
 * @Linked in : https://www.linkedin.com/in/armankabiri73
 * @Created at Feb 11, 2017 , 6:32:14 PM
 */
package Modules;

public class Enums {

    public enum AnalysisLevel {
        review, sentence
    }

    public enum AnalysisMethodInUse {
        ml, lexicon
    };

    public enum LexiconInUse {
        LexiPers, CNRC, lookup, adj
    }

    public enum AggregationMethod {
        DS, Average
    }

    public enum LexiconBasedRule {
        QuestionSentences, NegationWords
    }

    public enum Candidate {
        Rouhani, Raisi, HashemiTaba, Mirsalim;
    }

    public enum Polarity {
        Positive, Negative, Neutral
    }
}
