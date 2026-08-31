package com.google.android.gms.internal.p411firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzahn {
    private List<zzahk> zza;

    public zzahn() {
        this.zza = new ArrayList();
    }

    public final List<zzahk> zza() {
        return this.zza;
    }

    public zzahn(List<zzahk> list) {
        this.zza = Collections.unmodifiableList(list);
    }
}
