package com.nghiemtuananh.fragmentchangeorientationkpt

import java.io.Serializable

data class SinhVien(var hoTen: String, var namSinh: Int, var diaChi: String, var email: String, var isChoose: Boolean = false) : Serializable
