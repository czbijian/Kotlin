import java.math.BigInteger

//演示递归
//阶乘 1的阶乘1 2的阶乘2*1 3的阶乘3*2*1 4的阶乘4*3*2*1

fun main(args:Array<String>){
	var num = BigInteger("50")
	println(fact(num))
}

//BigInteger可以存放超级大的数值
fun fact(num:BigInteger):BigInteger{
	if(num == BigInteger.ONE){
		return BigInteger.ONE
	}else{
		return fact(num-BigInteger.ONE)*num
	}
}