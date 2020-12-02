package com.app.foodrecipes.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.app.foodrecipes.util.Constants
import com.app.foodrecipes.util.Constants.Companion.API_KEY
import com.app.foodrecipes.util.Constants.Companion.QUERY_ADD_RECIPE_INFORMATION
import com.app.foodrecipes.util.Constants.Companion.QUERY_API_KEY
import com.app.foodrecipes.util.Constants.Companion.QUERY_DIET
import com.app.foodrecipes.util.Constants.Companion.QUERY_FILL_INGREDIENTS
import com.app.foodrecipes.util.Constants.Companion.QUERY_NUMBER
import com.app.foodrecipes.util.Constants.Companion.QUERY_TYPE

class RecipesViewModel(application: Application): AndroidViewModel(application) {

    fun applyQueries(): HashMap<String, String> {
        val queries: HashMap<String, String> = HashMap()

        queries[QUERY_NUMBER] = "30"
        queries[QUERY_API_KEY] = API_KEY
        queries[QUERY_TYPE] = "snack"
        queries[QUERY_DIET] = "gluten free"
        queries[QUERY_ADD_RECIPE_INFORMATION] = "true"
        queries[QUERY_FILL_INGREDIENTS] = "true"

        return queries
    }
}