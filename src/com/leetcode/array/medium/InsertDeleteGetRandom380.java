package com.leetcode.array.medium;

import java.util.*;

public class InsertDeleteGetRandom380 {

}
class RandomizedSet {

    private List<Integer> elements;
    private Map<Integer, Integer> elementToIndex;
    private Random random;
    public RandomizedSet() {
        elements = new ArrayList<>();
        elementToIndex = new HashMap<>() ;
        random = new Random() ;
    }

    public boolean insert(int val) {
       if( elementToIndex.containsKey(val)){
           return false;
       }else{
           elements.add(val);
           elementToIndex. put(val,elements.size()-1);
           return true;
       }

    }
    public boolean remove(int val) {
       if(!elementToIndex.containsKey(val))return false;
       int indexRemove = elementToIndex.get(val);
       int lastElement = elements.get(elements.size()-1);

         //swapping
         elements.set(indexRemove,lastElement);
         elementToIndex.put(lastElement,indexRemove);
         // removing val from hashmap and list
        elements.remove(elements.size()-1) ; // last element deleting
        elementToIndex.remove(val);
        return true ;
    }

    public int getRandom() {
        int randomIndex = random.nextInt(elements.size()); // generating random index number
        return elements.get(randomIndex);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */