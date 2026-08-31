package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class zzgkg extends zzgic {
    final /* synthetic */ Iterator zza;
    final /* synthetic */ zzghd zzb;

    zzgkg(Iterator it, zzghd zzghdVar) {
        this.zza = it;
        this.zzb = zzghdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgic
    protected final Object zza() {
        zzghd zzghdVar;
        Object next;
        do {
            Iterator it = this.zza;
            if (!it.hasNext()) {
                zzb();
                return null;
            }
            zzghdVar = this.zzb;
            next = it.next();
        } while (!zzghdVar.zza(next));
        return next;
    }
}
