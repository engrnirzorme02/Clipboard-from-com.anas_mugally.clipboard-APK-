package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3324b1;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzehz extends zzbqs {
    private final zzeec zza;

    /* synthetic */ zzehz(zzeia zzeiaVar, zzeec zzeecVar, byte[] bArr) {
        Objects.requireNonNull(zzeiaVar);
        this.zza = zzeecVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqt
    public final void zze() {
        ((zzefo) this.zza.zzc).zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbqt
    public final void zzf(String str) {
        ((zzefo) this.zza.zzc).zzw(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbqt
    public final void zzg(C3324b1 c3324b1) {
        ((zzefo) this.zza.zzc).zzx(c3324b1);
    }
}
