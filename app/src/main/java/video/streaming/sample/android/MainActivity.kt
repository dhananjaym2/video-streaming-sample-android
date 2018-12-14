package video.streaming.sample.android

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity(),View.OnClickListener {
    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.textView_StreamVideo {

            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}