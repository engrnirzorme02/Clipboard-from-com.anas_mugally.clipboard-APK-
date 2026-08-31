package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzxe implements Comparator {
    static final /* synthetic */ zzxe zza = new zzxe();

    private /* synthetic */ zzxe() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        List list = (List) obj2;
        List list2 = (List) obj;
        return zzgjp.zzg().zza((zzyc) Collections.max(list2, zzyb.zza), (zzyc) Collections.max(list, zzxw.zza), zzxx.zza).zzb(list2.size(), list.size()).zza((zzyc) Collections.max(list2, zzxy.zza), (zzyc) Collections.max(list, zzxz.zza), zzya.zza).zze();
    }
}
