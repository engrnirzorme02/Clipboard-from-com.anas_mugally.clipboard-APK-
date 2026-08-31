package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public interface zzsq {
    void zza(int i7, int i8, int i9, long j7, int i10);

    void zzb(int i7, int i8, zzhd zzhdVar, long j7, int i9);

    void zzc(int i7, boolean z7);

    void zzd(int i7, long j7);

    int zze();

    int zzf(MediaCodec.BufferInfo bufferInfo);

    MediaFormat zzg();

    ByteBuffer zzh(int i7);

    ByteBuffer zzi(int i7);

    void zzj();

    void zzk();

    default boolean zzl(zzsp zzspVar) {
        return false;
    }

    void zzm(Surface surface);

    void zzn();

    void zzo(Bundle bundle);

    void zzp(int i7);
}
