package com.example.mad_411_assignments


import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlin.math.ceil



class MainActivity : AppCompatActivity() {

    private lateinit var name : EditText
    private lateinit var amount: EditText
    private lateinit var button: Button
    private lateinit var recyclerView: RecyclerView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("ActivityLifecycle","onCreate called")

        name =findViewById(R.id.name)
        amount = findViewById(R.id.amount)
        button = findViewById(R.id.button)
        recyclerView = findViewById(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this)
        val expenseList = mutableListOf<Expense>()
        val adapter = ExpenseAdapter(expenseList)
        recyclerView.adapter = adapter

        button.setOnClickListener{
            val exName = name.text.toString()
            val exAmount = amount.text.toString()


            val expense = Expense(exName,exAmount.toDouble())
            expenseList.add(expense)
            adapter.notifyItemInserted(expenseList.size-1)

            name.text.clear()
            amount.text.clear()

        }

    }

    override fun onStart() {
        super.onStart()
        Log.d("ActivityLifeCycle","OnStart Called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("ActivityLifeCycle","onResume Called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("ActivityLifeCycle","onPause Called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("ActivityLifeCycle","onStop Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ActivityLifeCycle","onDestroy Called")
    }
}
