package com.android.billingclient.api;

import android.content.Context;
import com.google.android.datatransport.cct.C3236a;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzji;
import p198a2.AbstractC2188d;
import p198a2.C2187c;
import p198a2.InterfaceC2192h;
import p198a2.InterfaceC2193i;
import p216c2.C3005u;

/* JADX INFO: renamed from: com.android.billingclient.api.M */
/* JADX INFO: loaded from: classes.dex */
final class C3165M {

    /* JADX INFO: renamed from: a */
    private boolean f13461a;

    /* JADX INFO: renamed from: b */
    private InterfaceC2193i f13462b;

    C3165M(Context context) {
        try {
            C3005u.m14973f(context);
            this.f13462b = C3005u.m14971c().m14975g(C3236a.f13845g).mo8933a("PLAY_BILLING_LIBRARY", zzji.class, C2187c.m8925b("proto"), new InterfaceC2192h() { // from class: z1.s
                @Override // p198a2.InterfaceC2192h
                public final Object apply(Object obj) {
                    return ((zzji) obj).zzM();
                }
            });
        } catch (Throwable unused) {
            this.f13461a = true;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m16778a(zzji zzjiVar) {
        if (this.f13461a) {
            zzc.zzn("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            this.f13462b.mo8932b(AbstractC2188d.m8927f(zzjiVar));
        } catch (Throwable unused) {
            zzc.zzn("BillingLogger", "logging failed.");
        }
    }
}
