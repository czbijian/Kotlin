fun main(args: Array<String>) {
    //filterGirlsByAddress("ɽ��")
    //filterGirlsByAge(25)
    //������������
    println(�ǳ��������ݿ�.maxBy { it.age })  //maxBy()�߽׺���
    println("******")
    //��С��minBy
    println(�ǳ��������ݿ�.minBy { it.age })  //minBy()�߽׺���
    //�����ض�����
    println("******")
    println(�ǳ��������ݿ�.filter{
        ((it.age>18)  and (it.height >168 ))
    })
    println("******")
    //ĳ������ӳ����µļ���
    var result = �ǳ��������ݿ�.map{
        "${it.name}:${it.age}"
    }
    println(result)
    println("******")
    //any�ж���û���������
    println(�ǳ��������ݿ�.any{
        it.age == 20
    })
    println("******")
    //countͳ�Ʒ����������ж��ٸ�
    println(�ǳ��������ݿ�.count{
        it.age > 22
    })
    println("******")
    //find���ҵ�һ���������������ӣ����ҷ���
    println(�ǳ��������ݿ�.find{
        it.address == "ɽ��"
    })
    println("******")
    //����ĳ����������
    var res = �ǳ��������ݿ�.groupBy {
        it.address
    }
    println(res)
    println("*********")
    //DSL ��Ȼ���Ա��
    //�ض����ı�� ������ǰ��infix��ʾ�����ÿո����
    �ǳ��������ݿ� ��������������С�� 20
}