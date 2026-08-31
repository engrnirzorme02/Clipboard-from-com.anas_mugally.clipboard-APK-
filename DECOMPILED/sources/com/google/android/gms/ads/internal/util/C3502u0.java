package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.browser.customtabs.C2381d;
import com.google.android.gms.internal.ads.zzbdi;
import com.google.android.gms.internal.ads.zzbdj;
import com.google.android.gms.internal.ads.zzhqn;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.util.u0 */
/* JADX INFO: loaded from: classes.dex */
final class C3502u0 implements zzbdi {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ zzbdj f14332a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Context f14333b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ Uri f14334c;

    C3502u0(C3431F0 c3431f0, zzbdj zzbdjVar, Context context, Uri uri) {
        this.f14332a = zzbdjVar;
        this.f14333b = context;
        this.f14334c = uri;
        Objects.requireNonNull(c3431f0);
    }

    @Override // com.google.android.gms.internal.ads.zzbdi
    public final void zza() {
        zzbdj zzbdjVar = this.f14332a;
        C2381d c2381dM10208a = new C2381d.d(zzbdjVar.zzc()).m10208a();
        Intent intent = c2381dM10208a.f8406a;
        Context context = this.f14333b;
        intent.setPackage(zzhqn.zza(context));
        c2381dM10208a.m10201a(context, this.f14334c);
        zzbdjVar.zzb((Activity) context);
    }
}
