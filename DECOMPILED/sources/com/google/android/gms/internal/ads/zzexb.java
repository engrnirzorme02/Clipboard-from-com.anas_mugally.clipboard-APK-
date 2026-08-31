package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzexb implements zzhpx {
    private final zzewu zza;

    private zzexb(zzewu zzewuVar) {
        this.zza = zzewuVar;
    }

    public static zzexb zzc(zzewu zzewuVar) {
        return new zzexb(zzewuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Integer zzb() {
        return Integer.valueOf(this.zza.zzj());
    }
}
