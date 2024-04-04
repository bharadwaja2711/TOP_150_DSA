import java.util.*;
class MajorityElement_5 {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int x : nums) {
            if(hm.containsKey(x)) {
                hm.put(x, hm.get(x)+1);
            } else {
                hm.put(x, 1);
            }
        }
        int majority = nums.length/2;
        int majorele = 0;
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            int val = entry.getValue();
            if(val > majority) {
                majorele = entry.getKey();
            }
        }
        return majorele;
    }
}
