package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
final class zzbva implements Callable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbvc zzb;

    zzbva(zzbvc zzbvcVar, Context context) {
        this.zza = context;
        Objects.requireNonNull(zzbvcVar);
        this.zzb = zzbvcVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0038  */
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzbuz zzbuzVarZza;
        zzbvc zzbvcVar = this.zzb;
        WeakHashMap weakHashMapZzb = zzbvcVar.zzb();
        Context context = this.zza;
        zzbvb zzbvbVar = (zzbvb) weakHashMapZzb.get(context);
        if (zzbvbVar != null) {
            if (zzbvbVar.zza + ((Long) zzbdx.zzd.zze()).longValue() < C7351t.m32357o().mo18159a()) {
                zzbuzVarZza = new zzbuy(context).zza();
            } else {
                zzbuzVarZza = new zzbuy(context, zzbvbVar.zzb).zza();
            }
        } else {
            zzbuzVarZza = new zzbuy(context).zza();
        }
        zzbvcVar.zzb().put(context, new zzbvb(zzbvcVar, zzbuzVarZza));
        return zzbuzVarZza;
    }
}
