/**
 *程序员B写的代码
 * 洗衣服
 */

fun main(args:Array<String>){
    var washMachine = WashMachine("小天鹅", 12)
    washMachine.openDoor()
    println("小花花把内裤放进去了")
    washMachine.closeDoor()
    washMachine.selectMode(1)
    washMachine.start()

    //washMachine.setMotorSpeed(10000)
}