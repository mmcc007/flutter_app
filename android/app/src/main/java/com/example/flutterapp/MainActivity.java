package com.example.flutterapp;

import android.os.Bundle;
import io.flutter.app.FlutterActivity;
import io.flutter.plugins.GeneratedPluginRegistrant;

public class MainActivity extends FlutterActivity {
  private FlutterAppInstrumentation instrumentation;

  /** Instrumentation for testing. */
  public FlutterAppInstrumentation getInstrumentation() {
    return instrumentation;
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    GeneratedPluginRegistrant.registerWith(this);
    instrumentation = new FlutterAppInstrumentation(this.getFlutterView());
  }
}
