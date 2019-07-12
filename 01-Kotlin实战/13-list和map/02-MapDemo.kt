import java.util.TreeMap

fun main(args: Array<String>) {
	var map = TreeMap<String, String>()
	map["好"] = "good"
	map["学习"] = "study"
	map["天"] = "day"
	map["向上"] = "up"
	
	println(map["好"]+map["好"]+map["学习"])
	println(map["天"]+map["天"]+map["向上"])
}