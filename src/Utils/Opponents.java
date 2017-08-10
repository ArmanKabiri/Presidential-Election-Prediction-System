/**
 * @author : Arman Kabiri
 * @Email : "arman73k@gmail.com"
 * @Linked in : https://www.linkedin.com/in/armankabiri73
 * @Created at May 18, 2017 , 12:03:29 PM
 */
package Utils;

import Modules.Enums;
import java.util.HashMap;

public class Opponents {

    //  All Opponent Candidates are specified here.
    public HashMap<Enums.Candidate, Enums.Candidate> opponentsHashMap = new HashMap<>();
    public Opponents() {
        opponentsHashMap.put(Enums.Candidate.Raisi, Enums.Candidate.Rouhani);
        opponentsHashMap.put(Enums.Candidate.Rouhani, Enums.Candidate.Raisi);
        opponentsHashMap.put(Enums.Candidate.HashemiTaba, Enums.Candidate.Mirsalim);
        opponentsHashMap.put(Enums.Candidate.Mirsalim, Enums.Candidate.HashemiTaba);
    }
}
