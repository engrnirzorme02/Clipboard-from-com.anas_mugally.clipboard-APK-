package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzrp {
    public final int zza;
    public final zzup zzb;
    private final CopyOnWriteArrayList zzc;

    private zzrp(CopyOnWriteArrayList copyOnWriteArrayList, int i7, zzup zzupVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzupVar;
    }

    public final zzrp zza(int i7, zzup zzupVar) {
        return new zzrp(this.zzc, 0, zzupVar);
    }

    public final void zzb(Handler handler, zzrq zzrqVar) {
        this.zzc.add(new zzro(handler, zzrqVar));
    }

    public final void zzc(zzrq zzrqVar) {
        CopyOnWriteArrayList<zzro> copyOnWriteArrayList = this.zzc;
        for (zzro zzroVar : copyOnWriteArrayList) {
            if (zzroVar.zza == zzrqVar) {
                copyOnWriteArrayList.remove(zzroVar);
            }
        }
    }

    public zzrp() {
        this(new CopyOnWriteArrayList(), 0, null);
    }
}
