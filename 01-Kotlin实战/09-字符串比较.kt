fun main(args: Array<String>) {
	var str1 = "Andy"
	var str2 = "andy"
	
	println(str1 == str2)           //false
	println(str1.equals(str2))		//false
	
	//�ڶ�������Ϊtrue���������ĸ�Ĵ�Сд
	println(str1.equals(str2, true))  //true
	
}