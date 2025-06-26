// Ebaad Awan
// June 26, 2025

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> arr = new ArrayList<Boolean>();

        int maxCandy = max(candies);

        for(int i = 0; i < candies.length; i++){
            if(candies[i] + extraCandies >= maxCandy){
                arr.add(true);
            }
            else{
                arr.add(false);
            }
        }

        return arr;
    }

    public static int max(int[] array){
        int num = array[0];

        for(int i = 0; i < array.length; i++){
            if(array[i] > num){
                num = array[i];
            }
        }
        return num;
    }
}