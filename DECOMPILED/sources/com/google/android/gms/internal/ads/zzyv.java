package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzyv {
    private int zza;
    private int zzb;
    private int zzc = 0;
    private zzyo[] zzd = new zzyo[100];

    public zzyv(boolean z7, int i7) {
    }

    public final synchronized void zza() {
        zzb(0);
    }

    public final synchronized void zzb(int i7) {
        int i8 = this.zza;
        this.zza = i7;
        if (i7 < i8) {
            zzf();
        }
    }

    public final synchronized zzyo zzc() {
        zzyo zzyoVar;
        try {
            this.zzb++;
            int i7 = this.zzc;
            if (i7 > 0) {
                zzyo[] zzyoVarArr = this.zzd;
                int i8 = i7 - 1;
                this.zzc = i8;
                zzyoVar = zzyoVarArr[i8];
                if (zzyoVar == null) {
                    throw null;
                }
                zzyoVarArr[i8] = null;
            } else {
                zzyoVar = new zzyo(new byte[65536], 0);
                int i9 = this.zzb;
                zzyo[] zzyoVarArr2 = this.zzd;
                int length = zzyoVarArr2.length;
                if (i9 > length) {
                    this.zzd = (zzyo[]) Arrays.copyOf(zzyoVarArr2, length + length);
                    return zzyoVar;
                }
            }
            return zzyoVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzd(zzyo zzyoVar) {
        zzyo[] zzyoVarArr = this.zzd;
        int i7 = this.zzc;
        this.zzc = i7 + 1;
        zzyoVarArr[i7] = zzyoVar;
        this.zzb--;
        notifyAll();
    }

    public final synchronized void zze(zzyp zzypVar) {
        while (zzypVar != null) {
            try {
                zzyo[] zzyoVarArr = this.zzd;
                int i7 = this.zzc;
                this.zzc = i7 + 1;
                zzyoVarArr[i7] = zzypVar.zzd();
                this.zzb--;
                zzypVar = zzypVar.zze();
            } catch (Throwable th) {
                throw th;
            }
        }
        notifyAll();
    }

    public final synchronized void zzf() {
        int i7 = this.zza;
        String str = zzeo.zza;
        int iMax = Math.max(0, ((i7 + 65535) / 65536) - this.zzb);
        int i8 = this.zzc;
        if (iMax >= i8) {
            return;
        }
        Arrays.fill(this.zzd, iMax, i8, (Object) null);
        this.zzc = iMax;
    }

    public final synchronized int zzg() {
        return this.zzb * 65536;
    }
}
