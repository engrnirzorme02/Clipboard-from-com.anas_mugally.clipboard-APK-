package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;
import android.webkit.WebView;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbv extends WebView {
    private final Handler zza;
    private final zzcb zzb;
    private boolean zzc;

    public zzbv(zzbx zzbxVar, Handler handler, zzcb zzcbVar) {
        super(zzbxVar);
        this.zzc = false;
        this.zza = handler;
        this.zzb = zzcbVar;
    }

    static /* bridge */ /* synthetic */ boolean zzf(zzbv zzbvVar, String str) {
        return str != null && str.startsWith("consent://");
    }

    public final void zzc() {
        final zzcb zzcbVar = this.zzb;
        Objects.requireNonNull(zzcbVar);
        this.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbs
            @Override // java.lang.Runnable
            public final void run() {
                zzcbVar.zzd();
            }
        });
    }

    public final void zzd(String str, String str2) {
        final String str3 = str + "(" + str2 + ");";
        this.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbr
            @Override // java.lang.Runnable
            public final void run() {
                zzct.zza(this.zza, str3);
            }
        });
    }
}
