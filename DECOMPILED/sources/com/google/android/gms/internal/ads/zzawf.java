package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzawf implements AppOpsManager$OnOpActiveChangedListener {
    final /* synthetic */ zzawg zza;

    zzawf(zzawg zzawgVar) {
        Objects.requireNonNull(zzawgVar);
        this.zza = zzawgVar;
    }

    public final void onOpActiveChanged(String str, int i7, String str2, boolean z7) {
        if (z7) {
            zzawg zzawgVar = this.zza;
            zzawgVar.zze(System.currentTimeMillis());
            zzawgVar.zzh(true);
            return;
        }
        zzawg zzawgVar2 = this.zza;
        long jZzf = zzawgVar2.zzf();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jZzf > 0 && jCurrentTimeMillis >= zzawgVar2.zzf()) {
            zzawgVar2.zzg(jCurrentTimeMillis - zzawgVar2.zzf());
        }
        zzawgVar2.zzh(false);
    }
}
