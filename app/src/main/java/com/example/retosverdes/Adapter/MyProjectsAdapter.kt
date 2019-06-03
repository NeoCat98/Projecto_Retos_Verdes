package com.example.retosverdes.Adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.retosverdes.R


import com.example.retosverdes.fragment.MyProjectsFragment.OnListFragmentInteractionListener

import kotlinx.android.synthetic.main.fragment_myprojects.view.*


class MyProjectsAdapter(
    private val mListener: OnListFragmentInteractionListener?
) : RecyclerView.Adapter<MyProjectsAdapter.ViewHolder>() {

    private val mOnClickListener: View.OnClickListener

    init {
        mOnClickListener = View.OnClickListener { v ->

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_myprojects, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int = 0

    inner class ViewHolder(val mView: View) : RecyclerView.ViewHolder(mView) {


    }
}
