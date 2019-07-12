val Pi = 3.14159f
fun 获取长方形面积(长:Float, 宽:Float):Float{
	return 长*宽
}

fun 获取圆的周长(PI:Float = Pi, 半径:Float):Float{
	return 2*PI*半径
}

fun 获取圆的周长2(PI:Float = Pi, 直径:Float):Float{
	return PI*直径
}

fun 获取圆柱体的体积(PI:Float = Pi, 半径:Float, 高:Float):Float{
	return 	PI*半径*半径*高
}

fun 获取球体的表面积(PI:Float = Pi, 半径:Float):Float{
	return PI*半径*半径*4
}

fun main(args:Array<String>){
	//var area = 获取长方形面积(3.0f, 2.0f)
	var area = 获取圆的周长2(直径 = 4.0f)
	println(area)
}

