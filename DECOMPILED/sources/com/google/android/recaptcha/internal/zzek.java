package com.google.android.recaptcha.internal;

import android.content.Context;
import kotlin.jvm.internal.AbstractC6112h;

/* JADX INFO: loaded from: classes2.dex */
public final class zzek {
    private final String zza;
    private String zzb;
    private String zzc;
    private final Context zzd;
    private final zzeo zze;
    private String zzf;
    private Integer zzg;
    private final int zzh;

    private zzek(String str, String str2, String str3, int i7, Context context, zzeo zzeoVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzh = i7;
        this.zzd = context;
        this.zze = zzeoVar;
    }

    public final zzek zza() {
        return new zzek(this);
    }

    public final zzek zzb(int i7) {
        this.zzg = Integer.valueOf(i7);
        return this;
    }

    public final zzek zzc(String str) {
        this.zzf = str;
        return this;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final void zze(zztx zztxVar) {
        this.zze.zza(zztxVar);
    }

    public final zzen zzf(int i7) {
        String str = this.zzb;
        String str2 = this.zzc;
        String str3 = this.zzf;
        zzcc zzccVar = new zzcc();
        Context context = this.zzd;
        Integer num = this.zzg;
        return new zzen(i7, this.zza, this.zzh, str, str2, str3, null, this.zze, zzccVar, context, num);
    }

    public /* synthetic */ zzek(String str, String str2, String str3, int i7, Context context, zzeo zzeoVar, AbstractC6112h abstractC6112h) {
        this(str, str2, str3, i7, context, zzeoVar);
    }

    private zzek(zzek zzekVar) {
        this(zzekVar.zza, zzekVar.zzb, zzekVar.zzc, zzekVar.zzh, zzekVar.zzd, zzekVar.zze);
        this.zzf = zzekVar.zzf;
        this.zzg = zzekVar.zzg;
    }
}
