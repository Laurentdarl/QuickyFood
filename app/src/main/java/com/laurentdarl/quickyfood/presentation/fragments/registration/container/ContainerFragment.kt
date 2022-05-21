package com.laurentdarl.quickyfood.presentation.fragments.registration.container

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.laurentdarl.quickyfood.databinding.FragmentContainerBinding

class ContainerFragment : Fragment() {

    private var _binding: FragmentContainerBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentContainerBinding.inflate(layoutInflater)


        // Inflate the layout for this fragment
        return binding.root
    }
}