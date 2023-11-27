package classswork1.cl2

sealed class Directions(val description: String) {
    class North: Directions("north")
    class South: Directions("south")
    class East: Directions("earth")
    class West: Directions("west")
}