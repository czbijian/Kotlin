fun main(args: Array<String>) {
	while(true) {
		println("欢迎使用黑马程序员加法计算器")
		println("请输入第一个数字:")
		var num1str = readLine()
		println("请输入第二个数字:")
		var num2str = readLine()

		try {
			var num1 = num1str!!.toInt()
			var num2 = num2str!!.toInt()
		} catch (e: Exception) {
			println("大哥，请输入数字哦，你输入的数据有问题吧")
		}

		//println("${num1} + ${num2} = ${num1 + num2}")
	}
}