package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdgu implements zzcvs, zzdde {
    private final zzbxo zza;
    private final Context zzb;
    private final zzbxr zzc;
    private final View zzd;
    private String zze;
    private final zzbbn.zza.EnumC7681zza zzf;

    public zzdgu(zzbxo zzbxoVar, Context context, zzbxr zzbxrVar, View view, zzbbn.zza.EnumC7681zza enumC7681zza) {
        this.zza = zzbxoVar;
        this.zzb = context;
        this.zzc = zzbxrVar;
        this.zzd = view;
        this.zzf = enumC7681zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzd(zzbvh zzbvhVar, String str, String str2) {
        zzbxr zzbxrVar = this.zzc;
        Context context = this.zzb;
        if (zzbxrVar.zza(context)) {
            try {
                zzbxrVar.zzo(context, zzbxrVar.zzj(context), this.zza.zzb(), zzbvhVar.zzb(), zzbvhVar.zzc());
            } catch (RemoteException e7) {
                int i7 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33332g("Remote Exception to get reward item.", e7);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzdO() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzdx() {
        this.zza.zza(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzdy() {
        View view = this.zzd;
        if (view != null && this.zze != null) {
            this.zzc.zzg(view.getContext(), this.zze);
        }
        this.zza.zza(true);
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdde
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.zzdde
    public final void zzh() {
        zzbbn.zza.EnumC7681zza enumC7681zza = this.zzf;
        if (enumC7681zza == zzbbn.zza.EnumC7681zza.APP_OPEN) {
            return;
        }
        String strZzf = this.zzc.zzf(this.zzb);
        this.zze = strZzf;
        this.zze = String.valueOf(strZzf).concat(enumC7681zza == zzbbn.zza.EnumC7681zza.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
    }
}
