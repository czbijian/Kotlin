fun main(args:Array<String>){
    var person1 = Man("������")
    person1.eat()

    var person2 = Woman("��Ϫ̫��")
    person2.eat()

    var person3 = Man("С����")
    var person4 = Woman("������ɯ")
    var person5 = Man("���˺�ķ")
    //����Щ�˵�һ���������棨���䣩
    var houseList = listOf<Human>(person1,person2,person3,person4,person5)
    for(h in houseList){
        h.pee()
    }

}