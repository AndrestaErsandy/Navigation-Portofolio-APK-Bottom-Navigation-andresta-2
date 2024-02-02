package com.example.belajarnavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentHalamanDiklat.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentHalamanDiklat : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding : FragmentHalamanDiklat = DataBindingUtil.inflate(inflater, R.layout.fragment_halaman_diklat, container, false)

        binding.btnMbalek.setOnClickListener{
            it.findNavController().navigate(R.id.action_fragmentHalamanDiklat_to_fragmentDashboard2)
        }
        return binding.root
    }
}