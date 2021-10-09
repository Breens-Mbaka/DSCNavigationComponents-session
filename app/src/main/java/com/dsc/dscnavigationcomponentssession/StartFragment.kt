package com.dsc.dscnavigationcomponentssession

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.navigation.navOptions

class StartFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_start, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button = view.findViewById<Button>(R.id.startGameButton)
        button?.setOnClickListener {
            /**
             * You can navigate using destinations, actions and safe args
             * Uncomment & comment parts to see functionality in isolation.
             * Safe args is the recommended way
             * */

            //1.navigating using actions

            findNavController().navigate(R.id.action_startFragment_to_gameFragment, null)

            //2.navigating using safe Args

            //val actions = StartFragmentDirections.actionStartFragmentToGameFragment()
            //findNavController().navigate(actions)

            //3.sending data to another fragment using safe args

            //val numberArg = 1
            //val action = StartFragmentDirections.actionStartFragmentToGameFragment(numberArg)
            //findNavController().navigate(action)
        }
    }
}