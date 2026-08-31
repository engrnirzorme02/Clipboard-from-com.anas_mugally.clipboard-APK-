package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.Iterator;
import java.util.Objects;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
final class zzaza implements Runnable {
    final /* synthetic */ zzazb zza;

    zzaza(zzazb zzazbVar) {
        Objects.requireNonNull(zzazbVar);
        this.zza = zzazbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzazb zzazbVar = this.zza;
        synchronized (zzazbVar.zzf()) {
            if (zzazbVar.zzg().get() && zzazbVar.zzh()) {
                zzazbVar.zzg().set(false);
                int i7 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33326a("App went background");
                Iterator it = zzazbVar.zzi().iterator();
                while (it.hasNext()) {
                    try {
                        ((zzazc) it.next()).zza(false);
                    } catch (Exception e7) {
                        AbstractC7599p.m33329d("", e7);
                    }
                }
            } else {
                int i8 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33326a("App is still foreground");
            }
        }
    }
}
