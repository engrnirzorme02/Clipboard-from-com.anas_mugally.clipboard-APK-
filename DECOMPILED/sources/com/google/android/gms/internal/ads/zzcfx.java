package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.C3431F0;
import java.io.File;
import java.util.Collections;
import java.util.Map;
import p380w2.C7351t;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public class zzcfx extends zzcev {
    public zzcfx(zzcek zzcekVar, zzbbh zzbbhVar, boolean z7, zzecy zzecyVar) {
        super(zzcekVar, zzbbhVar, z7, new zzbsa(zzcekVar, zzcekVar.zzK(), new zzbbp(zzcekVar.getContext())), null, zzecyVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final WebResourceResponse zzaa(WebView webView, String str, Map map) {
        String str2;
        if (!(webView instanceof zzcek)) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        zzcek zzcekVar = (zzcek) webView;
        zzbxf zzbxfVar = this.zzb;
        if (zzbxfVar != null) {
            zzbxfVar.zze(str, map, 1);
        }
        zzfqm.zza();
        zzfqr zzfqrVar = zzfqr.zza;
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            return super.zzJ(str, map);
        }
        if (zzcekVar.zzP() != null) {
            zzcekVar.zzP().zzL();
        }
        if (zzcekVar.zzN().zzg()) {
            str2 = (String) C3250D.m17200c().zzd(zzbci.zzag);
        } else if (zzcekVar.zzW()) {
            str2 = (String) C3250D.m17200c().zzd(zzbci.zzaf);
        } else {
            str2 = (String) C3250D.m17200c().zzd(zzbci.zzae);
        }
        C7351t.m32349g();
        return C3431F0.m17402b(zzcekVar.getContext(), zzcekVar.zzs().f30226a, str2);
    }
}
