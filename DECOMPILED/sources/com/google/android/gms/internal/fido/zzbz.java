package com.google.android.gms.internal.fido;

/* JADX INFO: loaded from: classes2.dex */
final class zzbz extends zzbu {
    private final zzcc zza;

    zzbz(zzcc zzccVar, int i7) {
        super(zzccVar.size(), i7);
        this.zza = zzccVar;
    }

    @Override // com.google.android.gms.internal.fido.zzbu
    protected final Object zza(int i7) {
        return this.zza.get(i7);
    }
}
