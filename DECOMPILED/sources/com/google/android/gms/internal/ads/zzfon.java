package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.internal.AbstractC3686c;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import p170W2.C1837b;

/* JADX INFO: loaded from: classes2.dex */
final class zzfon implements AbstractC3686c.a, AbstractC3686c.b {
    protected final zzfpj zza;
    private final String zzb;
    private final String zzc;
    private final LinkedBlockingQueue zzd;
    private final HandlerThread zze;

    public zzfon(Context context, String str, String str2) {
        this.zzb = str;
        this.zzc = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.zze = handlerThread;
        handlerThread.start();
        zzfpj zzfpjVar = new zzfpj(context, handlerThread.getLooper(), this, this, 9200000);
        this.zza = zzfpjVar;
        this.zzd = new LinkedBlockingQueue();
        zzfpjVar.checkAvailabilityAndConnect();
    }

    static zzast zzc() {
        zzarw zzarwVarZzi = zzast.zzi();
        zzarwVarZzi.zzl(32768L);
        return (zzast) zzarwVarZzi.zzbu();
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c.a
    public final void onConnected(Bundle bundle) {
        zzfpo zzfpoVarZzd = zzd();
        if (zzfpoVarZzd != null) {
            try {
                try {
                    this.zzd.put(zzfpoVarZzd.zze(new zzfpk(this.zzb, this.zzc)).zza());
                } catch (Throwable unused) {
                    this.zzd.put(zzc());
                }
            } catch (InterruptedException unused2) {
            } finally {
                zzb();
                this.zze.quit();
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c.b
    public final void onConnectionFailed(C1837b c1837b) {
        try {
            this.zzd.put(zzc());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c.a
    public final void onConnectionSuspended(int i7) {
        try {
            this.zzd.put(zzc());
        } catch (InterruptedException unused) {
        }
    }

    public final zzast zza(int i7) {
        zzast zzastVar;
        try {
            zzastVar = (zzast) this.zzd.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            zzastVar = null;
        }
        return zzastVar == null ? zzc() : zzastVar;
    }

    public final void zzb() {
        zzfpj zzfpjVar = this.zza;
        if (zzfpjVar != null) {
            if (zzfpjVar.isConnected() || zzfpjVar.isConnecting()) {
                zzfpjVar.disconnect();
            }
        }
    }

    protected final zzfpo zzd() {
        try {
            return this.zza.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
