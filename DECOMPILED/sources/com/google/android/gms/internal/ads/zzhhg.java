package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzhhg {
    private static volatile int zza = 100;
    public static final /* synthetic */ int zzf = 0;
    int zzb;
    int zzc;
    final int zzd = zza;
    Object zze;

    private zzhhg() {
    }

    public static zzhhg zzF(InputStream inputStream, int i7) {
        if (inputStream != null) {
            return new zzhhe(inputStream, 4096, null);
        }
        byte[] bArr = zzhiu.zzb;
        int length = bArr.length;
        return zzG(bArr, 0, 0, false);
    }

    static zzhhg zzG(byte[] bArr, int i7, int i8, boolean z7) {
        zzhhc zzhhcVar = new zzhhc(bArr, i7, i8, z7, null);
        try {
            zzhhcVar.zzz(i8);
            return zzhhcVar;
        } catch (zzhiw e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public static int zzK(int i7) {
        return (i7 >>> 1) ^ (-(i7 & 1));
    }

    public static long zzL(long j7) {
        return (j7 >>> 1) ^ (-(1 & j7));
    }

    public static int zzM(int i7, InputStream inputStream) throws IOException {
        if ((i7 & 128) == 0) {
            return i7;
        }
        int i8 = i7 & 127;
        int i9 = 7;
        while (i9 < 32) {
            int i10 = inputStream.read();
            if (i10 == -1) {
                throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            i8 |= (i10 & 127) << i9;
            if ((i10 & 128) == 0) {
                return i8;
            }
            i9 += 7;
        }
        while (i9 < 64) {
            int i11 = inputStream.read();
            if (i11 == -1) {
                throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if ((i11 & 128) == 0) {
                return i8;
            }
            i9 += 7;
        }
        throw new zzhiw("CodedInputStream encountered a malformed varint.");
    }

    public abstract void zzA(int i7);

    public abstract boolean zzB();

    public abstract int zzC();

    public final void zzH() throws zzhiw {
        if (this.zzb + this.zzc >= this.zzd) {
            throw new zzhiw("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    public final void zzI() {
        if (this.zzc == 0) {
            zzb(0);
        }
    }

    public final void zzJ() throws zzhiw {
        boolean zZzc;
        do {
            int iZza = zza();
            if (iZza == 0) {
                return;
            }
            zzH();
            this.zzc++;
            zZzc = zzc(iZza);
            this.zzc--;
        } while (zZzc);
    }

    public abstract int zza();

    public abstract void zzb(int i7);

    public abstract boolean zzc(int i7);

    public abstract double zzd();

    public abstract float zze();

    public abstract long zzf();

    public abstract long zzg();

    public abstract int zzh();

    public abstract long zzi();

    public abstract int zzj();

    public abstract boolean zzk();

    public abstract String zzl();

    public abstract String zzm();

    public abstract zzhhb zzn();

    public abstract int zzo();

    public abstract int zzp();

    public abstract int zzq();

    public abstract long zzr();

    public abstract int zzs();

    public abstract long zzt();

    public abstract int zzz(int i7);

    /* synthetic */ zzhhg(byte[] bArr) {
    }
}
