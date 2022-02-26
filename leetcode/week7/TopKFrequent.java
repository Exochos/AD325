import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> list = new ArrayList<String>();
        HashMap<String,Integer> map = new HashMap<>();
        
        PriorityQueue<String> pq = new PriorityQueue<>((a,b) -> {
        if(map.get(a) == map.get(b))
            if (a.compareTo(b) > 0)
                return 1;
            else
                return -1;
        else {
            return map.get(b) - map.get(a);
        }
        });
        
        
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        
        for (String word : map.keySet()) {
            pq.add(word);
        }
        
        for (int i = 0; i < k; i++) {
            list.add(pq.poll());
        }
            
        Collections.reverse(list);
        return list;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.topKFrequent(new String[] { "i", "love", "leetcode", "i", "love", "coding" }, 2);
    }
} 
