class Son :Father(){   //继承父类方法，父类类名前加open
    override fun action(){   //重写父类方法，父类方法前必须加open
        println("儿子很乖，在公共场合很有礼貌")
    }
}