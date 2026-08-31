package com.google.android.gms.internal.ads;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.IntentFilter;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfmr {
    private static final zzfmr zza = new zzfmr();
    private WeakReference zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public static zzfmr zza() {
        return zza;
    }

    public final void zzb(Context context) {
        if (context == null) {
            return;
        }
        this.zzb = new WeakReference(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new zzfmq(this), intentFilter);
    }

    public final void zzc() {
        KeyguardManager keyguardManager;
        Context context = (Context) this.zzb.get();
        if (context == null || (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) == null) {
            return;
        }
        boolean zIsDeviceLocked = keyguardManager.isDeviceLocked();
        zzd(this.zzc, zIsDeviceLocked);
        this.zzd = zIsDeviceLocked;
    }

    public final void zzd(boolean z7, boolean z8) {
        if ((z8 || z7) == (this.zzd || this.zzc)) {
            return;
        }
        Iterator it = zzfmh.zza().zze().iterator();
        while (it.hasNext()) {
            ((zzfln) it.next()).zzg().zzg(z8 || z7);
        }
    }

    final /* synthetic */ void zze(boolean z7) {
        this.zzc = z7;
    }

    final /* synthetic */ boolean zzf() {
        return this.zzd;
    }
}
