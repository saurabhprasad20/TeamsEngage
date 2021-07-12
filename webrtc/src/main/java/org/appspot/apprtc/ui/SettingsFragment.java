
package org.appspot.apprtc.ui;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import org.appspot.apprtc.R;

/**
 * Settings fragment for AppRTC.
 */
public class SettingsFragment extends PreferenceFragment {
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    // Load the preferences from an XML resource
    addPreferencesFromResource(R.xml.preferences);
  }
}
