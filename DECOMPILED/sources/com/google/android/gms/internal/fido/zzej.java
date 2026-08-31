package com.google.android.gms.internal.fido;

/* JADX INFO: loaded from: classes2.dex */
public final class zzej implements zzek {
    private final String zza;
    private final zzdn zzb;

    public zzej() {
        zzdo zzdoVar = zzdo.NO_OP;
        this.zza = "";
        this.zzb = zzdoVar;
    }

    @Override // com.google.android.gms.internal.fido.zzek
    public final zzdp zza(String str) {
        return new zzes(this.zza, str, true, this.zzb, true, true);
    }
}
