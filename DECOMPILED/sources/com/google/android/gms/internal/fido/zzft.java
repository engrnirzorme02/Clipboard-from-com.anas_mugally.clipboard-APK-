package com.google.android.gms.internal.fido;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzft {
    private static final char[] zza = "0123456789abcdef".toCharArray();
    public static final /* synthetic */ int zzb = 0;

    zzft() {
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzft) {
            zzft zzftVar = (zzft) obj;
            if (zzb() == zzftVar.zzb() && zzc(zzftVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (zzb() >= 32) {
            return zza();
        }
        byte[] bArrZze = zze();
        int i7 = bArrZze[0] & 255;
        for (int i8 = 1; i8 < bArrZze.length; i8++) {
            i7 |= (bArrZze[i8] & 255) << (i8 * 8);
        }
        return i7;
    }

    public final String toString() {
        byte[] bArrZze = zze();
        int length = bArrZze.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b7 : bArrZze) {
            char[] cArr = zza;
            sb.append(cArr[(b7 >> 4) & 15]);
            sb.append(cArr[b7 & 15]);
        }
        return sb.toString();
    }

    public abstract int zza();

    public abstract int zzb();

    abstract boolean zzc(zzft zzftVar);

    public abstract byte[] zzd();

    byte[] zze() {
        throw null;
    }
}
