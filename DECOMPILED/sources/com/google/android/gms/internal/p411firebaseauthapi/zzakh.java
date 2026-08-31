package com.google.android.gms.internal.p411firebaseauthapi;

import com.google.android.gms.common.api.C3553a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzakh {
    private static volatile int zzd = 100;
    int zza;
    int zzb;
    zzakl zzc;
    private int zze;
    private int zzf;

    public static int zza(int i7) {
        return (-(i7 & 1)) ^ (i7 >>> 1);
    }

    public abstract double zza();

    public abstract float zzb();

    public abstract int zzb(int i7);

    public abstract int zzc();

    public abstract void zzc(int i7);

    public abstract int zzd();

    public abstract void zzd(int i7);

    public abstract int zze();

    public abstract boolean zze(int i7);

    public abstract int zzf();

    public abstract int zzg();

    public abstract int zzh();

    public abstract int zzi();

    public abstract int zzj();

    public abstract long zzk();

    public abstract long zzl();

    abstract long zzm();

    public abstract long zzn();

    public abstract long zzo();

    public abstract long zzp();

    public abstract zzajv zzq();

    public abstract String zzr();

    public abstract String zzs();

    public final void zzt() throws zzall {
        if (this.zza + this.zze >= this.zzf) {
            throw zzall.zzh();
        }
    }

    public final void zzu() {
        if (this.zze == 0) {
            zzc(0);
        }
    }

    public final void zzv() throws zzall {
        boolean zZze;
        do {
            int iZzi = zzi();
            if (iZzi == 0) {
                return;
            }
            zzt();
            this.zze++;
            zZze = zze(iZzi);
            this.zze--;
        } while (zZze);
    }

    public abstract boolean zzw();

    public abstract boolean zzx();

    private zzakh() {
        this.zzf = zzd;
        this.zzb = C3553a.e.API_PRIORITY_OTHER;
    }

    public static long zza(long j7) {
        return (-(j7 & 1)) ^ (j7 >>> 1);
    }

    static zzakh zza(byte[] bArr, int i7, int i8, boolean z7) {
        zzakk zzakkVar = new zzakk(bArr, i7, i8, z7);
        try {
            zzakkVar.zzb(i8);
            return zzakkVar;
        } catch (zzall e7) {
            throw new IllegalArgumentException(e7);
        }
    }
}
