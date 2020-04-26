/*You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".*/

/*S and J will consist of letters and have length at most 50.
The characters in J are distinct.*/


class Solution {
    public int numJewelsInStones(String J, String S) {
        //put the jewels into a set. 
        int jewel = 0;
        HashSet<Character> jewels = new HashSet<Character>();
        //add the characters that are jewels to a jewel set.
        for(int i=0; i< J.length(); i++){
            jewels.add(J.charAt(i));
        }
        
        for(int i=0; i<S.length(); i++){
            // check if it matches any of the jewels increment further
            if(jewels.contains(S.charAt(i))){
                jewel++;
            }
        }
        //return the number of jewels.
        return jewel;
    }
    
}