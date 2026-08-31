package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbft;
import com.google.android.gms.internal.ads.zzbgq;
import p314o2.C6573y;
import p314o2.InterfaceC6562n;
import p404z2.AbstractC7599p;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.E1 */
/* JADX INFO: loaded from: classes.dex */
public final class C3255E1 implements InterfaceC6562n {

    /* JADX INFO: renamed from: a */
    private final zzbft f13887a;

    /* JADX INFO: renamed from: b */
    private final C6573y f13888b = new C6573y();

    /* JADX INFO: renamed from: c */
    private final zzbgq f13889c;

    public C3255E1(zzbft zzbftVar, zzbgq zzbgqVar) {
        this.f13887a = zzbftVar;
        this.f13889c = zzbgqVar;
    }

    @Override // p314o2.InterfaceC6562n
    /* JADX INFO: renamed from: a */
    public final boolean mo17204a() {
        try {
            return this.f13887a.zzk();
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final zzbft m17205b() {
        return this.f13887a;
    }

    @Override // p314o2.InterfaceC6562n
    public final boolean zza() {
        try {
            return this.f13887a.zzl();
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
            return false;
        }
    }

    @Override // p314o2.InterfaceC6562n
    public final zzbgq zzb() {
        return this.f13889c;
    }
}
