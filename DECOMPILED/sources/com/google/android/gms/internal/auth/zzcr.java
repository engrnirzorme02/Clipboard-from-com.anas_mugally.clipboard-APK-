package com.google.android.gms.internal.auth;

import android.net.Uri;
import androidx.collection.C2390a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcr {
    private static final C2390a zza = new C2390a();

    public static synchronized Uri zza(String str) {
        C2390a c2390a = zza;
        Uri uri = (Uri) c2390a.get("com.google.android.gms.auth_account");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.auth_account"))));
        c2390a.put("com.google.android.gms.auth_account", uri2);
        return uri2;
    }
}
