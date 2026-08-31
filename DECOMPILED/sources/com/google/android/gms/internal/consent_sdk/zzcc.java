package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcc implements zzdo {
    private final zzdr zza;
    private final zzdr zzb;
    private final zzdr zzc;
    private final zzdr zzd;
    private final zzdr zze;
    private final zzdr zzf;

    public zzcc(zzdr zzdrVar, zzdr zzdrVar2, zzdr zzdrVar3, zzdr zzdrVar4, zzdr zzdrVar5, zzdr zzdrVar6, zzdr zzdrVar7, zzdr zzdrVar8) {
        this.zza = zzdrVar;
        this.zzb = zzdrVar2;
        this.zzc = zzdrVar5;
        this.zzd = zzdrVar6;
        this.zze = zzdrVar7;
        this.zzf = zzdrVar8;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdt, com.google.android.gms.internal.consent_sdk.zzds
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzcb zza() {
        return new zzcb((Application) this.zza.zza(), (zzbx) this.zzb.zza(), zzat.zzb(), zzav.zzb(), (zze) this.zzc.zza(), ((zzap) this.zzd).zza(), (zzbc) this.zze.zza(), (zzaq) this.zzf.zza());
    }
}
