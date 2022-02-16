data class DataClass(
    val javaLong: java.lang.Long,
    val nullableLong: Long?,
    val regularLong: Long,
    val string: String,
    var regular: RegularClass
)

class RegularClass(val field: Any) {
    data class InnerDataClass(val test: Long)
}

data class SmallDataClass(val char: Char)

fun main(args: Array<String>) {
    val shallowSize = SmallDataClass('c').shallowSize()
    println(shallowSize)

    val shallowSize2 = RegularClass.InnerDataClass(5).shallowSize()
    println(shallowSize2)
}