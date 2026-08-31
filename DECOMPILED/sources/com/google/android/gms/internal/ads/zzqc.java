package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public interface zzqc {
    void zzA();

    default void zzB() {
    }

    void zza(zzpz zzpzVar);

    default void zzb(zzox zzoxVar) {
    }

    default void zzc(zzdb zzdbVar) {
    }

    boolean zzd(zzu zzuVar);

    int zze(zzu zzuVar);

    default zzpg zzf(zzu zzuVar) {
        throw null;
    }

    long zzg(boolean z7);

    void zzh(zzu zzuVar, int i7, int[] iArr);

    void zzi();

    void zzj();

    boolean zzk(ByteBuffer byteBuffer, long j7, int i7);

    void zzl();

    boolean zzm();

    boolean zzn();

    void zzo(zzau zzauVar);

    zzau zzp();

    void zzq(boolean z7);

    void zzr(zzc zzcVar);

    void zzs(int i7);

    void zzt(zzd zzdVar);

    default void zzu(AudioDeviceInfo audioDeviceInfo) {
    }

    long zzv();

    default void zzw(int i7, int i8) {
    }

    void zzx(float f7);

    void zzy();

    void zzz();
}
