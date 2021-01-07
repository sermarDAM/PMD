package com.example.dialogex;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;



public class FragmentoDialogo extends DialogFragment {

    public interface NoticeDialogListener{
        void onPositiveButtonClick();
        void onNegativeButtonClick();
    }

    NoticeDialogListener listener;

    public Dialog onCreateDialog(Bundle savedDistanceState){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setTitle("Termine el pago")
                .setMessage("¿Quiere finalizar el proceso del pago?")
                .setPositiveButton("SI", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        listener.onPositiveButtonClick(FragmentoDialogo.this);
                    }
                })
                .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        listener.onNegativeButtonClick(FragmentoDialogo.this);

                    }
                });
        return builder.create();
    }

}