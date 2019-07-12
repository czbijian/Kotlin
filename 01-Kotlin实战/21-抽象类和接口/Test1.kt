fun main(args:Array<String>) {
    var man1 = Man()
    var man2 = TaiJian()

    var house = listOf<Human>(man1, man2)
    for (p in house){
        if(p is Man){
            p.eat()
        }
    }
}