package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import java.util.Objects;
import p396y2.InterfaceC7516d;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdoc {
    private final zzcvq zza;
    private final zzcwz zzb;
    private final zzcxm zzc;
    private final zzcyd zzd;
    private final zzdaw zze;
    private final zzddx zzf;
    private final zzdsm zzg;
    private final zzfjv zzh;
    private final zzecn zzi;
    private final zzcmi zzj;

    zzdoc(zzcvq zzcvqVar, zzcwz zzcwzVar, zzcxm zzcxmVar, zzcyd zzcydVar, zzdaw zzdawVar, zzddx zzddxVar, zzdsm zzdsmVar, zzfjv zzfjvVar, zzecn zzecnVar, zzcmi zzcmiVar) {
        this.zza = zzcvqVar;
        this.zzb = zzcwzVar;
        this.zzc = zzcxmVar;
        this.zzd = zzcydVar;
        this.zze = zzdawVar;
        this.zzf = zzddxVar;
        this.zzg = zzdsmVar;
        this.zzh = zzfjvVar;
        this.zzi = zzecnVar;
        this.zzj = zzcmiVar;
    }

    public final void zza(zzdod zzdodVar, zzcek zzcekVar) throws Throwable {
        zzdoa zzdoaVarZzb = zzdodVar.zzb();
        final zzcwz zzcwzVar = this.zzb;
        Objects.requireNonNull(zzcwzVar);
        zzdoaVarZzb.zzn(this.zza, this.zzc, this.zzd, this.zze, new InterfaceC7516d() { // from class: com.google.android.gms.internal.ads.zzdob
            @Override // p396y2.InterfaceC7516d
            public final /* synthetic */ void zzl() {
                zzcwzVar.zzb();
            }
        }, this.zzf);
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzkW)).booleanValue() || zzcekVar == null || zzcekVar.zzP() == null) {
            return;
        }
        zzcgi zzcgiVarZzP = zzcekVar.zzP();
        zzcmi zzcmiVar = this.zzj;
        zzecn zzecnVar = this.zzi;
        zzcgiVarZzP.zzd(zzcmiVar, zzecnVar, this.zzh);
        zzcgiVarZzP.zze(zzcmiVar, zzecnVar, this.zzg);
    }
}
