package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class zztm implements zzsq {
    private final MediaCodec zza;
    private final zzsm zzb;

    /* synthetic */ zztm(MediaCodec mediaCodec, zzsm zzsmVar, byte[] bArr) {
        this.zza = mediaCodec;
        this.zzb = zzsmVar;
        if (Build.VERSION.SDK_INT < 35 || zzsmVar == null) {
            return;
        }
        zzsmVar.zzb(mediaCodec);
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zza(int i7, int i8, int i9, long j7, int i10) {
        this.zza.queueInputBuffer(i7, 0, i9, j7, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzb(int i7, int i8, zzhd zzhdVar, long j7, int i9) {
        this.zza.queueSecureInputBuffer(i7, 0, zzhdVar.zzb(), j7, i9);
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzc(int i7, boolean z7) {
        this.zza.releaseOutputBuffer(i7, false);
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzd(int i7, long j7) {
        this.zza.releaseOutputBuffer(i7, j7);
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final int zze() {
        return this.zza.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final int zzf(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.zza.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final MediaFormat zzg() {
        return this.zza.getOutputFormat();
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final ByteBuffer zzh(int i7) {
        return this.zza.getInputBuffer(i7);
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final ByteBuffer zzi(int i7) {
        return this.zza.getOutputBuffer(i7);
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzj() {
        this.zza.flush();
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzk() {
        zzsm zzsmVar;
        try {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 30 && i7 < 33) {
                this.zza.stop();
            }
            if (i7 >= 35 && this.zzb != null) {
            }
        } finally {
            if (Build.VERSION.SDK_INT >= 35 && (zzsmVar = this.zzb) != null) {
                zzsmVar.zzc(this.zza);
            }
            this.zza.release();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzm(Surface surface) {
        this.zza.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzn() {
        this.zza.detachOutputSurface();
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzo(Bundle bundle) {
        this.zza.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzp(int i7) {
        this.zza.setVideoScalingMode(i7);
    }
}
