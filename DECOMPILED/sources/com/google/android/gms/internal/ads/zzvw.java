package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzvw implements zzuo {
    private final zzfz zza;
    private final zzvh zzb;
    private int zzc;
    private final zzyy zzd;

    public zzvw(zzfz zzfzVar, final zzada zzadaVar) {
        zzvh zzvhVar = new zzvh() { // from class: com.google.android.gms.internal.ads.zzvv
            @Override // com.google.android.gms.internal.ads.zzvh
            public final /* synthetic */ zzvi zza(zzox zzoxVar) {
                return new zztr(zzadaVar);
            }
        };
        zzyy zzyyVar = new zzyy(-1);
        this.zza = zzfzVar;
        this.zzb = zzvhVar;
        this.zzd = zzyyVar;
        this.zzc = 1048576;
    }

    public final zzvw zza(int i7) {
        this.zzc = i7;
        return this;
    }

    public final zzvx zzb(zzaj zzajVar) {
        zzajVar.zzb.getClass();
        return new zzvx(zzajVar, this.zza, this.zzb, zzru.zza, this.zzd, this.zzc, 0, null, null, null);
    }
}
