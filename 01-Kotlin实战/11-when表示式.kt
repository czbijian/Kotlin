//10分满分 9干得不错 8分还可以 7还需要努力 6分刚好及格 其他(需要加油啦)
fun gradeStudent(score:Int){
	when(score){
		10 -> println("考了满分，棒棒哒")
		9 -> println("干得不错")
		8 -> println("还可以")
		7 -> println("还需努力")
		6 -> println("刚好及格")
		else -> println("需要需要加油哦")
	}
}

fun main(args:Array<String>){
	gradeStudent(9)
}