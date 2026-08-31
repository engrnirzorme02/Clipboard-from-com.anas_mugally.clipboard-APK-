package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.telephony.TelephonyManager;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.internal.ads.zzbbh;
import com.google.android.gms.internal.ads.zzbbn;
import com.google.android.gms.internal.ads.zzcek;
import com.google.android.gms.internal.ads.zzcev;
import com.google.android.gms.internal.ads.zzecy;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.util.P0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3451P0 {
    /* synthetic */ AbstractC3451P0(byte[] bArr) {
    }

    /* JADX INFO: renamed from: a */
    public abstract CookieManager mo17452a(Context context);

    /* JADX INFO: renamed from: b */
    public abstract zzcev mo17459b(zzcek zzcekVar, zzbbh zzbbhVar, boolean z7, zzecy zzecyVar);

    /* JADX INFO: renamed from: c */
    public abstract WebResourceResponse mo17453c(String str, String str2, int i7, String str3, Map map, InputStream inputStream);

    /* JADX INFO: renamed from: d */
    public abstract boolean mo17458d(Activity activity, Configuration configuration);

    /* JADX INFO: renamed from: e */
    public abstract zzbbn.zzq mo17460e(Context context, TelephonyManager telephonyManager);

    /* JADX INFO: renamed from: f */
    public abstract void mo17461f(Context context, String str, String str2);

    /* JADX INFO: renamed from: g */
    public abstract boolean mo17462g(Context context, String str);

    /* JADX INFO: renamed from: h */
    public abstract Intent mo17463h(Activity activity);

    /* JADX INFO: renamed from: i */
    public void mo17471i(Activity activity) {
    }

    /* JADX INFO: renamed from: j */
    public int mo17472j(AudioManager audioManager) {
        return 0;
    }

    /* JADX INFO: renamed from: k */
    public int mo17473k(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }
}
