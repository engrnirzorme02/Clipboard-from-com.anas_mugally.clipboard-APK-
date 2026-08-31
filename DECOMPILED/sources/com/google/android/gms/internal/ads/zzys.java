package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzys {
    private final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public final void zza(Handler handler, zzyt zzytVar) {
        zzb(zzytVar);
        this.zza.add(new zzyr(handler, zzytVar));
    }

    public final void zzb(zzyt zzytVar) {
        CopyOnWriteArrayList<zzyr> copyOnWriteArrayList = this.zza;
        for (zzyr zzyrVar : copyOnWriteArrayList) {
            if (zzyrVar.zzc() == zzytVar) {
                zzyrVar.zza();
                copyOnWriteArrayList.remove(zzyrVar);
            }
        }
    }

    public final void zzc(final int i7, final long j7, final long j8) {
        for (final zzyr zzyrVar : this.zza) {
            if (!zzyrVar.zzd()) {
                zzyrVar.zzb().post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzyq
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzyrVar.zzc().zzX(i7, j7, j8);
                    }
                });
            }
        }
    }
}
