package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.InterfaceC3312Y;
import java.util.Objects;
import p324p2.C6735b;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
final class zzbhx implements Runnable {
    final /* synthetic */ C6735b zza;
    final /* synthetic */ InterfaceC3312Y zzb;
    final /* synthetic */ zzbhy zzc;

    zzbhx(zzbhy zzbhyVar, C6735b c6735b, InterfaceC3312Y interfaceC3312Y) {
        this.zza = c6735b;
        this.zzb = interfaceC3312Y;
        Objects.requireNonNull(zzbhyVar);
        this.zzc = zzbhyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zza.m29539e(this.zzb)) {
            this.zzc.zzc();
            throw null;
        }
        AbstractC7599p.m33331f("Could not bind.");
    }
}
