package ru.x5113nc3x.dexclassloaderdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

import dalvik.system.DexClassLoader;
import dalvik.system.InMemoryDexClassLoader;

public class MainActivity extends AppCompatActivity {

    private String dexName = "out1.dex";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.main_btn).setOnClickListener(v -> {

        });
    }
}










//            String classPath = "ru.x5113nc3x.DexFile";
//            String methodName = "getHelloworld";
//
//            byte[] dex = new byte[0];
//            try {
//                dex = new DynamicLoading().execute("http://x5113nc3x.ru:7000/out1.dex").get();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//            ByteBuffer bb = ByteBuffer.allocate(dex.length);
//            bb.put(dex);
//            bb.position(0);
//            ClassLoader loader = new InMemoryDexClassLoader(bb, null);
//            try {
//                Class<?> clz = loader.loadClass(classPath);
//                Method dexRes = clz.getDeclaredMethod(methodName);
//                Toast.makeText(this, (String) dexRes.invoke(clz.newInstance()), Toast.LENGTH_LONG).show();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }