package com.choosemuse.example.libmuse;

/**
 * Created by zm on 12/7/2016.
 */

import java.io.File;
import java.lang.ref.WeakReference;
import java.util.List;

import java.util.concurrent.atomic.AtomicReference;

import com.choosemuse.libmuse.Accelerometer;
import com.choosemuse.libmuse.AnnotationData;
import com.choosemuse.libmuse.ConnectionState;
import com.choosemuse.libmuse.Eeg;
import com.choosemuse.libmuse.LibmuseVersion;
import com.choosemuse.libmuse.MessageType;
import com.choosemuse.libmuse.Muse;
import com.choosemuse.libmuse.MuseArtifactPacket;
import com.choosemuse.libmuse.MuseConfiguration;
import com.choosemuse.libmuse.MuseConnectionListener;
import com.choosemuse.libmuse.MuseConnectionPacket;
import com.choosemuse.libmuse.MuseDataListener;
import com.choosemuse.libmuse.MuseDataPacket;
import com.choosemuse.libmuse.MuseDataPacketType;
import com.choosemuse.libmuse.MuseFileFactory;
import com.choosemuse.libmuse.MuseFileReader;
import com.choosemuse.libmuse.MuseFileWriter;
import com.choosemuse.libmuse.MuseListener;
import com.choosemuse.libmuse.MuseManagerAndroid;
import com.choosemuse.libmuse.MuseVersion;
import com.choosemuse.libmuse.Result;
import com.choosemuse.libmuse.ResultLevel;

import android.Manifest;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.os.Looper;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.app.Fragment;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;

import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;

public class Home extends Activity implements OnClickListener{



  //--------------------------------------
  // UI Specific methods



@Override
protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);



  // Load and initialize our UI.
  initHomeUI();

  // Start up a thread for asynchronous file operations.
  // This is only needed if you want to do File I/O.
  //fileThread.start();

  // Start our asynchronous updates of the UI.
  //handler.post(tickUi);
}

  public void onClick(View view) {
    if (view.getId() == R.id.start) {
      // The user has pressed the "Refresh" button.
      Intent myIntent = new Intent(view.getContext(), MainActivity.class);
      startActivityForResult(myIntent, 0);

    } else if (view.getId() == R.id.settings) {
      Intent myIntent = new Intent(view.getContext(), MainActivity.class);
      startActivityForResult(myIntent, 0);
    }
  }

  protected void onPause() {
    super.onPause();
    // It is important to call stopListening when the Activity is paused
    // to avoid a resource leak from the LibMuse library.
    //manager.stopListening();
  }

  /**
   * Initializes the UI of the example application.
   */
  private void initHomeUI() {
    setContentView(R.layout.activity_home);
    Button start = (Button) findViewById(R.id.start);
    start.setOnClickListener(this);
    Button settings = (Button) findViewById(R.id.settings);
    settings.setOnClickListener(this);
  }



}
