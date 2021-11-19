package com.example.kotlinwashxadapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinwashxadapter.databinding.FragmentHistoryDetailBinding

class HistoryDetailFragment : Fragment(){
    private lateinit var binding : FragmentHistoryDetailBinding
   private val vehicleDetailsModelList : MutableList<VehicleDetailsModel> = ArrayList()
    private var vehicleAdapter :VehicleAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        addData()
    }

   private fun addData(){
      vehicleDetailsModelList.add(VehicleDetailsModel("Toyoto Fortuner- SUV","White LX001h","$170.00","Silver","Sanitization Service","$70","$70"))
       vehicleDetailsModelList.add(VehicleDetailsModel("Hundai i20- Car","Silver SM001h","$200.00","Golden","Sanitization Service pro","$90","$90"))
   }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHistoryDetailBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
         binding.vehicleRv.layoutManager = LinearLayoutManager(activity,RecyclerView.VERTICAL,false)
         vehicleAdapter = VehicleAdapter(vehicleDetailsModelList,requireActivity())
         binding.vehicleRv.adapter = vehicleAdapter
    }
}