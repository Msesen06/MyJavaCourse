package Alistirmalar;

public class kopyaKaldir {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3,3,3,3,4,4,4,4,4};
        System.out.println(removeDuplicates(nums));
    }

        public static  int removeDuplicates(int[] nums) {
            int   index = 1;
            int  count = 0;
            for(int i = 1;i<nums.length;i++){
                if(nums[i] == nums[i-1]){
                    count++;
                }
                else{
                    count = 0;
                }

                if(count <= 1){
                    nums[index] = nums[i];
                    index++;
                }
            }
            return index;
        }

}
