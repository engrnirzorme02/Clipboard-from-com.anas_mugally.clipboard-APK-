package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Callable;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzesh implements Callable {
    static final /* synthetic */ zzesh zza = new zzesh();

    private /* synthetic */ zzesh() {
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        Bundle bundle = new Bundle();
        Runtime runtime = Runtime.getRuntime();
        bundle.putLong("runtime_free", runtime.freeMemory());
        bundle.putLong("runtime_max", runtime.maxMemory());
        bundle.putLong("runtime_total", runtime.totalMemory());
        bundle.putInt("web_view_count", C7351t.m32354l().zzl());
        return new zzesj(bundle);
    }
}
