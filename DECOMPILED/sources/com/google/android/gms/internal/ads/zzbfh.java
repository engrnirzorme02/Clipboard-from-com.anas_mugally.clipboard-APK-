package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamic.InterfaceC3772a;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbfh extends zzbfv {
    private final Drawable zza;
    private final Uri zzb;
    private final double zzc;
    private final int zzd;
    private final int zze;
    private final Map zzf;

    public zzbfh(Drawable drawable, Uri uri, double d7, int i7, int i8, Map map) {
        this.zza = drawable;
        this.zzb = uri;
        this.zzc = d7;
        this.zzd = i7;
        this.zze = i8;
        this.zzf = map;
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final InterfaceC3772a zzb() {
        return BinderC3773b.m18221N0(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final double zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final int zze() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final int zzf() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final Map zzg() {
        return this.zzf;
    }
}
