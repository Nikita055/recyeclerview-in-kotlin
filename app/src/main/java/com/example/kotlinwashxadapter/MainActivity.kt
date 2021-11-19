package com.example.kotlinwashxadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.kotlinwashxadapter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding : ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
         initUi()
    }

    private fun initUi(){
      val historyDetailFragment : Fragment = HistoryDetailFragment()
        // Get the support fragment manager instance
        val manager = supportFragmentManager

        // Begin the fragment transition using support fragment manager
        val transaction = manager.beginTransaction()

        // Replace the fragment on container
        transaction.replace(R.id.container,historyDetailFragment)
        transaction.addToBackStack(null)

        // Finishing the transition
        transaction.commit()
    }

}