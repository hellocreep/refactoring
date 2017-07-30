class Person {
    private var name: String
    private var sex: String
    private var age: Int

    init {
        this.name = ""
        this.sex = ""
        this.age = 0
    }

    fun setName(name: String) {
        this.name = name
    }

    fun setSex(sex: String) {
        this.sex = sex
    }

    fun setAge(age: Int) {
        this.age = age
    }

    override fun toString(): String {
        return "name: " + this.name + " sex: " + this.sex + " age: " + this.age
    }
}