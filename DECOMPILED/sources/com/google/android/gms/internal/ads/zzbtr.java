package com.google.android.gms.internal.ads;

import java.util.Objects;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
final class zzbtr implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ Thread.UncaughtExceptionHandler zza;
    final /* synthetic */ zzbtt zzb;

    zzbtr(zzbtt zzbttVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.zza = uncaughtExceptionHandler;
        Objects.requireNonNull(zzbttVar);
        this.zzb = zzbttVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            try {
                this.zzb.zzg(thread, th);
            } finally {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.zza;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                }
            }
        } catch (Throwable unused) {
            AbstractC7599p.m33328c("AdMob exception reporter failed reporting the exception.");
        }
        if (this.zza != null) {
        }
    }
}
