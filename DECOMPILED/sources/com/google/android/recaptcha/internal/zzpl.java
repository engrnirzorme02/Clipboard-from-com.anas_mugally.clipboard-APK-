package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzpl {
    private static volatile int zza = 100;

    zzpl() {
    }

    abstract Object zza(Object obj);

    abstract Object zzb();

    abstract Object zzc(Object obj);

    abstract void zzd(Object obj, int i7, int i8);

    abstract void zze(Object obj, int i7, long j7);

    abstract void zzf(Object obj, int i7, Object obj2);

    abstract void zzg(Object obj, int i7, zzle zzleVar);

    abstract void zzh(Object obj, int i7, long j7);

    abstract void zzi(Object obj);

    abstract void zzj(Object obj, Object obj2);

    final boolean zzk(Object obj, zzov zzovVar, int i7) throws zznn {
        int iZzd = zzovVar.zzd();
        int i8 = iZzd >>> 3;
        int i9 = iZzd & 7;
        if (i9 == 0) {
            zzh(obj, i8, zzovVar.zzl());
            return true;
        }
        if (i9 == 1) {
            zze(obj, i8, zzovVar.zzk());
            return true;
        }
        if (i9 == 2) {
            zzg(obj, i8, zzovVar.zzp());
            return true;
        }
        if (i9 != 3) {
            if (i9 == 4) {
                return false;
            }
            if (i9 != 5) {
                throw new zznm("Protocol message tag had invalid wire type.");
            }
            zzd(obj, i8, zzovVar.zzf());
            return true;
        }
        Object objZzb = zzb();
        int i10 = i8 << 3;
        int i11 = i7 + 1;
        if (i11 >= zza) {
            throw new zznn("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (zzovVar.zzc() != Integer.MAX_VALUE && zzk(objZzb, zzovVar, i11)) {
        }
        if ((i10 | 4) != zzovVar.zzd()) {
            throw new zznn("Protocol message end-group tag did not match expected tag.");
        }
        zzf(obj, i8, zzc(objZzb));
        return true;
    }
}
