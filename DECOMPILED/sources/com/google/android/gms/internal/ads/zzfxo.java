package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfxo {
    private final zzgpd zza;
    private final zzfxt zzb;
    private final Set zzc;
    private final String zzd;
    private final zzarw zze;
    private final zzfym zzf;
    private final zzgea zzg;

    zzfxo(zzgpd zzgpdVar, zzfxt zzfxtVar, zzfym zzfymVar, zzfvd zzfvdVar, String str, zzarw zzarwVar, zzhqm zzhqmVar, zzhqm zzhqmVar2, zzhqm zzhqmVar3, zzgea zzgeaVar) {
        this.zza = zzgpdVar;
        this.zzb = zzfxtVar;
        this.zzd = str;
        this.zzf = zzfymVar;
        this.zze = zzarwVar;
        this.zzg = zzgeaVar;
        int iOrdinal = zzfvdVar.ordinal();
        if (iOrdinal == 0) {
            this.zzc = ((zzhqj) zzhqmVar).zzb();
        } else if (iOrdinal == 1) {
            this.zzc = ((zzhqj) zzhqmVar2).zzb();
        } else {
            if (iOrdinal != 2) {
                throw new IllegalStateException();
            }
            this.zzc = ((zzhqj) zzhqmVar3).zzb();
        }
    }

    final InterfaceFutureC1673e zza() {
        if (!this.zzb.zzc()) {
            return zzgot.zza(Integer.toString(7));
        }
        if (!this.zzf.zzb()) {
            return zzgot.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzfxn
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.zzb();
                }
            }, this.zza);
        }
        Set set = this.zzc;
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(this.zza.submit((zzfzp) it.next()));
        }
        return zzgot.zzm(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzfxl
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        }, zzgpk.zza());
    }

    final /* synthetic */ String zzb() {
        return this.zzb.zzg(16384, this.zzd);
    }

    final /* synthetic */ String zzc() {
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzfxm
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzd();
            }
        };
        zzgdy zzgdyVarZza = this.zzg.zza(101);
        try {
            zzgdyVarZza.zza();
            Object objCall = callable.call();
            zzgdyVarZza.zzc();
            return (String) objCall;
        } catch (Throwable th) {
            try {
                zzgdyVarZza.zzb(th);
                throw th;
            } catch (Throwable th2) {
                zzgdyVarZza.zzc();
                throw th2;
            }
        }
    }

    final /* synthetic */ String zzd() {
        zzast zzastVar = (zzast) this.zze.zzbu();
        String str = this.zzd;
        zzfxt zzfxtVar = this.zzb;
        try {
            return Base64.encodeToString(((zzatk) zzfxtVar.zzf(zzastVar.zzaN(), str).zzbu()).zzaN(), 11);
        } catch (IllegalArgumentException unused) {
            return zzfxtVar.zzg(4096, str);
        }
    }
}
