package ChallengeProblems.Recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SubsetsOfASet {
//    static Set mySet = new HashSet();

    static ArrayList al = new ArrayList();
    static HashMap<Integer,ArrayList<ArrayList>> hm = new HashMap();
    public static void subSet() throws InstantiationException, IllegalAccessException {
        al.add(3);al.add(2);al.add(5);al.add(8);al.add(9);al.add(1);al.add(4);al.add(6);
        populateMapWithValuesAndEmptyLists();
        System.out.println(hm.get(3));

        
    }
    public static void populateMapWithValuesAndEmptyLists() throws IllegalAccessException, InstantiationException {
        for (Object el: al){
            hm.put((Integer) el, ArrayList.class.newInstance());
        }
    }
}
