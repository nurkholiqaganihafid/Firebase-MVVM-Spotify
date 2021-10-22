package com.nurkholiq.firebase_spotify.exoplayer

import android.content.Context
import android.support.v4.media.session.MediaControllerCompat
import android.support.v4.media.session.MediaSessionCompat
import com.google.android.exoplayer2.ui.PlayerNotificationManager
import com.nurkholiq.firebase_spotify.R
import com.nurkholiq.firebase_spotify.other.Constants.NOTIFICATION_CHANNEL_ID
import com.nurkholiq.firebase_spotify.other.Constants.NOTIFICATION_ID

class MusicNotificationManager(
    private val context: Context,
    sessionToken: MediaSessionCompat.Token,
    notificationListener: PlayerNotificationManager.NotificationListener,
    private val newSongCallback: () -> Unit
) {

//    private val notificationManager: PlayerNotificationManager
//
//    init {
//        notificationManager = PlayerNotificationManager.createWithNotificationChannel(
//            context,
//            NOTIFICATION_CHANNEL_ID,
//            R.string.notification_channel_name,
//            R.string.notification_channel_description,
//            NOTIFICATION_ID,
//            DescriptionAdapter(mediaController),
//            notificationListener
//        )
//    }

    val mediaController = MediaControllerCompat(context, sessionToken)

    private val notificationManager: PlayerNotificationManager = PlayerNotificationManager.Builder(
        context,
        NOTIFICATION_ID,
        NOTIFICATION_CHANNEL_ID,
        DescriptionAdapter(mediaController)
    ).apply {
        setSmallIconResourceId(R.drawable.ic_music)
        setChannelNameResourceId(R.string.notification_channel_name)
        setChannelDescriptionResourceId(R.string.notification_channel_description)
        setNotificationListener(notificationListener)
    }.build()

}