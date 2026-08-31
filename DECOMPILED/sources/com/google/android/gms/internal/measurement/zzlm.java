package com.google.android.gms.internal.measurement;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzlm extends zzkz {
    public static final /* synthetic */ int zzb = 0;
    private static final Logger zzc = Logger.getLogger(zzlm.class.getName());
    private static final boolean zzd = zzop.zza();
    zzln zza;

    private zzlm() {
        throw null;
    }

    public static int zzA(long j7) {
        return (640 - (Long.numberOfLeadingZeros(j7) * 9)) >>> 6;
    }

    public static int zzB(String str) {
        int length;
        try {
            length = zzos.zzb(str);
        } catch (zzor unused) {
            length = str.getBytes(zzmp.zza).length;
        }
        return zzz(length) + length;
    }

    public static int zzC(zznm zznmVar) {
        int iZzcn = zznmVar.zzcn();
        return zzz(iZzcn) + iZzcn;
    }

    static int zzD(zznm zznmVar, zznx zznxVar) {
        int iZzcd = ((zzks) zznmVar).zzcd(zznxVar);
        return zzz(iZzcd) + iZzcd;
    }

    @Deprecated
    static int zzG(int i7, zznm zznmVar, zznx zznxVar) {
        int iZzz = zzz(i7 << 3);
        return iZzz + iZzz + ((zzks) zznmVar).zzcd(zznxVar);
    }

    public static int zzz(int i7) {
        return (352 - (Integer.numberOfLeadingZeros(i7) * 9)) >>> 6;
    }

    public final void zzE() {
        if (zzy() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void zzF(String str, zzor zzorVar) throws zzll {
        zzc.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzorVar);
        byte[] bytes = str.getBytes(zzmp.zza);
        try {
            int length = bytes.length;
            zzr(length);
            zzw(bytes, 0, length);
        } catch (IndexOutOfBoundsException e7) {
            throw new zzll(e7);
        }
    }

    public abstract void zza(int i7, int i8);

    public abstract void zzb(int i7, int i8);

    public abstract void zzc(int i7, int i8);

    public abstract void zzd(int i7, int i8);

    public abstract void zze(int i7, long j7);

    public abstract void zzf(int i7, long j7);

    public abstract void zzg(int i7, boolean z7);

    public abstract void zzh(int i7, String str);

    public abstract void zzi(int i7, zzlh zzlhVar);

    public abstract void zzj(zzlh zzlhVar);

    abstract void zzk(byte[] bArr, int i7, int i8);

    abstract void zzl(int i7, zznm zznmVar, zznx zznxVar);

    public abstract void zzm(int i7, zznm zznmVar);

    public abstract void zzn(int i7, zzlh zzlhVar);

    public abstract void zzo(zznm zznmVar);

    public abstract void zzp(byte b7);

    public abstract void zzq(int i7);

    public abstract void zzr(int i7);

    public abstract void zzs(int i7);

    public abstract void zzt(long j7);

    public abstract void zzu(long j7);

    public abstract void zzw(byte[] bArr, int i7, int i8);

    public abstract void zzx(String str);

    public abstract int zzy();

    /* synthetic */ zzlm(byte[] bArr) {
    }
}
