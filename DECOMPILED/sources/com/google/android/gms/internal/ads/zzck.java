package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.text.Layout;

/* JADX INFO: loaded from: classes2.dex */
public final class zzck {
    private CharSequence zza;
    private Bitmap zzb;
    private Layout.Alignment zzc;
    private Layout.Alignment zzd;
    private float zze;
    private int zzf;
    private int zzg;
    private float zzh;
    private int zzi;
    private int zzj;
    private float zzk;
    private float zzl;
    private float zzm;
    private int zzn;
    private float zzo;
    private int zzp;

    public zzck() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = -3.4028235E38f;
        this.zzf = Integer.MIN_VALUE;
        this.zzg = Integer.MIN_VALUE;
        this.zzh = -3.4028235E38f;
        this.zzi = Integer.MIN_VALUE;
        this.zzj = Integer.MIN_VALUE;
        this.zzk = -3.4028235E38f;
        this.zzl = -3.4028235E38f;
        this.zzm = -3.4028235E38f;
        this.zzn = Integer.MIN_VALUE;
    }

    public final zzck zza(CharSequence charSequence) {
        this.zza = charSequence;
        this.zzb = null;
        return this;
    }

    public final CharSequence zzb() {
        return this.zza;
    }

    public final zzck zzc(Bitmap bitmap) {
        this.zzb = bitmap;
        this.zza = null;
        return this;
    }

    public final zzck zzd(Layout.Alignment alignment) {
        this.zzc = alignment;
        return this;
    }

    public final zzck zze(Layout.Alignment alignment) {
        this.zzd = alignment;
        return this;
    }

    public final zzck zzf(float f7, int i7) {
        this.zze = f7;
        this.zzf = i7;
        return this;
    }

    public final zzck zzg(int i7) {
        this.zzg = i7;
        return this;
    }

    public final int zzh() {
        return this.zzg;
    }

    public final zzck zzi(float f7) {
        this.zzh = f7;
        return this;
    }

    public final zzck zzj(int i7) {
        this.zzi = i7;
        return this;
    }

    public final int zzk() {
        return this.zzi;
    }

    public final zzck zzl(float f7, int i7) {
        this.zzk = f7;
        this.zzj = i7;
        return this;
    }

    public final zzck zzm(float f7) {
        this.zzl = f7;
        return this;
    }

    public final zzck zzn(float f7) {
        this.zzm = f7;
        return this;
    }

    public final zzck zzo(int i7) {
        this.zzn = i7;
        return this;
    }

    public final zzck zzp(float f7) {
        this.zzo = f7;
        return this;
    }

    public final zzck zzq(int i7) {
        this.zzp = i7;
        return this;
    }

    public final zzcl zzr() {
        return new zzcl(this.zza, this.zzc, this.zzd, this.zzb, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, false, -16777216, this.zzn, this.zzo, this.zzp, null);
    }

    /* synthetic */ zzck(zzcl zzclVar, byte[] bArr) {
        this.zza = zzclVar.zza;
        this.zzb = zzclVar.zzd;
        this.zzc = zzclVar.zzb;
        this.zzd = zzclVar.zzc;
        this.zze = zzclVar.zze;
        this.zzf = zzclVar.zzf;
        this.zzg = zzclVar.zzg;
        this.zzh = zzclVar.zzh;
        this.zzi = zzclVar.zzi;
        this.zzj = zzclVar.zzl;
        this.zzk = zzclVar.zzm;
        this.zzl = zzclVar.zzj;
        this.zzm = zzclVar.zzk;
        this.zzn = zzclVar.zzn;
        this.zzo = zzclVar.zzo;
        this.zzp = zzclVar.zzp;
    }
}
