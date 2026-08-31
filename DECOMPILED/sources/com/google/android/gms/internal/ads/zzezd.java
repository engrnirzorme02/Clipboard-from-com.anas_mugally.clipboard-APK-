package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.Executor;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzezd implements zzfab {
    private zzcuz zza;
    private final Executor zzb = zzgpk.zza();

    public final zzcuz zza() {
        return this.zza;
    }

    public final InterfaceFutureC1673e zzb(zzfac zzfacVar, zzfaa zzfaaVar, zzcuz zzcuzVar) {
        zzcuy zzcuyVarZza = zzfaaVar.zza(zzfacVar.zzb);
        zzcuyVarZza.zzj(new zzfaf(true));
        zzcuz zzcuzVar2 = (zzcuz) zzcuyVarZza.zzh();
        this.zza = zzcuzVar2;
        final zzcrw zzcrwVarZza = zzcuzVar2.zza();
        final zzffa zzffaVar = new zzffa();
        zzgol zzgolVarZzw = zzgol.zzw(zzcrwVarZza.zzb());
        zzgob zzgobVar = new zzgob(this) { // from class: com.google.android.gms.internal.ads.zzezc
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
                zzfcu zzfcuVar = (zzfcu) obj;
                zzffaVar.zzb = zzfcuVar;
                Iterator it = zzfcuVar.zzb.zza.iterator();
                boolean z7 = false;
                while (it.hasNext()) {
                    Iterator it2 = ((zzfcj) it.next()).zza.iterator();
                    while (it2.hasNext()) {
                        if (!((String) it2.next()).contains("FirstPartyRenderer")) {
                            return zzgot.zza(null);
                        }
                        z7 = true;
                    }
                }
                if (z7) {
                    return zzcrwVarZza.zzc(zzgot.zza(zzfcuVar));
                }
                return zzgot.zza(null);
            }
        };
        Executor executor = this.zzb;
        return (zzgol) zzgot.zzk((zzgol) zzgot.zzj(zzgolVarZzw, zzgobVar, executor), new zzggr() { // from class: com.google.android.gms.internal.ads.zzezb
            @Override // com.google.android.gms.internal.ads.zzggr
            public final /* synthetic */ Object apply(Object obj) {
                zzffa zzffaVar2 = zzffaVar;
                zzffaVar2.zzc = (zzcqs) obj;
                return zzffaVar2;
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzfab
    public final /* bridge */ /* synthetic */ InterfaceFutureC1673e zzc(zzfac zzfacVar, zzfaa zzfaaVar, Object obj) {
        return zzb(zzfacVar, zzfaaVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfab
    public final /* synthetic */ Object zzd() {
        return this.zza;
    }
}
