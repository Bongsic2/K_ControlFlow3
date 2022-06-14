package org.techtown.k_controlflow3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var eraOfRyu = 2.32
        var eraOfDegrom = 2.43

        var era = if (eraOfRyu < eraOfDegrom) {
            Log.d("MLB_Result", "2019류현진이 디그롬을 이겼습니다.")
            eraOfRyu
        } else {
            Log.d("MLB_Result", "2019디그롬이이 류현진을 이겼습니다.")
            eraOfDegrom
        }
        Log.d("MLB_Result","2019 MLB에서 가장 높은 ERA는 ${era}입니다.")
    }
}