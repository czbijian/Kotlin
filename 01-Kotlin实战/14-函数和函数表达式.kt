fun main(args: Array<String>) {
	var result = add(3,5)
	println(result)
	
	var i = {x:Int, y:Int -> x + y}
	var result2 = i(3, 5)
	println(result2)
	
	var j:(Int,Int)->Int = {x, y -> x+y}
	var result3 = j(3, 5)
	println(result3)
}

fun add(x:Int, y:Int):Int = x + y


