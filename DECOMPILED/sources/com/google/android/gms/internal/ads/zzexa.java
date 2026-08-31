package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzexa implements zzhpx {
    private final zzewu zza;

    private zzexa(zzewu zzewuVar) {
        this.zza = zzewuVar;
    }

    public static zzexa zzc(zzewu zzewuVar) {
        return new zzexa(zzewuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Integer zzb() {
        return Integer.valueOf(this.zza.zzi());
    }
}
