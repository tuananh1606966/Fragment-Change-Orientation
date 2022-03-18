package com.nghiemtuananh.fragmentchangeorientationkpt

import android.content.Intent
import android.content.res.Configuration
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import androidx.databinding.DataBindingUtil
import com.nghiemtuananh.fragmentchangeorientationkpt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), ITruyenSinhVien {
    lateinit var binding: ActivityMainBinding
    var fragmentStudentInfo: FragmentStudentInfo? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =
            DataBindingUtil.setContentView(this, R.layout.activity_main) as ActivityMainBinding
        var configuration: Configuration = resources.configuration
        if (configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            fragmentStudentInfo = supportFragmentManager.findFragmentById(R.id.fragment_info) as FragmentStudentInfo?
            AsyncTaskTest().execute()
        }
    }

    override fun dataStudent(sinhVien: SinhVien) {
        fragmentStudentInfo =
            supportFragmentManager.findFragmentById(R.id.fragment_info) as FragmentStudentInfo?
        var configuration: Configuration = resources.configuration
//      if (fragmentStudentInfo != null && fragmentStudentInfo.isInLayout) {
        if (fragmentStudentInfo != null && configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            fragmentStudentInfo!!.setInfo(sinhVien)
        } else {
            intent = Intent(this, StudentInfomation::class.java)
            intent.putExtra("info", sinhVien)
            startActivity(intent)
        }
    }
    inner class AsyncTaskTest : AsyncTask<Void, Void, Void>() {
        override fun onPostExecute(result: Void?) {
            fragmentStudentInfo?.setInfo(SinhVien("Nguyễn Văn A",
                1999,
                "Hà Nội",
                "tuananh@gmail.com"))
            super.onPostExecute(result)
        }

        override fun doInBackground(vararg params: Void?): Void? {
            SystemClock.sleep(100)
            return null
        }
    }
}