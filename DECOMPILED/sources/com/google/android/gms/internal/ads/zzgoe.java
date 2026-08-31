package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzgoe extends zzgnv {
    private List zza;

    zzgoe(zzgjv zzgjvVar, boolean z7) {
        super(zzgjvVar, z7, true);
        List listZzb = zzgjvVar.isEmpty() ? Collections.EMPTY_LIST : zzgkp.zzb(zzgjvVar.size());
        for (int i7 = 0; i7 < zzgjvVar.size(); i7++) {
            listZzb.add(null);
        }
        this.zza = listZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgnv
    final void zzA(int i7) {
        super.zzA(i7);
        this.zza = null;
    }

    abstract Object zzD(List list);

    @Override // com.google.android.gms.internal.ads.zzgnv
    final void zzw(int i7, Object obj) {
        List list = this.zza;
        if (list != null) {
            list.set(i7, new zzgod(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgnv
    final void zzx() {
        List list = this.zza;
        if (list != null) {
            zza(zzD(list));
        }
    }
}
