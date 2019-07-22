import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO

fun main(args:Array<String>){
    //内存中创建一个宽和高为100 的图片
    var Image = BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB)
    var w = 0 .. 99
    var h = 0 .. 99
   // Image.setRGB(0,0,0xff0000)  //红色
    Image.apply {
        for(i in w){
            for(j in h){
                setRGB(i,j,0x00ff00)   //蓝色
            }
        }
    }
    ImageIO.write(Image,"bmp", File("b.bmp"))
}