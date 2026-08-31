package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;
import p012B2.AbstractC0082w;
import p012B2.InterfaceC0063d;
import p314o2.C6550b;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
final class zzbrf implements InterfaceC0063d {
    final /* synthetic */ zzbqq zza;
    final /* synthetic */ zzbpd zzb;

    zzbrf(zzbrj zzbrjVar, zzbqq zzbqqVar, zzbpd zzbpdVar) {
        this.zza = zzbqqVar;
        this.zzb = zzbpdVar;
        Objects.requireNonNull(zzbrjVar);
    }

    @Override // p012B2.InterfaceC0063d
    public final void onFailure(C6550b c6550b) {
        try {
            this.zza.zzg(c6550b.m27810d());
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
        }
    }

    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        AbstractC0082w abstractC0082w = (AbstractC0082w) obj;
        if (abstractC0082w != null) {
            try {
                this.zza.zze(new zzbqe(abstractC0082w));
            } catch (RemoteException e7) {
                AbstractC7599p.m33329d("", e7);
            }
            return new zzbrk(this.zzb);
        }
        AbstractC7599p.m33331f("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            this.zza.zzf("Adapter returned null.");
            return null;
        } catch (RemoteException e8) {
            AbstractC7599p.m33329d("", e8);
            return null;
        }
    }

    public final void onFailure(String str) {
        onFailure(new C6550b(0, str, "undefined"));
    }
}
