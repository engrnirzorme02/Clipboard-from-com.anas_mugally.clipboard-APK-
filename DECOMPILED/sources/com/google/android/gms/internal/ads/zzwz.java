package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class zzwz implements zzyf {
    protected final zzbf zza;
    protected final int zzb;
    protected final int[] zzc;
    private final zzu[] zzd;
    private int zze;

    public zzwz(zzbf zzbfVar, int[] iArr, int i7) {
        int length = iArr.length;
        zzghc.zzh(length > 0);
        zzbfVar.getClass();
        this.zza = zzbfVar;
        this.zzb = length;
        this.zzd = new zzu[length];
        for (int i8 = 0; i8 < iArr.length; i8++) {
            this.zzd[i8] = zzbfVar.zza(iArr[i8]);
        }
        Arrays.sort(this.zzd, zzwy.zza);
        this.zzc = new int[this.zzb];
        for (int i9 = 0; i9 < this.zzb; i9++) {
            this.zzc[i9] = zzbfVar.zzb(this.zzd[i9]);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzwz zzwzVar = (zzwz) obj;
            if (this.zza.equals(zzwzVar.zza) && Arrays.equals(this.zzc, zzwzVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.zze;
        if (i7 != 0) {
            return i7;
        }
        int iIdentityHashCode = (System.identityHashCode(this.zza) * 31) + Arrays.hashCode(this.zzc);
        this.zze = iIdentityHashCode;
        return iIdentityHashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzyk
    public final zzbf zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzyk
    public final zzu zzb(int i7) {
        return this.zzd[i7];
    }

    @Override // com.google.android.gms.internal.ads.zzyf
    public final zzu zzc() {
        return this.zzd[0];
    }

    @Override // com.google.android.gms.internal.ads.zzyk
    public final int zze() {
        return this.zzc.length;
    }

    @Override // com.google.android.gms.internal.ads.zzyk
    public final int zzf(int i7) {
        return this.zzc[i7];
    }

    @Override // com.google.android.gms.internal.ads.zzyk
    public final int zzg(int i7) {
        for (int i8 = 0; i8 < this.zzb; i8++) {
            if (this.zzc[i8] == i7) {
                return i8;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzyf
    public final int zzh() {
        return this.zzc[0];
    }
}
