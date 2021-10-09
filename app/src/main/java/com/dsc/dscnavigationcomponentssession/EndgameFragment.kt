package com.dsc.dscnavigationcomponentssession

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController


class EndgameFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_endgame, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        /**
         * You can navigate using destinations, actions and safe args
         * Uncomment & comment parts to see functionality in isolation.
         * Safe args is the recommended way
         * */
        val button = view.findViewById<Button>(R.id.restartGameButton)
        button?.setOnClickListener {
            //1.navigating using actions

            findNavController().navigate(R.id.action_endgameFragment_to_startFragment, null)

            //2.navigating using safe Args

            //val actions = EndgameFragmentDirections.actionEndgameFragmentToStartFragment()
            //findNavController().navigate(actions)
        }
    }
}