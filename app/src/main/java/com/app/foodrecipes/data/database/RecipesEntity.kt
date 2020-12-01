package com.app.foodrecipes.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.app.foodrecipes.models.FoodRecipe
import com.app.foodrecipes.util.Constants.Companion.RECIPES_TABLE

@Entity(tableName = RECIPES_TABLE)
class RecipesEntity(
    var foodRecipe: FoodRecipe
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0
}