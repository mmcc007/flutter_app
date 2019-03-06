// Copyright 2017 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package com.example.flutterapp;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class FlutterAppInstrumentationTest {
  @Rule
  public ActivityTestRule<MainActivity> mActivityRule =
      new ActivityTestRule<>(MainActivity.class);

  private MainActivity activity;

  @Before
  public void setUp() {
    activity = mActivityRule.getActivity();
  }

  @Test
  public void activityLoaded() throws Exception {
    FlutterAppInstrumentation instrumentation = activity.getInstrumentation();
    instrumentation.waitForTestToFinish();
    assertThat(instrumentation.isTestSuccessful(), is(true));
  }
}
