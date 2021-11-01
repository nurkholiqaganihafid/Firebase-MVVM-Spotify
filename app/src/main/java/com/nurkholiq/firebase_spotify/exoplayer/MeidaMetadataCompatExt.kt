package com.nurkholiq.firebase_spotify.exoplayer

import android.support.v4.media.MediaMetadataCompat
import com.nurkholiq.firebase_spotify.data.entities.Song

fun MediaMetadataCompat.toSong(): Song? {
    return description?.let {
        Song(
            it.mediaId ?: "",
            it.title.toString(),
            it.subtitle.toString(),
            it.mediaUri.toString(),
            it.iconUri.toString()
        )
    }
}