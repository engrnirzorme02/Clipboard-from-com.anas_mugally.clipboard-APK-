package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONObject;
import p380w2.C7351t;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdfl implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;
    private final zzhqg zzc;
    private final zzhqg zzd;

    private zzdfl(zzdfe zzdfeVar, zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
        this.zzc = zzhqgVar3;
        this.zzd = zzhqgVar4;
    }

    public static zzdfl zza(zzdfe zzdfeVar, zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4) {
        return new zzdfl(zzdfeVar, zzhqgVar, zzhqgVar2, zzhqgVar3, zzhqgVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.zza.zzb();
        final C7584a c7584aZza = ((zzchs) this.zzb).zza();
        final zzfcj zzfcjVarZza = ((zzcrj) this.zzc).zza();
        final zzfdc zzfdcVarZza = ((zzcvj) this.zzd).zza();
        return new zzddr(new zzcxg() { // from class: com.google.android.gms.internal.ads.zzdfd
            @Override // com.google.android.gms.internal.ads.zzcxg
            public final /* synthetic */ void zzg() {
                zzfdc zzfdcVar = zzfdcVarZza;
                JSONObject jSONObject = zzfcjVarZza.zzC;
                C7351t.m32361s().m17592g(context, c7584aZza.f30226a, jSONObject.toString(), zzfdcVar.zzg);
            }
        }, zzbzh.zzg);
    }
}
