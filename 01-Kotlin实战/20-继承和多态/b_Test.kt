fun main(args:Array<String>){
    var person1 = Man("金三胖")
    person1.eat()

    var person2 = Woman("慈溪太后")
    person2.eat()

    var person3 = Man("小华华")
    var person4 = Woman("蒙娜丽莎")
    var person5 = Man("贝克汉姆")
    //请这些人到一个集合里面（房间）
    var houseList = listOf<Human>(person1,person2,person3,person4,person5)
    for(h in houseList){
        h.pee()
    }

}