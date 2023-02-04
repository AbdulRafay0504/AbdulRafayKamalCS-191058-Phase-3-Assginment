package com.example.student.ui.addrecord

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.student.databinding.FragmentAddRecordBinding

class AddrecordFragment :Fragment() {

    private var _binding :FragmentAddRecordBinding? = null

    private val binding get() =_binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val addrecordViewModel = ViewModelProvider(this).get(AddrecordViewModel::class.java)
        _binding = FragmentAddRecordBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textName
        val textdesc: TextView = binding.textDesc
        addrecordViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
            textdesc.text =it
        }
        return root
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}