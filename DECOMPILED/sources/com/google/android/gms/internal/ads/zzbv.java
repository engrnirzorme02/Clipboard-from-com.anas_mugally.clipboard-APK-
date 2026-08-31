package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbv {
    private AudioManager.OnAudioFocusChangeListener zza;
    private Handler zzb;
    private zzc zzc = zzc.zza;

    public zzbv(int i7) {
    }

    public final zzbv zza(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.zza = onAudioFocusChangeListener;
        this.zzb = handler;
        return this;
    }

    public final zzbv zzb(zzc zzcVar) {
        this.zzc = zzcVar;
        return this;
    }

    public final zzby zzc() {
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.zza;
        if (onAudioFocusChangeListener == null) {
            throw new IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
        }
        Handler handler = this.zzb;
        handler.getClass();
        return new zzby(1, onAudioFocusChangeListener, handler, this.zzc, false);
    }
}
