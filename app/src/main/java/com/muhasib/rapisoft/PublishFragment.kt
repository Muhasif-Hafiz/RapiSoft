package com.muhasib.rapisoft

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.floatingactionbutton.FloatingActionButton

class PublishFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_publish, container, false)
    }

    // Add this method for UI-related code
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val publishButton: Button= view.findViewById(R.id.floatingActionbarButton)
        publishButton.setOnClickListener {

            showBottomSheet()
        }


    }
    private fun showBottomSheet() {

        val bottomSheetView: View = LayoutInflater.from(requireContext()).inflate(R.layout.bottomsheetlayout, null)
        val done: Button = bottomSheetView.findViewById(R.id.publishButton)

        val bottomSheet = BottomSheetDialog(requireContext())
        bottomSheet.setContentView(bottomSheetView)
        bottomSheet.show()


        done.setOnClickListener {
            bottomSheet.dismiss()
        }
    }


}
