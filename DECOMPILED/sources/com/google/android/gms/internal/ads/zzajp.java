package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzajp {
    public static void zza(zzajq zzajqVar, zzaju zzajuVar, zzdf zzdfVar) {
        for (int i7 = 0; i7 < zzajqVar.zza(); i7++) {
            long jZzb = zzajqVar.zzb(i7);
            List listZzc = zzajqVar.zzc(jZzb);
            if (!listZzc.isEmpty()) {
                if (i7 == zzajqVar.zza() - 1) {
                    throw new IllegalStateException();
                }
                long jZzb2 = zzajqVar.zzb(i7 + 1) - zzajqVar.zzb(i7);
                if (jZzb2 > 0) {
                    zzdfVar.zza(new zzajn(listZzc, jZzb, jZzb2));
                }
            }
        }
    }
}
