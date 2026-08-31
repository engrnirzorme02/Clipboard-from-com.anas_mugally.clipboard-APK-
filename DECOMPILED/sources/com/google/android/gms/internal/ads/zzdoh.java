package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.InterfaceC3340f1;
import com.google.android.gms.ads.internal.client.InterfaceC3352i1;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import p314o2.C6573y;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdoh extends C6573y.a {
    private final zzdiu zza;

    public zzdoh(zzdiu zzdiuVar) {
        this.zza = zzdiuVar;
    }

    private static InterfaceC3352i1 zza(zzdiu zzdiuVar) {
        InterfaceC3340f1 interfaceC3340f1Zzy = zzdiuVar.zzy();
        if (interfaceC3340f1Zzy == null) {
            return null;
        }
        try {
            return interfaceC3340f1Zzy.zzo();
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // p314o2.C6573y.a
    public final void onVideoEnd() {
        InterfaceC3352i1 interfaceC3352i1Zza = zza(this.zza);
        if (interfaceC3352i1Zza == null) {
            return;
        }
        try {
            interfaceC3352i1Zza.zzh();
        } catch (RemoteException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33332g("Unable to call onVideoEnd()", e7);
        }
    }

    @Override // p314o2.C6573y.a
    public final void onVideoPause() {
        InterfaceC3352i1 interfaceC3352i1Zza = zza(this.zza);
        if (interfaceC3352i1Zza == null) {
            return;
        }
        try {
            interfaceC3352i1Zza.zzg();
        } catch (RemoteException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33332g("Unable to call onVideoEnd()", e7);
        }
    }

    @Override // p314o2.C6573y.a
    public final void onVideoStart() {
        InterfaceC3352i1 interfaceC3352i1Zza = zza(this.zza);
        if (interfaceC3352i1Zza == null) {
            return;
        }
        try {
            interfaceC3352i1Zza.zze();
        } catch (RemoteException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33332g("Unable to call onVideoEnd()", e7);
        }
    }
}
