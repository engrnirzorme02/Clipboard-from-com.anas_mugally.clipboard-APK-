package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class zzgb extends IOException {
    public final int zza;

    public zzgb(int i7) {
        this.zza = i7;
    }

    public zzgb(String str, int i7) {
        super(str);
        this.zza = i7;
    }

    public zzgb(String str, Throwable th, int i7) {
        super(str, th);
        this.zza = i7;
    }

    public zzgb(Throwable th, int i7) {
        super(th);
        this.zza = i7;
    }
}
