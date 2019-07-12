//累加操作
//1的累加1 2的累加就是=2+1 3的累加就是3+2+1
//4的累加4+3+2+1 5的累加5+4+3+2+1
//n的累加？
fun main(args: Array<String>) {
	var result = 0
	println(ollAdd(100, result))
}

//tailrec 尾递归优化
tailrec fun ollAdd(num:Int, result:Int):Int{
	println("计算机第${num}次运算result = ${result}")
	if(num == 0){
		return 1
	}else{
		return ollAdd(num - 1, result+num)
	}
}