//�ۼӲ���
//1���ۼ�1 2���ۼӾ���=2+1 3���ۼӾ���3+2+1
//4���ۼ�4+3+2+1 5���ۼ�5+4+3+2+1
//n���ۼӣ�
fun main(args: Array<String>) {
	var result = 0
	println(ollAdd(100, result))
}

//tailrec β�ݹ��Ż�
tailrec fun ollAdd(num:Int, result:Int):Int{
	println("�������${num}������result = ${result}")
	if(num == 0){
		return 1
	}else{
		return ollAdd(num - 1, result+num)
	}
}