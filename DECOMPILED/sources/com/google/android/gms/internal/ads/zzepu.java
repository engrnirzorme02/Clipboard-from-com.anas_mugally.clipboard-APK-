package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzepu implements zzhpx {
    public static zzepu zza() {
        return zzept.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* synthetic */ Object zzb() {
        Object arrayList = new ArrayList();
        zzbbz zzbbzVar = zzbci.zzmA;
        if (!((String) C3250D.m17200c().zzd(zzbbzVar)).isEmpty()) {
            arrayList = Arrays.asList(((String) C3250D.m17200c().zzd(zzbbzVar)).split(","));
        }
        zzhqf.zzb(arrayList);
        return arrayList;
    }
}
