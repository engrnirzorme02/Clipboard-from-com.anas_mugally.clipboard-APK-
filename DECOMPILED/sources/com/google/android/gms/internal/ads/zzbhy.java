package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.BinderC3317Z1;
import com.google.android.gms.ads.internal.client.InterfaceC3312Y;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamic.InterfaceC3772a;
import p324p2.C6735b;
import p340r2.InterfaceC6888f;
import p404z2.AbstractC7599p;
import p404z2.C7590g;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbhy extends zzbhg {
    private final InterfaceC6888f zza;

    public zzbhy(InterfaceC6888f interfaceC6888f) {
    }

    final /* synthetic */ InterfaceC6888f zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final void zze(InterfaceC3312Y interfaceC3312Y, InterfaceC3772a interfaceC3772a) {
        if (interfaceC3312Y == null || interfaceC3772a == null) {
            return;
        }
        C6735b c6735b = new C6735b((Context) BinderC3773b.m18220M0(interfaceC3772a));
        try {
            if (interfaceC3312Y.zzw() instanceof BinderC3317Z1) {
                BinderC3317Z1 binderC3317Z1 = (BinderC3317Z1) interfaceC3312Y.zzw();
                c6735b.setAdListener(binderC3317Z1 != null ? binderC3317Z1.m17219L0() : null);
            }
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
        }
        try {
            if (interfaceC3312Y.zzv() instanceof zzayx) {
                zzayx zzayxVar = (zzayx) interfaceC3312Y.zzv();
                c6735b.setAppEventListener(zzayxVar != null ? zzayxVar.zzc() : null);
            }
        } catch (RemoteException e8) {
            AbstractC7599p.m33329d("", e8);
        }
        C7590g.f30239b.post(new zzbhx(this, c6735b, interfaceC3312Y));
    }
}
