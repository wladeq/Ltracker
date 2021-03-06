package com.wladeq.ltracker;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;


// This class creates popup, where we have to choose the instructor
public class InstructorChoiceDialog extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        // setting the name of pop-up
        builder.setTitle(R.string.dialog_choose_instructor);

        // identifying what was chosen
        builder.setItems(R.array.instructors, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {

                // reading the choice and sending to other class
                if (which == 0){
                    InstructorChoose a = new InstructorChoose();
                    a.setChoice("ucBNQA1WR3SM5fUgNdniVumm67r2");
                } if (which ==1){
                    InstructorChoose a = new InstructorChoose();
                    a.setChoice("3AFbHnKxUkV5xuFlmBWZ57C0RcS2");
                } else {
                    InstructorChoose a = new InstructorChoose();
                    a.setChoice("8uuQvE4UofbkHdBarenVGlY7IkR2");
                }

            }
        });
        return builder.create();
    }}
