package codingtest.week3.combinations;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(n,k,new ArrayList<>(), result);
        return  result;
    }

    void backtrack(int n, int k, List<Integer> curr, List<List<Integer>> result) {
        //base case
        if (curr.size() == k){
            result.add(new ArrayList<>(curr));
            return;
        }


        //recursuve call
        for (int i = 1; i <= n; i++) {
            curr.add(i);
            backtrack(n, k, curr , result);
            curr.remove(curr.size()-1);

        }
    }
}
