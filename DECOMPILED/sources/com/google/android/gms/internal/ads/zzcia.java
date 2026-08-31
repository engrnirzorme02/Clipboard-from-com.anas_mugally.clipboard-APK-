package com.google.android.gms.internal.ads;

import android.content.Context;
import p380w2.C7351t;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcia implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzcia(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzcia zzc(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzcia(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbup zzb() {
        Context contextZza = ((zzchd) this.zza).zza();
        zzfie zzfieVar = (zzfie) this.zzb.zzb();
        zzbod zzbodVarZza = C7351t.m32364v().zza(contextZza, C7584a.m33270T(), zzfieVar);
        zzbnx zzbnxVar = zzboa.zza;
        zzbodVarZza.zza("google.afma.request.getAdDictionary", zzbnxVar, zzbnxVar);
        return new zzbur(contextZza, C7351t.m32364v().zza(contextZza, C7584a.m33270T(), zzfieVar).zza("google.afma.sdkConstants.getSdkConstants", zzbnxVar, zzbnxVar), C7584a.m33270T());
    }
}
