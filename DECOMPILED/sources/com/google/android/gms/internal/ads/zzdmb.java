package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzdmb implements zzggr {
    static final /* synthetic */ zzdmb zza = new zzdmb();

    private /* synthetic */ zzdmb() {
    }

    @Override // com.google.android.gms.internal.ads.zzggr
    public final /* synthetic */ Object apply(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (zzbfh zzbfhVar : (List) obj) {
            if (zzbfhVar != null) {
                arrayList.add(zzbfhVar);
            }
        }
        return arrayList;
    }
}
