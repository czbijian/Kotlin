//返回两个数当中较大的那个
fun returnBig(a:Int, b:Int):Int{
	if(a > b)
		return a
	else
		return b
}

fun main(args:Array<String>){
	var a = 8
	var b = 5
	println("${a}和${b}较大的那个数的值为${returnBig(a,b)}")
}