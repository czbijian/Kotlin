/**
 *����ԱBд�Ĵ���
 * ϴ�·�
 */

fun main(args:Array<String>){
    var washMachine = WashMachine("С���", 12)
    washMachine.openDoor()
    println("С�������ڿ�Ž�ȥ��")
    washMachine.closeDoor()
    washMachine.selectMode(1)
    washMachine.start()

    //washMachine.setMotorSpeed(10000)
}