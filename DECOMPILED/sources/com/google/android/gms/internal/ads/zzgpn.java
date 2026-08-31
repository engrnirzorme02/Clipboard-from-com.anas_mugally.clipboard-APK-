package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
final class zzgpn implements Runnable {
    zzgpp zza;

    zzgpn(zzgpp zzgppVar) {
        this.zza = zzgppVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceFutureC1673e interfaceFutureC1673eZzf;
        zzgpp zzgppVar = this.zza;
        if (zzgppVar == null || (interfaceFutureC1673eZzf = zzgppVar.zzf()) == null) {
            return;
        }
        this.zza = null;
        if (interfaceFutureC1673eZzf.isDone()) {
            zzgppVar.zzk(interfaceFutureC1673eZzf);
            return;
        }
        try {
            ScheduledFuture scheduledFutureZzx = zzgppVar.zzx();
            zzgppVar.zzy(null);
            String string = "Timed out";
            if (scheduledFutureZzx != null) {
                try {
                    long jAbs = Math.abs(scheduledFutureZzx.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        StringBuilder sb = new StringBuilder(String.valueOf(jAbs).length() + 55);
                        sb.append("Timed out");
                        sb.append(" (timeout delayed by ");
                        sb.append(jAbs);
                        sb.append(" ms after scheduled time)");
                        string = sb.toString();
                    }
                } catch (Throwable th) {
                    zzgppVar.zzb(new zzgpo(string, null));
                    throw th;
                }
            }
            String string2 = interfaceFutureC1673eZzf.toString();
            StringBuilder sb2 = new StringBuilder(string.length() + 2 + string2.length());
            sb2.append(string);
            sb2.append(": ");
            sb2.append(string2);
            zzgppVar.zzb(new zzgpo(sb2.toString(), null));
            interfaceFutureC1673eZzf.cancel(true);
        } catch (Throwable th2) {
            interfaceFutureC1673eZzf.cancel(true);
            throw th2;
        }
    }
}
