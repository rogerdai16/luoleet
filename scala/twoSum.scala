def twoSum(arr: Array[Int], target: Int): Boolean = {
	if(arr == null || arr.length == 0) false
	val hs = new java.util.HashSet[Int]
	for(ele <- arr) if(hs.contains(target - ele)) return true else hs.add(ele)
	false
}
val test1 = Array(1,2,3,4,55,22,43,2,5214,235,3,42,3423,1423,523)
println("test 1 is " + twoSum(test1, 4))
