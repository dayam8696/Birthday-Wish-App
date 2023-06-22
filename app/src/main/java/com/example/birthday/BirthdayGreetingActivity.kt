package com.example.birthday

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.birthday.databinding.ActivityBirthdayGreetingBinding

class BirthdayGreetingActivity : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA = "name_extra"
    }
    private val binding by lazy { ActivityBirthdayGreetingBinding.inflate(layoutInflater) }
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val name = intent.getStringExtra(NAME_EXTRA)
        binding.birthdaygreeting.text = "Happy Birthday \n $name"

    }
}