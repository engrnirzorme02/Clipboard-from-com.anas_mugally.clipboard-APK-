package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzcmo implements zzgoq {
    final /* synthetic */ String zza;
    final /* synthetic */ zzcmu zzb;

    zzcmo(zzcmu zzcmuVar, String str) {
        this.zza = str;
        Objects.requireNonNull(zzcmuVar);
        this.zzb = zzcmuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        zzcmu zzcmuVar = this.zzb;
        zzcmuVar.zzu().zza(zzcmuVar.zzt().zzb(zzcmuVar.zzr(), zzcmuVar.zzs(), false, this.zza, null, zzcmuVar.zzp(), zzcmuVar.zzw()), null);
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = this.zza;
        String str2 = (String) obj;
        zzcmu zzcmuVar = this.zzb;
        zzcmuVar.zzu().zza(zzcmuVar.zzt().zzb(zzcmuVar.zzr(), zzcmuVar.zzs(), false, str, str2, zzcmuVar.zzp(), zzcmuVar.zzw()), zzcmuVar.zzv());
    }
}
