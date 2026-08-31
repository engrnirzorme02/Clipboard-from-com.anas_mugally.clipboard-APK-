package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzfjm;
import com.google.android.gms.internal.ads.zzfjn;
import p380w2.C7351t;
import p404z2.C7605v;
import p404z2.C7606w;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.util.W */
/* JADX INFO: loaded from: classes.dex */
public final class C3457W extends AbstractC3422B {

    /* JADX INFO: renamed from: a */
    private final C7605v f14216a;

    /* JADX INFO: renamed from: b */
    private final String f14217b;

    /* JADX INFO: renamed from: c */
    private final C7606w f14218c;

    public C3457W(Context context, String str, String str2, zzfjn zzfjnVar, C7606w c7606w) {
        this.f14216a = new C7605v(context, C7351t.m32349g().m17439O(context, str));
        this.f14217b = str2;
        this.f14218c = c7606w;
    }

    @Override // com.google.android.gms.ads.internal.util.AbstractC3422B
    public final void zza() {
        C7606w c7606w = this.f14218c;
        if (c7606w == null) {
            this.f14216a.zza(this.f14217b);
        } else {
            new zzfjm(c7606w.m33345a(), this.f14216a, zzbzh.zze, null).zza(this.f14217b);
        }
    }
}
