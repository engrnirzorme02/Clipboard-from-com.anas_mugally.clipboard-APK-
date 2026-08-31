package com.google.android.gms.internal.p411firebaseauthapi;

import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zza {
    private static zza zza = new zzc();

    public static synchronized zza zza() {
        return zza;
    }

    public abstract URLConnection zza(URL url, String str);
}
