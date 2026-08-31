package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhku extends RuntimeException {
    public zzhku(zzhjs zzhjsVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzhiw zza() {
        return new zzhiw(getMessage());
    }
}
