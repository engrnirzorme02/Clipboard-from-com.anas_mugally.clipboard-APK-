package com.google.android.gms.internal.p411firebaseauthapi;

import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes2.dex */
final class zzc extends zza {
    @Override // com.google.android.gms.internal.p411firebaseauthapi.zza
    public final URLConnection zza(URL url, String str) {
        return url.openConnection();
    }

    private zzc() {
    }
}
