package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzqz extends AudioTrack$StreamEventCallback {
    final /* synthetic */ zzrb zza;

    zzqz(zzrb zzrbVar) {
        Objects.requireNonNull(zzrbVar);
        this.zza = zzrbVar;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i7) {
        zzrc zzrcVar = this.zza.zza;
        if (audioTrack.equals(zzrcVar.zzJ()) && zzrcVar.zzI() != null && zzrcVar.zzL()) {
            zzrcVar.zzI().zza();
        }
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        zzrc zzrcVar = this.zza.zza;
        if (audioTrack.equals(zzrcVar.zzJ())) {
            zzrcVar.zzK(true);
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        zzrc zzrcVar = this.zza.zza;
        if (audioTrack.equals(zzrcVar.zzJ()) && zzrcVar.zzI() != null && zzrcVar.zzL()) {
            zzrcVar.zzI().zza();
        }
    }
}
