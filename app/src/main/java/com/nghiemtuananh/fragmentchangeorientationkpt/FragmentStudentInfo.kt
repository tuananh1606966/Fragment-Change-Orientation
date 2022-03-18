package com.nghiemtuananh.fragmentchangeorientationkpt

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.nghiemtuananh.fragmentchangeorientationkpt.databinding.FragmentStudentInfoBinding

class FragmentStudentInfo : Fragment() {
    //    lateinit var txtTen: TextView
//    lateinit var txtNamSinh: TextView
//    lateinit var txtDiaChi: TextView
//    lateinit var txtEmail: TextView
    var binding: FragmentStudentInfoBinding? = null

    //    internal lateinit var view: View
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
//        var view = inflater.inflate(R.layout.fragment_student_info, container, false)
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_student_info,
            container,
            false)
//        anhXa()
        return binding?.root
    }

    fun setInfo(sinhVien: SinhVien) {
//        txtTen.setText(sinhVien.hoTen)
//        txtNamSinh.setText("Năm sinh: ${sinhVien.namSinh}")
//        txtDiaChi.setText("Địa chỉ: ${sinhVien.diaChi}")
//        txtEmail.setText("Email: ${sinhVien.email}")
        binding!!.data = sinhVien
    }

//    private fun anhXa() {
//        txtTen = view.findViewById(R.id.tv_name_student)
//        txtNamSinh = view.findViewById(R.id.tv_namsinh)
//        txtDiaChi = view.findViewById(R.id.tv_diachi)
//        txtEmail = view.findViewById(R.id.tv_email)
//    }
}