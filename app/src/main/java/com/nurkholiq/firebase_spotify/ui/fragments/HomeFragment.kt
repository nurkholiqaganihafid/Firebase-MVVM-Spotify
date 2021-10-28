package com.nurkholiq.firebase_spotify.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.nurkholiq.firebase_spotify.R
import com.nurkholiq.firebase_spotify.adapters.SongAdapter
import com.nurkholiq.firebase_spotify.ui.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class HomeFragment : Fragment(R.layout.fragment_home) {

    lateinit var mainViewModel: MainViewModel

    @Inject
    lateinit var songAdapter: SongAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mainViewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)
    }
}