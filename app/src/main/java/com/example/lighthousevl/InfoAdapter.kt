package com.example.lighthousevl

import android.app.Activity
import android.content.Context
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.Marker

class InfoAdapter(val context: Context): GoogleMap.InfoWindowAdapter {

    var mInfoView = (context as Activity).layoutInflater.inflate(R.layout.custom_info_window, null)

    private fun setData(marker: Marker, view: View) {
        val title = marker.title
        val tvTitle = view.findViewById<View>(R.id.title) as TextView
        tvTitle.text = title
        val info = marker.snippet
        val tvInfo = view.findViewById<View>(R.id.info) as TextView
        tvInfo.text = info
        val tvImage = view.findViewById<View>(R.id.image) as ImageView
        if (title == "Токаревский Маяк") tvImage.setBackgroundResource(R.drawable.tk)
        else if (title == "Маяк на мысе Басаргина") tvImage.setBackgroundResource(R.drawable.bs)
        else if (title == "Маяк Гамова") tvImage.setBackgroundResource(R.drawable.gv)
        tvImage.layoutParams.width = 250
        tvImage.layoutParams.height = 250
    }

    override fun getInfoContents(p0: Marker): View {
        setData(p0, mInfoView)
        return mInfoView
    }

    override fun getInfoWindow(p0: Marker): View {
        setData(p0, mInfoView)
        return mInfoView
    }
}