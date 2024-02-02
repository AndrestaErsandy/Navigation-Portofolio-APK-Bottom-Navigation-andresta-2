package com.example.belajarnavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.core.view.MenuHost
import androidx.core.view.MenuProvider
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.belajarnavigation.databinding.FragmentDashboardBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//private const val ARG_PARAM1 = "param1"
//private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentDashboard.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentDashboard : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding : FragmentDashboardBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_dashboard, container, false)
        val menuHost : MenuHost = requireActivity()
        binding.btnProfil.setOnClickListener{
            var namaDepan = binding.edt1.text.toString()
            it.findNavController().navigate(DashboardDirections.actionFragmentDashboard2ToFragmentHalamanProfil(namaDepan))
        }

        binding.btnPortofolio.setOnClickListener {
            it.findNavController().navigate(R.id.action_fragmentDashboard2_to_fragmentHalamanPortofolio)
        }

        binding.btnDiklat.setOnClickListener {
            it.findNavController().navigate(R.id.action_fragmentDashboard2_to_fragmentHalamanDiklat)
        }
        menuHost.addMenuProvider(object : MenuProvider{
            override fun onCreateMenu(menu: Menu, menuInflater: MenuInflater) {
                menuInflater.inflate(R.menu.overflow_menu, menu)
            }

            override fun onMenuItemSelected(menuItem: MenuItem): Boolean {
                return NavigationUI.onNavDestinationSelected(menuItem, requireView().findNavController())
            }

        }, viewLifecycleOwner)
        return binding.root
    }
}