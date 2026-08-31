package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzfuu implements zzfxq {
    private final zzfun zza;
    private final zzfut zzb;
    private Context zzc;
    private View zzd;
    private Activity zze;
    private String zzf;
    private Map zzg;
    private zzarw zzh;
    private zzfvd zzi;

    /* synthetic */ zzfuu(zzfun zzfunVar, zzfut zzfutVar, byte[] bArr) {
        this.zza = zzfunVar;
        this.zzb = zzfutVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfxq
    public final zzfxr zza() {
        zzhqf.zzc(this.zzc, Context.class);
        zzhqf.zzc(this.zzg, Map.class);
        zzhqf.zzc(this.zzh, zzarw.class);
        zzhqf.zzc(this.zzi, zzfvd.class);
        return new zzfuv(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
    }

    @Override // com.google.android.gms.internal.ads.zzfxq
    public final /* bridge */ /* synthetic */ zzfxq zzb(zzfvd zzfvdVar) {
        zzfvdVar.getClass();
        this.zzi = zzfvdVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfxq
    public final /* bridge */ /* synthetic */ zzfxq zzc(zzarw zzarwVar) {
        zzarwVar.getClass();
        this.zzh = zzarwVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfxq
    public final /* bridge */ /* synthetic */ zzfxq zzd(Map map) {
        this.zzg = map;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfxq
    public final /* synthetic */ zzfxq zze(String str) {
        this.zzf = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfxq
    public final /* synthetic */ zzfxq zzf(Activity activity) {
        this.zze = activity;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfxq
    public final /* synthetic */ zzfxq zzg(View view) {
        this.zzd = view;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfxq
    public final /* bridge */ /* synthetic */ zzfxq zzh(Context context) {
        context.getClass();
        this.zzc = context;
        return this;
    }
}
