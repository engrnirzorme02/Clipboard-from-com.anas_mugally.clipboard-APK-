package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.BinderC3773b;
import p340r2.C6884b;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbgr {
    private final zzbgq zza;

    public zzbgr(zzbgq zzbgqVar) {
        Context context;
        this.zza = zzbgqVar;
        try {
            context = (Context) BinderC3773b.m18220M0(zzbgqVar.zzm());
        } catch (RemoteException | NullPointerException e7) {
            AbstractC7599p.m33329d("", e7);
            context = null;
        }
        if (context != null) {
            try {
                this.zza.zzn(BinderC3773b.m18221N0(new C6884b(context)));
            } catch (RemoteException e8) {
                AbstractC7599p.m33329d("", e8);
            }
        }
    }

    public final zzbgq zza() {
        return this.zza;
    }

    public final String zzb() {
        try {
            return this.zza.zzh();
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
            return null;
        }
    }
}
