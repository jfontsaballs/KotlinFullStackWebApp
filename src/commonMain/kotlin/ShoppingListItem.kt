import kotlinx.serialization.Serializable

@Serializable
data class ShoppingListItem(
    val desc: String,
    val priority: Int
) {
    val id: Int = desc.hashCode()

    companion object {
        const val path = "shoppingList"
    }
}

val shoppingList = mutableListOf(
    ShoppingListItem("Cucumbers 🥒", 1),
    ShoppingListItem("Tomatoes 🍅", 2),
    ShoppingListItem("Orange Juice 🍊", 3)
)