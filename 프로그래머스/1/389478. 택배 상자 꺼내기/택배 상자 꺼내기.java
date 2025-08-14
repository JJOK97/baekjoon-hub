class Solution {
    public int solution(int n, int w, int num) {
        int totalLevel = n / w;
        if (n % w > 0) totalLevel++;

        int targetLevel = num / w;
        if(num % w > 0) targetLevel++;

        if(totalLevel == targetLevel) return 1;

        boolean isTopReverse = totalLevel % 2 == 0;
        boolean isTargetReverse = targetLevel % 2 == 0;

        int targetLocation = num % w;
        if (targetLocation == 0) {
            if(!isTargetReverse) targetLocation = 1;
            else targetLocation = w;
        }
        int topLocation = n % w;

        if (isTargetReverse == isTopReverse) {
            if (topLocation == 0 || topLocation >= targetLocation) {
                return totalLevel - targetLevel + 1;
            } else {
                return totalLevel - targetLevel;
            }
        } else {
            if (topLocation == 0 || w - topLocation <= targetLocation) {
                return totalLevel - targetLevel + 1;
            } else {
                return totalLevel - targetLevel;
            }
        }
    }
}