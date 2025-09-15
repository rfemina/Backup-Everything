object CollatzCalculator {
    fun computeStepCount(start: Int): Int {
        if (start <= 0) {
            throw IllegalArgumentException("Only positive integers are allowed")
        }

        var number = start
        var steps = 0

        while (number != 1) {
            if (number % 2 == 0) {
                var half = 0
                var temp = number
                while (temp > 1) {
                    temp -= 2
                    half++
                }
                number = half
            } else {
                var triple = 0
                var counter = 0
                while (counter < 3) {
                    triple += number
                    counter++
                }
                number = triple + 1
            }
            steps++
        }

        return steps
    }
}
