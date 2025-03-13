package com.example.fragmentactivity

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.ArrayAdapter
import android.widget.Spinner


class ColorFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_color, container, false).apply {
            findViewById<Spinner>(R.id.spinner).apply{
                adapter = ArrayAdapter(context, android.R.layout.simple_spinner_item,
                    arrayOf("Blue", "Red", "White", "Black", "Magenta"))

                onItemSelectedListener = object: OnItemSelectedListener{
                    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                        p0?.run {
                            view?.setBackgroundColor(Color.parseColor(getItemAtPosition(p2).toString()))
                        }
                    }

                    override fun onNothingSelected(parent: AdapterView<*>?) {
                    }


                }

            }
        }
    }

}