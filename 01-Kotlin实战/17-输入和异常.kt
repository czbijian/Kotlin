fun main(args: Array<String>) {
	while(true) {
		println("��ӭʹ�ú������Ա�ӷ�������")
		println("�������һ������:")
		var num1str = readLine()
		println("������ڶ�������:")
		var num2str = readLine()

		try {
			var num1 = num1str!!.toInt()
			var num2 = num2str!!.toInt()
		} catch (e: Exception) {
			println("��磬����������Ŷ��������������������")
		}

		//println("${num1} + ${num2} = ${num1 + num2}")
	}
}