package backtracking;

public class SumOfAllSubsetsXorTotal {

    public int subsetXORSum(int[] nums) {
        return dfs(0,0, nums);
    } 

    public int dfs(int i, int total, int[] nums){

        if(i == nums.length) return total;

        return dfs(i + 1, total ^ nums[i], nums) + dfs(i+1, total, nums);
    }
}

