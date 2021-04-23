public class ArrayPractice1 {
    public boolean firstLast6(int[] nums) {
        if(nums[0] == 6) {
            return true;
        }else return nums[nums.length - 1] == 6;
    }
    public boolean sameFirstLast(int[] nums) {
        return nums.length >= 1 && nums[0] == nums[nums.length - 1];
    }
    public int[] makePi() {
        int[] piArray = new int[]{ 3,1,4 };
        return piArray;
    }
    public boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];

    }
    public int sum3(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }

    public int[] rotateLeft3(int[] nums) {
        int[] intArray = new int[]{ nums[1], nums[2], nums[0]};
        return intArray;
    }

    public int[] reverse3(int[] nums) {
        int[] intArray = new int[]{ nums[2], nums[1], nums[0]};
        return intArray;
    }


}
