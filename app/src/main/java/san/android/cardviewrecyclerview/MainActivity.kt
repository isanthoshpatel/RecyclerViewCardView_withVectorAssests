package san.android.cardviewrecyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var arrayList = ArrayList<ImageClass>()

        arrayList.add(ImageClass(R.drawable.ic_android_black_24dp, "Line 1", "Line 2"))
        arrayList.add(ImageClass(R.drawable.ic_audiotrack_black_24dp, "Line 3", "Line 4"))
        arrayList.add(ImageClass(R.drawable.ic_brightness_1_black_24dp, "Line 5", "Line 6"))
        arrayList.add(ImageClass(R.drawable.ic_3d_rotation_black_24dp, "Line 7", "Line 8"))
        arrayList.add(ImageClass(R.drawable.ic_brightness_1_black_24dp, "Line 9", "Line 10 "))
        arrayList.add(ImageClass(R.drawable.ic_beach_access_black_24dp, "Line 11", "Line 12"))
        arrayList.add(ImageClass(R.drawable.ic_brightness_1_black_24dp, "Line 13", "Line 14"))
        arrayList.add(ImageClass(R.drawable.ic_audiotrack_black_24dp, "Line 15", "Line 16"))
        arrayList.add(ImageClass(R.drawable.ic_brightness_1_black_24dp, "Line 17", "Line 18"))
        arrayList.add(ImageClass(R.drawable.ic_audiotrack_black_24dp, "Line 19", "Line 20"))
        arrayList.add(ImageClass(R.drawable.ic_audiotrack_black_24dp, "Line 19", "Line 20"))
        arrayList.add(ImageClass(R.drawable.ic_audiotrack_black_24dp, "Line 19", "Line 20"))
        arrayList.add(ImageClass(R.drawable.ic_audiotrack_black_24dp, "Line 19", "Line 20"))
        arrayList.add(ImageClass(R.drawable.ic_audiotrack_black_24dp, "Line 19", "Line 20"))
        arrayList.add(ImageClass(R.drawable.ic_audiotrack_black_24dp, "Line 19", "Line 20"))
        arrayList.add(ImageClass(R.drawable.ic_audiotrack_black_24dp, "Line 19", "Line 20"))
        arrayList.add(ImageClass(R.drawable.ic_audiotrack_black_24dp, "Line 19", "Line 20"))
        arrayList.add(ImageClass(R.drawable.ic_audiotrack_black_24dp, "Line 19", "Line 20"))
        arrayList.add(ImageClass(R.drawable.ic_audiotrack_black_24dp, "Line 19", "Line 20"))
        arrayList.add(ImageClass(R.drawable.ic_audiotrack_black_24dp, "Line 19", "Line 20"))
        arrayList.add(ImageClass(R.drawable.ic_brightness_1_black_24dp, "Line 17", "Line 18"))
        arrayList.add(ImageClass(R.drawable.ic_brightness_1_black_24dp, "Line 17", "Line 18"))
        arrayList.add(ImageClass(R.drawable.ic_brightness_1_black_24dp, "Line 17", "Line 18"))
        arrayList.add(ImageClass(R.drawable.ic_brightness_1_black_24dp, "Line 17", "Line 18"))
        arrayList.add(ImageClass(R.drawable.ic_brightness_1_black_24dp, "Line 17", "Line 18"))

        var recycler = rv1
        recycler.setHasFixedSize(true)

        var mLayout = LinearLayoutManager(this)
        var mAdaptor = AdaptorClass(arrayList)

        recycler.layoutManager = mLayout
        recycler.adapter = mAdaptor


    }
}
