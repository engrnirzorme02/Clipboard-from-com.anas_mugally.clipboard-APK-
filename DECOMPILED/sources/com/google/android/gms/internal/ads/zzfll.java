package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfll {
    private final zzflx zza;
    private final WebView zzb;
    private final List zzc = new ArrayList();
    private final Map zzd = new HashMap();
    private final String zze;
    private final String zzf;
    private final zzflm zzg;

    private zzfll(zzflx zzflxVar, WebView webView, String str, List list, String str2, String str3, zzflm zzflmVar) {
        this.zza = zzflxVar;
        this.zzb = webView;
        this.zzg = zzflmVar;
        this.zzf = str2;
        this.zze = str3;
    }

    public static zzfll zza(zzflx zzflxVar, WebView webView, String str, String str2) {
        if (str2 != null) {
            zzfnh.zzd(str2, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new zzfll(zzflxVar, webView, null, null, str, str2, zzflm.HTML);
    }

    public static zzfll zzb(zzflx zzflxVar, WebView webView, String str, String str2) {
        zzfnh.zzd("", 256, "CustomReferenceData is greater than 256 characters");
        return new zzfll(zzflxVar, webView, null, null, str, "", zzflm.JAVASCRIPT);
    }

    public final zzflx zzc() {
        return this.zza;
    }

    public final List zzd() {
        return Collections.unmodifiableList(this.zzc);
    }

    public final Map zze() {
        return Collections.unmodifiableMap(this.zzd);
    }

    public final WebView zzf() {
        return this.zzb;
    }

    public final String zzg() {
        return this.zzf;
    }

    public final String zzh() {
        return this.zze;
    }

    public final zzflm zzi() {
        return this.zzg;
    }
}
