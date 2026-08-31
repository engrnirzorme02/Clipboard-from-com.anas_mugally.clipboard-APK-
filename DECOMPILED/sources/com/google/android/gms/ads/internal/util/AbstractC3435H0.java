package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.C3244B;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.internal.ads.zzbci;
import p380w2.C7351t;
import p404z2.C7590g;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.util.H0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3435H0 extends AbstractC3433G0 {
    /* JADX INFO: renamed from: l */
    static final boolean m17457l(int i7, int i8, int i9) {
        return Math.abs(i7 - i8) <= i9;
    }

    @Override // com.google.android.gms.ads.internal.util.AbstractC3451P0
    /* JADX INFO: renamed from: d */
    public final boolean mo17458d(Activity activity, Configuration configuration) {
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzfy)).booleanValue()) {
            return false;
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzfA)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        C3244B.m17190a();
        int iM33276c = C7590g.m33276c(activity, configuration.screenHeightDp);
        int iM33276c2 = C7590g.m33276c(activity, configuration.screenWidthDp);
        WindowManager windowManager = (WindowManager) activity.getApplicationContext().getSystemService("window");
        C7351t.m32349g();
        DisplayMetrics displayMetricsM17415h0 = C3431F0.m17415h0(windowManager);
        int i7 = displayMetricsM17415h0.heightPixels;
        int i8 = displayMetricsM17415h0.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        int iRound = ((int) Math.round(((double) activity.getResources().getDisplayMetrics().density) + 0.5d)) * ((Integer) C3250D.m17200c().zzd(zzbci.zzfw)).intValue();
        return (m17457l(i7, iM33276c + dimensionPixelSize, iRound) && m17457l(i8, iM33276c2, iRound)) ? false : true;
    }
}
