package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public interface zzll extends zzlg {
    String zzS();

    default long zzT(long j7, long j8) {
        if (zze() == 1) {
            return (zzX() || zzY()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    default void zzU(float f7, float f8) {
    }

    default void zzV() {
    }

    void zzW(long j7, long j8);

    boolean zzX();

    boolean zzY();

    int zza();

    zzln zzb();

    void zzc(int i7, zzox zzoxVar, zzdb zzdbVar);

    void zzcY();

    void zzcZ(zzu[] zzuVarArr, zzwf zzwfVar, long j7, long j8, zzup zzupVar);

    zzkm zzd();

    zzwf zzda();

    boolean zzdb();

    int zze();

    void zzf(zzlo zzloVar, zzu[] zzuVarArr, zzwf zzwfVar, long j7, boolean z7, boolean z8, long j8, long j9, zzup zzupVar);

    long zzk();

    void zzl();

    boolean zzm();

    void zzn();

    void zzo(zzbe zzbeVar);

    void zzp(long j7);

    void zzq();

    void zzr();

    void zzs();

    default void zzt() {
    }
}
