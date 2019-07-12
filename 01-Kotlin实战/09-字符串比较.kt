fun main(args: Array<String>) {
	var str1 = "Andy"
	var str2 = "andy"
	
	println(str1 == str2)           //false
	println(str1.equals(str2))		//false
	
	//第二个参数为true代表忽略字母的大小写
	println(str1.equals(str2, true))  //true
	
}