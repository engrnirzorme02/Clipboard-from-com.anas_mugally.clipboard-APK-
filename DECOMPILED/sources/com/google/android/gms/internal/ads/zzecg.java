package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.Objects;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
final class zzecg implements zzgoq {
    final /* synthetic */ zzfgm zza;

    zzecg(zzecn zzecnVar, zzfgm zzfgmVar) {
        this.zza = zzfgmVar;
        Objects.requireNonNull(zzecnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        String strValueOf = String.valueOf(th.getMessage());
        int i7 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33328c("Failed to get offline buffered ping database: ".concat(strValueOf));
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zza.zza((SQLiteDatabase) obj);
        } catch (Exception e7) {
            String strValueOf = String.valueOf(e7.getMessage());
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33328c("Error executing function on offline buffered ping database: ".concat(strValueOf));
        }
    }
}
