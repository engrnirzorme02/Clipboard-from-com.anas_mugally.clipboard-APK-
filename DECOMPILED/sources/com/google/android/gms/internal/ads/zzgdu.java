package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzgdu implements AppOpsManager$OnOpActiveChangedListener {
    final /* synthetic */ zzgdw zza;

    zzgdu(zzgdw zzgdwVar) {
        Objects.requireNonNull(zzgdwVar);
        this.zza = zzgdwVar;
    }

    public final void onOpActiveChanged(String str, int i7, String str2, boolean z7) {
        zzgdw zzgdwVar = this.zza;
        synchronized (zzgdwVar) {
            try {
                if (z7) {
                    zzgdwVar.zzg(System.currentTimeMillis());
                    zzgdwVar.zzj(true);
                } else {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (zzgdwVar.zzh() > 0 && jCurrentTimeMillis >= zzgdwVar.zzh()) {
                        zzgdwVar.zzi(jCurrentTimeMillis - zzgdwVar.zzh());
                    }
                    zzgdwVar.zzj(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
