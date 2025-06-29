// Ebaad Awan
// June 29, 2025

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int i = 2;

        if(flowerbed.length == 1){
            if(flowerbed[0] == 0){
                count += 1;
            }
            if(n <= count){
                return true;
            }
            else{
                return false;
            }
        }

        if(flowerbed.length == 2){
            if(flowerbed[0] == 0 && flowerbed[1] == 0){
                count += 1;
            }
            if(n <= count){
                return true;
            }
            else{
                return false;
            }
        }

        if(flowerbed[0] == 0 && flowerbed[1] == 0){
            count += 1;
        }

        while(i < flowerbed.length - 2){
            if(flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0){
                count += 1;
                i += 2;
            }
            else{
                i++;
            }
        }

        if(flowerbed[flowerbed.length - 1] == 0 && flowerbed[flowerbed.length - 2] == 0){
            count += 1;
        }

        if(n <= count){
            return true;
        }
        else{
            return false;
        }
    }
}