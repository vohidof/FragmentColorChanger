package com.vohidov.colorchangerfragment

import Cache.MySharedPreference
import Utils.MyData
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_main.view.*

class MainFragment : Fragment() {

    lateinit var root: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        root = inflater.inflate(R.layout.fragment_main, container, false)

        root.btn_EditColor.setOnClickListener {
            fragmentManager?.beginTransaction()?.replace(R.id.liner_container, EditColorFragment())
                ?.addToBackStack(null)?.commit()
        }
        return root
    }

    override fun onStart() {
        super.onStart()

        MySharedPreference.init(context)

        if (MySharedPreference.color == 1){
            root.setBackgroundColor(resources.getColor(R.color.color1))
        }else if (MySharedPreference.color == 2){
            root.setBackgroundColor(resources.getColor(R.color.color2))
        }else if (MySharedPreference.color == 3){
            root.setBackgroundColor(resources.getColor(R.color.color3))
        }else if (MySharedPreference.color == 4){
            root.setBackgroundColor(resources.getColor(R.color.color4))
        }else if (MySharedPreference.color == 5){
            root.setBackgroundColor(resources.getColor(R.color.color5))
        }else if (MySharedPreference.color == 6){
            root.setBackgroundColor(resources.getColor(R.color.color6))
        }else if (MySharedPreference.color == 7){
            root.setBackgroundColor(resources.getColor(R.color.color7))
        }else if (MySharedPreference.color == 8){
            root.setBackgroundColor(resources.getColor(R.color.color8))
        }else if (MySharedPreference.color == 9){
            root.setBackgroundColor(resources.getColor(R.color.color9))
        }else if (MySharedPreference.color == 10){
            root.setBackgroundColor(resources.getColor(R.color.color10))
        }else if (MySharedPreference.color == 11){
            root.setBackgroundColor(resources.getColor(R.color.color11))
        }else if (MySharedPreference.color == 12){
            root.setBackgroundColor(resources.getColor(R.color.color12))
        }

    }
}