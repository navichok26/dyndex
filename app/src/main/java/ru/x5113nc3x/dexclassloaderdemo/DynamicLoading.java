package ru.x5113nc3x.dexclassloaderdemo;

import android.os.AsyncTask;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class DynamicLoading extends AsyncTask<String, Void, byte[]> {

    @Override
    protected byte[] doInBackground(String... urls) {
        InputStream myInput;
        ByteArrayOutputStream myOutput = null;
        try {
            myOutput = new ByteArrayOutputStream();
            URL dexurl = new URL(urls[0]);
            myInput = new DataInputStream(dexurl.openStream());
            byte[] buffer = new byte[1024];
            int length = myInput.read(buffer);
            while (length > 0) {
                myOutput.write(buffer, 0, length);
                length = myInput.read(buffer);
            }

            myOutput.flush();
            myInput.close();
            myOutput.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return myOutput.toByteArray();
    }
}
