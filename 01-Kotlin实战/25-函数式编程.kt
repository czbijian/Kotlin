//(String)->Unit  �������� ����Ϊ�ַ��� ����ֵ��Unit
var print = fun (name:String):Unit{   //print�����ں���ָ��
    println(name)
}
fun main(args:Array<String>){
    var names = listOf<String>("tom", "jerry", "lucy")
    //��һ�ַ���
    names.forEach(print)  //forEach�Ǹ߼���������������Ǻ���
    //�ڶ��ַ���
    for(element in names){
        print(element)
    }
    //�����ַ���
    names.forEach{
       // a -> println(a)  //����������������a��������println(a)
        println(it)  //Ĭ�ϲ�����Ϊit��
    }
}