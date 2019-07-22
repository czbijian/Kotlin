fun main(args: Array<String>) {
    //filterGirlsByAddress("山东")
    //filterGirlsByAge(25)
    //年龄最大的妹子
    println(非诚勿扰数据库.maxBy { it.age })  //maxBy()高阶函数
    println("******")
    //最小，minBy
    println(非诚勿扰数据库.minBy { it.age })  //minBy()高阶函数
    //过滤特定条件
    println("******")
    println(非诚勿扰数据库.filter{
        ((it.age>18)  and (it.height >168 ))
    })
    println("******")
    //某个属性映射成新的集合
    var result = 非诚勿扰数据库.map{
        "${it.name}:${it.age}"
    }
    println(result)
    println("******")
    //any判断有没有这个数据
    println(非诚勿扰数据库.any{
        it.age == 20
    })
    println("******")
    //count统计符合条件的有多少个
    println(非诚勿扰数据库.count{
        it.age > 22
    })
    println("******")
    //find查找第一个符合条件的妹子，并且返回
    println(非诚勿扰数据库.find{
        it.address == "山东"
    })
    println("******")
    //按照某个特征分组
    var res = 非诚勿扰数据库.groupBy {
        it.address
    }
    println(res)
    println("*********")
    //DSL 自然语言编程
    //特定中文编程 函数名前加infix表示可以用空格调用
    非诚勿扰数据库 查找嫩妹子年龄小于 20
}