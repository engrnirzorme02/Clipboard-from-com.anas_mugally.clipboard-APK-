package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcdc implements zzkj {
    private final zzyv zza = new zzyv(true, 65536);
    private long zzb = 15000000;
    private long zzc = 30000000;
    private long zzd = 2500000;
    private long zze = 5000000;
    private int zzf;
    private boolean zzg;

    zzcdc() {
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final void zza(zzox zzoxVar) {
        zzo(false);
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final void zzb(zzki zzkiVar, zzwq zzwqVar, zzyf[] zzyfVarArr) {
        int i7;
        this.zzf = 0;
        for (zzyf zzyfVar : zzyfVarArr) {
            if (zzyfVar != null) {
                int i8 = this.zzf;
                int i9 = zzyfVar.zza().zzc;
                if (i9 == 0) {
                    i7 = 144310272;
                } else if (i9 == 1) {
                    i7 = 13107200;
                } else if (i9 != 2) {
                    i7 = 131072;
                    if (i9 != 3 && i9 != 5 && i9 != 6) {
                        throw new IllegalArgumentException();
                    }
                } else {
                    i7 = 131072000;
                }
                this.zzf = i8 + i7;
            }
        }
        this.zza.zzb(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final void zzc(zzox zzoxVar) {
        zzo(true);
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final void zzd(zzox zzoxVar) {
        zzo(true);
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final long zze(zzox zzoxVar) {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final boolean zzf(zzox zzoxVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final boolean zzg(zzki zzkiVar) {
        char c7;
        long j7 = zzkiVar.zze;
        boolean z7 = true;
        if (j7 > this.zzc) {
            c7 = 0;
        } else {
            c7 = j7 < this.zzb ? (char) 2 : (char) 1;
        }
        int iZzg = this.zza.zzg();
        int i7 = this.zzf;
        if (c7 != 2 && (c7 != 1 || !this.zzg || iZzg >= i7)) {
            z7 = false;
        }
        this.zzg = z7;
        return z7;
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final boolean zzh(zzki zzkiVar) {
        long j7 = zzkiVar.zzg ? this.zze : this.zzd;
        return j7 <= 0 || zzkiVar.zze >= j7;
    }

    public final synchronized void zzj(int i7) {
        this.zzb = ((long) i7) * 1000;
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final zzyv zzk() {
        return this.zza;
    }

    public final synchronized void zzl(int i7) {
        this.zzc = ((long) i7) * 1000;
    }

    public final synchronized void zzm(int i7) {
        this.zzd = ((long) i7) * 1000;
    }

    public final synchronized void zzn(int i7) {
        this.zze = ((long) i7) * 1000;
    }

    final void zzo(boolean z7) {
        this.zzf = 0;
        this.zzg = false;
        if (z7) {
            this.zza.zza();
        }
    }
}
