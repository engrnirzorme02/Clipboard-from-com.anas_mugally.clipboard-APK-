package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
final class zzbx implements AudioManager.OnAudioFocusChangeListener {
    private final Handler zza;
    private final AudioManager.OnAudioFocusChangeListener zzb;

    zzbx(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.zzb = onAudioFocusChangeListener;
        Looper looper = handler.getLooper();
        String str = zzeo.zza;
        this.zza = new Handler(looper, null);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i7) {
        zzeo.zzd(this.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzbw
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zza(i7);
            }
        });
    }

    final /* synthetic */ void zza(int i7) {
        this.zzb.onAudioFocusChange(i7);
    }
}
