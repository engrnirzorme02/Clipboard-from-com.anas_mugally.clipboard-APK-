package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p157U3.InterfaceFutureC1673e;
import p404z2.C7605v;
import p404z2.C7606w;
import p404z2.EnumC7604u;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfjv {
    private final Context zza;
    private final Executor zzb;
    private final zzgpe zzc;
    private final C7605v zzd;
    private final zzfjn zze;
    private final zzfie zzf;

    zzfjv(Context context, Executor executor, zzgpe zzgpeVar, C7605v c7605v, zzfjn zzfjnVar, zzfie zzfieVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzgpeVar;
        this.zzd = c7605v;
        this.zze = zzfjnVar;
        this.zzf = zzfieVar;
    }

    public final void zza(List list, C7606w c7606w) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((String) it.next(), c7606w, null, null);
        }
    }

    public final void zzb(final String str, C7606w c7606w, zzfib zzfibVar, zzcyh zzcyhVar) {
        InterfaceFutureC1673e interfaceFutureC1673eSubmit;
        zzfhr zzfhrVarZzn = null;
        if (zzfie.zza() && ((Boolean) zzbeb.zzd.zze()).booleanValue()) {
            zzfhrVarZzn = zzfhr.zzn(this.zza, 14);
            zzfhrVarZzn.zza();
        }
        if (c7606w != null) {
            interfaceFutureC1673eSubmit = new zzfjm(c7606w.m33345a(), this.zzd, this.zzc, this.zze).zza(str);
        } else {
            interfaceFutureC1673eSubmit = this.zzc.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfju
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.zzc(str);
                }
            });
        }
        zzgot.zzq(interfaceFutureC1673eSubmit, new zzfjt(this, zzfhrVarZzn, zzfibVar, zzcyhVar), this.zzb);
    }

    final /* synthetic */ EnumC7604u zzc(String str) {
        return this.zzd.zza(str);
    }

    final /* synthetic */ C7605v zzd() {
        return this.zzd;
    }

    final /* synthetic */ zzfie zze() {
        return this.zzf;
    }
}
