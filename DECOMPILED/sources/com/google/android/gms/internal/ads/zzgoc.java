package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzgoc extends zzgoe {
    zzgoc(zzgjv zzgjvVar, boolean z7) {
        super(zzgjvVar, z7);
        zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgoe
    public final /* bridge */ /* synthetic */ Object zzD(List list) {
        ArrayList arrayListZzb = zzgkp.zzb(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzgod zzgodVar = (zzgod) it.next();
            arrayListZzb.add(zzgodVar != null ? zzgodVar.zza : null);
        }
        return Collections.unmodifiableList(arrayListZzb);
    }
}
