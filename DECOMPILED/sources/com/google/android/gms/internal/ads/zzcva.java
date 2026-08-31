package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcva {
    private Context zza;
    private zzfdc zzb;
    private Bundle zzc;
    private zzfcv zzd;
    private zzcut zze;
    private zzeee zzf;
    private int zzg = 0;

    public final zzcva zza(Context context) {
        this.zza = context;
        return this;
    }

    public final zzcva zzb(zzfdc zzfdcVar) {
        this.zzb = zzfdcVar;
        return this;
    }

    public final zzcva zzc(Bundle bundle) {
        this.zzc = bundle;
        return this;
    }

    public final zzcva zzd(zzcut zzcutVar) {
        this.zze = zzcutVar;
        return this;
    }

    public final zzcvb zze() {
        return new zzcvb(this, null);
    }

    public final zzcva zzf(zzfcv zzfcvVar) {
        this.zzd = zzfcvVar;
        return this;
    }

    public final zzcva zzg(zzeee zzeeeVar) {
        this.zzf = zzeeeVar;
        return this;
    }

    public final zzcva zzh(int i7) {
        this.zzg = i7;
        return this;
    }

    final /* synthetic */ Context zzi() {
        return this.zza;
    }

    final /* synthetic */ zzfdc zzj() {
        return this.zzb;
    }

    final /* synthetic */ Bundle zzk() {
        return this.zzc;
    }

    final /* synthetic */ zzfcv zzl() {
        return this.zzd;
    }

    final /* synthetic */ zzcut zzm() {
        return this.zze;
    }

    final /* synthetic */ zzeee zzn() {
        return this.zzf;
    }

    final /* synthetic */ int zzo() {
        return this.zzg;
    }
}
