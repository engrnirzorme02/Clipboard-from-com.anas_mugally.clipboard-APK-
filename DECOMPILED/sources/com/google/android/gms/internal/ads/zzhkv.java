package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzhkv {
    private static volatile int zza = 100;

    zzhkv() {
    }

    abstract void zza(Object obj, int i7, long j7);

    abstract void zzb(Object obj, int i7, int i8);

    abstract void zzc(Object obj, int i7, long j7);

    abstract void zzd(Object obj, int i7, zzhhb zzhhbVar);

    abstract void zze(Object obj, int i7, Object obj2);

    abstract Object zzf();

    abstract Object zzg(Object obj);

    abstract Object zzh(Object obj);

    abstract void zzi(Object obj, Object obj2);

    abstract void zzj(Object obj);

    final boolean zzk(Object obj, zzhkf zzhkfVar, int i7) throws zzhiw {
        int iZzc = zzhkfVar.zzc();
        int i8 = iZzc >>> 3;
        int i9 = iZzc & 7;
        if (i9 == 0) {
            zza(obj, i8, zzhkfVar.zzh());
            return true;
        }
        if (i9 == 1) {
            zzc(obj, i8, zzhkfVar.zzj());
            return true;
        }
        if (i9 == 2) {
            zzd(obj, i8, zzhkfVar.zzq());
            return true;
        }
        if (i9 != 3) {
            if (i9 == 4) {
                if (i7 != 0) {
                    return false;
                }
                throw new zzhiw("Protocol message end-group tag did not match expected tag.");
            }
            if (i9 != 5) {
                throw new zzhiv("Protocol message tag had invalid wire type.");
            }
            zzb(obj, i8, zzhkfVar.zzk());
            return true;
        }
        Object objZzf = zzf();
        int i10 = i8 << 3;
        int i11 = i7 + 1;
        if (i11 >= zza) {
            throw new zzhiw("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (zzhkfVar.zzb() != Integer.MAX_VALUE && zzk(objZzf, zzhkfVar, i11)) {
        }
        if ((i10 | 4) != zzhkfVar.zzc()) {
            throw new zzhiw("Protocol message end-group tag did not match expected tag.");
        }
        zze(obj, i8, zzg(objZzf));
        return true;
    }
}
