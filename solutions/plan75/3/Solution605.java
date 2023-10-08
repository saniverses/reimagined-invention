public class Solution605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int tmpCount = 1;
        int neededSpace = 2*n+1;
        int neededSpaceForOne = 3;
        int nonAdjSpacesCount = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 1) {
                tmpCount = 0;
            } else {
                tmpCount++;
                if (i+1 == flowerbed.length) {//last digit is zero
                    tmpCount++;
                }
            }
            if (tmpCount == neededSpace) {
                return true;
            }
            if (tmpCount == neededSpaceForOne | i+1 == flowerbed.length && tmpCount == neededSpaceForOne + 1) {
                nonAdjSpacesCount++;
            }
        }
        return nonAdjSpacesCount >= n;
    }
}
