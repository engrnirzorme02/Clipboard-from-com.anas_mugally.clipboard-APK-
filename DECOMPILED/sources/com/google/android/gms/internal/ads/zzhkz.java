package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
final class zzhkz extends zzhlb {
    zzhkz(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.ads.zzhlb
    public final void zza(Object obj, long j7, byte b7) {
        if (zzhlc.zzb) {
            zzhlc.zzG(obj, j7, b7);
        } else {
            zzhlc.zzH(obj, j7, b7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlb
    public final boolean zzb(Object obj, long j7) {
        return zzhlc.zzb ? zzhlc.zzx(obj, j7) : zzhlc.zzy(obj, j7);
    }

    @Override // com.google.android.gms.internal.ads.zzhlb
    public final void zzc(Object obj, long j7, boolean z7) {
        if (zzhlc.zzb) {
            zzhlc.zzG(obj, j7, z7 ? (byte) 1 : (byte) 0);
        } else {
            zzhlc.zzH(obj, j7, z7 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlb
    public final float zzd(Object obj, long j7) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j7));
    }

    @Override // com.google.android.gms.internal.ads.zzhlb
    public final void zze(Object obj, long j7, float f7) {
        this.zza.putInt(obj, j7, Float.floatToIntBits(f7));
    }

    @Override // com.google.android.gms.internal.ads.zzhlb
    public final double zzf(Object obj, long j7) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j7));
    }

    @Override // com.google.android.gms.internal.ads.zzhlb
    public final void zzg(Object obj, long j7, double d7) {
        this.zza.putLong(obj, j7, Double.doubleToLongBits(d7));
    }

    @Override // com.google.android.gms.internal.ads.zzhlb
    public final byte zzh(long j7) {
        return Memory.peekByte((int) j7);
    }

    @Override // com.google.android.gms.internal.ads.zzhlb
    public final void zzi(long j7, byte[] bArr, long j8, long j9) {
        Memory.peekByteArray((int) j7, bArr, (int) j8, (int) j9);
    }
}
