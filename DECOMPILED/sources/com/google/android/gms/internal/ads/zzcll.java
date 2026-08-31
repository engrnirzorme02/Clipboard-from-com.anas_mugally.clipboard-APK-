package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.C3250D;
import java.util.Map;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
final class zzcll implements zzcky {
    zzcll() {
    }

    @Override // com.google.android.gms.internal.ads.zzcky
    public final void zza(Map map) {
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzlj)).booleanValue() || map.isEmpty()) {
            return;
        }
        String str = (String) map.get("is_topics_ad_personalization_allowed");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C7351t.m32354l().zzo().mo17553f(Boolean.parseBoolean(str));
    }
}
