//日记生成器 接受参数是地点 返回值是日记的内容

fun diaryGenerator(placeName:String):String{
	var temple = """
 今天天气晴朗，万里无云，我们去${placeName}游玩，
 首先映入眼帘的是，${placeName} ${numToChinese(placeName.length)}个鎏金大字。"""
	return temple
}

fun numToChinese(num:Int):String{
	var result = when(num){
		1 -> "一"
		2 -> "二"
		3 -> "三"
		4 -> "四"
		5 -> "五"
		else -> num.toString()
	}
	return result
}

fun main(args:Array<String>){
	var diary = diaryGenerator("中山公园")
	println(diary)
	
	diary = diaryGenerator("天安门")
	println(diary)
}