package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcvb {
    private final Context zza;
    private final zzfdc zzb;
    private final Bundle zzc;
    private final zzfcv zzd;
    private final zzcut zze;
    private final zzeee zzf;
    private final int zzg;

    /* synthetic */ zzcvb(zzcva zzcvaVar, byte[] bArr) {
        this.zza = zzcvaVar.zzi();
        this.zzb = zzcvaVar.zzj();
        this.zzc = zzcvaVar.zzk();
        this.zzd = zzcvaVar.zzl();
        this.zze = zzcvaVar.zzm();
        this.zzf = zzcvaVar.zzn();
        this.zzg = zzcvaVar.zzo();
    }

    final zzcva zza() {
        zzcva zzcvaVar = new zzcva();
        zzcvaVar.zza(this.zza);
        zzcvaVar.zzb(this.zzb);
        zzcvaVar.zzc(this.zzc);
        zzcvaVar.zzd(this.zze);
        zzcvaVar.zzg(this.zzf);
        return zzcvaVar;
    }

    final zzfdc zzb() {
        return this.zzb;
    }

    final zzfcv zzc() {
        return this.zzd;
    }

    final Bundle zzd() {
        return this.zzc;
    }

    final zzcut zze() {
        return this.zze;
    }

    final Context zzf(Context context) {
        return this.zza;
    }

    final zzeee zzg(String str) {
        zzeee zzeeeVar = this.zzf;
        return zzeeeVar != null ? zzeeeVar : new zzeee(str);
    }

    final int zzh() {
        return this.zzg;
    }
}
