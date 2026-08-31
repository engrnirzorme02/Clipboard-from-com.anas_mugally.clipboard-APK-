package com.google.android.gms.location;

import com.google.android.gms.common.api.AbstractC3560h;
import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.location.zzaf;
import com.google.android.gms.internal.location.zzaz;
import com.google.android.gms.internal.location.zzbi;
import com.google.android.gms.internal.location.zzz;

/* JADX INFO: renamed from: com.google.android.gms.location.k */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3972k {

    /* JADX INFO: renamed from: a */
    public static final C3553a f15030a;

    /* JADX INFO: renamed from: b */
    public static final InterfaceC3966e f15031b;

    /* JADX INFO: renamed from: c */
    public static final InterfaceC3968g f15032c;

    /* JADX INFO: renamed from: d */
    public static final InterfaceC3977p f15033d;

    /* JADX INFO: renamed from: e */
    private static final C3553a.g f15034e;

    /* JADX INFO: renamed from: f */
    private static final C3553a.a f15035f;

    static {
        C3553a.g gVar = new C3553a.g();
        f15034e = gVar;
        C3942G c3942g = new C3942G();
        f15035f = c3942g;
        f15030a = new C3553a("LocationServices.API", c3942g, gVar);
        f15031b = new zzz();
        f15032c = new zzaf();
        f15033d = new zzbi();
    }

    /* JADX INFO: renamed from: a */
    public static zzaz m18396a(AbstractC3560h abstractC3560h) {
        AbstractC3718s.m18073b(abstractC3560h != null, "GoogleApiClient parameter is required.");
        zzaz zzazVar = (zzaz) abstractC3560h.m17773d(f15034e);
        AbstractC3718s.m18087p(zzazVar != null, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
        return zzazVar;
    }
}
