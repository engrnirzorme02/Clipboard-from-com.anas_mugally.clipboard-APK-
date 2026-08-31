package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzfno implements Runnable {
    zzfno() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (zzfnr.zzc != null) {
            zzfnr.zzc.post(zzfnr.zzk);
            zzfnr.zzc.postDelayed(zzfnr.zzl, 200L);
        }
    }
}
