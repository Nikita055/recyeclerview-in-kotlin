package com.example.kotlinwashxadapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinwashxadapter.databinding.ItemHistoryBinding

class VehicleAdapter(private val vehicleDetailsModel: List<VehicleDetailsModel?>,private val context:Context):RecyclerView.Adapter<VehicleAdapter.VehicleChildViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VehicleChildViewHolder {
      val itemBinding = ItemHistoryBinding.inflate(LayoutInflater.from(parent.context),parent,false)
     return VehicleChildViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: VehicleChildViewHolder, position: Int) {
      val vehicleList = vehicleDetailsModel[position]
      holder.bind(vehicleList)
    }

    override fun getItemCount(): Int {
        return vehicleDetailsModel.size
    }

    class VehicleChildViewHolder (private val itemBinding:ItemHistoryBinding):RecyclerView.ViewHolder(itemBinding.root){
        fun bind(vehicleList: VehicleDetailsModel?) {
             itemBinding.vehicleModelTv.text = vehicleList!!.carModel
             itemBinding.vehicleNameTv.text = vehicleList.carType
             itemBinding.amountTv.text = vehicleList.subTotal
             itemBinding.amountTv1.text = vehicleList.amount1
             itemBinding.amountTv2.text = vehicleList.amount2
            itemBinding.serviceName.text = vehicleList.serviceType
            itemBinding.serviceName1.text = vehicleList.serviceType2

        }

    }

}