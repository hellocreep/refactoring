class Person {
    private var name: String
    private var sex: String
    private var age: Int

    init {
        this.name = ""
        this.sex = ""
        this.age = 0
    }

    fun setName(name: String): Person {
        this.name = name
        return this
    }

    fun setSex(sex: String): Person {
        this.sex = sex
        return this
    }

    fun setAge(age: Int): Person {
        this.age = age
        return this
    }

    override fun toString(): String {
        return "name: " + this.name + " sex: " + this.sex + " age: " + this.age
    }
}