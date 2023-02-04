package com.example.student.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider

import androidx.recyclerview.widget.LinearLayoutManager
import com.example.student.databinding.FragmentDashboardBinding


class DashboardFragment : Fragment() {
    private var _binding: FragmentDashboardBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
       val dashboardViewModel = ViewModelProvider(this).get(DashboardViewModel:: class.java)
        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.rvRecord.layoutManager = LinearLayoutManager(context)
        dashboardViewModel.getAllRecord().observe(viewLifecycleOwner){
          binding.rvRecord.adapter = RecordAdaptor(it)
        }
      return root
}



}
