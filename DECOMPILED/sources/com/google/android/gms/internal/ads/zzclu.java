package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.client.C3250D;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzclu implements zzcky {
    private final CookieManager zza;

    public zzclu(Context context) {
        this.zza = C7351t.m32352j().mo17452a(context);
    }

    @Override // com.google.android.gms.internal.ads.zzcky
    public final void zza(Map map) {
        CookieManager cookieManager = this.zza;
        if (cookieManager == null) {
            return;
        }
        if (((String) map.get("clear")) == null) {
            String str = (String) map.get("cookie");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            cookieManager.setCookie((String) C3250D.m17200c().zzd(zzbci.zzbd), str);
            return;
        }
        String str2 = (String) C3250D.m17200c().zzd(zzbci.zzbd);
        String cookie = cookieManager.getCookie(str2);
        if (cookie != null) {
            List listZze = zzghq.zza(zzggo.zzc(';')).zze(cookie);
            for (int i7 = 0; i7 < listZze.size(); i7++) {
                Iterator it = zzghq.zza(zzggo.zzc('=')).zzd((String) listZze.get(i7)).iterator();
                it.getClass();
                if (!it.hasNext()) {
                    StringBuilder sb = new StringBuilder(String.valueOf(0).length() + 70);
                    sb.append("position (0) must be less than the number of elements that remained (");
                    sb.append(0);
                    sb.append(")");
                    throw new IndexOutOfBoundsException(sb.toString());
                }
                cookieManager.setCookie(str2, String.valueOf((String) it.next()).concat(String.valueOf((String) C3250D.m17200c().zzd(zzbci.zzaP))));
            }
        }
    }
}
