package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
final class zzfzl extends zzfzq {
    private final Context zza;
    private final Map zzb;

    zzfzl(zzarw zzarwVar, zzfym zzfymVar, Map map, Context context, zzgea zzgeaVar) {
        super("x/ivla75gbIxCSMBtwVFWwE7jSlsNIYRehCnDl+Ns11wdt5XgfFS+Bzic10LR+be", "N9mlriyqiGYjveLiAIuV0+bKr3wcLcRtJx5Wr89lqng=", zzarwVar, zzfymVar, zzgeaVar.zza(120));
        this.zza = context;
        this.zzb = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfzq
    protected final void zza(Method method, zzarw zzarwVar) {
        Long lValueOf = -1L;
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                Long l7 = (Long) method.invoke("", this.zza);
                if (l7 == null) {
                    throw null;
                }
                lValueOf = l7;
            } else {
                InterfaceFutureC1673e interfaceFutureC1673e = (InterfaceFutureC1673e) this.zzb.get("gs");
                if (interfaceFutureC1673e != null && interfaceFutureC1673e.isDone()) {
                    lValueOf = Long.valueOf(((zzast) interfaceFutureC1673e.get()).zzd());
                }
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        synchronized (zzarwVar) {
            zzarwVar.zzR(lValueOf.longValue());
        }
    }
}
