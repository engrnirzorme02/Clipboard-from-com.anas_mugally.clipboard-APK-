package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcbh implements AudioManager.OnAudioFocusChangeListener {
    private final AudioManager zza;
    private final zzcbg zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private float zzf = 1.0f;

    public zzcbh(Context context, zzcbg zzcbgVar) {
        this.zza = (AudioManager) context.getSystemService("audio");
        this.zzb = zzcbgVar;
    }

    private final void zzf() {
        if (!this.zzd || this.zze || this.zzf <= 0.0f) {
            if (this.zzc) {
                AudioManager audioManager = this.zza;
                if (audioManager != null) {
                    this.zzc = audioManager.abandonAudioFocus(this) == 0;
                }
                this.zzb.zzq();
                return;
            }
            return;
        }
        if (this.zzc) {
            return;
        }
        AudioManager audioManager2 = this.zza;
        if (audioManager2 != null) {
            this.zzc = audioManager2.requestAudioFocus(this, 3, 2) == 1;
        }
        this.zzb.zzq();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i7) {
        this.zzc = i7 > 0;
        this.zzb.zzq();
    }

    public final void zza(boolean z7) {
        this.zze = z7;
        zzf();
    }

    public final void zzb(float f7) {
        this.zzf = f7;
        zzf();
    }

    public final float zzc() {
        float f7 = this.zze ? 0.0f : this.zzf;
        if (this.zzc) {
            return f7;
        }
        return 0.0f;
    }

    public final void zzd() {
        this.zzd = true;
        zzf();
    }

    public final void zze() {
        this.zzd = false;
        zzf();
    }
}
