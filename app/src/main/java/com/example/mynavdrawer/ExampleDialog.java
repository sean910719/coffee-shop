package com.example.mynavdrawer;

import android.content.Intent;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

public class ExampleDialog extends DialogFragment {
    private EditText username;
    private EditText password;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity()).setCancelable(true);

        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.layout_dialog, null);

        username = view.findViewById(R.id.edit_username);
        password = view.findViewById(R.id.edit_password);

        builder.setView(view)
        .setTitle("登入")
        .setCancelable(false)
        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //correct
                if(username.getText().toString().equals("123") && password.getText().toString().equals("123")){
                    Toast.makeText(getContext(),"LOGIN SUCCESSFUL",Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(getContext(), LoginActivity.class));
                }else{
                    //incorrect
                    Toast.makeText(getContext(),"LOGIN FAILED !!!",Toast.LENGTH_SHORT).show();
                }

            }
        })
        .setNeutralButton("Clear", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getContext(),"clear",Toast.LENGTH_SHORT).show();
                username.setText("");
                password.setText("");
            }
        })
        .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });

        return builder.create();
    }

}