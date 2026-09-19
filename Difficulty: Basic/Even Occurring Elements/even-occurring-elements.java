import java.util.*;

class Solution {
    public ArrayList<Integer> findEvenOccurrences(int[] arr) {
        // code here
        Map<Integer, Integer> freqmap = new LinkedHashMap<>();
        for(int num:arr){
            freqmap.put(num,freqmap.getOrDefault(num,0)+1);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for(Map.Entry<Integer,Integer>entry:freqmap.entrySet()){
            if(entry.getValue() % 2 == 0){
                result.add(entry.getKey());
            }
        }
        if(result.isEmpty()){
            result.add(-1);
        }
        return result;
    }
}