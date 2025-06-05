class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int len = flowerbed.length;

        for (int i = 0; i < len; i++) {
            if (flowerbed[i] == 0) {

                int left = (i == 0) ? 0 : flowerbed[i - 1]; //If you're at the first plot, then there's no left neighbor, so assume it's 0 (empty).
                int right = (i == len - 1) ? 0 : flowerbed[i + 1];//If you're at the last plot, then there's no right neighbor, so assume it's 0 (empty).
                //Otherwise, take the actual left and right values from the array.

                if (left == 0 && right == 0) {
                    flowerbed[i] = 1; //// plant a flower here
                    count++;
                }
                if (count >= n)
                    return true;
            }
        }
        return count >= n;
    }
}