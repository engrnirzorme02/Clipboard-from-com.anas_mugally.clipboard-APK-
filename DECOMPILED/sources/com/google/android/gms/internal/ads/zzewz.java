package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzewz implements zzhpx {
    private final zzewu zza;

    private zzewz(zzewu zzewuVar) {
        this.zza = zzewuVar;
    }

    public static zzewz zzc(zzewu zzewuVar) {
        return new zzewz(zzewuVar);
    }

    public static String zzd(zzewu zzewuVar) {
        String strZze = zzewuVar.zze();
        zzhqf.zzb(strZze);
        return strZze;
    }

    public final String zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
