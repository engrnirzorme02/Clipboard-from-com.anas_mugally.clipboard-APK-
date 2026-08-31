package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.C3250D;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfad implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;
    private final zzhqg zzc;

    private zzfad(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
        this.zzc = zzhqgVar3;
    }

    public static zzfad zzc(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3) {
        return new zzfad(zzhqgVar, zzhqgVar2, zzhqgVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfab zzb() {
        Context context = (Context) this.zza.zzb();
        zzfen zzfenVar = (zzfen) this.zzb.zzb();
        zzfff zzfffVar = (zzfff) this.zzc.zzb();
        zzbyq zzbyqVarZzi = ((Boolean) C3250D.m17200c().zzd(zzbci.zzgK)).booleanValue() ? C7351t.m32354l().zzo().zzi() : C7351t.m32354l().zzo().zzj();
        boolean z7 = false;
        if (zzbyqVarZzi != null && zzbyqVarZzi.zzi()) {
            z7 = true;
        }
        if (((Integer) C3250D.m17200c().zzd(zzbci.zzha)).intValue() > 0) {
            if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzgJ)).booleanValue() || z7) {
                zzffe zzffeVarZza = zzfffVar.zza(zzfev.AppOpen, context, zzfenVar, new zzeze(new zzezd()));
                zzezs zzezsVar = new zzezs(new zzezr());
                zzfer zzferVar = zzffeVarZza.zza;
                zzgpd zzgpdVar = zzbzh.zza;
                return new zzezi(zzezsVar, new zzezo(zzferVar, zzgpdVar), zzffeVarZza.zzb, zzferVar.zze().zzf, zzgpdVar);
            }
        }
        return new zzezr();
    }
}
