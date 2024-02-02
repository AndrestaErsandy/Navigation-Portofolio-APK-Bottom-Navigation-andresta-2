package com.example.belajarnavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.example.belajarnavigation.databinding.FragmentHalamanProfilBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentHalamanProfil.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentHalamanProfil : Fragment() {
    val args : FragmentHalamanProfil by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding : FragmentHalamanProfilBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_halaman_profil, container, false)

        binding.buttonDashboard.setOnClickListener {
            it.findNavController()
                .navigate(R.id.action_fragmentHalamanProfil_to_fragmentDashboard2)


            val namaDepan = args.namaDepan

            binding.tvResta.text = "$namaDepan"
        }
        return binding.root
    }
}