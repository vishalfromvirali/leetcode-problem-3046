import java.util.*;
class leetcodeone {
    public static void main(String[]args){
        int[] nums ={1,1,2,2,3,4};
        int[] nums1 =new int[nums.length];
        int[] nums2 =new int[nums.length/2];
        for(int i=0;i<nums.length;i++){
            nums1[i] =nums[i];
            for(int j=0;j<nums2.length;j++){
                
                for(int k=1;k<nums.length-1;k++){
                    nums2[j] =nums[k];

                }
                
                
            }
            

        }
        System.out.println(Arrays.toString(nums1));
        System.out.println(nums.length/2);
        
    
    }
}