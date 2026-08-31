package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3324b1;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcmm implements zzcvv {
    private final zzfcm zza;
    private final zzfcu zzb;
    private final zzfjr zzc;
    private final zzfjv zzd;

    public zzcmm(zzfcu zzfcuVar, zzfjv zzfjvVar, zzfjr zzfjrVar) {
        this.zzb = zzfcuVar;
        this.zzd = zzfjvVar;
        this.zzc = zzfjrVar;
        this.zza = zzfcuVar.zzb.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcvv
    public final void zzdN(C3324b1 c3324b1) {
        List list = this.zza.zza;
        this.zzd.zza(this.zzc.zza(this.zzb, null, list), null);
    }
}
