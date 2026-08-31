package com.google.android.gms.internal.auth;

import android.net.Uri;
import androidx.collection.C2400k;

/* JADX INFO: loaded from: classes2.dex */
public final class zzci {
    private final C2400k zza;

    zzci(C2400k c2400k) {
        this.zza = c2400k;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        C2400k c2400k;
        if (uri != null) {
            c2400k = (C2400k) this.zza.get(uri.toString());
        } else {
            c2400k = null;
        }
        if (c2400k == null) {
            return null;
        }
        return (String) c2400k.get("".concat(str3));
    }
}
