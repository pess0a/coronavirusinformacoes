package com.pessoadev.coronavirusinformacoes.util

import android.content.Context
import coil.ImageLoader
import coil.decode.SvgDecoder

class ImageLoaderUtil(private val context: Context) {

    var imageLoader: ImageLoader = ImageLoader(context) {
        componentRegistry {
            add(SvgDecoder(context))
        }
    }

}