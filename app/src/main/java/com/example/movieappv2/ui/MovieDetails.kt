package com.example.movieappv2.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.bumptech.glide.Glide
import com.example.movieappv2.R
import com.example.movieappv2.databinding.MovieDetailsBinding
import kotlinx.android.synthetic.main.movie_details.*

class MovieDetails : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding : MovieDetailsBinding = DataBindingUtil.setContentView(this,R.layout.movie_details)
        

        val bundle = intent.extras!!
        var url = "https://image.tmdb.org/t/p/w500"
        var urlBackdrop = "https://image.tmdb.org/t/p/original"

        Glide.with(this)
            .load(url+bundle.getString("poster_path"))
            .into(ivMoviePoster)

        Glide.with(this)
            .load(urlBackdrop+bundle.getString("backdrop_path"))
            .into(ivBackdrop)

        var voteDisplay = bundle.getInt("vote_count").toString() +" votes"

        tvMovieTitle.text = bundle.getString("original_title")
        tvVoteAverage.text = bundle.getDouble("vote_average").toString()
        tvVoteCount.text = voteDisplay
        tvReleaseDate.text = bundle.getString("release_date")
        tvOriginalLanguage.text = bundle.getString("original_language")
        tvDescription.text = bundle.getString("overview")
    }
}