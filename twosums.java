class Solution {
    public int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        int[] newNum = new int[2];
        for(int i=0;i<size;i++)
        {
          for(int j=i+1;j<size;j++)
          {
              if(nums[i]+nums[j]==target)
              {
                newNum[0]=i;
                newNum[1]=j;  
              }
          }
        }
        return newNum;
    }
}
/*
public int[] twoSum(int[] numbers, int target) {
    int[] result = new int[2];
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < numbers.length; i++) {
        if (map.containsKey(target - numbers[i])) {
            result[1] = i;
            result[0] = map.get(target - numbers[i]);
            return result;
        }
        map.put(numbers[i], i);
    }
    return result;
}
*/