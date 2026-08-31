package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzzc extends Handler implements Runnable {
    final /* synthetic */ zzzh zza;
    private final zzzd zzb;
    private final long zzc;
    private zzyz zzd;
    private IOException zze;
    private int zzf;
    private Thread zzg;
    private boolean zzh;
    private volatile boolean zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzzc(zzzh zzzhVar, Looper looper, zzzd zzzdVar, zzyz zzyzVar, int i7, long j7) {
        super(looper);
        Objects.requireNonNull(zzzhVar);
        this.zza = zzzhVar;
        this.zzb = zzzdVar;
        this.zzd = zzyzVar;
        this.zzc = j7;
    }

    private final void zzd() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j7 = jElapsedRealtime - this.zzc;
        zzyz zzyzVar = this.zzd;
        zzyzVar.getClass();
        zzyzVar.zzC(this.zzb, jElapsedRealtime, j7, this.zzf);
        this.zze = null;
        zzzh zzzhVar = this.zza;
        zzzc zzzcVarZzj = zzzhVar.zzj();
        zzzcVarZzj.getClass();
        zzzhVar.zzi().execute(zzzcVarZzj);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.zzi) {
            return;
        }
        int i7 = message.what;
        if (i7 == 1) {
            zzd();
            return;
        }
        if (i7 == 4) {
            throw ((Error) message.obj);
        }
        zzzh zzzhVar = this.zza;
        zzzhVar.zzk(null);
        long j7 = this.zzc;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j8 = jElapsedRealtime - j7;
        zzyz zzyzVar = this.zzd;
        zzyzVar.getClass();
        if (this.zzh) {
            zzyzVar.zzA(this.zzb, jElapsedRealtime, j8, false);
            return;
        }
        int i8 = message.what;
        if (i8 == 2) {
            try {
                zzyzVar.zzB(this.zzb, jElapsedRealtime, j8);
                return;
            } catch (RuntimeException e7) {
                zzds.zzf("LoadTask", "Unexpected exception handling load completed", e7);
                this.zza.zzl(new zzzg(e7));
                return;
            }
        }
        if (i8 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.zze = iOException;
        int i9 = this.zzf + 1;
        this.zzf = i9;
        zzzb zzzbVarZzz = zzyzVar.zzz(this.zzb, jElapsedRealtime, j8, iOException, i9);
        if (zzzbVarZzz.zzb() == 3) {
            zzzhVar.zzl(this.zze);
        } else if (zzzbVarZzz.zzb() != 2) {
            if (zzzbVarZzz.zzb() == 1) {
                this.zzf = 1;
            }
            zzb(zzzbVarZzz.zzc() != -9223372036854775807L ? zzzbVarZzz.zzc() : Math.min((this.zzf - 1) * zzbbn.zzq.zzf, 5000));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z7;
        try {
            synchronized (this) {
                z7 = this.zzh;
                this.zzg = Thread.currentThread();
            }
            if (!z7) {
                zzzd zzzdVar = this.zzb;
                String simpleName = zzzdVar.getClass().getSimpleName();
                StringBuilder sb = new StringBuilder(simpleName.length() + 5);
                sb.append("load:");
                sb.append(simpleName);
                Trace.beginSection(sb.toString());
                try {
                    zzzdVar.zzc();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.zzg = null;
                Thread.interrupted();
            }
            if (this.zzi) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e7) {
            if (this.zzi) {
                return;
            }
            obtainMessage(3, e7).sendToTarget();
        } catch (Exception e8) {
            if (this.zzi) {
                return;
            }
            zzds.zzf("LoadTask", "Unexpected exception loading stream", e8);
            obtainMessage(3, new zzzg(e8)).sendToTarget();
        } catch (OutOfMemoryError e9) {
            if (this.zzi) {
                return;
            }
            zzds.zzf("LoadTask", "OutOfMemory error loading stream", e9);
            obtainMessage(3, new zzzg(e9)).sendToTarget();
        } catch (Error e10) {
            if (!this.zzi) {
                zzds.zzf("LoadTask", "Unexpected error loading stream", e10);
                obtainMessage(4, e10).sendToTarget();
            }
            throw e10;
        }
    }

    public final void zza(int i7) throws IOException {
        IOException iOException = this.zze;
        if (iOException != null && this.zzf > i7) {
            throw iOException;
        }
    }

    public final void zzb(long j7) {
        zzzh zzzhVar = this.zza;
        zzghc.zzh(zzzhVar.zzj() == null);
        zzzhVar.zzk(this);
        if (j7 > 0) {
            sendEmptyMessageDelayed(1, j7);
        } else {
            zzd();
        }
    }

    public final void zzc(boolean z7) {
        this.zzi = z7;
        this.zze = null;
        if (hasMessages(1)) {
            this.zzh = true;
            removeMessages(1);
            if (!z7) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.zzh = true;
                    this.zzb.zzb();
                    Thread thread = this.zzg;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z7) {
            this.zza.zzk(null);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            zzyz zzyzVar = this.zzd;
            zzyzVar.getClass();
            zzyzVar.zzA(this.zzb, jElapsedRealtime, jElapsedRealtime - this.zzc, true);
            this.zzd = null;
        }
    }
}
