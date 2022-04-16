package com.example.project_athome.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import com.example.project_athome.R
import com.example.project_athome.databinding.HomeFragmentBinding


class HomeFragment : Fragment() {

    private lateinit var viewModel : HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = HomeFragmentBinding.inflate(inflater)
        viewModel = ViewModelProviders.of(this).get(HomeViewModel::class.java)
        binding.viewModel = viewModel

        viewModel.navigateToPubQuiz.observe(viewLifecycleOwner, Observer {
            if (null != it) {
                binding.root.findNavController().navigate(
                    R.id.action_homeFragment_to_gameFragment
                )
                viewModel.doneNavigatingToPubQuiz()
            }
        })

        return binding.root
    }
}