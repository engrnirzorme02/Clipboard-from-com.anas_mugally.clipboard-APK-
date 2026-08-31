package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.TextureView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzcaj extends TextureView implements zzcbg {
    protected final zzcax zza;
    protected final zzcbh zzb;

    public zzcaj(Context context) {
        super(context);
        this.zza = new zzcax();
        this.zzb = new zzcbh(context, this);
    }

    public void zzA(int i7) {
    }

    public void zzB(int i7) {
    }

    public void zzC(int i7) {
    }

    public abstract String zza();

    public abstract void zzb(zzcai zzcaiVar);

    public abstract void zzc(String str);

    public abstract void zzd();

    public abstract void zze();

    public abstract void zzf();

    public abstract int zzg();

    public abstract int zzh();

    public abstract void zzi(int i7);

    public abstract void zzj(float f7, float f8);

    public abstract int zzk();

    public abstract int zzl();

    public abstract long zzm();

    public abstract long zzn();

    public abstract long zzo();

    public abstract int zzp();

    public abstract void zzq();

    public Integer zzw() {
        return null;
    }

    public void zzx(String str, String[] strArr, Integer num) {
        zzc(str);
    }

    public void zzy(int i7) {
    }

    public void zzz(int i7) {
    }
}
