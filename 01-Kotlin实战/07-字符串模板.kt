//�ռ������� ���ܲ����ǵص� ����ֵ���ռǵ�����

fun diaryGenerator(placeName:String):String{
	var temple = """
 �����������ʣ��������ƣ�����ȥ${placeName}���棬
 ����ӳ���������ǣ�${placeName} ${numToChinese(placeName.length)}���̽���֡�"""
	return temple
}

fun numToChinese(num:Int):String{
	var result = when(num){
		1 -> "һ"
		2 -> "��"
		3 -> "��"
		4 -> "��"
		5 -> "��"
		else -> num.toString()
	}
	return result
}

fun main(args:Array<String>){
	var diary = diaryGenerator("��ɽ��԰")
	println(diary)
	
	diary = diaryGenerator("�찲��")
	println(diary)
}