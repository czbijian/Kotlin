import java.math.BigInteger

//��ʾ�ݹ�
//�׳� 1�Ľ׳�1 2�Ľ׳�2*1 3�Ľ׳�3*2*1 4�Ľ׳�4*3*2*1

fun main(args:Array<String>){
	var num = BigInteger("50")
	println(fact(num))
}

//BigInteger���Դ�ų��������ֵ
fun fact(num:BigInteger):BigInteger{
	if(num == BigInteger.ONE){
		return BigInteger.ONE
	}else{
		return fact(num-BigInteger.ONE)*num
	}
}