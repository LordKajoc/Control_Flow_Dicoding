fun main(args: Array<String>) {
    //Enumeration
    /*
    Enumeration merupakan salah satu fitur yang bisa kita gunakan untuk menyimpan kumpulan objek yang telah
    didefinisikan menjadi tipe data konstanta. Enumeration dapat ditetapkan sebagai nilai ke dalam sebuah
    variabel dengan cara yang lebih efisien. Selain itu, Enumeration juga dapat digunakan untuk meminimalisir
    kesalahan dalam pengetikan nilai sebuah variabel, misalnya:
     */
    val colorRed = Color.RED
    val colorGreen = Color.GREEN
    val colorBlue = Color.BLUE
    val color : Color = Color.RED
    print(color)
    //output: RED
}

enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

enum class Color2{
    RED, GREEN, BLUE
}