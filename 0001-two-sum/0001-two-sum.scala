object Solution {
    def twoSum(nums: Array[Int], target: Int): Array[Int] = {
        
        def rec(hm: Map[Int, Int], ind: Int): Array[Int] = {
        
            ind match {
                case i if i == nums.length => Array(0, 0)
                case i if hm.contains(target - nums(i)) => Array(hm(target - nums(i)), i)
                case i => rec(hm + (nums(i) -> i), ind + 1)
            }
            
        }
        rec(Map.empty[Int, Int], 0)
    }
}