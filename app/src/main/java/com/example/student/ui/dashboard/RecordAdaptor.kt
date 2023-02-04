package com.example.student.ui.dashboard

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.student.R
import com.example.student.databinding.ItemFavRecBinding
import com.example.student.databinding.ItemRecordBinding
import com.example.student.model.datamodel.FavouriteRecord
import com.example.student.model.datamodel.Record

class RecordAdaptor(private val records:List<Record>) : RecyclerView.Adapter<RecordAdaptor.ViewHolder>() {


    inner class userViewHolder(val v:View):RecyclerView.ViewHolder(v){
        val img = v.findViewById<ImageView>(R.id.iv_img)
        val name = v.findViewById<TextView>(R.id.tv_name)
        val desc = v.findViewById<TextView>(R.id.tv_desc)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return RecordAdaptor.ViewHolder(ItemRecordBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model =  records[position]
        holder.binding.tvName.text = model.name
        holder.binding.ivImg.setImageResource(model.image)

    }

    override fun getItemCount(): Int {
        return records.size
    }
    class ViewHolder(val binding: ItemRecordBinding): RecyclerView.ViewHolder(binding.root)
}