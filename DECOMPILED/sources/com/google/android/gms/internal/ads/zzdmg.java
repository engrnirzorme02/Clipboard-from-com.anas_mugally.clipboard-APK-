package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzdmg implements zzggr {
    static final /* synthetic */ zzdmg zza = new zzdmg();

    private /* synthetic */ zzdmg() {
    }

    @Override // com.google.android.gms.internal.ads.zzggr
    public final /* synthetic */ Object apply(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (zzdme zzdmeVar : (List) obj) {
            if (zzdmeVar != null) {
                arrayList.add(zzdmeVar);
            }
        }
        return arrayList;
    }
}
