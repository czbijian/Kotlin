//(String)->Unit  函数类型 参数为字符串 返回值是Unit
var print = fun (name:String):Unit{   //print类似于函数指针
    println(name)
}
fun main(args:Array<String>){
    var names = listOf<String>("tom", "jerry", "lucy")
    //第一种方法
    names.forEach(print)  //forEach是高级函数，里面参数是函数
    //第二种方法
    for(element in names){
        print(element)
    }
    //第三种方法
    names.forEach{
       // a -> println(a)  //匿名函数，参数是a，内容是println(a)
        println(it)  //默认参数名为it。
    }
}