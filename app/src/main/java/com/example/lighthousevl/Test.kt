package com.example.lighthousevl

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
import com.google.android.gms.maps.model.Marker

class InfoAdapterTest(private val mContext: Context) : InfoWindowAdapter {
    private val mWindow: View = LayoutInflater.from(mContext).inflate(R.layout.custom_info_window, null)

    private fun setText(marker: Marker, view: View) {
        val title = marker.title
        val tvTitle = view.findViewById<View>(R.id.title) as TextView
        tvTitle.text = title
        val info = marker.snippet
        val tvInfo = view.findViewById<View>(R.id.info) as TextView
        tvInfo.text = info
    }

    override fun getInfoWindow(marker: Marker): View {
        setText(marker, mWindow)
        return mWindow
    }

    override fun getInfoContents(marker: Marker): View {
        setText(marker, mWindow)
        return mWindow
    }

}