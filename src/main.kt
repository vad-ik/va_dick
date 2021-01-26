fun main() {

    val isSasha: (String) -> Boolean = fun(s: String):Boolean {
        return s == "Sasha"
    }
    val isVadik: (String) -> Boolean = fun(s: String):Boolean {
        return s == "Vadik"
    }
    println(isSasha("Sasha"))
    println(isVadik("Sasha"))
}

