/**
 * 小母驴，小公驴，小公马生下来的儿子
 */
//sealed印章或者密封的意思
//Sealed class表示 子类类型有限的class
sealed class Son{
    fun sayHello(){
        println("大家好！")
    }
    class 小小驴():Son()
    class 小骡子():Son()
}