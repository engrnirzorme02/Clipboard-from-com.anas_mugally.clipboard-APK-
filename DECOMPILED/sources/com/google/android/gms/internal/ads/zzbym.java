package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;
import java.util.Objects;
import p170W2.C1842g;
import p170W2.C1843h;
import p356t2.C7073a;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
final class zzbym implements Runnable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbzm zzb;

    zzbym(zzbyn zzbynVar, Context context, zzbzm zzbzmVar) {
        this.zza = context;
        this.zzb = zzbzmVar;
        Objects.requireNonNull(zzbynVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.zzc(C7073a.m31181a(this.zza));
        } catch (C1842g | C1843h | IOException | IllegalStateException e7) {
            this.zzb.zzd(e7);
            AbstractC7599p.m33329d("Exception while getting advertising Id info", e7);
        }
    }
}
