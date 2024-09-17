fun getVolume(length: Int, width: Int = 1, height: Int = 1): Int {
    val vol = (length*width*height)
    return vol
}

fun main() {
    println(getVolume(1))
}