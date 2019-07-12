/**
 * ����ԱA������ϴ�»�
 */
class WashMachine(var module:String, var size:Int) {
    var isDoorOpen = true
    var currentMode = 0
    fun openDoor(){
        println("ϴ�»������Ѿ�����")
        isDoorOpen = true
    }
    fun closeDoor(){
        println("ϴ�»������Ѿ��ر���")
        isDoorOpen = false
    }
    fun selectMode(mode:Int){
        currentMode = mode
        when(mode){
            0 -> println("��ʼģʽ������ѡ��ģʽ")
            1 -> println("����")
            2 -> println("����")
            else -> println("��Ҫ��š��š���˲����ް�")
        }
    }
    fun start(){
        if(isDoorOpen){
            println("����...�Ż�û���أ���������")
        }else{
            when(currentMode){
                0 -> {println("ѡ��ģʽ���󣬲��ܿ�ʼϴ�·�")}
                1 -> {
                    println("��ˮ")
                    setMotorSpeed(100)
                    println("���࿪ʼ��������ת�� ��")
                    println("ϴ����")
                }
                2 -> {
                    println("��ˮ")
                    setMotorSpeed(1000)
                    println("���࿪ʼ��������ת�� ��")
                    println("ϴ����")
                }
                else ->{
                    println("ģʽ���ܱ�ʶ��")
                }
            }
        }
    }
	//private ˽�з������ⲿ���ܷ��ʡ���װ��
    private fun setMotorSpeed(speed:Int){
        println("��ǰ������ת��Ϊ${speed}Ȧ/��")
    }
}