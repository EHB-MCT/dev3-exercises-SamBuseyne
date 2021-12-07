open class Word (
    open val original: String,
    open val translated: String,
    val language:String,
    val startDiff: Int) {
    var diff: Int = startDiff
        set(value) {
            if (value == 0) {
                field = 1
            } else {
                field = value
            }
        }

}