package com.example.mvi_test.ui.main.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mvi_test.R
import com.example.mvi_test.data.model.User
import com.example.mvi_test.databinding.ItemLayoutBinding

class MainAdapter(private val users: ArrayList<User>) :
    RecyclerView.Adapter<MainAdapter.DataViewHolder>() {
    class DataViewHolder(private val binding: ItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(user: User) {
            binding.textViewUserName.text = user.name
            binding.textViewUserEmail.text = user.email
            Glide.with(binding.imageViewAvatar.context)
                .load(user.avatar)
                .into(binding.imageViewAvatar)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        val binding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DataViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return users.size
    }

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.bind(users[position])
    }

    fun addData(list: List<User>) {
        users.addAll(list)
    }

}