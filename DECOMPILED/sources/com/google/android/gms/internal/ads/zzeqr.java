package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.C3431F0;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeqr implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzeqr(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzeqr zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzeqr(zzhqgVar, zzhqgVar2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0030  */
    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgke zzgkeVarZzh;
        zzerp zzerpVarZzb = ((zzerr) this.zza).zzb();
        Context contextZza = ((zzchd) this.zzb).zza();
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzmh)).booleanValue()) {
            C7351t.m32349g();
            if (C3431F0.m17410f(contextZza)) {
                zzgkeVarZzh = zzgke.zzi(zzerpVarZzb);
            } else {
                zzgkeVarZzh = zzgke.zzh();
            }
        } else {
            zzgkeVarZzh = zzgke.zzh();
        }
        zzhqf.zzb(zzgkeVarZzh);
        return zzgkeVarZzh;
    }
}
