package com.google.android.gms.internal.ads;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdjx implements GestureDetector.OnGestureListener {
    private final zzdip zza;
    private final zzdjp zzb;

    zzdjx(zzdip zzdipVar, zzdjp zzdjpVar) {
        this.zza = zzdipVar;
        this.zzb = zzdjpVar;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    @Override // android.view.GestureDetector.OnGestureListener
    public final synchronized boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f8) {
        int y7;
        try {
            zzdip zzdipVar = this.zza;
            if (zzdipVar != null) {
                int i7 = -1;
                if (Math.abs(f7) > Math.abs(f8)) {
                    if (f7 > 0.0f) {
                        y7 = (int) (((motionEvent2.getX() - motionEvent.getX()) / f7) * 1000.0f);
                        i7 = 1;
                    } else if (f7 < 0.0f) {
                        y7 = (int) (((motionEvent2.getX() - motionEvent.getX()) / f7) * 1000.0f);
                        i7 = 2;
                    } else {
                        y7 = 0;
                    }
                } else if (f8 > 0.0f) {
                    y7 = (int) (((motionEvent2.getY() - motionEvent.getY()) / f8) * 1000.0f);
                    i7 = 8;
                } else if (f8 < 0.0f) {
                    y7 = (int) (((motionEvent2.getY() - motionEvent.getY()) / f8) * 1000.0f);
                    i7 = 4;
                } else {
                    y7 = 0;
                }
                if (i7 == zzdipVar.zzG()) {
                    zzdipVar.zzE(this.zzb.zzr(), y7);
                    return false;
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f8) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final synchronized boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }
}
