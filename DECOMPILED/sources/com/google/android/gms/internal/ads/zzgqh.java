package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgqh {
    private boolean zza;
    private final zzgqs zzc;
    private final zzgqf zzb = zzgqf.zza;
    private zzgqi zzd = null;
    private zzgqj zze = null;

    /* synthetic */ zzgqh(zzgqs zzgqsVar, byte[] bArr) {
        this.zzc = zzgqsVar;
    }

    public final zzgqh zza() {
        zzgqj zzgqjVar = this.zze;
        if (zzgqjVar != null) {
            zzgqjVar.zzc();
        }
        this.zza = true;
        return this;
    }

    public final zzgqh zzb() {
        this.zzd = zzgqi.zza;
        return this;
    }

    final /* synthetic */ boolean zzc() {
        return this.zza;
    }

    final /* synthetic */ void zzd(boolean z7) {
        this.zza = false;
    }

    final /* synthetic */ zzgqf zze() {
        return this.zzb;
    }

    final /* synthetic */ zzgqs zzf() {
        return this.zzc;
    }

    final /* synthetic */ zzgqi zzg() {
        return this.zzd;
    }

    final /* synthetic */ zzgqj zzh() {
        return this.zze;
    }

    final /* synthetic */ void zzi(zzgqj zzgqjVar) {
        this.zze = zzgqjVar;
    }
}
