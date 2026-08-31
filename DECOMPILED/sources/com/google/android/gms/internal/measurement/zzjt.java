package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.collection.C2400k;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjt {
    private final C2400k zza;

    zzjt(C2400k c2400k) {
        this.zza = c2400k;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        C2400k c2400k = uri != null ? (C2400k) this.zza.get(uri.toString()) : null;
        if (c2400k == null) {
            return null;
        }
        return (String) c2400k.get("".concat(str3));
    }
}
