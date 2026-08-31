package p044F2;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.C3431F0;
import com.google.android.gms.internal.ads.zzbbz;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzghs;
import java.util.List;
import java.util.Map;
import p380w2.C7351t;
import p404z2.C7584a;

/* JADX INFO: renamed from: F2.a */
/* JADX INFO: loaded from: classes.dex */
public class C0416a {

    /* JADX INFO: renamed from: a */
    private final Context f1659a;

    /* JADX INFO: renamed from: b */
    private final String f1660b;

    /* JADX INFO: renamed from: c */
    private final String f1661c;

    public C0416a(Context context, C7584a c7584a) {
        this.f1659a = context;
        this.f1660b = context.getPackageName();
        this.f1661c = c7584a.f30226a;
    }

    /* JADX INFO: renamed from: a */
    public void m1804a(Map map) {
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        C7351t.m32349g();
        map.put("device", C3431F0.m17411f0());
        map.put("app", this.f1660b);
        C7351t.m32349g();
        Context context = this.f1659a;
        map.put("is_lite_sdk", true != C3431F0.m17416i(context) ? "0" : "1");
        zzbbz zzbbzVar = zzbci.zza;
        List listZzf = C3250D.m17199b().zzf();
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzhm)).booleanValue()) {
            listZzf.addAll(C7351t.m32354l().zzo().zzi().zzh());
        }
        map.put("e", TextUtils.join(",", listZzf));
        map.put("sdkVersion", this.f1661c);
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzmf)).booleanValue()) {
            C7351t.m32349g();
            map.put("is_bstar", true != C3431F0.m17410f(context) ? "0" : "1");
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzkj)).booleanValue()) {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzcE)).booleanValue()) {
                map.put("plugin", zzghs.zza(C7351t.m32354l().zzu()));
            }
        }
    }
}
