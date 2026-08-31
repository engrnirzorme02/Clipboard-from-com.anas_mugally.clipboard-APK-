package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfzf extends zzfzq {
    private static volatile Long zza;
    private static final Object zzb = new Object();

    zzfzf(zzarw zzarwVar, zzfym zzfymVar, zzgea zzgeaVar) {
        super("4EuCewMNo7oy5HJGjIHWZVxouDpcyFQvVYKjdCC+HW0E6LLnkuCZqI8dzQVnGx8e", "LgWy0irzLAc0ySGOZyKJEvwv+9ISzhvaYv1Kh0MSt9M=", zzarwVar, zzfymVar, zzgeaVar.zza(117));
    }

    @Override // com.google.android.gms.internal.ads.zzfzq
    protected final void zza(Method method, zzarw zzarwVar) {
        if (zza == null) {
            synchronized (zzb) {
                try {
                    if (zza == null) {
                        Long l7 = (Long) method.invoke("", new Object[0]);
                        if (l7 == null) {
                            throw null;
                        }
                        zza = l7;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        synchronized (zzarwVar) {
            try {
                if (zza != null) {
                    zzarwVar.zzm(zza.longValue());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
