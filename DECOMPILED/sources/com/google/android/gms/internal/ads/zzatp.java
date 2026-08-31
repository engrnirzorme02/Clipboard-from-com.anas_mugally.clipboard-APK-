package com.google.android.gms.internal.ads;

import android.content.p203pm.PackageManager$OnChecksumsReadyListener;
import android.content.pm.ApkChecksum;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzatp implements PackageManager$OnChecksumsReadyListener {
    final zzgpm zza = zzgpm.zze();

    public final void onChecksumsReady(List list) {
        if (list == null) {
            this.zza.zza("");
            return;
        }
        try {
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                ApkChecksum apkChecksumM18314a = AbstractC3850b.m18314a(list.get(i7));
                if (apkChecksumM18314a.getType() == 8) {
                    zzgpm zzgpmVar = this.zza;
                    zzgmk zzgmkVarZzi = zzgmk.zzn().zzi();
                    byte[] value = apkChecksumM18314a.getValue();
                    zzgpmVar.zza(zzgmkVarZzi.zzj(value, 0, value.length));
                    return;
                }
            }
        } catch (Throwable unused) {
        }
        this.zza.zza("");
    }
}
