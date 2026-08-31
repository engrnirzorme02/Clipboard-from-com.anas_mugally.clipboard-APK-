package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes2.dex */
final class zzbr extends zzbn {
    private final zzbt zza;

    zzbr(zzbt zzbtVar, int i7) {
        super(zzbtVar.size(), i7);
        this.zza = zzbtVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbn
    protected final Object zza(int i7) {
        return this.zza.get(i7);
    }
}
