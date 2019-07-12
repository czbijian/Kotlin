fun main(args: Array<String>) {
	var lists = listOf("买鸡蛋", "买大米", "买杜蕾斯","买冰淇淋")
	for((i,e) in lists.withIndex()){  //withIndex()有下标
		println("$i $e")
	}
}