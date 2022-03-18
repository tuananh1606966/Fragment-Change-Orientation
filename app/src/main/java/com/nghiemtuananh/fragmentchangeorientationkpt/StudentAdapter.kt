package com.nghiemtuananh.fragmentchangeorientationkpt

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.nghiemtuananh.fragmentchangeorientationkpt.databinding.RowStudentBinding

class StudentAdapter(var listStudent: MutableList<SinhVien>): RecyclerView.Adapter<StudentAdapter.StudentViewHolder>() {
    lateinit var iTruyenSinhVien: ITruyenSinhVien
    var lastCheckedPosition: Int = -1
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        var binding = RowStudentBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return StudentViewHolder(binding)
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        iTruyenSinhVien = holder.itemView.context as ITruyenSinhVien
        var sinhVien = listStudent.get(position)
        holder.binding.data = sinhVien
        holder.itemView.setOnClickListener {
//            Toast.makeText(holder.itemView.context, sinhVien.hoTen, Toast.LENGTH_LONG).show()
            chooseItem(sinhVien, holder)
            iTruyenSinhVien.dataStudent(sinhVien)
        }
    }

    private fun chooseItem(sinhVien: SinhVien, holder: StudentViewHolder) {
        for (i in 0..listStudent.size - 1) {
            listStudent[i].isChoose = false
        }
        sinhVien.isChoose = !sinhVien.isChoose
        var copyOfLastCheckedPosition: Int = lastCheckedPosition
        lastCheckedPosition = holder.adapterPosition
        notifyItemChanged(copyOfLastCheckedPosition)
        notifyItemChanged(lastCheckedPosition)
    }

    override fun getItemCount(): Int {
        return listStudent.size
    }

    inner class StudentViewHolder(var binding: RowStudentBinding) : RecyclerView.ViewHolder(binding.root) {
    }
}