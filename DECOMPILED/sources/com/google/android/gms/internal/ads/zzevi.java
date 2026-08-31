package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.privacysandbox.ads.adservices.topics.C2706h;
import androidx.privacysandbox.ads.adservices.topics.C2718t;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzevi implements zzgob {
    static final /* synthetic */ zzevi zza = new zzevi();

    private /* synthetic */ zzevi() {
    }

    @Override // com.google.android.gms.internal.ads.zzgob
    public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
        C2706h c2706h = (C2706h) obj;
        if (c2706h == null) {
            return zzgot.zza(new zzevk("", 1, null));
        }
        zzhme zzhmeVarZzc = zzhmf.zzc();
        for (C2718t c2718t : c2706h.m12819a()) {
            zzhmc zzhmcVarZzc = zzhmd.zzc();
            zzhmcVarZzc.zza(c2718t.m12834c());
            zzhmcVarZzc.zzb(c2718t.m12832a());
            zzhmcVarZzc.zzc(c2718t.m12833b());
            zzhmeVarZzc.zza((zzhmd) zzhmcVarZzc.zzbu());
        }
        return zzgot.zza(new zzevk(Base64.encodeToString(((zzhmf) zzhmeVarZzc.zzbu()).zzaN(), 1), 1, null));
    }
}
