package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3324b1;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzegp extends zzbqp {
    final /* synthetic */ zzegq zza;
    private final zzeec zzb;

    /* synthetic */ zzegp(zzegq zzegqVar, zzeec zzeecVar, byte[] bArr) {
        Objects.requireNonNull(zzegqVar);
        this.zza = zzegqVar;
        this.zzb = zzeecVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqq
    public final void zze(zzbpm zzbpmVar) {
        this.zza.zzc(zzbpmVar);
        ((zzefo) this.zzb.zzc).zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbqq
    public final void zzf(String str) {
        ((zzefo) this.zzb.zzc).zzw(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbqq
    public final void zzg(C3324b1 c3324b1) {
        ((zzefo) this.zzb.zzc).zzx(c3324b1);
    }
}
