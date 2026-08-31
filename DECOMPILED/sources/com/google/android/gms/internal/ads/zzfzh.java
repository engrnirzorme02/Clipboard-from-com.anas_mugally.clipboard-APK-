package com.google.android.gms.internal.ads;

import android.net.NetworkCapabilities;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzfzh extends zzfzq {
    private final Map zza;

    zzfzh(zzarw zzarwVar, zzfym zzfymVar, Map map, zzgea zzgeaVar) {
        super("uQz4dxkf+WOUr5wO4tTY9oXNYZ2ptQNPPdZqIAtAnawrI3JfbJ94yRS4TeqtMQNm", "6O6kCb1xkUau22Q8zOpKfx2DsGNNbnckYsUMgkTzV8k=", zzarwVar, zzfymVar, zzgeaVar.zza(118));
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfzq
    protected final void zza(Method method, zzarw zzarwVar) {
        Map map = this.zza;
        Object[] objArr = (Object[]) method.invoke("", (NetworkCapabilities) map.get("ntc"), (Long) map.get("vs"), (Long) map.get("vf"));
        objArr.getClass();
        synchronized (zzarwVar) {
            try {
                zzarwVar.zzf(((Long) objArr[0]).longValue());
                long jLongValue = ((Long) objArr[1]).longValue();
                if (jLongValue >= 0) {
                    zzarwVar.zzW(jLongValue);
                }
                long jLongValue2 = ((Long) objArr[2]).longValue();
                if (jLongValue2 >= 0) {
                    zzarwVar.zzX(jLongValue2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
