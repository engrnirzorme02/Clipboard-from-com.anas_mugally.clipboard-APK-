package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.nativead.InterfaceC3522c;
import com.google.android.gms.dynamic.BinderC3773b;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbse implements InterfaceC3522c.a {
    private final zzbgq zza;

    public zzbse(zzbgq zzbgqVar) {
        this.zza = zzbgqVar;
        try {
            zzbgqVar.zzr();
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
        }
    }

    public final void setView(View view) {
        try {
            this.zza.zzq(BinderC3773b.m18221N0(view));
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
        }
    }

    public final boolean start() {
        try {
            return this.zza.zzp();
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
            return false;
        }
    }
}
