fun main(args:Array<String>){
    var s1:Son = Son.С����()

    var s2:Son = Son.СС¿()

    var s3:Son = Son.СС¿()

    var list = listOf<Son>(s1, s2, s3)

    for(v in list){
        if(v is Son.СС¿){
            v.sayHello()
        }
    }
}
