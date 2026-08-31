package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzkk {
    private long zza;
    private float zzb;
    private long zzc;

    public zzkk() {
        this.zza = -9223372036854775807L;
        this.zzb = -3.4028235E38f;
        this.zzc = -9223372036854775807L;
    }

    public final zzkk zza(long j7) {
        this.zza = j7;
        return this;
    }

    public final zzkk zzb(float f7) {
        boolean z7 = true;
        if (f7 <= 0.0f && f7 != -3.4028235E38f) {
            z7 = false;
        }
        zzghc.zza(z7);
        this.zzb = f7;
        return this;
    }

    public final zzkk zzc(long j7) {
        boolean z7 = true;
        if (j7 < 0) {
            if (j7 == -9223372036854775807L) {
                j7 = -9223372036854775807L;
            } else {
                z7 = false;
            }
        }
        zzghc.zza(z7);
        this.zzc = j7;
        return this;
    }

    public final zzkl zzd() {
        return new zzkl(this, null);
    }

    final /* synthetic */ long zze() {
        return this.zza;
    }

    final /* synthetic */ float zzf() {
        return this.zzb;
    }

    final /* synthetic */ long zzg() {
        return this.zzc;
    }

    /* synthetic */ zzkk(zzkl zzklVar, byte[] bArr) {
        this.zza = zzklVar.zza;
        this.zzb = zzklVar.zzb;
        this.zzc = zzklVar.zzc;
    }
}
