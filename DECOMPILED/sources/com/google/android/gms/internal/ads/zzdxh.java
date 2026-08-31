package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.C3431F0;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import p157U3.InterfaceFutureC1673e;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdxh {
    private final zzgpd zza;
    private final zzgpd zzb;
    private final zzdyr zzc;
    private final zzhpr zzd;

    public zzdxh(zzgpd zzgpdVar, zzgpd zzgpdVar2, zzdyr zzdyrVar, zzhpr zzhprVar) {
        this.zza = zzgpdVar;
        this.zzb = zzgpdVar2;
        this.zzc = zzdyrVar;
        this.zzd = zzhprVar;
    }

    public final InterfaceFutureC1673e zza(final zzbuv zzbuvVar) {
        InterfaceFutureC1673e interfaceFutureC1673eZzh;
        String str = zzbuvVar.zzd;
        C7351t.m32349g();
        if (C3431F0.m17412g(str)) {
            interfaceFutureC1673eZzh = zzgot.zzc(new zzdzk(1));
        } else {
            interfaceFutureC1673eZzh = zzgot.zzh(this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzdxg
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.zzb(zzbuvVar);
                }
            }), ExecutionException.class, zzdxd.zza, this.zzb);
        }
        final int callingUid = Binder.getCallingUid();
        return zzgot.zzh(interfaceFutureC1673eZzh, zzdzk.class, new zzgob() { // from class: com.google.android.gms.internal.ads.zzdxe
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
                return this.zza.zzc(zzbuvVar, callingUid, (zzdzk) obj);
            }
        }, this.zzb);
    }

    final /* synthetic */ zzdzl zzb(zzbuv zzbuvVar) {
        return (zzdzl) this.zzc.zza(zzbuvVar).get(((Integer) C3250D.m17200c().zzd(zzbci.zzgc)).intValue(), TimeUnit.SECONDS);
    }

    final /* synthetic */ InterfaceFutureC1673e zzc(final zzbuv zzbuvVar, int i7, zzdzk zzdzkVar) {
        Bundle bundle;
        if (zzbuvVar != null && (bundle = zzbuvVar.zzm) != null) {
            bundle.putBoolean("ls", true);
        }
        return zzgot.zzj(((zzeap) this.zzd.zzb()).zzb(zzbuvVar, i7), new zzgob() { // from class: com.google.android.gms.internal.ads.zzdxf
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
                return zzgot.zza(new zzdzl((InputStream) obj, zzbuvVar));
            }
        }, this.zzb);
    }
}
