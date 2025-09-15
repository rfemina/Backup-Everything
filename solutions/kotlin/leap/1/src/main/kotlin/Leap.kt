data class Year(val value: Int) {

    val isLeap: Boolean
        get() {
            if (value % 4 != 0) {
                return false
            }
            if (value % 100 != 0) {
                return true
            }
            return value % 400 == 0
        }
}
