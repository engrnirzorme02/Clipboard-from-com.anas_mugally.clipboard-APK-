package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzael implements zzadv {
    final /* synthetic */ zzaen zza;
    private final long zzb;

    public zzael(zzaen zzaenVar, long j7) {
        Objects.requireNonNull(zzaenVar);
        this.zza = zzaenVar;
        this.zzb = j7;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final zzadt zzc(long j7) {
        zzaen zzaenVar = this.zza;
        zzadt zzadtVarZzg = zzaenVar.zza()[0].zzg(j7);
        for (int i7 = 1; i7 < zzaenVar.zza().length; i7++) {
            zzadt zzadtVarZzg2 = zzaenVar.zza()[i7].zzg(j7);
            if (zzadtVarZzg2.zza.zzc < zzadtVarZzg.zza.zzc) {
                zzadtVarZzg = zzadtVarZzg2;
            }
        }
        return zzadtVarZzg;
    }
}
