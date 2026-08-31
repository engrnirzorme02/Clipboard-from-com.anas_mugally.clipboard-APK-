package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.C3553a;

/* JADX INFO: loaded from: classes2.dex */
final class zzeh extends zzej {
    private final byte[] zzb;
    private int zzc;
    private int zzd;
    private int zze;

    /* synthetic */ zzeh(byte[] bArr, int i7, int i8, boolean z7, zzeg zzegVar) {
        super(null);
        this.zze = C3553a.e.API_PRIORITY_OTHER;
        this.zzb = bArr;
        this.zzc = 0;
    }

    public final int zza(int i7) {
        int i8 = this.zze;
        this.zze = 0;
        int i9 = this.zzc + this.zzd;
        this.zzc = i9;
        if (i9 <= 0) {
            this.zzd = 0;
            return i8;
        }
        this.zzd = i9;
        this.zzc = 0;
        return i8;
    }
}
