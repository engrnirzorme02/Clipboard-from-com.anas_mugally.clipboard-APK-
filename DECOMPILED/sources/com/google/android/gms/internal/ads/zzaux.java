package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaux {
    private final InterfaceFutureC1673e zza;

    public zzaux(final Context context, Executor executor) {
        this.zza = zzgot.zzd(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzauw
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                Context context2 = context;
                try {
                    return zzfoo.zza(context2, context2.getPackageName(), Integer.toString(context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode));
                } catch (Throwable unused) {
                    return null;
                }
            }
        }, executor);
    }

    public final InterfaceFutureC1673e zza() {
        return this.zza;
    }
}
