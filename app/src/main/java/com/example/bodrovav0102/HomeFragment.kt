
package com.example.bodrovav0102

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val button = view.findViewById<Button>(R.id.button2)

        button.setOnClickListener {

            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, SecondActivity())
                .addToBackStack(null)
                .commit()

        }

        return view
    }
}
