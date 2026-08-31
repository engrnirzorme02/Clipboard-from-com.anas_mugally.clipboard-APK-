package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;
import p012B2.InterfaceC0061b;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
final class zzbpr implements InterfaceC0061b {
    final /* synthetic */ zzblo zza;

    zzbpr(zzbpy zzbpyVar, zzblo zzbloVar) {
        this.zza = zzbloVar;
        Objects.requireNonNull(zzbpyVar);
    }

    public final void onInitializationFailed(String str) {
        try {
            this.zza.zzf(str);
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
        }
    }

    public final void onInitializationSucceeded() {
        try {
            this.zza.zze();
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
        }
    }
}
