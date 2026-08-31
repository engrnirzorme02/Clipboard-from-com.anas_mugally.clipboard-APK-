package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class zzaao implements zzbr {
    private final zzbp zza = new zzaan(false);

    public zzaao(boolean z7) {
    }

    @Override // com.google.android.gms.internal.ads.zzbr
    public final zzbt zza(Context context, zzh zzhVar, zzk zzkVar, zzbs zzbsVar, Executor executor, long j7, boolean z7) {
        try {
            return ((zzbr) Class.forName("androidx.media3.effect.SingleInputVideoGraph$Factory").getConstructor(zzbp.class).newInstance(this.zza)).zza(context, zzhVar, zzkVar, zzbsVar, executor, 0L, false);
        } catch (Exception e7) {
            throw new IllegalStateException(e7);
        }
    }
}
