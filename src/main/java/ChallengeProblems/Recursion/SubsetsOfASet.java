package ChallengeProblems.Recursion;

import java.util.*;

public class SubsetsOfASet {
    static ArrayList al = new ArrayList();
    static HashMap<Integer, ArrayList<ArrayList<Integer>>> hm = new HashMap();
    public static void
    subSet() throws InstantiationException, IllegalAccessException {
        al.add(3);al.add(2);al.add(5);al.add(8);al.add(9);al.add(1);al.add(4);al.add(6);
        addSingletonToFirstIndex();
        generateSubsets(al.size()-1);
        System.out.println(hm.get(3));
    }

    public static ArrayList generateSubsets(int index){
        if(index==0){
            return (ArrayList) (hm.get(al.get(index)));
        }
        int newIndex = index-1;
        ArrayList previousSubsets = generateDeepCopy(generateSubsets(newIndex));
        generatePreviousSubsetsWithNewInt(previousSubsets, index);
        previousSubsets.add(new ArrayList<>());
        hm.put((Integer) al.get(index), (previousSubsets));
        return (ArrayList) previousSubsets.clone();
    }

    public static ArrayList<ArrayList<Integer>> generateDeepCopy(ArrayList<ArrayList<Integer>> originalArrayList){
        ArrayList <ArrayList<Integer>> newArrayList  = new ArrayList();
        for(ArrayList innerArrayList : originalArrayList){
            ArrayList<Integer> newInner = (ArrayList<Integer>) innerArrayList.clone();
            newArrayList.add(newInner);
        }
        return newArrayList;
    }

    public static ArrayList generatePreviousSubsetsWithNewInt(ArrayList<ArrayList> prevSub, int index){
        for(ArrayList set: prevSub){
            set.add(al.get(index));
        }
        return prevSub;
    }
    public static void addSingletonToFirstIndex(){
        ArrayList newArray = new ArrayList();
        ArrayList singleArray = new ArrayList();
        singleArray.add(al.get(0));
        newArray.add(new ArrayList<>());
        newArray.add(singleArray);
        hm.put((Integer) al.get(0), newArray);
    }

    public static void populateMapWithValuesAndEmptyLists() throws IllegalAccessException, InstantiationException {
        for (Object el: al){
            ArrayList outerArrayList = new ArrayList();
            hm.put((Integer) el, outerArrayList);
        }
    }
}
