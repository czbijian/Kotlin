fun main(args: Array<String>) {
	//1 ~ 100 ������
	var nums = 1 .. 100
	var result = 0
	for(num in nums){
		result = result + num
	}
	println("���:${result}")
}