package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzli {
    public static final /* synthetic */ int zzd = 0;
    private static volatile int zze = 100;
    int zza;
    final int zzb = zze;
    zzlj zzc;

    private zzli() {
    }

    public static int zzF(int i7) {
        return (i7 >>> 1) ^ (-(i7 & 1));
    }

    public static long zzG(long j7) {
        return (j7 >>> 1) ^ (-(1 & j7));
    }

    static zzli zzH(byte[] bArr, int i7, int i8, boolean z7) {
        zzlf zzlfVar = new zzlf(bArr, 0, 0, false, null);
        try {
            zzlfVar.zze(0);
            return zzlfVar;
        } catch (zznn e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public abstract void zzA(int i7);

    public abstract boolean zzC();

    public abstract boolean zzD();

    public abstract boolean zzE(int i7);

    public final void zzI() throws zznn {
        boolean zZzE;
        do {
            int iZzm = zzm();
            if (iZzm == 0) {
                return;
            }
            int i7 = this.zza;
            if (i7 >= this.zzb) {
                throw new zznn("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.zza = i7 + 1;
            zZzE = zzE(iZzm);
            this.zza--;
        } while (zZzE);
    }

    public abstract double zzb();

    public abstract float zzc();

    public abstract int zzd();

    public abstract int zze(int i7);

    public abstract int zzf();

    public abstract int zzg();

    public abstract int zzh();

    public abstract int zzk();

    public abstract int zzl();

    public abstract int zzm();

    public abstract int zzn();

    public abstract long zzo();

    public abstract long zzp();

    public abstract long zzt();

    public abstract long zzu();

    public abstract long zzv();

    public abstract zzle zzw();

    public abstract String zzx();

    public abstract String zzy();

    public abstract void zzz(int i7);

    /* synthetic */ zzli(zzlh zzlhVar) {
    }
}
