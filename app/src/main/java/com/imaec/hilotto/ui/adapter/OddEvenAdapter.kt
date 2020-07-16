package com.imaec.hilotto.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.imaec.hilotto.base.BaseAdapter
import com.imaec.hilotto.databinding.ItemOddEvenBinding
import com.imaec.hilotto.model.OddEvenDTO

class OddEvenAdapter : BaseAdapter() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        binding = ItemOddEvenBinding.inflate(LayoutInflater.from(parent.context))
        return ItemViewHolder(binding as ItemOddEvenBinding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is ItemViewHolder) {
            holder.onBind(listItem[position] as OddEvenDTO)
        }
    }

    inner class ItemViewHolder(val binding: ItemOddEvenBinding) : RecyclerView.ViewHolder(binding.root) {

        fun onBind(item: OddEvenDTO) {
            binding.apply {
                recyclerItemNum.adapter = NumberAdapter()
                recyclerItemNum.layoutManager = LinearLayoutManager(binding.root.context, LinearLayoutManager.HORIZONTAL, false)
                this.item = item
            }
        }
    }
}