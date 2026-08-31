package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhjl {
    private final zzhjk zza;

    private zzhjl(zzhli zzhliVar, Object obj, zzhli zzhliVar2, Object obj2) {
        this.zza = new zzhjk(zzhliVar, "", zzhliVar2, obj2);
    }

    public static zzhjl zza(zzhli zzhliVar, Object obj, zzhli zzhliVar2, Object obj2) {
        return new zzhjl(zzhliVar, "", zzhliVar2, obj2);
    }

    static void zzb(zzhhm zzhhmVar, zzhjk zzhjkVar, Object obj, Object obj2) {
        zzhhw.zzf(zzhhmVar, zzhjkVar.zza, 1, obj);
        zzhhw.zzf(zzhhmVar, zzhjkVar.zzc, 2, obj2);
    }

    static int zzc(zzhjk zzhjkVar, Object obj, Object obj2) {
        return zzhhw.zzh(zzhjkVar.zza, 1, obj) + zzhhw.zzh(zzhjkVar.zzc, 2, obj2);
    }

    public final int zzd(int i7, Object obj, Object obj2) {
        zzhjk zzhjkVar = this.zza;
        int iZzA = zzhhm.zzA(i7 << 3);
        int iZzc = zzc(zzhjkVar, obj, obj2);
        return iZzA + zzhhm.zzA(iZzc) + iZzc;
    }

    final zzhjk zze() {
        return this.zza;
    }
}
