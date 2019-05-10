package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.databinding.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {

    lateinit var scoreViewModel: ScoreViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        scoreViewModel = ViewModelProviders.of(this).get(ScoreViewModel::class.java)

        var binding : ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.teams = scoreViewModel


        bt_team_a_free_throw.setOnClickListener{
            scoreViewModel.scoreTeamA =(scoreViewModel.scoreTeamA.toInt() + 1).toString()
            binding.teams = scoreViewModel
        }
        bt_team_b_free_throw.setOnClickListener{
            scoreViewModel.scoreTeamB =(scoreViewModel.scoreTeamB.toInt() + 1).toString()
            binding.teams = scoreViewModel
        }

        bt_team_a_2_p.setOnClickListener{
            scoreViewModel.scoreTeamA =(scoreViewModel.scoreTeamA.toInt() + 2).toString()

            //scoreViewModel.scoreTeamA
            binding.teams = scoreViewModel
        }
        bt_team_b_2_p.setOnClickListener{
            scoreViewModel.scoreTeamB =(scoreViewModel.scoreTeamB.toInt() + 2).toString()

            //scoreViewModel.scoreTeamA
            binding.teams = scoreViewModel
        }
        bt_team_b_3_p.setOnClickListener{
            scoreViewModel.scoreTeamB =(scoreViewModel.scoreTeamB.toInt() + 3).toString()

            //scoreViewModel.scoreTeamA
            binding.teams = scoreViewModel
        }
        bt_team_a_3_p.setOnClickListener{
            scoreViewModel.scoreTeamA =(scoreViewModel.scoreTeamA.toInt() + 3).toString()

            //scoreViewModel.scoreTeamA
            binding.teams = scoreViewModel
        }

        bt_reset.setOnClickListener{
            scoreViewModel.scoreTeamA = "0"
            scoreViewModel.scoreTeamB = "0"

            binding.teams = scoreViewModel
        }


    }


}
