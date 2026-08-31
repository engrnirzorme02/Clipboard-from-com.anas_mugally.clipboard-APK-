package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
final class zzhl extends zzhn {
    zzhl(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhn
    public final double zza(Object obj, long j7) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j7));
    }

    @Override // com.google.android.gms.internal.play_billing.zzhn
    public final float zzb(Object obj, long j7) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j7));
    }

    @Override // com.google.android.gms.internal.play_billing.zzhn
    public final void zzc(Object obj, long j7, boolean z7) {
        if (zzho.zzb) {
            zzho.zzD(obj, j7, z7 ? (byte) 1 : (byte) 0);
        } else {
            zzho.zzE(obj, j7, z7 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhn
    public final void zzd(Object obj, long j7, byte b7) {
        if (zzho.zzb) {
            zzho.zzD(obj, j7, b7);
        } else {
            zzho.zzE(obj, j7, b7);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhn
    public final void zze(Object obj, long j7, double d7) {
        this.zza.putLong(obj, j7, Double.doubleToLongBits(d7));
    }

    @Override // com.google.android.gms.internal.play_billing.zzhn
    public final void zzf(Object obj, long j7, float f7) {
        this.zza.putInt(obj, j7, Float.floatToIntBits(f7));
    }

    @Override // com.google.android.gms.internal.play_billing.zzhn
    public final boolean zzg(Object obj, long j7) {
        return zzho.zzb ? zzho.zzt(obj, j7) : zzho.zzu(obj, j7);
    }
}
