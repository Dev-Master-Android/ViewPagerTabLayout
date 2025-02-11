package com.example.viewpagertablayout

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fragmentActivity: FragmentActivity, private val pages: List<Page>) :
    FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int = pages.size

    override fun createFragment(position: Int): Fragment {
        val fragment = WebViewFragment()
        val args = Bundle()
        args.putSerializable("page", pages[position])
        fragment.arguments = args
        return fragment
    }
}
