object Isogram {

    fun isIsogram(input: String): Boolean {
        val letters = input
            .lowercase()
            .filter { it.isLetter() }  // ignora espaços e hífens
        return letters.length == letters.toSet().size
    }
}
