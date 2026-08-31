package com.google.android.gms.internal.p411firebaseauthapi;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzanu<T, B> {
    private static volatile int zza = 100;

    zzanu() {
    }

    abstract int zza(T t7);

    abstract B zza();

    abstract T zza(T t7, T t8);

    abstract void zza(B b7, int i7, int i8);

    abstract void zza(B b7, int i7, long j7);

    abstract void zza(B b7, int i7, zzajv zzajvVar);

    abstract void zza(B b7, int i7, T t7);

    abstract void zza(T t7, zzaol zzaolVar);

    abstract boolean zza(zzanc zzancVar);

    final boolean zza(B b7, zzanc zzancVar, int i7) throws zzall {
        int iZzd = zzancVar.zzd();
        int i8 = iZzd >>> 3;
        int i9 = iZzd & 7;
        if (i9 == 0) {
            zzb(b7, i8, zzancVar.zzl());
            return true;
        }
        if (i9 == 1) {
            zza(b7, i8, zzancVar.zzk());
            return true;
        }
        if (i9 == 2) {
            zza((Object) b7, i8, zzancVar.zzp());
            return true;
        }
        if (i9 != 3) {
            if (i9 == 4) {
                if (i7 != 0) {
                    return false;
                }
                throw zzall.zzb();
            }
            if (i9 != 5) {
                throw zzall.zza();
            }
            zza((Object) b7, i8, zzancVar.zzf());
            return true;
        }
        B bZza = zza();
        int i10 = 4 | (i8 << 3);
        int i11 = i7 + 1;
        if (i11 >= zza) {
            throw zzall.zzh();
        }
        while (zzancVar.zzc() != Integer.MAX_VALUE && zza(bZza, zzancVar, i11)) {
        }
        if (i10 != zzancVar.zzd()) {
            throw zzall.zzb();
        }
        zza(b7, i8, zze(bZza));
        return true;
    }

    abstract int zzb(T t7);

    abstract void zzb(B b7, int i7, long j7);

    abstract void zzb(T t7, zzaol zzaolVar);

    abstract void zzb(Object obj, B b7);

    abstract B zzc(Object obj);

    abstract void zzc(Object obj, T t7);

    abstract T zzd(Object obj);

    abstract T zze(B b7);

    abstract void zzf(Object obj);
}
