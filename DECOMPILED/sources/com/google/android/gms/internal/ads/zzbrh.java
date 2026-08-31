package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;
import p028D2.InterfaceC0188b;
import p314o2.C6550b;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
final class zzbrh implements InterfaceC0188b {
    final /* synthetic */ zzbqz zza;

    zzbrh(zzbrj zzbrjVar, zzbqz zzbqzVar) {
        this.zza = zzbqzVar;
        Objects.requireNonNull(zzbrjVar);
    }

    public final void onFailure(C6550b c6550b) {
        try {
            this.zza.zzg(c6550b.m27810d());
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
        }
    }

    public final void onSuccess(String str) {
        try {
            this.zza.zze(str);
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
        }
    }

    public final void onFailure(String str) {
        try {
            this.zza.zzf(str);
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
        }
    }
}
