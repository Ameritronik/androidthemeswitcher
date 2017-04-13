package com.codepath.android.themeswitcher.app;

import android.app.Activity;
import android.content.Intent;

/**
 * Created by hkanekal on 4/12/2017.
 */

public class Utils {
    private static int sTheme;

    public final static int THEME_MATERIAL_LIGHT = 0;
    public final static int MY_THEME_1 = 1;
    public final static int MY_THEME_2 = 2;
    public final static int MY_THEME_3 = 3;

    public static void changeToTheme(Activity activity, int theme) {
        sTheme = theme;
        activity.finish();
        activity.startActivity(new Intent(activity, activity.getClass()));
        activity.overridePendingTransition(android.R.anim.fade_in,
                android.R.anim.fade_out);
    }

    public static void onActivityCreateSetTheme(Activity activity) {
        switch (sTheme) {
            default:
            case THEME_MATERIAL_LIGHT:
                activity.setTheme(R.style.Theme_Material_Light);
                break;
            case MY_THEME_1:
                activity.setTheme(R.style.Theme_MY_THEME_1);
                break;
            case MY_THEME_2:
                activity.setTheme(R.style.Theme_MY_THEME_2);
                break;
            case MY_THEME_3:
                activity.setTheme(R.style.Theme_MY_THEME_3);
                break;
        }
    }
}