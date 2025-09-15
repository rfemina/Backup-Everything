object Darts {
    fun score(x: Number, y: Number): Int {
        val dx = x.toDouble()
        val dy = y.toDouble()
        val distanceSquared = dx * dx + dy * dy

        return when {
            distanceSquared <= 1.0 -> 10
            distanceSquared <= 25.0 -> 5
            distanceSquared <= 100.0 -> 1
            else -> 0
        }
    }
}
