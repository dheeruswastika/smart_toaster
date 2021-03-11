package com.example.swastika_libs;

import android.content.Context;
import android.widget.Toast;

public class Swastika_Utils {

    public static void show(Context c, String message){
        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();
    }

}
