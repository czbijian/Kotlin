/**
 * 大头儿子
 */
object BigHeadSon:IWashBowl {  //object单例模式，在内存中有且仅有一份。
    override fun washing(){
        println("我是大头儿子，我在开心的洗碗，一次赚1块钱")
    }
}