package com.example.a581kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

lateinit var recyclerViewFeeds: RecyclerView
lateinit var recyclerViewStories: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        recyclerViewStories = findViewById(R.id.recyclerView_stories)
        recyclerViewStories.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        recyclerViewFeeds = findViewById(R.id.recyclerView_feeds)
        recyclerViewFeeds.layoutManager = GridLayoutManager(this, 1)

        getFeedsAdapter(dataOfFeeds())
        getStoriesAdapter(dataOfStories())
    }

    private fun dataOfStories(): ArrayList<Stories> {
        val storiesList: ArrayList<Stories> = ArrayList()
        storiesList.add(Stories(R.drawable.rasm, "Alisher"))
        storiesList.add(Stories(R.drawable.rasm1, "Abbos Daminov"))
        storiesList.add(Stories(R.drawable.rasm2, "Begzodbek"))
        storiesList.add(Stories(R.drawable.rasm, "Alisher"))
        storiesList.add(Stories(R.drawable.rasm1, "Abbos Daminov"))
        storiesList.add(Stories(R.drawable.rasm2, "Begzodbek"))
        storiesList.add(Stories(R.drawable.rasm, "Alisher"))
        storiesList.add(Stories(R.drawable.rasm1, "Abbos Daminov"))
        storiesList.add(Stories(R.drawable.rasm2, "Begzodbek"))
        storiesList.add(Stories(R.drawable.rasm, "Alisher"))
        storiesList.add(Stories(R.drawable.rasm1, "Abbos Daminov"))
        storiesList.add(Stories(R.drawable.rasm2, "Begzodbek"))
        return storiesList
    }

    private fun getStoriesAdapter(stories: ArrayList<Stories>) {
        val adapter = StoriesAdapter(this, stories)
        recyclerViewStories.adapter = adapter
    }

    private fun dataOfFeeds(): ArrayList<Feeds> {
        val feedsList: ArrayList<Feeds> = ArrayList()
        feedsList.add(
            Feeds(
                R.drawable.rasm,
                "Alisher Daminov",
                R.drawable.landscape,
                "@alisher^123"
            )
        )
        feedsList.add(
            Feeds(
                R.drawable.rasm1,
                "Alisher Daminov",
                R.drawable.portrait,
                "@begzod^777"
            )
        )
        feedsList.add(Feeds(R.drawable.rasm2, "Alisher Daminov", R.drawable.square, "@abbos^177"))
        feedsList.add(
            Feeds(
                R.drawable.rasm,
                "Alisher Daminov",
                R.drawable.landscape,
                "@alisher^123"
            )
        )
        feedsList.add(
            Feeds(
                R.drawable.rasm1,
                "Alisher Daminov",
                R.drawable.portrait,
                "@begzod^777"
            )
        )
        feedsList.add(Feeds(R.drawable.rasm2, "Alisher Daminov", R.drawable.square, "@abbos^177"))
        feedsList.add(
            Feeds(
                R.drawable.rasm,
                "Alisher Daminov",
                R.drawable.landscape,
                "@alisher^123"
            )
        )
        feedsList.add(
            Feeds(
                R.drawable.rasm1,
                "Alisher Daminov",
                R.drawable.portrait,
                "@begzod^777"
            )
        )
        feedsList.add(Feeds(R.drawable.rasm2, "Alisher Daminov", R.drawable.square, "@abbos^177"))
        return feedsList
    }

    private fun getFeedsAdapter(feeds: ArrayList<Feeds>) {
        val adapter = FeedsAdapter(this, feeds)
        recyclerViewFeeds.adapter = adapter
    }
}