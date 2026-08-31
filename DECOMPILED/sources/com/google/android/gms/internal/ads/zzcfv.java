package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.C3431F0;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcfv {
    private final zzcfu zza;
    private final zzcfw zzb;

    public zzcfv(zzcfw zzcfwVar, zzcfu zzcfuVar) {
        this.zza = zzcfuVar;
        this.zzb = zzcfwVar;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            AbstractC3490o0.m17545k("Click string is empty, not proceeding.");
            return "";
        }
        zzcfw zzcfwVar = this.zzb;
        zzauu zzauuVarZzS = ((zzcgd) zzcfwVar).zzS();
        if (zzauuVarZzS == null) {
            AbstractC3490o0.m17545k("Signal utils is empty, ignoring.");
            return "";
        }
        zzaup zzaupVarZzb = zzauuVarZzS.zzb();
        if (zzaupVarZzb == null) {
            AbstractC3490o0.m17545k("Signals object is empty, ignoring.");
            return "";
        }
        if (zzcfwVar.getContext() != null) {
            return zzaupVarZzb.zzf(zzcfwVar.getContext(), str, ((zzcgf) zzcfwVar).zzE(), zzcfwVar.zzj());
        }
        AbstractC3490o0.m17545k("Context is null, ignoring.");
        return "";
    }

    @JavascriptInterface
    public String getViewSignals() {
        zzcfw zzcfwVar = this.zzb;
        zzauu zzauuVarZzS = ((zzcgd) zzcfwVar).zzS();
        if (zzauuVarZzS == null) {
            AbstractC3490o0.m17545k("Signal utils is empty, ignoring.");
            return "";
        }
        zzaup zzaupVarZzb = zzauuVarZzS.zzb();
        if (zzaupVarZzb == null) {
            AbstractC3490o0.m17545k("Signals object is empty, ignoring.");
            return "";
        }
        if (zzcfwVar.getContext() != null) {
            return zzaupVarZzb.zzj(zzcfwVar.getContext(), ((zzcgf) zzcfwVar).zzE(), zzcfwVar.zzj());
        }
        AbstractC3490o0.m17545k("Context is null, ignoring.");
        return "";
    }

    @JavascriptInterface
    public void notify(final String str) {
        if (!TextUtils.isEmpty(str)) {
            C3431F0.f14180l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfs
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zza(str);
                }
            });
        } else {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f("URL is empty, ignoring message");
        }
    }

    final /* synthetic */ void zza(String str) {
        this.zza.zza(Uri.parse(str));
    }
}
