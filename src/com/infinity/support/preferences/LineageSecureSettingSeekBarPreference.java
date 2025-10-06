package com.infinity.support.preferences;
import android.content.Context;
import android.util.AttributeSet;

public class LineageSecureSettingSeekBarPreference extends CustomSeekBarPreference {

    public LineageSecureSettingSeekBarPreference(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setPreferenceDataStore(new LineageSecureSettingsStore(context.getContentResolver()));
    }

    public LineageSecureSettingSeekBarPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
        setPreferenceDataStore(new LineageSecureSettingsStore(context.getContentResolver()));
    }

    public LineageSecureSettingSeekBarPreference(Context context) {
        super(context, null);
        setPreferenceDataStore(new LineageSecureSettingsStore(context.getContentResolver()));
    }
}
