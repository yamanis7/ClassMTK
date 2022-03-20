class matematika {
    fun penjumlahan() {
        var a = 20
        var x = a + a
        println("Penjumlahan " + a + " + " + a + " = " + x)
    }
    fun pengurangan() {
        var a = 10
        var b = 5
        var y = 10 - 5
        println("Pengurangan " + a + " - " + b + " = " + y)
    }
    fun perkalian() {
        var a = 10
        var b = 20
        var z = a * b
        println("Perkalian " + a + " * " + b + " = " + z)
    }
    fun pembagian() {
        var a = 20
        var b = 2
        var v = a / b
        println("Pembagian " + a + " / " + b + " = " + v)
    }
}
fun main() {
    val hasil = matematika()

    hasil.penjumlahan()
    hasil.pengurangan()
    hasil.perkalian()
    hasil.pembagian()
}