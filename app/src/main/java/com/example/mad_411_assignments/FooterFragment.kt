package com.example.mad_411_assignments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class FooterFragment : Fragment() {
    private lateinit var totalAmountView: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_footer, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        totalAmountView = view.findViewById(R.id.totalView)
    }

    fun updateTotalAmount(totalAmount: Double){
        totalAmountView.text = "Total: $${"%.2f".format(totalAmount)}"
    }

}