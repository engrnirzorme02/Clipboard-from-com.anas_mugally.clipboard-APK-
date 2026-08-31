package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.client.C3250D;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdxr implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzdxr(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzdxr zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzdxr(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* synthetic */ Object zzb() {
        zzfhh zzfhhVar = (zzfhh) this.zza.zzb();
        final CookieManager cookieManagerMo17452a = C7351t.m32352j().mo17452a((Context) this.zzb.zzb());
        zzfhb zzfhbVar = zzfhb.WEBVIEW_COOKIE;
        Objects.requireNonNull(zzfhhVar);
        return zzfgs.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdxm
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                CookieManager cookieManager = cookieManagerMo17452a;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((String) C3250D.m17200c().zzd(zzbci.zzbd));
            }
        }, zzfhbVar, zzfhhVar).zzh(1L, TimeUnit.SECONDS).zzf(Exception.class, zzdxj.zza).zzi();
    }
}
