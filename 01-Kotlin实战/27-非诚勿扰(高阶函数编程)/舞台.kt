data class Girl(var name:String, var age:Int, var height:Int, var address:String)

var 非诚勿扰数据库 = listOf<Girl>(
    Girl("百合",18,168,"山东"),
    Girl("安琪",19,170,"江苏"),
    Girl("喵喵",25,165,"山东"),
    Girl("灵儿",20,163,"广东"),
    Girl("叶子",22,160,"上海")
)

fun filterGirlsByAddress(address:String){
    var 某个地区的妹子 = ArrayList<Girl>()
    for (girl in 非诚勿扰数据库){
        if (girl.address == address){
            某个地区的妹子.add(girl)
        }
    }
    for (girl in 某个地区的妹子){
        println("${girl.address} ${girl.age}岁的妹子，${girl.name}")
    }
}

fun filterGirlsByAge(age: Int){
    var 某个年龄以下的妹子 = ArrayList<Girl>()
    for (girl in 非诚勿扰数据库){
        if (girl.age < age){
            某个年龄以下的妹子.add(girl)
        }
    }
    for (girl in 某个年龄以下的妹子){
        println("${girl.address} ${girl.age}岁的妹子，${girl.name}")
    }
}

//加了infix之后，.的调用就变成了空格调用
infix fun List<Girl>.查找嫩妹子年龄小于(age:Int){
    filter {
        it.age < age
    }.forEach(::println)
}