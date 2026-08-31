package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.C3349h2;
import com.google.android.gms.ads.internal.client.InterfaceC3328c1;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzelt {
    private final zzely zza;
    private final String zzb;
    private InterfaceC3328c1 zzc;

    public zzelt(zzely zzelyVar, String str) {
        this.zza = zzelyVar;
        this.zzb = str;
    }

    public final synchronized boolean zza() {
        return this.zza.zzb();
    }

    public final synchronized void zzb(C3349h2 c3349h2, int i7) {
        this.zzc = null;
        zzelz zzelzVar = new zzelz(i7);
        zzels zzelsVar = new zzels(this);
        this.zza.zza(c3349h2, this.zzb, zzelzVar, zzelsVar);
    }

    public final synchronized String zzc() {
        InterfaceC3328c1 interfaceC3328c1;
        try {
            interfaceC3328c1 = this.zzc;
        } catch (RemoteException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
            return null;
        }
        return interfaceC3328c1 != null ? interfaceC3328c1.zze() : null;
    }

    public final synchronized String zzd() {
        InterfaceC3328c1 interfaceC3328c1;
        try {
            interfaceC3328c1 = this.zzc;
        } catch (RemoteException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
            return null;
        }
        return interfaceC3328c1 != null ? interfaceC3328c1.zze() : null;
    }

    final /* synthetic */ void zze(InterfaceC3328c1 interfaceC3328c1) {
        this.zzc = interfaceC3328c1;
    }
}
