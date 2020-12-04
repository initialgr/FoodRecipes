package com.app.foodrecipes.ui.fragments.instructions

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import com.app.foodrecipes.R
import com.app.foodrecipes.models.Result
import com.app.foodrecipes.util.Constants
import kotlinx.android.synthetic.main.fragment_instructions.view.*

class InstructionsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_instructions, container, false)

        val args = arguments
        val myBundle: Result? = args?.getParcelable(Constants.RECIPE_RESULT_KEY)

        view.instruction_webView.webViewClient = object : WebViewClient() {}
        val webSiteUrl: String = myBundle!!.sourceUrl
        view.instruction_webView.loadUrl(webSiteUrl)

        return view
    }
}