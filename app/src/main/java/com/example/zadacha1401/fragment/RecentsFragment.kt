package com.example.zadacha1401.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.zadacha1401.R
import com.example.zadacha1401.adapter.RecentsAdapter
import com.example.zadacha1401.model.Recents

class RecentsFragment : Fragment() {
    lateinit var list:ArrayList<Recents>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_recents, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews(view)
    }
    private fun initViews(view:View) {
        list=loadList()
        val rvRecents=view.findViewById<RecyclerView>(R.id.rv_recents)
        val adapter= RecentsAdapter(list)
        rvRecents.adapter=adapter
        rvRecents.layoutManager=
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL,false)
    }

    private fun loadList(): ArrayList<Recents> {
        val mylist=ArrayList<Recents>()
        mylist.add(Recents("https://www.carlogos.org/logo/Maybach-logo-640x480.jpg","Mansurbek","today"))
        mylist.add(Recents("https://www.carlogos.org/logo/Maybach-logo-640x480.jpg","Mansurbek","today"))
        mylist.add(Recents("https://www.carlogos.org/logo/Maybach-logo-640x480.jpg","Mansurbek","today"))
        mylist.add(Recents("https://www.carlogos.org/logo/Maybach-logo-640x480.jpg","Mansurbek","today"))
        mylist.add(Recents("https://www.carlogos.org/logo/Maybach-logo-640x480.jpg","Mansurbek","today"))
        mylist.add(Recents("https://www.carlogos.org/logo/Maybach-logo-640x480.jpg","Mansurbek","today"))
        mylist.add(Recents("https://www.carlogos.org/logo/Maybach-logo-640x480.jpg","Mansurbek","today"))
        mylist.add(Recents("https://www.carlogos.org/logo/Maybach-logo-640x480.jpg","Mansurbek","today"))
        return mylist
    }
}