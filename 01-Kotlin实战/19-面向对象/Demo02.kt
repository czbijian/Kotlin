//���� ����  ����
class Girl(var charactor:String, var voice:String){
    fun smaile(){
        println("����Ц��һ�£�ôô��")
    }
    fun cry(){
        println("�����أ��˼�����ô")
    }
}

fun main(args:Array<String>){
    var girl1 = Girl("�뺷","����")
    println("girl1��λ���ӵ�����:${girl1.voice}")
    girl1.cry()
    girl1.smaile()
}
