package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.AbstractC3718s;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcas {
    private final Context zza;
    private final zzcbd zzb;
    private final ViewGroup zzc;
    private final zzdsm zzd;
    private zzcar zze;

    public zzcas(Context context, ViewGroup viewGroup, zzcek zzcekVar, zzdsm zzdsmVar) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = viewGroup;
        this.zzb = zzcekVar;
        this.zze = null;
        this.zzd = zzdsmVar;
    }

    public final Integer zza() {
        zzcar zzcarVar = this.zze;
        if (zzcarVar != null) {
            return zzcarVar.zzl();
        }
        return null;
    }

    public final void zzb(int i7, int i8, int i9, int i10) {
        AbstractC3718s.m18076e("The underlay may only be modified from the UI thread.");
        zzcar zzcarVar = this.zze;
        if (zzcarVar != null) {
            zzcarVar.zzn(i7, i8, i9, i10);
        }
    }

    public final void zzc(int i7, int i8, int i9, int i10, int i11, boolean z7, zzcbc zzcbcVar) {
        if (this.zze != null) {
            return;
        }
        zzcbd zzcbdVar = this.zzb;
        zzbcp.zza(zzcbdVar.zzq().zzc(), zzcbdVar.zzi(), "vpr2");
        zzcar zzcarVar = new zzcar(this.zza, zzcbdVar, i11, z7, zzcbdVar.zzq().zzc(), zzcbcVar, this.zzd);
        this.zze = zzcarVar;
        this.zzc.addView(zzcarVar, 0, new ViewGroup.LayoutParams(-1, -1));
        this.zze.zzn(i7, i8, i9, i10);
        zzcbdVar.zzds(false);
    }

    public final zzcar zzd() {
        return this.zze;
    }

    public final void zze() {
        AbstractC3718s.m18076e("onPause must be called from the UI thread.");
        zzcar zzcarVar = this.zze;
        if (zzcarVar != null) {
            zzcarVar.zzr();
        }
    }

    public final void zzf() {
        AbstractC3718s.m18076e("onDestroy must be called from the UI thread.");
        zzcar zzcarVar = this.zze;
        if (zzcarVar != null) {
            zzcarVar.zzE();
            this.zzc.removeView(this.zze);
            this.zze = null;
        }
    }

    public final void zzg(int i7) {
        zzcar zzcarVar = this.zze;
        if (zzcarVar != null) {
            zzcarVar.zzm(i7);
        }
    }
}
