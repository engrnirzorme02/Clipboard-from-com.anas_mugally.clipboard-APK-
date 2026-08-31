package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzyn {
    public final int zza;
    public final zzlo[] zzb;
    public final zzyf[] zzc;
    public final zzbm zzd;
    public final Object zze;

    public zzyn(zzlo[] zzloVarArr, zzyf[] zzyfVarArr, zzbm zzbmVar, Object obj) {
        int length = zzloVarArr.length;
        zzghc.zza(length == zzyfVarArr.length);
        this.zzb = zzloVarArr;
        this.zzc = (zzyf[]) zzyfVarArr.clone();
        this.zzd = zzbmVar;
        this.zze = obj;
        this.zza = length;
    }

    public final boolean zza(int i7) {
        return this.zzb[i7] != null;
    }

    public final boolean zzb(zzyn zzynVar, int i7) {
        return zzynVar != null && Objects.equals(this.zzb[i7], zzynVar.zzb[i7]) && Objects.equals(this.zzc[i7], zzynVar.zzc[i7]);
    }
}
