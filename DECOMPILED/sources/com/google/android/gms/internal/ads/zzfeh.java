package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.tasks.Task;
import p084K2.AbstractC0736a;
import p084K2.InterfaceC0737b;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfeh {
    static Task zza;
    public static InterfaceC0737b zzb;
    private static final Object zzc = new Object();

    public static void zza(Context context, boolean z7) {
        synchronized (zzc) {
            try {
                if (zzb == null) {
                    zzb = AbstractC0736a.m3498a(context);
                }
                Task task = zza;
                if (task == null || ((task.isComplete() && !zza.isSuccessful()) || (z7 && zza.isComplete()))) {
                    zza = ((InterfaceC0737b) AbstractC3718s.m18084m(zzb, "the appSetIdClient shouldn't be null")).getAppSetIdInfo();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Task zzb(Context context) {
        Task task;
        zza(context, false);
        synchronized (zzc) {
            task = zza;
        }
        return task;
    }
}
