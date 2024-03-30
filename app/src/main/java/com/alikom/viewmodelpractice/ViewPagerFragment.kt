package com.alikom.viewmodelpractice

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2

class ViewPagerFragment : Fragment() {

    private lateinit var viewPager2: ViewPager2
    private lateinit var adapter: MyAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_viewpager, container, false)
        viewPager2 = view.findViewById(R.id.viewPager2)

        // Создание адаптера и присоединение его к RecyclerView
        adapter = MyAdapter(data.toMutableList())
        viewPager2.adapter = adapter

//        val addItemFragment = BottomSheetFragment()
//        addItemFragment.setAdapter(adapter)
//        adapter.updateItems(data)
////        addItemFragment.show(childFragmentManager, "add_item_bottom_sheet")

        return view
    }

    val data = mutableListOf(
        Model(R.drawable.ic_master_card, "Master Card", "$ 3 753.35", "* 5623"),
        Model(R.drawable.ic_milli, "Milly Card", "$ 6 333.35", "* 3323"),
        Model(R.drawable.bank_card, "Visa Card", "$ 2 003.35", "* 4443"),
    )

}
