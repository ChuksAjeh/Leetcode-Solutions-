class Solution {
    public int findDuplicate(int[] nums) {
        //lets use a set:
        Set<Integer> present = new HashSet<Integer>();
        /* loop through the array if already present return the duplicate 
        otherwise add to the set. */
        for(int num : nums){
            if(present.contains(num)){
                return num;
            }
            present.add(num);
        }
        return -1;
    }
    //Solution O(n) runtime 
}