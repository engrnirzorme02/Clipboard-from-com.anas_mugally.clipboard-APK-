package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzawk extends zzaxl {
    private static final zzaxm zzh = new zzaxm();
    private final Context zzi;

    public zzawk(zzavx zzavxVar, String str, String str2, zzarw zzarwVar, int i7, int i8, Context context) {
        super(zzavxVar, "yCCrg1bENISzqqs7fgrfIgqRoB89Hc58RpoZe38mDWknXggRGBdzPAEdsprm/nAh", "ygsxUks9qSJOiPMXEo9qlLCVVsFNNRfyc6WjXaB0M8U=", zzarwVar, i7, 29);
        this.zzi = context;
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    protected final void zza() {
        this.zzd.zzp("E");
        Context context = this.zzi;
        AtomicReference atomicReferenceZza = zzh.zza(context.getPackageName());
        if (atomicReferenceZza.get() == null) {
            synchronized (atomicReferenceZza) {
                try {
                    if (atomicReferenceZza.get() == null) {
                        atomicReferenceZza.set((String) this.zze.invoke(null, context));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        String str = (String) atomicReferenceZza.get();
        zzarw zzarwVar = this.zzd;
        synchronized (zzarwVar) {
            zzarwVar.zzp(zzatn.zza(str.getBytes(), true));
        }
    }
}
