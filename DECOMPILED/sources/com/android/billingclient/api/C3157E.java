package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzcs;
import com.google.android.gms.internal.play_billing.zzie;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import p104N.InterfaceC0904a;

/* JADX INFO: renamed from: com.android.billingclient.api.E */
/* JADX INFO: loaded from: classes.dex */
final class C3157E implements zzcs {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ InterfaceC0904a f13414a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Runnable f13415b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C3160H f13416c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ int f13417d;

    C3157E(C3160H c3160h, int i7, InterfaceC0904a interfaceC0904a, Runnable runnable) {
        this.f13417d = i7;
        this.f13414a = interfaceC0904a;
        this.f13415b = runnable;
        Objects.requireNonNull(c3160h);
        this.f13416c = c3160h;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcs
    public final void zza(Throwable th) {
        if (th instanceof TimeoutException) {
            this.f13416c.m16740H0(zzie.BILLING_OVERRIDE_SERVICE_CALL_TIMEOUT, 28, AbstractC3163K.f13432F);
            zzc.zzo("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th);
        } else {
            this.f13416c.m16740H0(zzie.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION, 28, AbstractC3163K.f13432F);
            zzc.zzo("BillingClientTesting", "An error occurred while retrieving billing override.", th);
        }
        this.f13415b.run();
    }

    @Override // com.google.android.gms.internal.play_billing.zzcs
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Integer num = (Integer) obj;
        int iIntValue = num.intValue();
        C3160H c3160h = this.f13416c;
        if (!C3160H.m16737E0(iIntValue)) {
            this.f13415b.run();
        } else {
            this.f13414a.accept(c3160h.m16738F0(this.f13417d, num.intValue()));
        }
    }
}
