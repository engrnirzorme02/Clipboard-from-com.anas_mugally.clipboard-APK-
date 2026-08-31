package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzenv implements zzggr {
    static final /* synthetic */ zzenv zza = new zzenv();

    private /* synthetic */ zzenv() {
    }

    @Override // com.google.android.gms.internal.ads.zzggr
    public final /* synthetic */ Object apply(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        if (true == arrayList.isEmpty()) {
            arrayList = null;
        }
        return new zzenx(arrayList);
    }
}
