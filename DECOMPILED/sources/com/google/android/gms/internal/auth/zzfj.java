package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes2.dex */
final class zzfj extends zzfl {
    /* synthetic */ zzfj(zzfi zzfiVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.auth.zzfl
    final void zza(Object obj, long j7) {
        ((zzez) zzhj.zzf(obj, j7)).zzb();
    }

    @Override // com.google.android.gms.internal.auth.zzfl
    final void zzb(Object obj, Object obj2, long j7) {
        zzez zzezVarZzd = (zzez) zzhj.zzf(obj, j7);
        zzez zzezVar = (zzez) zzhj.zzf(obj2, j7);
        int size = zzezVarZzd.size();
        int size2 = zzezVar.size();
        if (size > 0 && size2 > 0) {
            if (!zzezVarZzd.zzc()) {
                zzezVarZzd = zzezVarZzd.zzd(size2 + size);
            }
            zzezVarZzd.addAll(zzezVar);
        }
        if (size > 0) {
            zzezVar = zzezVarZzd;
        }
        zzhj.zzp(obj, j7, zzezVar);
    }

    private zzfj() {
        super(null);
    }
}
