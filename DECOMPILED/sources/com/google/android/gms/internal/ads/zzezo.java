package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzezo implements zzfab {
    private final zzfer zza;
    private final Executor zzb;
    private final zzgoq zzc = new zzezl(this);

    public zzezo(zzfer zzferVar, Executor executor) {
        this.zza = zzferVar;
        this.zzb = executor;
    }

    public final InterfaceFutureC1673e zza(zzfac zzfacVar, zzfaa zzfaaVar, final zzcuz zzcuzVar) {
        zzfer zzferVar = this.zza;
        Executor executor = this.zzb;
        return (zzgol) zzgot.zzg((zzgol) zzgot.zzj(zzgol.zzw(new zzezx(zzferVar, zzcuzVar, executor).zza()), new zzgob() { // from class: com.google.android.gms.internal.ads.zzezm
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
                return this.zza.zzb(zzcuzVar, (zzezv) obj);
            }
        }, executor), Exception.class, new zzezk(this), executor);
    }

    final /* synthetic */ InterfaceFutureC1673e zzb(zzcuz zzcuzVar, zzezv zzezvVar) {
        zzfer zzferVar = this.zza;
        zzffb zzffbVar = zzezvVar.zzb;
        zzbuv zzbuvVar = zzezvVar.zza;
        zzffa zzffaVarZza = zzferVar.zza(zzffbVar);
        if (zzffaVarZza != null && zzbuvVar != null) {
            zzgot.zzq(zzcuzVar.zza().zzf(zzbuvVar), this.zzc, this.zzb);
        }
        return zzgot.zza(new zzezn(zzffbVar, zzbuvVar, zzffaVarZza));
    }

    @Override // com.google.android.gms.internal.ads.zzfab
    public final /* bridge */ /* synthetic */ InterfaceFutureC1673e zzc(zzfac zzfacVar, zzfaa zzfaaVar, Object obj) {
        return zza(zzfacVar, zzfaaVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfab
    public final /* bridge */ /* synthetic */ Object zzd() {
        return null;
    }
}
