package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.C3244B;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import p380w2.C7351t;
import p404z2.AbstractC7599p;
import p404z2.C7590g;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfdz {
    public static void zza(int i7, Throwable th, String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 20);
        sb.append("Ad failed to load : ");
        sb.append(i7);
        String string = sb.toString();
        int i8 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33330e(string);
        AbstractC3490o0.m17546l(str, th);
        if (i7 == 3) {
            return;
        }
        C7351t.m32354l().zzh(th, str);
    }

    public static void zzb(Context context, boolean z7) {
        if (z7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33330e("This request is sent from a test device.");
            return;
        }
        C3244B.m17190a();
        String strM33277d = C7590g.m33277d(context);
        StringBuilder sb = new StringBuilder(String.valueOf(strM33277d).length() + 102);
        sb.append("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"");
        sb.append(strM33277d);
        sb.append("\")) to get test ads on this device.");
        String string = sb.toString();
        int i8 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33330e(string);
    }
}
