package com.example.splashscreen

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class WordTestImpFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.activity_main, container, false)
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        start_new_activity()

    }
    fun start_new_activity(){
        var b: Button? = view?.findViewById(R.id.button4)
        b?.setOnClickListener {
            val intent = Intent(activity, WordTestImplActivity::class.java)
            var str : String = "Visualize"
            val InpFrag : Array<String> = arrayOf("Görselleştirmek", "Altında", "Bağış", "Ensülin")
            intent.putExtra("label", str)
            intent.putExtra("card label list", InpFrag)
            activity?.startActivity(intent)
            // starting another activity on button click with data payload pushed to the other activity
        }
    }

}