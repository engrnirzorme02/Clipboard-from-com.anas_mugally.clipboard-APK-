package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.util.C3431F0;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import p157U3.InterfaceFutureC1673e;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdzw {
    private final zzgpd zza;
    private final zzdzb zzb;
    private final zzhpr zzc;

    public zzdzw(zzgpd zzgpdVar, zzdzb zzdzbVar, zzhpr zzhprVar) {
        this.zza = zzgpdVar;
        this.zzb = zzdzbVar;
        this.zzc = zzhprVar;
    }

    private final InterfaceFutureC1673e zzg(final zzbuv zzbuvVar, zzdzm zzdzmVar, final zzdzm zzdzmVar2, final zzgob zzgobVar) {
        InterfaceFutureC1673e interfaceFutureC1673eZzh;
        String str = zzbuvVar.zzd;
        C7351t.m32349g();
        if (C3431F0.m17412g(str)) {
            interfaceFutureC1673eZzh = zzgot.zzc(new zzdzk(1));
        } else {
            interfaceFutureC1673eZzh = zzgot.zzh(zzdzmVar.zza(zzbuvVar), ExecutionException.class, zzdzv.zza, this.zza);
        }
        zzgpd zzgpdVar = this.zza;
        return (zzgol) zzgot.zzh((zzgol) zzgot.zzj((zzgol) zzgot.zzj(zzgol.zzw(interfaceFutureC1673eZzh), zzdzo.zza, zzgpdVar), zzgobVar, zzgpdVar), zzdzk.class, new zzgob() { // from class: com.google.android.gms.internal.ads.zzdzp
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
                return this.zza.zzc(zzdzmVar2, zzbuvVar, zzgobVar, (zzdzk) obj);
            }
        }, zzgpdVar);
    }

    public final InterfaceFutureC1673e zza(final zzbuv zzbuvVar) {
        zzgob zzgobVar = new zzgob() { // from class: com.google.android.gms.internal.ads.zzdzq
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
                String str = new String(zzgmo.zza((InputStream) obj), StandardCharsets.UTF_8);
                zzbuv zzbuvVar2 = zzbuvVar;
                zzbuvVar2.zzj = str;
                return zzgot.zza(zzbuvVar2);
            }
        };
        final zzdzb zzdzbVar = this.zzb;
        Objects.requireNonNull(zzdzbVar);
        return zzg(zzbuvVar, new zzdzm() { // from class: com.google.android.gms.internal.ads.zzdzn
            @Override // com.google.android.gms.internal.ads.zzdzm
            public final /* synthetic */ InterfaceFutureC1673e zza(zzbuv zzbuvVar2) {
                return zzdzbVar.zza(zzbuvVar2);
            }
        }, new zzdzm() { // from class: com.google.android.gms.internal.ads.zzdzr
            @Override // com.google.android.gms.internal.ads.zzdzm
            public final /* synthetic */ InterfaceFutureC1673e zza(zzbuv zzbuvVar2) {
                return this.zza.zzd(zzbuvVar2);
            }
        }, zzgobVar);
    }

    public final InterfaceFutureC1673e zzb(zzbuv zzbuvVar) {
        return zzg(zzbuvVar, new zzdzm() { // from class: com.google.android.gms.internal.ads.zzdzt
            @Override // com.google.android.gms.internal.ads.zzdzm
            public final /* synthetic */ InterfaceFutureC1673e zza(zzbuv zzbuvVar2) {
                return this.zza.zze(zzbuvVar2);
            }
        }, new zzdzm() { // from class: com.google.android.gms.internal.ads.zzdzu
            @Override // com.google.android.gms.internal.ads.zzdzm
            public final /* synthetic */ InterfaceFutureC1673e zza(zzbuv zzbuvVar2) {
                return this.zza.zzf(zzbuvVar2);
            }
        }, zzdzs.zza);
    }

    final /* synthetic */ InterfaceFutureC1673e zzc(zzdzm zzdzmVar, zzbuv zzbuvVar, zzgob zzgobVar, zzdzk zzdzkVar) {
        return zzgot.zzj(zzdzmVar.zza(zzbuvVar), zzgobVar, this.zza);
    }

    final /* synthetic */ InterfaceFutureC1673e zzd(zzbuv zzbuvVar) {
        return ((zzeap) this.zzc.zzb()).zzc(zzbuvVar, Binder.getCallingUid());
    }

    final /* synthetic */ InterfaceFutureC1673e zze(zzbuv zzbuvVar) {
        return this.zzb.zzd(zzbuvVar.zzh);
    }

    final /* synthetic */ InterfaceFutureC1673e zzf(zzbuv zzbuvVar) {
        return ((zzeap) this.zzc.zzb()).zzd(zzbuvVar.zzh);
    }
}
