package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import p044F2.C0416a;
import p044F2.C0418c;
import p404z2.C7605v;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdsr extends zzdsv {
    private final C0416a zzf;

    public zzdsr(Executor executor, C7605v c7605v, C0416a c0416a, C0418c c0418c, Context context) {
        super(executor, c7605v, c0418c, context);
        this.zzf = c0416a;
        c0416a.m1804a(this.zza);
    }

    public final Map zza() {
        return new HashMap(this.zza);
    }
}
