package com.example.pum24.ui.movies

import MoviesAdapter
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pum24.R

data class Movie(
    val title: String,
    val author: String,
    val yearOfRelease: Int
)

class MoviesFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var moviesAdapter: MoviesAdapter
    private lateinit var moviesList: List<Movie>

    override fun onCreateView(
        inflater: LayoutInflater,    container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_movies, container, false)

        recyclerView = view.findViewById(R.id.recyclerViewMovies)
        initializeData()
        setupRecyclerView()

        return view
    }

    private fun initializeData() {
        moviesList = listOf(
            Movie("Inception", "Christopher Nolan", 2010),
            Movie("Interstellar", "Christopher Nolan", 2014),
            Movie("The Matrix", "Lana Wachowski, Lilly Wachowski", 1999),
            Movie("Avatar", "James Cameron", 2009)
        )
    }

    private fun setupRecyclerView() {
        moviesAdapter = MoviesAdapter(moviesList)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = moviesAdapter
    }
}