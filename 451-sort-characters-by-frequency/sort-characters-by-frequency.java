
import java.util.*;

class Solution {

    class Pair {
        int first;
        char second;

        Pair(int first, char second) {
            this.first = first;
            this.second = second;
        }
    }

    public String frequencySort(String s) {

        int n = s.length();

       
        Pair[] freq = new Pair[128];

       
        for(int i = 0; i < 128; i++) {
            freq[i] = new Pair(0, (char)i);
        }

        
        for(int i = 0; i < n; i++) {
            freq[s.charAt(i)].first++;
        }

       
        Arrays.sort(freq, (p1, p2) -> {

            if(p1.first < p2.first)
                return 1;

            if(p1.first > p2.first)
                return -1;

            return Character.compare(p1.second, p2.second);
        });

     
        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < 128; i++) {

            if(freq[i].first == 0)
                break;

            for(int j = 0; j < freq[i].first; j++) {
                ans.append(freq[i].second);
            }
        }

        return ans.toString();
    }
}
