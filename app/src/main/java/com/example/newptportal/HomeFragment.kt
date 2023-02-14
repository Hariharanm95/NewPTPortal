package com.example.newptportal

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment

class HomeFragment : Fragment() {

    private lateinit var profileCard: CardView
    private lateinit var feeCard: CardView
    private lateinit var disciplineCard: CardView
    private lateinit var academicsCard: CardView
    private lateinit var biometricCard: CardView
    private lateinit var skillsCard: CardView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_home, container, false)

        profileCard = rootView.findViewById(R.id.profileCard)
        feeCard = rootView.findViewById(R.id.feeCard)
        disciplineCard = rootView.findViewById(R.id.disciplineCard)
        academicsCard = rootView.findViewById(R.id.academicsCard)
        biometricCard = rootView.findViewById(R.id.biometricCard)
        skillsCard = rootView.findViewById(R.id.skillsCard)

        profileCard.setOnClickListener {
            val intent = Intent(this.activity, StudentActivity::class.java)
            startActivity(intent)
        }
        feeCard.setOnClickListener {
            val intent = Intent(this.activity, FeeActivity::class.java)
            startActivity(intent)
        }
        disciplineCard.setOnClickListener {
            val intent = Intent(this.activity, DisciplineActivity::class.java)
            startActivity(intent)
        }
        academicsCard.setOnClickListener {
            val intent = Intent(this.activity, AcademicsActivity::class.java)
            startActivity(intent)
        }
        biometricCard.setOnClickListener {
            val intent = Intent(this.activity, BiometricActivity::class.java)
            startActivity(intent)
        }
        skillsCard.setOnClickListener {
            val intent = Intent(this.activity, SkillActivity::class.java)
            startActivity(intent)
        }

        return rootView
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HomeFragment.
         */
        @JvmStatic
        fun newInstance() = HomeFragment()
    }
}
