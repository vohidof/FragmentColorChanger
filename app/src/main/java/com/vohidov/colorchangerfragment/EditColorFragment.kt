package com.vohidov.colorchangerfragment

import Cache.MySharedPreference
import Utils.MyData
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_edit_color.*
import kotlinx.android.synthetic.main.fragment_edit_color.view.*
import kotlinx.android.synthetic.main.fragment_main.*
import kotlinx.android.synthetic.main.fragment_main.view.*

class EditColorFragment : Fragment() {

    lateinit var root1 : View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        root1 = inflater.inflate(R.layout.fragment_edit_color, container, false)

        root1.btn_SetColor.setOnClickListener {
            fragmentManager?.beginTransaction()?.replace(R.id.liner_container, MainFragment())
                    ?.addToBackStack(null)?.commit()
        }

        MySharedPreference.init(context)

        root1.card1.setOnClickListener {
            MySharedPreference.color = 1
        }
        root1.card2.setOnClickListener {
            MySharedPreference.color = 2
        }
        root1.card3.setOnClickListener {
            MySharedPreference.color = 3
        }
        root1.card4.setOnClickListener {
            MySharedPreference.color = 4
        }
        root1.card5.setOnClickListener {
            MySharedPreference.color = 5
        }
        root1.card6.setOnClickListener {
            MySharedPreference.color = 6
        }
        root1.card7.setOnClickListener {
            MySharedPreference.color = 7
        }
        root1.card8.setOnClickListener {
            MySharedPreference.color = 8
        }
        root1.card9.setOnClickListener {
            MySharedPreference.color = 9
        }
        root1.card10.setOnClickListener {
            MySharedPreference.color = 10
        }
        root1.card11.setOnClickListener {
            MySharedPreference.color = 11
        }
        root1.card12.setOnClickListener {
            MySharedPreference.color = 12
        }

        return root1
    }

}