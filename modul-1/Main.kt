// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available
class Produk(val nama: String, val harga: Double, val stok: Int)

fun main() {
    baru()
}
    fun baru(){
    while (true) {
        println("=========================")
        println("|      Data Produk       |")
        println("==========================")
        println("|  Pilih Kategori Produk |")
        println("|1. Bahan Masak          |")
        println("|2. Bahan Roti           |")
        print("Masukan pilihan 1-2: ")
        var pilihan = readLine()?.toIntOrNull()

        if (pilihan == 1) {
            println("========================")
            println("|Masukan Produk Bahan Masak|")
            println("========================")
            print("|  Masukan Nama Produk  |")
            var nama = readLine() ?: ""
            print("|  Masukan Harga Produk  |")
            var harga = readLine()?.toDoubleOrNull() ?: 0.0
            print("|  Masukan Stok Produk   |")
            var stok = readLine()?.toIntOrNull() ?: 0
            println("========================")

            var produk = Produk(nama, harga, stok)
        }else if (pilihan == 2) {
            println("========================")
            println("|Masukan Produk Bahan Roti|")
            println("========================")
            print("|  Masukan Nama Produk  |")
            var nama = readLine() ?: ""
            print("|    Masukan Harga Produk    |")
            var harga = readLine()?.toDoubleOrNull() ?: 0.0
            print("|  Masukan Stok Produk   |")
            var stok = readLine()?.toIntOrNull() ?: 0
            println("========================")

            var produk = Produk(nama, harga, stok)
        } else {
            println("Pilihan tidak tersedia")
        }

        print("Masukkan Produk Lagi? (Y/T): ")
        var ulang = readLine()
        if (ulang?.equals("Y", ignoreCase = true) == true) {
        }else {
            println("==========================================")
            println("TERIMAKASIH")
            println("==========================================")
            break
        }
    }
}
