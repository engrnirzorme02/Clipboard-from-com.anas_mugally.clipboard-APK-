package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
final class zzezx {
    private final zzfer zza;
    private final zzcuz zzb;
    private final Executor zzc;
    private zzezv zzd;

    public zzezx(zzfer zzferVar, zzcuz zzcuzVar, Executor executor) {
        this.zza = zzferVar;
        this.zzb = zzcuzVar;
        this.zzc = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzffb zzb() {
        zzfdc zzfdcVarZzb = this.zzb.zzb();
        return this.zza.zzd(zzfdcVarZzb.zzd, zzfdcVarZzb.zzg, zzfdcVarZzb.zzk);
    }

    public final InterfaceFutureC1673e zza() {
        InterfaceFutureC1673e interfaceFutureC1673eZza;
        zzezv zzezvVar = this.zzd;
        if (zzezvVar != null) {
            return zzgot.zza(zzezvVar);
        }
        if (((Boolean) zzbep.zza.zze()).booleanValue()) {
            zzgol zzgolVarZzw = zzgol.zzw(this.zzb.zza().zze(this.zza.zze()));
            zzezu zzezuVar = new zzezu(this);
            Executor executor = this.zzc;
            interfaceFutureC1673eZza = (zzgol) zzgot.zzg((zzgol) zzgot.zzk(zzgolVarZzw, zzezuVar, executor), zzdzk.class, new zzezt(this), executor);
        } else {
            zzezv zzezvVar2 = new zzezv(null, zzb(), null);
            this.zzd = zzezvVar2;
            interfaceFutureC1673eZza = zzgot.zza(zzezvVar2);
        }
        return zzgot.zzk(interfaceFutureC1673eZza, zzezw.zza, this.zzc);
    }

    final /* synthetic */ zzezv zzc() {
        return this.zzd;
    }

    final /* synthetic */ void zzd(zzezv zzezvVar) {
        this.zzd = zzezvVar;
    }
}
