package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzhji implements zzhjq {
    private final zzhjq[] zza;

    zzhji(zzhjq... zzhjqVarArr) {
        this.zza = zzhjqVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzhjq
    public final boolean zzb(Class cls) {
        for (int i7 = 0; i7 < 2; i7++) {
            if (this.zza[i7].zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzhjq
    public final zzhjp zzc(Class cls) {
        for (int i7 = 0; i7 < 2; i7++) {
            zzhjq zzhjqVar = this.zza[i7];
            if (zzhjqVar.zzb(cls)) {
                return zzhjqVar.zzc(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
