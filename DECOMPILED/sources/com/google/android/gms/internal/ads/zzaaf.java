package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* JADX INFO: loaded from: classes2.dex */
final class zzaaf extends HandlerThread implements Handler.Callback {
    private zzdh zza;
    private Handler zzb;
    private Error zzc;
    private RuntimeException zzd;
    private zzaag zze;

    public zzaaf() {
        super("ExoPlayer:PlaceholderSurface");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i7 = message.what;
        try {
            if (i7 == 1) {
                try {
                    try {
                        int i8 = message.arg1;
                        zzdh zzdhVar = this.zza;
                        if (zzdhVar == null) {
                            throw null;
                        }
                        zzdhVar.zza(i8);
                        this.zze = new zzaag(this, this.zza.zzc(), i8 != 0, null);
                        synchronized (this) {
                            notify();
                        }
                    } catch (zzdi e7) {
                        zzds.zzf("PlaceholderSurface", "Failed to initialize placeholder surface", e7);
                        this.zzd = new IllegalStateException(e7);
                        synchronized (this) {
                            notify();
                        }
                    }
                } catch (Error e8) {
                    zzds.zzf("PlaceholderSurface", "Failed to initialize placeholder surface", e8);
                    this.zzc = e8;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e9) {
                    zzds.zzf("PlaceholderSurface", "Failed to initialize placeholder surface", e9);
                    this.zzd = e9;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i7 == 2) {
                try {
                    zzdh zzdhVar2 = this.zza;
                    if (zzdhVar2 == null) {
                        throw null;
                    }
                    zzdhVar2.zzb();
                    return true;
                } catch (Throwable th) {
                    try {
                        zzds.zzf("PlaceholderSurface", "Failed to release placeholder surface", th);
                    } finally {
                        quit();
                    }
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }

    public final zzaag zza(int i7) {
        boolean z7;
        start();
        this.zzb = new Handler(getLooper(), this);
        this.zza = new zzdh(this.zzb, null);
        synchronized (this) {
            z7 = false;
            this.zzb.obtainMessage(1, i7, 0).sendToTarget();
            while (this.zze == null && this.zzd == null && this.zzc == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z7 = true;
                }
            }
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.zzd;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = this.zzc;
        if (error != null) {
            throw error;
        }
        zzaag zzaagVar = this.zze;
        zzaagVar.getClass();
        return zzaagVar;
    }

    public final void zzb() {
        Handler handler = this.zzb;
        handler.getClass();
        handler.sendEmptyMessage(2);
    }
}
