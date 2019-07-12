fun main(args: Array<String>) {
	var a = "13"
	var b = 13
	
	a = b.toString() //把b数字转换成字符串放入a里面
	
	b = a.toInt()  //把a字符串转换成数字放入b里面
	
	var c = "a3"
//	b = c.toInt()  //NumberFormatException 因为a3不能转换成数字
}