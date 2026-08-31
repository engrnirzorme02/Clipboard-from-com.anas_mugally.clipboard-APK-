package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgpu {
    public static Object zza(Future future) {
        Object obj;
        boolean z7 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z7 = true;
            } catch (Throwable th) {
                if (z7) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }
}
