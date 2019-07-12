/**
 * 小头爸爸
 */
class SmallHeadFather:IWashBowl by BigHeadSon {
    override fun washing() {
        println("我是大头爸爸，我赚了10块钱")
        BigHeadSon.washing()
        println("我看着儿子把碗洗好了")
    }
}