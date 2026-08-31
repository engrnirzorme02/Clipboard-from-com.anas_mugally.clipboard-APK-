package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p380w2.C7332a;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdnv implements Callable {
    private final C7332a zza;
    private final Context zzb;
    private final zzdsm zzc;
    private final zzecn zzd;
    private final Executor zze;
    private final zzauu zzf;
    private final C7584a zzg;
    private final zzfjv zzh;
    private final zzecy zzi;
    private final zzfdg zzj;

    public zzdnv(Context context, Executor executor, zzauu zzauuVar, C7584a c7584a, C7332a c7332a, zzcfa zzcfaVar, zzecn zzecnVar, zzfjv zzfjvVar, zzdsm zzdsmVar, zzecy zzecyVar, zzfdg zzfdgVar) {
        this.zzb = context;
        this.zze = executor;
        this.zzf = zzauuVar;
        this.zzg = c7584a;
        this.zza = c7332a;
        this.zzd = zzecnVar;
        this.zzh = zzfjvVar;
        this.zzc = zzdsmVar;
        this.zzi = zzecyVar;
        this.zzj = zzfdgVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzdnx zzdnxVar = new zzdnx(this);
        zzdnxVar.zza();
        return zzdnxVar;
    }

    final /* synthetic */ C7332a zza() {
        return this.zza;
    }

    final /* synthetic */ Context zzb() {
        return this.zzb;
    }

    final /* synthetic */ zzdsm zzc() {
        return this.zzc;
    }

    final /* synthetic */ zzecn zzd() {
        return this.zzd;
    }

    final /* synthetic */ Executor zze() {
        return this.zze;
    }

    final /* synthetic */ zzauu zzf() {
        return this.zzf;
    }

    final /* synthetic */ C7584a zzg() {
        return this.zzg;
    }

    final /* synthetic */ zzfjv zzh() {
        return this.zzh;
    }

    final /* synthetic */ zzecy zzi() {
        return this.zzi;
    }

    final /* synthetic */ zzfdg zzj() {
        return this.zzj;
    }
}
