package com.google.android.recaptcha.internal;

import android.os.Build;
import p145S5.C1444v;
import p152T5.AbstractC1631j;
import p152T5.AbstractC1638q;
import p173W5.InterfaceC1875e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzn implements zzy {
    private final zzek zza;

    public zzn(zzek zzekVar) {
        this.zza = zzekVar;
    }

    private static final zzth zzg(String str) {
        zztg zztgVarZzf = zzth.zzf();
        zztgVarZzf.zzw(str);
        return (zzth) zztgVarZzf.zzk();
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final int zza() {
        return 11;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final zzek zzb() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final Object zzc(String str, InterfaceC1875e interfaceC1875e) {
        zzen zzenVarZzb = zzz.zzb(this, str);
        zztf zztfVarZzf = zzti.zzf();
        zzth zzthVarZzg = zzg(Build.MANUFACTURER);
        zzth zzthVarZzg2 = zzg(Build.MODEL);
        zzth zzthVarZzg3 = zzg(Build.DEVICE);
        zzth zzthVarZzg4 = zzg(Build.HARDWARE);
        zzth zzthVarZzg5 = zzg(Build.FINGERPRINT);
        zzth zzthVarZzg6 = zzg(Build.PRODUCT);
        zzth zzthVarZzg7 = zzg(Build.BOARD);
        zzth zzthVarZzg8 = zzg(Build.BRAND);
        zzth zzthVarZzg9 = zzg(AbstractC1631j.m6721R(Build.SUPPORTED_ABIS, ",", "[", "]", 0, null, null, 56, null));
        long j7 = Build.TIME;
        zztg zztgVarZzf = zzth.zzf();
        zztgVarZzf.zzv(j7);
        zztfVarZzf.zze(AbstractC1638q.m6767l(zzthVarZzg, zzthVarZzg2, zzthVarZzg3, zzthVarZzg4, zzthVarZzg5, zzthVarZzg6, zzthVarZzg7, zzthVarZzg8, zzthVarZzg9, (zzth) zztgVarZzf.zzk(), zzg(Build.ID), zzg(Build.BOOTLOADER), zzg(Build.DISPLAY), zzg(Build.TYPE), zzg(Build.TAGS)));
        zzenVarZzb.zza();
        return zzz.zza(this, (zzti) zztfVarZzf.zzk());
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final Object zzd(zzse zzseVar, InterfaceC1875e interfaceC1875e) {
        zzz.zzc(this).zza();
        return C1444v.f4971a;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final void zze(zzsr zzsrVar) {
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final boolean zzf() {
        return true;
    }
}
