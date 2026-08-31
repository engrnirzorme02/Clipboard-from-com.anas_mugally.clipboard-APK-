package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.C3431F0;
import java.util.HashMap;
import java.util.Map;
import p380w2.C7351t;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
final class zzbif implements zzbjl {
    zzbif() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcek zzcekVar = (zzcek) obj;
        WindowManager windowManager = (WindowManager) zzcekVar.getContext().getSystemService("window");
        C7351t.m32349g();
        DisplayMetrics displayMetricsM17415h0 = C3431F0.m17415h0(windowManager);
        int i7 = displayMetricsM17415h0.widthPixels;
        int i8 = displayMetricsM17415h0.heightPixels;
        int[] iArr = new int[2];
        HashMap map2 = new HashMap();
        ((View) zzcekVar).getLocationInWindow(iArr);
        map2.put("xInPixels", Integer.valueOf(iArr[0]));
        map2.put("yInPixels", Integer.valueOf(iArr[1]));
        map2.put("windowWidthInPixels", Integer.valueOf(i7));
        map2.put("windowHeightInPixels", Integer.valueOf(i8));
        zzcekVar.zze("locationReady", map2);
        int i9 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33331f("GET LOCATION COMPILED");
    }
}
