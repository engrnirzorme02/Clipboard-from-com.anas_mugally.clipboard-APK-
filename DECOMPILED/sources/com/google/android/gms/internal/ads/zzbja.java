package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.HashMap;
import java.util.Map;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzbja implements zzbjl {
    static final /* synthetic */ zzbja zza = new zzbja();

    private /* synthetic */ zzbja() {
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* synthetic */ void zza(Object obj, Map map) {
        zzcfw zzcfwVar = (zzcfw) obj;
        zzbjl zzbjlVar = zzbjk.zza;
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zziX)).booleanValue()) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f("canOpenAppGmsgHandler disabled.");
            return;
        }
        String str = (String) map.get("package_name");
        if (TextUtils.isEmpty(str)) {
            int i8 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f("Package name missing in canOpenApp GMSG.");
            return;
        }
        HashMap map2 = new HashMap();
        Boolean boolValueOf = Boolean.valueOf(zzcfwVar.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
        map2.put(str, boolValueOf);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13 + boolValueOf.toString().length());
        sb.append("/canOpenApp;");
        sb.append(str);
        sb.append(";");
        sb.append(boolValueOf);
        AbstractC3490o0.m17545k(sb.toString());
        ((zzbmh) zzcfwVar).zze("openableApp", map2);
    }
}
