fun main(args: Array<String>) {
	var nums = 1 until 100 //[1,100)
	for(num in nums){
		println(num)
	}
	
	var nums2 = 1 .. 16   //[1,16]
	for(a in nums2 step 2){
		println(a)
	}
	
	var nums3 = nums2.reversed()
	for(a in nums3){
		println(a)
	}
	
	println("×ÜÊıÎª£º" + nums3.count())
}