//妹子 长相  声音
class Girl(var charactor:String, var voice:String){
    fun smaile(){
        println("妹子笑了一下，么么哒")
    }
    fun cry(){
        println("呜呜呜，人家伤心么")
    }
}

fun main(args:Array<String>){
    var girl1 = Girl("彪悍","甜美")
    println("girl1这位妹子的声音:${girl1.voice}")
    girl1.cry()
    girl1.smaile()
}
