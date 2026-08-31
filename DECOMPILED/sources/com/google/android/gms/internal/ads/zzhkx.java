package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzhkx extends zzhkv {
    zzhkx() {
    }

    @Override // com.google.android.gms.internal.ads.zzhkv
    final /* bridge */ /* synthetic */ void zza(Object obj, int i7, long j7) {
        ((zzhkw) obj).zzk(i7 << 3, Long.valueOf(j7));
    }

    @Override // com.google.android.gms.internal.ads.zzhkv
    final /* bridge */ /* synthetic */ void zzb(Object obj, int i7, int i8) {
        ((zzhkw) obj).zzk((i7 << 3) | 5, Integer.valueOf(i8));
    }

    @Override // com.google.android.gms.internal.ads.zzhkv
    final /* bridge */ /* synthetic */ void zzc(Object obj, int i7, long j7) {
        ((zzhkw) obj).zzk((i7 << 3) | 1, Long.valueOf(j7));
    }

    @Override // com.google.android.gms.internal.ads.zzhkv
    final /* bridge */ /* synthetic */ void zzd(Object obj, int i7, zzhhb zzhhbVar) {
        ((zzhkw) obj).zzk((i7 << 3) | 2, zzhhbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhkv
    final /* bridge */ /* synthetic */ void zze(Object obj, int i7, Object obj2) {
        ((zzhkw) obj).zzk((i7 << 3) | 3, (zzhkw) obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzhkv
    final /* synthetic */ Object zzf() {
        return zzhkw.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzhkv
    final /* synthetic */ Object zzg(Object obj) {
        zzhkw zzhkwVar = (zzhkw) obj;
        zzhkwVar.zzd();
        return zzhkwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhkv
    final /* bridge */ /* synthetic */ Object zzh(Object obj) {
        zzhih zzhihVar = (zzhih) obj;
        zzhkw zzhkwVar = zzhihVar.zzt;
        if (zzhkwVar != zzhkw.zza()) {
            return zzhkwVar;
        }
        zzhkw zzhkwVarZzb = zzhkw.zzb();
        zzhihVar.zzt = zzhkwVarZzb;
        return zzhkwVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhkv
    final /* synthetic */ void zzi(Object obj, Object obj2) {
        ((zzhih) obj).zzt = (zzhkw) obj2;
    }

    @Override // com.google.android.gms.internal.ads.zzhkv
    final void zzj(Object obj) {
        ((zzhih) obj).zzt.zzd();
    }
}
