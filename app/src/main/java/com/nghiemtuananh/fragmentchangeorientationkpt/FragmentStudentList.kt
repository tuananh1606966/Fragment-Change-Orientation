package com.nghiemtuananh.fragmentchangeorientationkpt

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FragmentStudentList: Fragment() {
    var listSinhVien: MutableList<SinhVien> = mutableListOf()
    lateinit var adapter: StudentAdapter
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_student_list, container, false)
        var recyclerView = view.findViewById(R.id.rcv_list_student) as RecyclerView
        addSinhVien()
        adapter = StudentAdapter(listSinhVien)
        recyclerView.adapter = adapter
//        recyclerView.setHasFixedSize(true)
        var itemDecoration: DividerItemDecoration = DividerItemDecoration(activity, DividerItemDecoration.VERTICAL)
        recyclerView.addItemDecoration(itemDecoration)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        return view
    }

    private fun addSinhVien() {
        listSinhVien.add(SinhVien("Nguyễn Văn A", 1999,"Hà Nội", "tuananh16@gmail.com"))
        listSinhVien.add(SinhVien("Nguyễn Văn B", 1996,"Cà Mau", "lan@gmail.com"))
        listSinhVien.add(SinhVien("Nguyễn Văn C", 1992,"Hồ Chí Minh", "cuty@gmail.com"))
        listSinhVien.add(SinhVien("Nguyễn Văn D", 1991,"Vũng Tàu", "hayqua@gmail.com"))
        listSinhVien.add(SinhVien("Nguyễn Văn E", 1990,"Lào Cai", "android@gmail.com"))
        listSinhVien.add(SinhVien("Nguyễn Văn F", 1989,"Phú Thọ", "ios@gmail.com"))
        listSinhVien.add(SinhVien("Nguyễn Văn A", 1999,"Hà Nội", "tuananh16@gmail.com"))
        listSinhVien.add(SinhVien("Nguyễn Văn B", 1996,"Cà Mau", "lan@gmail.com"))
        listSinhVien.add(SinhVien("Nguyễn Văn C", 1992,"Hồ Chí Minh", "cuty@gmail.com"))
        listSinhVien.add(SinhVien("Nguyễn Văn D", 1991,"Vũng Tàu", "hayqua@gmail.com"))
        listSinhVien.add(SinhVien("Nguyễn Văn E", 1990,"Lào Cai", "android@gmail.com"))
        listSinhVien.add(SinhVien("Nguyễn Văn F", 1989,"Phú Thọ", "ios@gmail.com"))
        listSinhVien.add(SinhVien("Nguyễn Văn A", 1999,"Hà Nội", "tuananh16@gmail.com"))
        listSinhVien.add(SinhVien("Nguyễn Văn B", 1996,"Cà Mau", "lan@gmail.com"))
        listSinhVien.add(SinhVien("Nguyễn Văn C", 1992,"Hồ Chí Minh", "cuty@gmail.com"))
        listSinhVien.add(SinhVien("Nguyễn Văn D", 1991,"Vũng Tàu", "hayqua@gmail.com"))
        listSinhVien.add(SinhVien("Nguyễn Văn E", 1990,"Lào Cai", "android@gmail.com"))
        listSinhVien.add(SinhVien("Nguyễn Văn F", 1989,"Phú Thọ", "ios@gmail.com"))
        listSinhVien.add(SinhVien("Nguyễn Văn A", 1999,"Hà Nội", "tuananh16@gmail.com"))
        listSinhVien.add(SinhVien("Nguyễn Văn B", 1996,"Cà Mau", "lan@gmail.com"))
        listSinhVien.add(SinhVien("Nguyễn Văn C", 1992,"Hồ Chí Minh", "cuty@gmail.com"))
        listSinhVien.add(SinhVien("Nguyễn Văn D", 1991,"Vũng Tàu", "hayqua@gmail.com"))
        listSinhVien.add(SinhVien("Nguyễn Văn E", 1990,"Lào Cai", "android@gmail.com"))
        listSinhVien.add(SinhVien("Nguyễn Văn F", 1989,"Phú Thọ", "ios@gmail.com"))
        listSinhVien.add(SinhVien("Nguyễn Văn A", 1999,"Hà Nội", "tuananh16@gmail.com"))
        listSinhVien.add(SinhVien("Nguyễn Văn B", 1996,"Cà Mau", "lan@gmail.com"))
        listSinhVien.add(SinhVien("Nguyễn Văn C", 1992,"Hồ Chí Minh", "cuty@gmail.com"))
        listSinhVien.add(SinhVien("Nguyễn Văn D", 1991,"Vũng Tàu", "hayqua@gmail.com"))
        listSinhVien.add(SinhVien("Nguyễn Văn E", 1990,"Lào Cai", "android@gmail.com"))
        listSinhVien.add(SinhVien("Nguyễn Văn F", 1989,"Phú Thọ", "ios@gmail.com"))
        listSinhVien.add(SinhVien("Nguyễn Văn A", 1999,"Hà Nội", "tuananh16@gmail.com"))
        listSinhVien.add(SinhVien("Nguyễn Văn B", 1996,"Cà Mau", "lan@gmail.com"))
        listSinhVien.add(SinhVien("Nguyễn Văn C", 1992,"Hồ Chí Minh", "cuty@gmail.com"))
        listSinhVien.add(SinhVien("Nguyễn Văn D", 1991,"Vũng Tàu", "hayqua@gmail.com"))
        listSinhVien.add(SinhVien("Nguyễn Văn E", 1990,"Lào Cai", "android@gmail.com"))
        listSinhVien.add(SinhVien("Nguyễn Văn F", 1989,"Phú Thọ", "ios@gmail.com"))
        listSinhVien.add(SinhVien("Nguyễn Văn A", 1999,"Hà Nội", "tuananh16@gmail.com"))
        listSinhVien.add(SinhVien("Nguyễn Văn B", 1996,"Cà Mau", "lan@gmail.com"))
        listSinhVien.add(SinhVien("Nguyễn Văn C", 1992,"Hồ Chí Minh", "cuty@gmail.com"))
        listSinhVien.add(SinhVien("Nguyễn Văn D", 1991,"Vũng Tàu", "hayqua@gmail.com"))
        listSinhVien.add(SinhVien("Nguyễn Văn E", 1990,"Lào Cai", "android@gmail.com"))
        listSinhVien.add(SinhVien("Nguyễn Văn F", 1989,"Phú Thọ", "ios@gmail.com"))
        listSinhVien.add(SinhVien("Nguyễn Văn A", 1999,"Hà Nội", "tuananh16@gmail.com"))
        listSinhVien.add(SinhVien("Nguyễn Văn B", 1996,"Cà Mau", "lan@gmail.com"))
        listSinhVien.add(SinhVien("Nguyễn Văn C", 1992,"Hồ Chí Minh", "cuty@gmail.com"))
        listSinhVien.add(SinhVien("Nguyễn Văn D", 1991,"Vũng Tàu", "hayqua@gmail.com"))
        listSinhVien.add(SinhVien("Nguyễn Văn E", 1990,"Lào Cai", "android@gmail.com"))
        listSinhVien.add(SinhVien("Nguyễn Văn F", 1989,"Phú Thọ", "ios@gmail.com"))
        listSinhVien.add(SinhVien("Nguyễn Văn A", 1999,"Hà Nội", "tuananh16@gmail.com"))
        listSinhVien.add(SinhVien("Nguyễn Văn B", 1996,"Cà Mau", "lan@gmail.com"))
        listSinhVien.add(SinhVien("Nguyễn Văn C", 1992,"Hồ Chí Minh", "cuty@gmail.com"))
        listSinhVien.add(SinhVien("Nguyễn Văn D", 1991,"Vũng Tàu", "hayqua@gmail.com"))
        listSinhVien.add(SinhVien("Nguyễn Văn E", 1990,"Lào Cai", "android@gmail.com"))
        listSinhVien.add(SinhVien("Nguyễn Văn F", 1989,"Phú Thọ", "ios@gmail.com"))
    }
}