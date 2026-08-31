package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzgdj extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzgdl zza;

    zzgdj(zzgdl zzgdlVar) {
        Objects.requireNonNull(zzgdlVar);
        this.zza = zzgdlVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        zzgdl zzgdlVar = this.zza;
        synchronized (zzgdlVar) {
            zzgdlVar.zzf(networkCapabilities);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        zzgdl zzgdlVar = this.zza;
        synchronized (zzgdlVar) {
            zzgdlVar.zzf(null);
        }
    }
}
