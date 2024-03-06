public class trappedRainWater {
        public int trap(final int[] A) {
             int n = A.length;
            if (n <= 2) return 0;
            
            int left = 0, right = n - 1;
            int leftMax = 0, rightMax = 0;
            int trappedWater = 0;
            
            while (left < right) {
                if (A[left] <= A[right]) {
                    if (A[left] >= leftMax)
                        leftMax = A[left];
                    else
                        trappedWater += leftMax - A[left];
                    left++;
                } else {
                    if (A[right] >= rightMax)
                        rightMax = A[right];
                    else
                        trappedWater += rightMax - A[right];
                    right--;
                }
            }
            
            return trappedWater;
        }
    }
    

