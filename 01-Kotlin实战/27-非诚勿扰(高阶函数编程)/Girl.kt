data class Girl(var name:String, var age:Int, var height:Int, var address:String)

var �ǳ��������ݿ� = listOf<Girl>(
    Girl("�ٺ�",18,168,"ɽ��"),
    Girl("����",19,170,"����"),
    Girl("����",25,165,"ɽ��"),
    Girl("���",20,163,"�㶫"),
    Girl("Ҷ��",22,160,"�Ϻ�")
)

fun filterGirlsByAddress(address:String){
    var ĳ������������ = ArrayList<Girl>()
    for (girl in �ǳ��������ݿ�){
        if (girl.address == address){
            ĳ������������.add(girl)
        }
    }
    for (girl in ĳ������������){
        println("${girl.address} ${girl.age}������ӣ�${girl.name}")
    }
}

fun filterGirlsByAge(age: Int){
    var ĳ���������µ����� = ArrayList<Girl>()
    for (girl in �ǳ��������ݿ�){
        if (girl.age < age){
            ĳ���������µ�����.add(girl)
        }
    }
    for (girl in ĳ���������µ�����){
        println("${girl.address} ${girl.age}������ӣ�${girl.name}")
    }
}

//����infix֮��.�ĵ��þͱ���˿ո����
infix fun List<Girl>.��������������С��(age:Int){
    filter {
        it.age < age
    }.forEach(::println)
}