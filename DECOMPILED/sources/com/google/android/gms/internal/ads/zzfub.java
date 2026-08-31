package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.Objects;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
final class zzfub implements zzgob {
    final /* synthetic */ Context zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ View zzc;
    final /* synthetic */ zzfuc zzd;

    zzfub(zzfuc zzfucVar, Context context, String str, View view, Activity activity) {
        this.zza = context;
        this.zzb = str;
        this.zzc = view;
        Objects.requireNonNull(zzfucVar);
        this.zzd = zzfucVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgob
    public final /* bridge */ /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
        return this.zzd.zzg().zzd(this.zza, this.zzb, this.zzc, null);
    }
}
