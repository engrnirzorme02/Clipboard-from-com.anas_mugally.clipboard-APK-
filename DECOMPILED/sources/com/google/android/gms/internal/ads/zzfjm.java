package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.internal.client.C3250D;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import p157U3.InterfaceFutureC1673e;
import p404z2.AbstractC7608y;
import p404z2.C7605v;
import p404z2.EnumC7604u;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfjm {
    private final AbstractC7608y zza;
    private final C7605v zzb;
    private final zzgpe zzc;
    private final zzfjn zzd;

    public zzfjm(AbstractC7608y abstractC7608y, C7605v c7605v, zzgpe zzgpeVar, zzfjn zzfjnVar) {
        this.zza = abstractC7608y;
        this.zzb = c7605v;
        this.zzc = zzgpeVar;
        this.zzd = zzfjnVar;
    }

    private final InterfaceFutureC1673e zze(final String str, final long j7, final int i7) {
        final String string;
        AbstractC7608y abstractC7608y = this.zza;
        if (i7 > abstractC7608y.mo33322a()) {
            zzfjn zzfjnVar = this.zzd;
            if (zzfjnVar == null || !abstractC7608y.mo33325d()) {
                return zzgot.zza(EnumC7604u.RETRIABLE_FAILURE);
            }
            zzfjnVar.zza(str, "", 2);
            return zzgot.zza(EnumC7604u.BUFFERED);
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzjp)).booleanValue()) {
            Uri uri = Uri.parse(str);
            String encodedQuery = uri.getEncodedQuery();
            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
            builderClearQuery.appendQueryParameter("pa", Integer.toString(i7));
            String strValueOf = String.valueOf(builderClearQuery.build());
            StringBuilder sb = new StringBuilder(strValueOf.length() + 1 + String.valueOf(encodedQuery).length());
            sb.append(strValueOf);
            sb.append("&");
            sb.append(encodedQuery);
            string = sb.toString();
        } else {
            string = str;
        }
        zzgob zzgobVar = new zzgob() { // from class: com.google.android.gms.internal.ads.zzfjl
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
                return this.zza.zzb(i7, j7, str, (EnumC7604u) obj);
            }
        };
        if (j7 == 0) {
            zzgpe zzgpeVar = this.zzc;
            return zzgot.zzj(zzgpeVar.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfjk
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.zzd(string);
                }
            }), zzgobVar, zzgpeVar);
        }
        zzgpe zzgpeVar2 = this.zzc;
        return zzgot.zzj(zzgpeVar2.schedule(new Callable() { // from class: com.google.android.gms.internal.ads.zzfjj
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc(string);
            }
        }, j7, TimeUnit.MILLISECONDS), zzgobVar, zzgpeVar2);
    }

    public final InterfaceFutureC1673e zza(String str) {
        try {
            return zze(str, 0L, 1);
        } catch (NullPointerException | RejectedExecutionException unused) {
            return zzgot.zza(EnumC7604u.PERMANENT_FAILURE);
        }
    }

    final /* synthetic */ InterfaceFutureC1673e zzb(int i7, long j7, String str, EnumC7604u enumC7604u) {
        if (enumC7604u != EnumC7604u.RETRIABLE_FAILURE) {
            return zzgot.zza(enumC7604u);
        }
        AbstractC7608y abstractC7608y = this.zza;
        long jMo33323b = abstractC7608y.mo33323b();
        if (i7 != 1) {
            jMo33323b = (long) (abstractC7608y.mo33324c() * j7);
        }
        return zze(str, jMo33323b, i7 + 1);
    }

    final /* synthetic */ EnumC7604u zzc(String str) {
        return this.zzb.zza(str);
    }

    final /* synthetic */ EnumC7604u zzd(String str) {
        return this.zzb.zza(str);
    }
}
