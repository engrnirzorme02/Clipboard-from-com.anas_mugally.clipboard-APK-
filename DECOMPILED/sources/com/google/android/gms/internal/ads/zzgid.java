package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class zzgid extends zzgiu implements zzgkk {
    protected zzgid(Map map) {
        super(map);
    }

    @Override // com.google.android.gms.internal.ads.zzgiu
    final Collection zza(Collection collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // com.google.android.gms.internal.ads.zzgiu
    final Collection zzb(Object obj, Collection collection) {
        return zzg(obj, (List) collection, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgiu
    /* bridge */ /* synthetic */ Collection zzc() {
        throw null;
    }
}
