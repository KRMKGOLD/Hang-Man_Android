package com.example.hangman.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.hangman.data.model.Info
import com.example.hangman.R

class MainAdapter(private val infoList: ArrayList<Info>) : RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_main, parent, false)
        return MainViewHolder(view)
    }

    override fun getItemCount(): Int = infoList.size

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bind(infoList[position])
    }

    class MainViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var tvRoomName: TextView = itemView.findViewById(R.id.tv_room_name_main_item)
        var tvCount: TextView = itemView.findViewById(R.id.tv_count_main_item)
        var itemLayout : ConstraintLayout = itemView.findViewById(R.id.layout_item_main)

        fun bind(info : Info) {
            tvRoomName.text = info.roomTitle
            tvCount.text = info.count
            itemLayout.setOnClickListener {
                /* TODO : 어차피 방 ID로 구분할건데 이거 adapterPosition이랑 어떻게 낑겨서 개발
                *   어떻게든 합니다 진짜 일단 그냥 RoomActivity 이동. MVP 로직으로 변경 필요 */
            }
        }
    }
}