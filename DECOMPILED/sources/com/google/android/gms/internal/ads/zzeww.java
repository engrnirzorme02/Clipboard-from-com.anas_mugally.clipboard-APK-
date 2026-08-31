package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeww implements zzhpx {
    private final zzewu zza;

    private zzeww(zzewu zzewuVar) {
        this.zza = zzewuVar;
    }

    public static zzeww zzc(zzewu zzewuVar) {
        return new zzeww(zzewuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Integer zzb() {
        return Integer.valueOf(this.zza.zzf());
    }
}
