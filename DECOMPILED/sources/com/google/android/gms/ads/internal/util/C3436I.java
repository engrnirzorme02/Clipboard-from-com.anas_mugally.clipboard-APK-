package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzapl;
import com.google.android.gms.internal.ads.zzapq;
import java.util.Objects;
import p404z2.AbstractC7599p;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.util.I */
/* JADX INFO: loaded from: classes.dex */
final class C3436I implements zzapl {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f14200a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C3440K f14201b;

    C3436I(C3446N c3446n, String str, C3440K c3440k) {
        this.f14200a = str;
        this.f14201b = c3440k;
        Objects.requireNonNull(c3446n);
    }

    @Override // com.google.android.gms.internal.ads.zzapl
    public final void zza(zzapq zzapqVar) {
        String str = this.f14200a;
        String string = zzapqVar.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(string).length());
        sb.append("Failed to load URL: ");
        sb.append(str);
        sb.append("\n");
        sb.append(string);
        String string2 = sb.toString();
        int i7 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33331f(string2);
        this.f14201b.zza((Object) null);
    }
}
