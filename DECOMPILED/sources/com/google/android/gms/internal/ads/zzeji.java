package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Objects;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeji implements zzedz {
    private final Context zza;
    private final zzcpp zzb;
    private final zzbdd zzc;
    private final zzgpd zzd;
    private final zzfhh zze;

    public zzeji(Context context, zzcpp zzcppVar, zzfhh zzfhhVar, zzgpd zzgpdVar, zzbdd zzbddVar) {
        this.zza = context;
        this.zzb = zzcppVar;
        this.zze = zzfhhVar;
        this.zzd = zzgpdVar;
        this.zzc = zzbddVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedz
    public final boolean zza(zzfcu zzfcuVar, zzfcj zzfcjVar) {
        zzfco zzfcoVar;
        return (this.zzc == null || (zzfcoVar = zzfcjVar.zzs) == null || zzfcoVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzedz
    public final InterfaceFutureC1673e zzb(zzfcu zzfcuVar, zzfcj zzfcjVar) {
        zzeje zzejeVar = new zzeje(this, new View(this.zza), null, zzejg.zza, (zzfck) zzfcjVar.zzu.get(0));
        zzcol zzcolVarZzf = this.zzb.zzf(new zzcri(zzfcuVar, zzfcjVar, null), zzejeVar);
        zzejh zzejhVarZzl = zzcolVarZzf.zzl();
        zzfco zzfcoVar = zzfcjVar.zzs;
        final zzbcy zzbcyVar = new zzbcy(zzejhVarZzl, zzfcoVar.zzb, zzfcoVar.zza);
        zzfhb zzfhbVar = zzfhb.CUSTOM_RENDER_SYN;
        zzfhh zzfhhVar = this.zze;
        Objects.requireNonNull(zzfhhVar);
        return zzfgs.zzd(new zzfgn() { // from class: com.google.android.gms.internal.ads.zzejf
            @Override // com.google.android.gms.internal.ads.zzfgn
            public final /* synthetic */ void zza() {
                this.zza.zzc(zzbcyVar);
            }
        }, this.zzd, zzfhbVar, zzfhhVar).zzj(zzfhb.CUSTOM_RENDER_ACK).zze(zzgot.zza(zzcolVarZzf.zzi())).zzi();
    }

    final /* synthetic */ void zzc(zzbcy zzbcyVar) {
        this.zzc.zze(zzbcyVar);
    }
}
