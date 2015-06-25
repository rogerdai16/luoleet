# Leetcode题解
***
#### [戴清灏](mailto:rogerdai16@gail.com)

这本笔记是我在做Leetcode题目过程中的一些总结，也是北美找工作过程中的一部分。在准备面试的过程中，我从网络上得到了很多很有帮助的资源，包括戴方勤的《Leetcode题解(c++版)》。作为回报，我也把我自己的题解写下来，供别人准备面试参考。这个笔记的主要目的是使代码简洁而且清晰。本文所有代码用Java写成，个别地方附Python解法。为了缩短篇幅的需要，本文不附带Leetcode题目，读者可以通过链接查询题目。(https://leetcode.com/problemset/algorithms/)

---

* [Two Sum](https://leetcode.com/problems/two-sum/)
```java
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums == null) return new int[]{-1, -1};
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                return new int[]{map.get(target - nums[i]) + 1, i + 1};
            }else{
                map.put(nums[i], i);
            }
        }
        return new int[]{-1, -1};
    }
}
```


* 


