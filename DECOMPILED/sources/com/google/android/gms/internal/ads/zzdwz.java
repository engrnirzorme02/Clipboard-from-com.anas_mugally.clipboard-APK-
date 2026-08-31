package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public class zzdwz extends Exception {
    private final int zza;

    public zzdwz(int i7) {
        this.zza = i7;
    }

    public final int zza() {
        return this.zza;
    }

    public zzdwz(int i7, String str) {
        super(str);
        this.zza = i7;
    }

    public zzdwz(int i7, String str, Throwable th) {
        super(str, th);
        this.zza = 1;
    }
}
