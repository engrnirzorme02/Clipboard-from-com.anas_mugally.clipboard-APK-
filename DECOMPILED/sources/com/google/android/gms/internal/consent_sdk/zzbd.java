package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbd implements zzdo {
    private final zzdr zza;
    private final zzdr zzb;
    private final zzdr zzc;
    private final zzdr zzd;
    private final zzdr zze;
    private final zzdr zzf;

    public zzbd(zzdr zzdrVar, zzdr zzdrVar2, zzdr zzdrVar3, zzdr zzdrVar4, zzdr zzdrVar5, zzdr zzdrVar6) {
        this.zza = zzdrVar;
        this.zzb = zzdrVar2;
        this.zzc = zzdrVar3;
        this.zzd = zzdrVar4;
        this.zze = zzdrVar5;
        this.zzf = zzdrVar6;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdt, com.google.android.gms.internal.consent_sdk.zzds
    public final /* bridge */ /* synthetic */ Object zza() {
        return new zzbc((Application) this.zza.zza(), (zzad) this.zzb.zza(), (zzbx) this.zzc.zza(), (zzaq) this.zzd.zza(), (zzbq) this.zze.zza(), this.zzf);
    }
}
