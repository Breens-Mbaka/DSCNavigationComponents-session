package com.dsc.dscnavigationcomponentssession

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class GameFragment : Fragment() {

    //Declare this to be able to access sent data
    val args: GameFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //receiving sent data
        val number = args.number
        Toast.makeText(context, number.toString(), Toast.LENGTH_LONG).show()
        return inflater.inflate(R.layout.fragment_game, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button = view.findViewById<Button>(R.id.finishGameButton)
        button?.setOnClickListener {
            /**
             * You can navigate using destinations, actions and safe args
             * Uncomment & comment parts to see functionality in isolation.
             * Safe args is the recommended way to send data between destination and nvaigating
             * */

            //1.navigating using actions

            //able to add transition animations in XML rather in porgrammatically
            findNavController().navigate(R.id.action_gameFragment_to_endgameFragment, null)

            //2.navigating using safe Args

            //val actions = GameFragmentDirections.actionGameFragmentToEndgameFragment()
            //findNavController().navigate(actions)
        }
    }

}