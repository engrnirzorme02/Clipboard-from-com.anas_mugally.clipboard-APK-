package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import p404z2.AbstractC7599p;
import p404z2.AbstractC7603t;
import p404z2.C7602s;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbfc {
    private final Context zza;

    public zzbfc(Context context) {
        this.zza = context;
    }

    public final void zza(zzbtz zzbtzVar) {
        try {
            ((zzbfd) AbstractC7603t.m33337a(this.zza, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", zzbfb.zza)).zze(zzbtzVar);
        } catch (RemoteException e7) {
            AbstractC7599p.m33331f("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e7.getMessage())));
        } catch (C7602s e8) {
            AbstractC7599p.m33331f("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e8.getMessage())));
        }
    }
}
