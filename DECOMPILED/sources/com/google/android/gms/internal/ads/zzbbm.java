package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.dynamic.BinderC3773b;
import java.util.concurrent.ExecutorService;
import p404z2.AbstractC7586c;
import p404z2.AbstractC7599p;
import p404z2.AbstractC7603t;
import p404z2.C7602s;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbbm {
    zzaye zza;
    boolean zzb;
    private final ExecutorService zzc;

    public zzbbm() {
        this.zzc = AbstractC7586c.f30234b;
    }

    final /* synthetic */ ExecutorService zza() {
        return this.zzc;
    }

    public zzbbm(final Context context) {
        ExecutorService executorService = AbstractC7586c.f30234b;
        this.zzc = executorService;
        executorService.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbbi
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                boolean zBooleanValue = ((Boolean) C3250D.m17200c().zzd(zzbci.zzfD)).booleanValue();
                Context context2 = context;
                zzbbm zzbbmVar = this.zza;
                if (zBooleanValue) {
                    try {
                        zzbbmVar.zza = (zzaye) AbstractC7603t.m33337a(context2, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", zzbbj.zza);
                        zzbbmVar.zza.zze(BinderC3773b.m18221N0(context2), "GMA_SDK");
                        zzbbmVar.zzb = true;
                    } catch (RemoteException | NullPointerException | C7602s unused) {
                        AbstractC7599p.m33326a("Cannot dynamite load clearcut");
                    }
                }
            }
        });
    }
}
