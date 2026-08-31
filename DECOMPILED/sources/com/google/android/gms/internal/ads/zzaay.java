package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;

/* JADX INFO: loaded from: classes2.dex */
final class zzaay implements Choreographer.FrameCallback, Handler.Callback {
    private static final zzaay zzb = new zzaay();
    public volatile long zza = -9223372036854775807L;
    private final Handler zzc;
    private final HandlerThread zzd;
    private Choreographer zze;
    private int zzf;

    private zzaay() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        this.zzd = handlerThread;
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        String str = zzeo.zza;
        Handler handler = new Handler(looper, this);
        this.zzc = handler;
        handler.sendEmptyMessage(1);
    }

    public static zzaay zza() {
        return zzb;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j7) {
        this.zza = j7;
        Choreographer choreographer = this.zze;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i7 = message.what;
        if (i7 == 1) {
            try {
                this.zze = Choreographer.getInstance();
            } catch (RuntimeException e7) {
                zzds.zzd("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e7);
            }
            return true;
        }
        if (i7 == 2) {
            Choreographer choreographer = this.zze;
            if (choreographer != null) {
                int i8 = this.zzf + 1;
                this.zzf = i8;
                if (i8 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        }
        if (i7 != 3) {
            return false;
        }
        Choreographer choreographer2 = this.zze;
        if (choreographer2 != null) {
            int i9 = this.zzf - 1;
            this.zzf = i9;
            if (i9 == 0) {
                choreographer2.removeFrameCallback(this);
                this.zza = -9223372036854775807L;
            }
        }
        return true;
    }

    public final void zzb() {
        this.zzc.sendEmptyMessage(2);
    }

    public final void zzc() {
        this.zzc.sendEmptyMessage(3);
    }
}
