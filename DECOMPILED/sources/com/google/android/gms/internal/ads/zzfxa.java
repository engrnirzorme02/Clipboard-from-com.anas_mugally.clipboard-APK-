package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.View;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
final class zzfxa implements zzfwn {
    private final ExecutorService zza;
    private final zzhpr zzb;
    private final zzhpr zzc;
    private final zzgcx zzd;
    private final zzhpr zze;
    private final zzhqm zzf;
    private final zzfui zzg;

    zzfxa(ExecutorService executorService, zzhpr zzhprVar, zzhpr zzhprVar2, zzgcx zzgcxVar, zzhpr zzhprVar3, zzhqm zzhqmVar, zzfui zzfuiVar) {
        this.zza = executorService;
        this.zzb = zzhprVar;
        this.zzc = zzhprVar2;
        this.zzd = zzgcxVar;
        this.zze = zzhprVar3;
        this.zzf = zzhqmVar;
        this.zzg = zzfuiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final String zza() {
        return "1.794714348";
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final InterfaceFutureC1673e zzb() {
        return zzgot.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzfwz
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                this.zza.zzh();
                return null;
            }
        }, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final InterfaceFutureC1673e zzc(Context context) {
        zzfxq zzfxqVarZzh = ((zzfxq) this.zzf.zzb()).zzh(context);
        zzfxqVarZzh.zzd(this.zzd.zzb());
        zzfxqVarZzh.zzc(zzast.zzi());
        zzfxqVarZzh.zzb(zzfvd.QUERY);
        return zzfxqVarZzh.zza().zza().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final InterfaceFutureC1673e zzd(Context context, String str, View view, Activity activity) {
        zzfxq zzfxqVarZzh = ((zzfxq) this.zzf.zzb()).zzh(context);
        zzfxqVarZzh.zzg(view);
        zzfxqVarZzh.zzf(activity);
        zzfxqVarZzh.zze(true != this.zzg.zze() ? "" : null);
        zzfxqVarZzh.zzd(this.zzd.zzc(context, view));
        zzfxqVarZzh.zzc(zzast.zzi());
        zzfxqVarZzh.zzb(zzfvd.VIEW);
        return zzfxqVarZzh.zza().zza().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final InterfaceFutureC1673e zze(Context context, String str, View view, Activity activity) {
        zzhpr zzhprVar = this.zze;
        Map mapZzd = this.zzd.zzd();
        ((zzfxi) zzhprVar.zzb()).zzb(mapZzd);
        zzfxq zzfxqVarZzh = ((zzfxq) this.zzf.zzb()).zzh(context);
        zzfxqVarZzh.zzg(view);
        zzfxqVarZzh.zzf(null);
        zzfxqVarZzh.zze(str);
        zzfxqVarZzh.zzd(mapZzd);
        zzfxqVarZzh.zzb(zzfvd.CLICK);
        zzfxqVarZzh.zzc(zzast.zzi());
        return zzfxqVarZzh.zza().zza().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final void zzf(InputEvent inputEvent) {
        if (inputEvent instanceof MotionEvent) {
            ((zzfxi) this.zze.zzb()).zza((MotionEvent) inputEvent);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final int zzg() {
        return 2;
    }

    final /* synthetic */ Void zzh() {
        ((zzfxt) this.zzc.zzb()).zza();
        ((zzfym) this.zzb.zzb()).zza();
        return null;
    }
}
