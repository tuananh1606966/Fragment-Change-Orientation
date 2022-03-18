package com.nghiemtuananh.fragmentchangeorientationkpt

import android.content.res.Configuration
import android.os.AsyncTask
import android.os.Bundle
import android.os.SystemClock
import androidx.appcompat.app.AppCompatActivity

class StudentInfomation : AppCompatActivity() {
    lateinit var fragmentInfo: FragmentStudentInfo
    lateinit var sinhVien: SinhVien
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_infomation)
        fragmentInfo = supportFragmentManager.findFragmentById(R.id.fragment_chitiet) as FragmentStudentInfo
        sinhVien = intent.getSerializableExtra("info") as SinhVien
        val configuration: Configuration = resources.configuration
        if (configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            finish()
        } else {
            AsyncTaskTest().execute()
        }
//        fragmentInfo.setInfo(sinhVien)
    }

    inner class AsyncTaskTest : AsyncTask<Void, Void, Void>() {
        override fun onPostExecute(result: Void?) {
            super.onPostExecute(result)
            fragmentInfo.setInfo(sinhVien)
        }

        override fun doInBackground(vararg params: Void?): Void? {
            SystemClock.sleep(100)
            return null
        }
    }
}