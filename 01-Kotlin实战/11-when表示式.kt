//10������ 9�ɵò��� 8�ֻ����� 7����ҪŬ�� 6�ָպü��� ����(��Ҫ������)
fun gradeStudent(score:Int){
	when(score){
		10 -> println("�������֣�������")
		9 -> println("�ɵò���")
		8 -> println("������")
		7 -> println("����Ŭ��")
		6 -> println("�պü���")
		else -> println("��Ҫ��Ҫ����Ŷ")
	}
}

fun main(args:Array<String>){
	gradeStudent(9)
}