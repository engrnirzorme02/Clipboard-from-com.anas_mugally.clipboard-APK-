package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzewv implements zzhpx {
    private final zzewu zza;

    private zzewv(zzewu zzewuVar) {
        this.zza = zzewuVar;
    }

    public static zzewv zzc(zzewu zzewuVar) {
        return new zzewv(zzewuVar);
    }

    public static String zzd(zzewu zzewuVar) {
        String strZza = zzewuVar.zza();
        zzhqf.zzb(strZza);
        return strZza;
    }

    public final String zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
