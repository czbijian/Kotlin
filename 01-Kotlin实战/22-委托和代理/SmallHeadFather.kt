/**
 * Сͷ�ְ�
 */
class SmallHeadFather:IWashBowl by BigHeadSon {
    override fun washing() {
        println("���Ǵ�ͷ�ְ֣���׬��10��Ǯ")
        BigHeadSon.washing()
        println("�ҿ��Ŷ��Ӱ���ϴ����")
    }
}