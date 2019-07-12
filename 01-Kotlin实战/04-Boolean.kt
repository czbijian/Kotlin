//Boolean 布尔 true真false假
fun main(args:Array<String>){
	var num1 = 4
	var num2 = 6
	
	println(num1 < num2)   //true
	
	//sqrt() 函数求平方根
	var num3 = Math.sqrt(5.0) - Math.sqrt(4.0)
	var num4 = Math.sqrt(4.0) - Math.sqrt(3.0)
	
	println(num3 < num4)   //true
	
	//pow()求某个数的N次方
	var num5 = Math.pow(2.0, 10.0)
	var num6 = Math.pow(3.0, 75.0)
	println(num5 < num6)   //true
}