package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zzct {
    private static final String zzb;
    public final String zza;

    static {
        String str = zzeo.zza;
        zzb = Integer.toString(0, 36);
    }

    public zzct(String str) {
        this.zza = str;
    }

    public final Bundle zza() {
        Bundle bundle = new Bundle();
        bundle.putString(zzb, this.zza);
        return bundle;
    }
}
