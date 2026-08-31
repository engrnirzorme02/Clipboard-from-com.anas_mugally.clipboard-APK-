package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.HashMap;
import java.util.Map;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzbjj implements zzbjl {
    static final /* synthetic */ zzbjj zza = new zzbjj();

    private /* synthetic */ zzbjj() {
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* synthetic */ void zza(Object obj, Map map) {
        zzcfw zzcfwVar = (zzcfw) obj;
        zzbjl zzbjlVar = zzbjk.zza;
        String str = (String) map.get("urls");
        if (TextUtils.isEmpty(str)) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] strArrSplit = str.split(",");
        HashMap map2 = new HashMap();
        PackageManager packageManager = zzcfwVar.getContext().getPackageManager();
        for (String str2 : strArrSplit) {
            String[] strArrSplit2 = str2.split(";", 2);
            Boolean boolValueOf = Boolean.valueOf(packageManager.resolveActivity(new Intent(strArrSplit2.length > 1 ? strArrSplit2[1].trim() : "android.intent.action.VIEW", Uri.parse(strArrSplit2[0].trim())), 65536) != null);
            map2.put(str2, boolValueOf);
            StringBuilder sb = new StringBuilder(str2.length() + 14 + boolValueOf.toString().length());
            sb.append("/canOpenURLs;");
            sb.append(str2);
            sb.append(";");
            sb.append(boolValueOf);
            AbstractC3490o0.m17545k(sb.toString());
        }
        ((zzbmh) zzcfwVar).zze("openableURLs", map2);
    }
}
