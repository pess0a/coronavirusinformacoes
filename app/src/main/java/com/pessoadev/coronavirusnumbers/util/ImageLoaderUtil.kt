package com.pessoadev.coronavirusnumbers.util

import android.content.Context
import coil.Coil
import coil.ImageLoader
import coil.api.get
import coil.api.load
import coil.decode.SvgDecoder
import coil.request.RequestDisposable

class ImageLoaderUtil(private val context: Context) {

    var imageLoader: ImageLoader = ImageLoader(context) {
        componentRegistry {
            add(SvgDecoder(context))
        }
    }

}