package com.example.week_3_assignment_fulyaaa

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.week_3_assignment_fulyaaa.data.ProductModel
import com.example.week_3_assignment_fulyaaa.data.mockProductData


class SecondFragment : Fragment(), ProductListener {

    private lateinit var navController: NavController
    private lateinit var rvProductList: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_second, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = findNavController()
        rvProductList = view.findViewById(R.id.rvProductList)
        setupAdapter()
    }

    private fun setupAdapter(){
        rvProductList.adapter = ProductAdapter(mockProductData, this@SecondFragment)
    }

    override fun onClicked(product: ProductModel) {
        navController.navigate(R.id.action_secondFragment_to_thirdFragment, Bundle().apply {
            putString("productModel", product.toJson())
        })
    }


}