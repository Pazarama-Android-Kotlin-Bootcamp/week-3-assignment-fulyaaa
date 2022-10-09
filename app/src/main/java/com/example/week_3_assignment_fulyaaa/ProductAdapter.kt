package com.example.week_3_assignment_fulyaaa

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.week_3_assignment_fulyaaa.data.ProductModel

class ProductAdapter(
    private val productList: MutableList<ProductModel>,
    private val listener: ProductListener
):
    RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.fragment_third, parent, false)
        return ProductViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.bind(productList[position], listener)
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    class ProductViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val name = view.findViewById<TextView>(R.id.productName)
        private val image = view.findViewById<ImageView>(R.id.productImage)

        fun bind(product: ProductModel, listener: ProductListener) {
            name.text = product.name
            image.setImageResource(product.image)


            itemView.setOnClickListener {
                listener.onClicked(product)
                listener.onClicked(product)
            }

        }
    }
}

interface ProductListener {
    fun onClicked(product: ProductModel)
}