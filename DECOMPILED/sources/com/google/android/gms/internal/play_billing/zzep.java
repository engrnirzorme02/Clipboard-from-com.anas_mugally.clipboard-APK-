package com.google.android.gms.internal.play_billing;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzep extends zzdz {
    public static final /* synthetic */ int zzb = 0;
    private static final Logger zzc = Logger.getLogger(zzep.class.getName());
    private static final boolean zzd = zzho.zzx();
    zzeq zza;

    private zzep() {
        throw null;
    }

    static int zzA(zzgl zzglVar, zzgv zzgvVar) {
        int iZze = ((zzds) zzglVar).zze(zzgvVar);
        return zzC(iZze) + iZze;
    }

    public static int zzB(String str) {
        int length;
        try {
            length = zzhr.zzc(str);
        } catch (zzhq unused) {
            length = str.getBytes(zzfo.zza).length;
        }
        return zzC(length) + length;
    }

    public static int zzC(int i7) {
        return (352 - (Integer.numberOfLeadingZeros(i7) * 9)) >>> 6;
    }

    public static int zzD(long j7) {
        return (640 - (Long.numberOfLeadingZeros(j7) * 9)) >>> 6;
    }

    @Deprecated
    static int zzy(int i7, zzgl zzglVar, zzgv zzgvVar) {
        int iZzC = zzC(i7 << 3);
        return iZzC + iZzC + ((zzds) zzglVar).zze(zzgvVar);
    }

    public static int zzz(zzgl zzglVar) {
        int iZzj = zzglVar.zzj();
        return zzC(iZzj) + iZzj;
    }

    public final void zzE() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void zzF(String str, zzhq zzhqVar) throws zzen {
        zzc.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzhqVar);
        byte[] bytes = str.getBytes(zzfo.zza);
        try {
            int length = bytes.length;
            zzv(length);
            zzm(bytes, 0, length);
        } catch (IndexOutOfBoundsException e7) {
            throw new zzen(e7);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b7);

    public abstract void zzd(int i7, boolean z7);

    public abstract void zze(int i7, zzei zzeiVar);

    public abstract void zzg(int i7, int i8);

    public abstract void zzh(int i7);

    public abstract void zzi(int i7, long j7);

    public abstract void zzj(long j7);

    public abstract void zzk(int i7, int i8);

    public abstract void zzl(int i7);

    public abstract void zzm(byte[] bArr, int i7, int i8);

    abstract void zzn(int i7, zzgl zzglVar, zzgv zzgvVar);

    public abstract void zzp(int i7, zzgl zzglVar);

    public abstract void zzq(int i7, zzei zzeiVar);

    public abstract void zzr(int i7, String str);

    public abstract void zzt(int i7, int i8);

    public abstract void zzu(int i7, int i8);

    public abstract void zzv(int i7);

    public abstract void zzw(int i7, long j7);

    public abstract void zzx(long j7);

    /* synthetic */ zzep(zzeo zzeoVar) {
    }
}
