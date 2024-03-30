package com.alikom.viewmodelpractice

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.fragment.app.DialogFragment
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class BottomSheetFragment : BottomSheetDialogFragment() {

    private lateinit var addButton: Button
    private lateinit var viewPager2Adapter: MyAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_bottom_sheet, container, false)
        addButton = view.findViewById(R.id.addButton)
        addButton.setOnClickListener {
            addItemToViewPager()

        }

        val img_visa: ImageView = view.findViewById(R.id.img_visa)
        val img_master = view.findViewById<ImageView>(R.id.img_master)
        val img_milli = view.findViewById<ImageView>(R.id.img_milli)

        val lineVisa = view.findViewById<LinearLayout>(R.id.lineVisa).setOnClickListener {
            img_visa.setImageResource(R.drawable.ic_select)
            img_master.setImageResource(R.drawable.circle)
            img_milli.setImageResource(R.drawable.circle)
        }
        val lineMilli = view.findViewById<LinearLayout>(R.id.lineMilly).setOnClickListener {
            img_visa.setImageResource(R.drawable.circle)
            img_master.setImageResource(R.drawable.circle)
            img_milli.setImageResource(R.drawable.ic_select)
        }
        val lineMaster = view.findViewById<LinearLayout>(R.id.lineMaster).setOnClickListener {
            img_visa.setImageResource(R.drawable.circle)
            img_master.setImageResource(R.drawable.ic_select)
            img_milli.setImageResource(R.drawable.circle)
        }


        return view
    }


    private fun addItemToViewPager() {
        val newItem = Model(R.drawable.bank_card,"New Item", "Bank Card", "new Item")
        viewPager2Adapter.addData(newItem)
        dismiss()
    }

    fun setAdapter(adapter: MyAdapter) {
        viewPager2Adapter = adapter
    }
}