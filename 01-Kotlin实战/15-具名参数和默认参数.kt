val Pi = 3.14159f
fun ��ȡ���������(��:Float, ��:Float):Float{
	return ��*��
}

fun ��ȡԲ���ܳ�(PI:Float = Pi, �뾶:Float):Float{
	return 2*PI*�뾶
}

fun ��ȡԲ���ܳ�2(PI:Float = Pi, ֱ��:Float):Float{
	return PI*ֱ��
}

fun ��ȡԲ��������(PI:Float = Pi, �뾶:Float, ��:Float):Float{
	return 	PI*�뾶*�뾶*��
}

fun ��ȡ����ı����(PI:Float = Pi, �뾶:Float):Float{
	return PI*�뾶*�뾶*4
}

fun main(args:Array<String>){
	//var area = ��ȡ���������(3.0f, 2.0f)
	var area = ��ȡԲ���ܳ�2(ֱ�� = 4.0f)
	println(area)
}

