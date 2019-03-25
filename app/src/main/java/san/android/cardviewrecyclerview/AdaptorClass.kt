package san.android.cardviewrecyclerview

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.indiview.view.*

class AdaptorClass(var list:ArrayList<ImageClass>) : RecyclerView.Adapter<AdaptorClass.ViewHolderClass>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolderClass {

        var v = LayoutInflater.from(p0.context).inflate(R.layout.indiview, p0, false)
        return ViewHolderClass(v)
    }

    override fun getItemCount(): Int {
       return list.size

    }

    override fun onBindViewHolder(p0: ViewHolderClass, p1: Int) {

        var imageclass:ImageClass = list.get(p1)
        p0.mImage1.setImageResource(imageclass.img1)
        p0.mText1.text = imageclass.text1
        p0.mText2.text = imageclass.text2
    }

    class ViewHolderClass(v: View) : RecyclerView.ViewHolder(v) {

        var mImage1 = v.imgv1!!
        var mText1 = v.tv1!!
        var mText2 = v.tv2!!

    }

}