package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3324b1;
import com.google.android.gms.ads.internal.client.C3349h2;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p157U3.InterfaceFutureC1673e;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcrw {
    private final zzdyo zza;
    private final zzfdc zzb;
    private final zzfhh zzc;
    private final zzckw zzd;
    private final zzehr zze;
    private final zzdbh zzf;
    private zzfcu zzg;
    private final zzdzw zzh;
    private final zzcuw zzi;
    private final Executor zzj;
    private final zzdzh zzk;
    private final zzeee zzl;

    zzcrw(zzdyo zzdyoVar, zzfdc zzfdcVar, zzfhh zzfhhVar, zzckw zzckwVar, zzehr zzehrVar, zzdbh zzdbhVar, zzfcu zzfcuVar, zzdzw zzdzwVar, zzcuw zzcuwVar, Executor executor, zzdzh zzdzhVar, zzeee zzeeeVar) {
        this.zza = zzdyoVar;
        this.zzb = zzfdcVar;
        this.zzc = zzfhhVar;
        this.zzd = zzckwVar;
        this.zze = zzehrVar;
        this.zzf = zzdbhVar;
        this.zzg = zzfcuVar;
        this.zzh = zzdzwVar;
        this.zzi = zzcuwVar;
        this.zzj = executor;
        this.zzk = zzdzhVar;
        this.zzl = zzeeeVar;
    }

    public final InterfaceFutureC1673e zza(InterfaceFutureC1673e interfaceFutureC1673e) {
        if (this.zzg != null) {
            zzfhh zzfhhVar = this.zzc;
            zzfhb zzfhbVar = zzfhb.SERVER_TRANSACTION;
            Objects.requireNonNull(zzfhhVar);
            return zzfgs.zza(zzgot.zza(this.zzg), zzfhbVar, zzfhhVar).zzi();
        }
        C7351t.m32356n().zzb();
        zzfgy zzfgyVarZza = this.zzc.zza(zzfhb.SERVER_TRANSACTION, interfaceFutureC1673e);
        final zzdzh zzdzhVar = this.zzk;
        Objects.requireNonNull(zzdzhVar);
        return zzfgyVarZza.zzc(new zzgob() { // from class: com.google.android.gms.internal.ads.zzcrv
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
                return zzdzhVar.zza((zzbuv) obj);
            }
        }).zzi();
    }

    public final InterfaceFutureC1673e zzb() {
        C3349h2 c3349h2 = this.zzb.zzd;
        if (c3349h2.f13944I == null && c3349h2.f13939D == null) {
            return zza(this.zzi.zzb());
        }
        zzfhh zzfhhVar = this.zzc;
        zzfhb zzfhbVar = zzfhb.PRELOADED_LOADER;
        Objects.requireNonNull(zzfhhVar);
        return zzfgs.zza(this.zza.zza(), zzfhbVar, zzfhhVar).zzi();
    }

    public final InterfaceFutureC1673e zzc(InterfaceFutureC1673e interfaceFutureC1673e) {
        zzfgy zzfgyVarZzc = this.zzc.zza(zzfhb.RENDERER, interfaceFutureC1673e).zzb(new zzfgm() { // from class: com.google.android.gms.internal.ads.zzcru
            @Override // com.google.android.gms.internal.ads.zzfgm
            public final /* synthetic */ Object zza(Object obj) {
                zzfcu zzfcuVar = (zzfcu) obj;
                this.zza.zzi(zzfcuVar);
                return zzfcuVar;
            }
        }).zzc(this.zze);
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzgb)).booleanValue()) {
            zzfgyVarZzc = zzfgyVarZzc.zzh(((Integer) C3250D.m17200c().zzd(zzbci.zzgc)).intValue(), TimeUnit.SECONDS);
        }
        return zzfgyVarZzc.zzi();
    }

    public final zzdbh zzd() {
        return this.zzf;
    }

    public final InterfaceFutureC1673e zze(final zzfey zzfeyVar) {
        zzfgo zzfgoVarZzi = this.zzc.zza(zzfhb.GET_CACHE_KEY, this.zzi.zzb()).zzc(new zzgob() { // from class: com.google.android.gms.internal.ads.zzcrt
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
                return this.zza.zzj(zzfeyVar, (zzbuv) obj);
            }
        }).zzi();
        zzgot.zzq(zzfgoVarZzi, new zzcrr(this), this.zzj);
        return zzfgoVarZzi;
    }

    public final InterfaceFutureC1673e zzf(zzbuv zzbuvVar) {
        zzfgo zzfgoVarZzi = this.zzc.zza(zzfhb.NOTIFY_CACHE_HIT, this.zzh.zzb(zzbuvVar)).zzi();
        zzgot.zzq(zzfgoVarZzi, new zzcrs(this), this.zzj);
        return zzfgoVarZzi;
    }

    public final C3324b1 zzg(Throwable th) {
        return zzfee.zzb(th, this.zzl);
    }

    public final void zzh(zzfcu zzfcuVar) {
        this.zzg = zzfcuVar;
    }

    final /* synthetic */ zzfcu zzi(zzfcu zzfcuVar) {
        this.zzd.zza(zzfcuVar);
        return zzfcuVar;
    }

    final /* synthetic */ InterfaceFutureC1673e zzj(zzfey zzfeyVar, zzbuv zzbuvVar) {
        zzbuvVar.zzi = zzfeyVar;
        return this.zzh.zza(zzbuvVar);
    }

    final /* synthetic */ zzdbh zzk() {
        return this.zzf;
    }
}
