package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
final class zzfzb extends zzfzq {
    private final Context zza;

    zzfzb(zzarw zzarwVar, zzfym zzfymVar, Context context, zzgea zzgeaVar) {
        super("x40hskW4QcWcQlOMoD+3YAVbf6i903hOugunenCO8Kx52wp1PAVSKnHG+BzVtl/X", "O7aqoG+z6jUBUdfieuknEoT3SAYjfs4xXRTTjVY6eYc=", zzarwVar, zzfymVar, zzgeaVar.zza(115));
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfzq
    protected final void zza(Method method, zzarw zzarwVar) {
        Object[] objArr = (Object[]) method.invoke("", this.zza);
        objArr.getClass();
        synchronized (zzarwVar) {
            try {
                zzarwVar.zzO(((Integer) objArr[0]).intValue());
                int i7 = 1;
                zzarwVar.zzd(((Integer) objArr[1]).intValue());
                zzarwVar.zze(((Integer) objArr[2]).intValue());
                zzarwVar.zzab(((Integer) objArr[3]).intValue());
                Boolean bool = (Boolean) objArr[4];
                if (bool == null) {
                    zzarwVar.zzaf(3);
                } else {
                    zzarwVar.zzaf(true != bool.booleanValue() ? 1 : 2);
                }
                Boolean bool2 = (Boolean) objArr[5];
                if (bool2 == null) {
                    zzarwVar.zzae(3);
                } else {
                    if (true == bool2.booleanValue()) {
                        i7 = 2;
                    }
                    zzarwVar.zzae(i7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
