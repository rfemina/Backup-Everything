class Dna(private val sequence: String) {

    init {
        val valid = setOf('A', 'C', 'G', 'T')
        if (sequence.any { it !in valid }) {
            throw IllegalArgumentException("Invalid DNA sequence")
        }
    }

    val nucleotideCounts: Map<Char, Int>
        get() {
            val counts = mutableMapOf('A' to 0, 'C' to 0, 'G' to 0, 'T' to 0)
            for (char in sequence) {
                counts[char] = counts[char]!! + 1
            }
            return counts
        }
}
