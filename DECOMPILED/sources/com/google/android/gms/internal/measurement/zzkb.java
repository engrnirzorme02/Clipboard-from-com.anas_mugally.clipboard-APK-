package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.collection.C2390a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzkb {
    public static final /* synthetic */ int zza = 0;
    private static final C2390a zzb = new C2390a();

    public static synchronized Uri zza(String str) {
        C2390a c2390a = zzb;
        Uri uri = (Uri) c2390a.get("com.google.android.gms.measurement");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
        c2390a.put("com.google.android.gms.measurement", uri2);
        return uri2;
    }
}
