package com.example.mad_411_assignments

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ExpenseAdapter (
    private val expenseList:MutableList<Expense>):
        RecyclerView.Adapter<ExpenseAdapter.ExpenseViewHolder>(){

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ExpenseAdapter.ExpenseViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.expense_item,parent,false)
        return ExpenseViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: ExpenseAdapter.ExpenseViewHolder,
        position: Int) {
        val expense = expenseList[position]
        holder.eName.text = expense.expenseName
        holder.eAmount.text = "$${expense.expenseAmount}"

        holder.deleteButton.setOnClickListener{
            removeItem(position)
        }


    }

    override fun getItemCount(): Int {
        return expenseList.size
    }

    private fun removeItem(position: Int){
        expenseList.removeAt(position)
        notifyItemRemoved(position)
        notifyItemChanged(position,expenseList.size)
    }

    class ExpenseViewHolder(view:View):RecyclerView.ViewHolder(view){
        val eName:TextView = view.findViewById(R.id.nameView)
        val eAmount: TextView = view.findViewById(R.id.amountView)
        val deleteButton: Button = view.findViewById(R.id.deleteButton)
    }
}
