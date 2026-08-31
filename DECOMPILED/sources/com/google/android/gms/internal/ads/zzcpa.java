package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONObject;
import p380w2.C7351t;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcpa implements zzhpx {
    private final zzcor zza;
    private final zzhqg zzb;
    private final zzhqg zzc;
    private final zzhqg zzd;
    private final zzhqg zze;

    private zzcpa(zzcor zzcorVar, zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4) {
        this.zza = zzcorVar;
        this.zzb = zzhqgVar;
        this.zzc = zzhqgVar2;
        this.zzd = zzhqgVar3;
        this.zze = zzhqgVar4;
    }

    public static zzcpa zza(zzcor zzcorVar, zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4) {
        return new zzcpa(zzcorVar, zzhqgVar, zzhqgVar2, zzhqgVar3, zzhqgVar4);
    }

    public static zzddr zzc(zzcor zzcorVar, final Context context, final C7584a c7584a, final zzfcj zzfcjVar, final zzfdc zzfdcVar) {
        return new zzddr(new zzcxg() { // from class: com.google.android.gms.internal.ads.zzcoq
            @Override // com.google.android.gms.internal.ads.zzcxg
            public final /* synthetic */ void zzg() {
                zzfdc zzfdcVar2 = zzfdcVar;
                JSONObject jSONObject = zzfcjVar.zzC;
                C7351t.m32361s().m17592g(context, c7584a.f30226a, jSONObject.toString(), zzfdcVar2.zzg);
            }
        }, zzbzh.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzc(this.zza, (Context) this.zzb.zzb(), ((zzchs) this.zzc).zza(), ((zzcrj) this.zzd).zza(), ((zzcvj) this.zze).zza());
    }
}
