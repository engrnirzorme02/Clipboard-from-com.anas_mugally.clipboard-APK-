package com.android.billingclient.api;

import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zzbt;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzie;
import java.util.Objects;
import java.util.concurrent.Callable;
import p403z1.C7580v;
import p403z1.InterfaceC7565g;

/* JADX INFO: renamed from: com.android.billingclient.api.q */
/* JADX INFO: loaded from: classes.dex */
final class CallableC3191q implements Callable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ InterfaceC7565g f13657a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f13658b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C3176b f13659c;

    CallableC3191q(C3176b c3176b, InterfaceC7565g interfaceC7565g, String str, boolean z7) {
        this.f13657a = interfaceC7565g;
        this.f13658b = str;
        Objects.requireNonNull(c3176b);
        this.f13659c = c3176b;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C3176b c3176b = this.f13659c;
        if (!c3176b.m16815D(30000L)) {
            zzie zzieVar = zzie.SERVICE_CONNECTION_NOT_READY;
            C3178d c3178d = AbstractC3163K.f13442j;
            c3176b.m16841e0(zzieVar, 9, c3178d);
            this.f13657a.mo27214a(c3178d, zzbt.zzk());
            return null;
        }
        String str = this.f13658b;
        if (TextUtils.isEmpty(str)) {
            zzc.zzn("BillingClient", "Please provide a valid product type.");
            zzie zzieVar2 = zzie.EMPTY_PRODUCT_TYPE;
            C3178d c3178d2 = AbstractC3163K.f13437e;
            c3176b.m16841e0(zzieVar2, 9, c3178d2);
            this.f13657a.mo27214a(c3178d2, zzbt.zzk());
            return null;
        }
        C7580v c7580vM16840d0 = c3176b.m16840d0(str, false, 9);
        if (c7580vM16840d0.m33269b() != null) {
            this.f13657a.mo27214a(c7580vM16840d0.m33268a(), c7580vM16840d0.m33269b());
            return null;
        }
        this.f13657a.mo27214a(c7580vM16840d0.m33268a(), zzbt.zzk());
        return null;
    }
}
