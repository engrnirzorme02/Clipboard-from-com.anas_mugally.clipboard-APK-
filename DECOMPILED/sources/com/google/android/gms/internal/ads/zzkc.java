package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzkc {
    public zzld zza;
    public int zzb;
    public boolean zzc;
    public int zzd;
    private boolean zze;

    public zzkc(zzld zzldVar) {
        this.zza = zzldVar;
    }

    public final void zza(int i7) {
        this.zze = 1 == ((this.zze ? 1 : 0) | i7);
        this.zzb += i7;
    }

    public final void zzb(zzld zzldVar) {
        this.zze |= this.zza != zzldVar;
        this.zza = zzldVar;
    }

    public final void zzc(int i7) {
        if (this.zzc && this.zzd != 5) {
            zzghc.zza(i7 == 5);
            return;
        }
        this.zze = true;
        this.zzc = true;
        this.zzd = i7;
    }

    final /* synthetic */ boolean zzd() {
        return this.zze;
    }
}
