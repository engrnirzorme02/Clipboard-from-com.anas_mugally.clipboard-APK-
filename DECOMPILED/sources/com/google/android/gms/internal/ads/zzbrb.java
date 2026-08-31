package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.appcompat.app.AbstractC2263x;
import java.util.Objects;
import p012B2.InterfaceC0063d;
import p314o2.C6550b;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
final class zzbrb implements InterfaceC0063d {
    final /* synthetic */ zzbqk zza;
    final /* synthetic */ zzbpd zzb;

    zzbrb(zzbrj zzbrjVar, zzbqk zzbqkVar, zzbpd zzbpdVar) {
        this.zza = zzbqkVar;
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
        AbstractC2263x.m9328a(obj);
        AbstractC7599p.m33331f("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            this.zza.zzf("Adapter returned null.");
            return null;
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
            return null;
        }
    }

    public final void onFailure(String str) {
        onFailure(new C6550b(0, str, "undefined"));
    }
}
