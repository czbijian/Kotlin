import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO

fun main(args:Array<String>){
    //�ڴ��д���һ����͸�Ϊ100 ��ͼƬ
    var Image = BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB)
    var w = 0 .. 99
    var h = 0 .. 99
   // Image.setRGB(0,0,0xff0000)  //��ɫ
    Image.apply {
        for(i in w){
            for(j in h){
                setRGB(i,j,0x00ff00)   //��ɫ
            }
        }
    }
    ImageIO.write(Image,"bmp", File("b.bmp"))
}