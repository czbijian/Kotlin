/**
 * Сĸ¿��С��¿��С�����������Ķ���
 */
//sealedӡ�»����ܷ����˼
//Sealed class��ʾ �����������޵�class
sealed class Son{
    fun sayHello(){
        println("��Һã�")
    }
    class СС¿():Son()
    class С����():Son()
}