//请编写函数，函数名为sayHello
//方法返回值是String类型，一个参数是String类型 名称为name
fun sayHello(name:String):String{
	return "hello" + name
}

//请编写函数， 函数名为checkAge
//方法的返回值是Boolean类型，一个参数是整数类型 名称为age
fun checkAge(age:Int):Boolean{
	if(age > 18)return true else return false
}

//请编写函数，函数名为saveLog
//方法没有返回值 一个参数是整数类型 名称为logLevel
fun saveLog(logLevel:Int){
	
}
fun main(args:Array<String>){
	saveLog(3)
}