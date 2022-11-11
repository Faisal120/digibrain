package com.example.digibrainmedia

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.WeekDueAdapter
import com.WeekDueModel

class HomeFragment : Fragment() {

    private lateinit var item1 : TextView
    private lateinit var item2 : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_home, container, false)
        val recyclerWeek = view.findViewById<RecyclerView>(R.id.recWeekDue)

        recyclerWeek.layoutManager = LinearLayoutManager(context)
        val weekData =ArrayList<WeekDueModel>()

        weekData.add(WeekDueModel(R.drawable.elon,"Absardze Koblenz","Due 26 sep","- 8 days to pay", "$ 24.90"))
        weekData.add(WeekDueModel(R.drawable.elon,"Absardze Koblenz","Due 26 sep","- 8 days to pay", "$ 24.90"))
        weekData.add(WeekDueModel(R.drawable.elon,"Absardze Koblenz","Due 26 sep","- 8 days to pay", "$ 24.90"))
        weekData.add(WeekDueModel(R.drawable.elon,"Absardze Koblenz","Due 26 sep","- 8 days to pay", "$ 24.90"))

        val adapter = WeekDueAdapter(weekData)
        recyclerWeek.adapter = adapter

        val swipeController = SwipeCntroller()
        val itemTouchHelper = ItemTouchHelper(swipeController)
        itemTouchHelper.attachToRecyclerView(recyclerWeek)


        return view

    }
}