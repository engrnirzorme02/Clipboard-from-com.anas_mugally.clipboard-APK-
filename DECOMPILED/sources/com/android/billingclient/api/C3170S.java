package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.zzbt;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzeu;
import com.google.android.gms.internal.play_billing.zzhx;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzil;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: com.android.billingclient.api.S */
/* JADX INFO: loaded from: classes.dex */
final class C3170S extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    private boolean f13481a;

    /* JADX INFO: renamed from: b */
    private final boolean f13482b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C3171T f13483c;

    C3170S(C3171T c3171t, boolean z7) {
        Objects.requireNonNull(c3171t);
        this.f13483c = c3171t;
        this.f13482b = z7;
    }

    /* JADX INFO: renamed from: c */
    private final void m16793c(Bundle bundle, C3178d c3178d, int i7, zzil zzilVar, long j7, boolean z7) {
        try {
            if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") != null) {
                this.f13483c.f13486c.mo16770g(zzhx.zzA(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD"), zzeu.zza()), j7, z7);
            } else {
                this.f13483c.f13486c.mo16770g(AbstractC3161I.m16762b(zzie.BILLING_RESULT_RECEIVED_FROM_PHONESKY, i7, c3178d, null, zzilVar), j7, z7);
            }
        } catch (Throwable unused) {
            zzc.zzn("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m16794a(Context context, IntentFilter intentFilter) {
        try {
            if (this.f13481a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.f13482b ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f13481a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m16795b(Context context, IntentFilter intentFilter, String str) {
        C3170S c3170s;
        try {
            try {
                if (this.f13481a) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    c3170s = this;
                    context.registerReceiver(c3170s, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != this.f13482b ? 4 : 2);
                } else {
                    c3170s = this;
                    context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                c3170s.f13481a = true;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0039  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        byte b7;
        zzil zzilVar;
        int i7;
        C3178d c3178dZzh;
        int iIntValue;
        String action = intent.getAction();
        int iHashCode = action.hashCode();
        if (iHashCode != -1484087650) {
            if (iHashCode != -337612916) {
                if (iHashCode == 345207161 && action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
                    b7 = 2;
                } else {
                    b7 = -1;
                }
            } else if (action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
                b7 = 1;
            } else {
                b7 = -1;
            }
        } else if (action.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
            b7 = 0;
        } else {
            b7 = -1;
        }
        if (b7 == 0) {
            zzilVar = zzil.PURCHASES_UPDATED_ACTION;
        } else if (b7 != 1) {
            zzilVar = b7 != 2 ? zzil.BROADCAST_ACTION_UNSPECIFIED : zzil.ALTERNATIVE_BILLING_ACTION;
        } else {
            zzilVar = zzil.LOCAL_PURCHASES_UPDATED_ACTION;
        }
        zzil zzilVar2 = zzilVar;
        zzil zzilVar3 = zzil.LOCAL_PURCHASES_UPDATED_ACTION;
        if (zzilVar2.equals(zzilVar3) || zzilVar2.equals(zzil.ALTERNATIVE_BILLING_ACTION)) {
            i7 = 2;
        } else {
            i7 = zzilVar2.equals(zzil.PURCHASES_UPDATED_ACTION) ? 32 : 1;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            zzc.zzn("BillingBroadcastManager", "Bundle is null.");
            C3171T c3171t = this.f13483c;
            InterfaceC3162J interfaceC3162J = c3171t.f13486c;
            zzie zzieVar = zzie.NULL_BUNDLE_IN_BROADCAST_RECEIVER;
            C3178d c3178d = AbstractC3163K.f13440h;
            interfaceC3162J.mo16765b(AbstractC3161I.m16762b(zzieVar, i7, c3178d, null, zzilVar2));
            if (c3171t.f13485b != null) {
                c3171t.f13485b.mo15839D(c3178d, null);
            }
        } else {
            if (i7 == 2) {
                int i8 = zzc.zza;
                C3178d.a aVarM16923d = C3178d.m16923d();
                aVarM16923d.m16933d(zzc.zzb(intent.getExtras(), "BillingBroadcastManager"));
                Bundle extras2 = intent.getExtras();
                if (extras2 == null) {
                    zzc.zzn("BillingBroadcastManager", "Unexpected null bundle received!");
                } else {
                    Object obj = extras2.get("SUB_RESPONSE_CODE");
                    if (obj == null) {
                        zzc.zzm("BillingBroadcastManager", "getLaunchBillingFlowSubResponseCodeFromBundle() got null response code, assuming OK");
                    } else {
                        if (obj instanceof Integer) {
                            iIntValue = ((Integer) obj).intValue();
                        } else {
                            zzc.zzn("BillingBroadcastManager", "Unexpected type for bundle sub response code: ".concat(obj.getClass().getName()));
                        }
                        aVarM16923d.m16932c(iIntValue);
                        aVarM16923d.m16931b(zzc.zzj(intent.getExtras(), "BillingBroadcastManager"));
                        c3178dZzh = aVarM16923d.m16930a();
                    }
                }
                iIntValue = 0;
                aVarM16923d.m16932c(iIntValue);
                aVarM16923d.m16931b(zzc.zzj(intent.getExtras(), "BillingBroadcastManager"));
                c3178dZzh = aVarM16923d.m16930a();
            } else {
                c3178dZzh = zzc.zzh(intent, "BillingBroadcastManager");
            }
            C3178d c3178d2 = c3178dZzh;
            long j7 = extras.getLong("billingClientTransactionId", 0L);
            boolean z7 = extras.getBoolean("wasServiceAutoReconnected", false);
            if (zzilVar2.equals(zzil.PURCHASES_UPDATED_ACTION) || zzilVar2.equals(zzilVar3)) {
                List listZzl = zzc.zzl(extras);
                if (c3178d2.m16929c() == 0) {
                    this.f13483c.f13486c.mo16769f(AbstractC3161I.m16763c(i7, zzilVar2), j7, z7);
                } else {
                    m16793c(extras, c3178d2, i7, zzilVar2, j7, z7);
                }
                this.f13483c.f13485b.mo15839D(c3178d2, listZzl);
                return;
            }
            if (zzilVar2.equals(zzil.ALTERNATIVE_BILLING_ACTION)) {
                if (c3178d2.m16929c() != 0) {
                    m16793c(extras, c3178d2, i7, zzilVar2, j7, z7);
                    this.f13483c.f13485b.mo15839D(c3178d2, zzbt.zzk());
                    return;
                }
                C3171T c3171t2 = this.f13483c;
                C3171T.m16796a(c3171t2);
                C3171T.m16799e(c3171t2);
                zzc.zzn("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
                C3171T c3171t3 = this.f13483c;
                InterfaceC3162J interfaceC3162J2 = c3171t3.f13486c;
                zzie zzieVar2 = zzie.MISSING_USER_CHOICE_BILLING_LISTENER;
                C3178d c3178d3 = AbstractC3163K.f13440h;
                interfaceC3162J2.mo16770g(AbstractC3161I.m16762b(zzieVar2, i7, c3178d3, null, zzilVar2), j7, z7);
                c3171t3.f13485b.mo15839D(c3178d3, zzbt.zzk());
            }
        }
    }
}
