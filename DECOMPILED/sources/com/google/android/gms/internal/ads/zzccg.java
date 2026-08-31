package com.google.android.gms.internal.ads;

import java.util.Objects;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
final class zzccg implements Runnable {
    final /* synthetic */ zzcci zza;

    zzccg(zzcci zzcciVar) {
        Objects.requireNonNull(zzcciVar);
        this.zza = zzcciVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7351t.m32344b().zzd(this.zza);
    }
}
