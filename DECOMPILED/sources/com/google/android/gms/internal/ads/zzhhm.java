package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzhhm extends zzhgs {
    private static final Logger zza = Logger.getLogger(zzhhm.class.getName());
    private static final boolean zzb = zzhlc.zza();
    public static final /* synthetic */ int zzf = 0;
    Object zze;

    private zzhhm() {
        throw null;
    }

    public static int zzA(int i7) {
        return (352 - (Integer.numberOfLeadingZeros(i7) * 9)) >>> 6;
    }

    public static int zzB(long j7) {
        return (640 - (Long.numberOfLeadingZeros(j7) * 9)) >>> 6;
    }

    public static int zzC(String str) {
        int length;
        try {
            length = zzhlh.zzc(str);
        } catch (zzhlg unused) {
            length = str.getBytes(zzhiu.zza).length;
        }
        return zzA(length) + length;
    }

    public static int zzD(zzhjs zzhjsVar) {
        int iZzbr = zzhjsVar.zzbr();
        return zzA(iZzbr) + iZzbr;
    }

    static int zzz(int i7) {
        if (i7 > 4096) {
            return 4096;
        }
        return i7;
    }

    public final void zzE() {
        if (zzb() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void zzF(String str, zzhlg zzhlgVar) throws zzhhk {
        zza.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzhlgVar);
        byte[] bytes = str.getBytes(zzhiu.zza);
        try {
            int length = bytes.length;
            zzs(length);
            zza(bytes, 0, length);
        } catch (IndexOutOfBoundsException e7) {
            throw new zzhhk(e7);
        }
    }

    public abstract void zzJ(int i7, int i8);

    public abstract void zzK(int i7, int i8);

    public abstract void zzL(int i7, int i8);

    public abstract void zzM(int i7, int i8);

    public abstract void zzN(int i7, long j7);

    @Override // com.google.android.gms.internal.ads.zzhgs
    public abstract void zza(byte[] bArr, int i7, int i8);

    public abstract int zzb();

    public abstract void zzh(int i7, long j7);

    public abstract void zzi(int i7, boolean z7);

    public abstract void zzj(int i7, String str);

    public abstract void zzk(int i7, zzhhb zzhhbVar);

    public abstract void zzl(zzhhb zzhhbVar);

    abstract void zzm(byte[] bArr, int i7, int i8);

    public abstract void zzn(int i7, zzhjs zzhjsVar);

    public abstract void zzo(int i7, zzhhb zzhhbVar);

    public abstract void zzp(zzhjs zzhjsVar);

    public abstract void zzq(byte b7);

    public abstract void zzr(int i7);

    public abstract void zzs(int i7);

    public abstract void zzt(int i7);

    public abstract void zzu(long j7);

    public abstract void zzv(long j7);

    public abstract void zzx(String str);

    public abstract void zzy();

    /* synthetic */ zzhhm(byte[] bArr) {
    }
}
