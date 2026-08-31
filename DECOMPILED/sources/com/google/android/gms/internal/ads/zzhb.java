package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public class zzhb {
    private int zza;

    public void zza() {
        this.zza = 0;
    }

    public final boolean zzb() {
        return zzi(4);
    }

    public final boolean zzc() {
        return zzi(1);
    }

    public final boolean zzd() {
        return zzi(536870912);
    }

    public final boolean zze() {
        return zzi(268435456);
    }

    public final boolean zzf() {
        return zzi(67108864);
    }

    public final void zzg(int i7) {
        this.zza = i7;
    }

    public final void zzh(int i7) {
        this.zza |= 536870912;
    }

    protected final boolean zzi(int i7) {
        return (this.zza & i7) == i7;
    }
}
