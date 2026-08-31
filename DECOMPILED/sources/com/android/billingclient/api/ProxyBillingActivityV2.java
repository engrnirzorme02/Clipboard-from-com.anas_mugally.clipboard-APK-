package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzie;
import p223d.AbstractActivityC5187q;
import p239f.AbstractC5382c;
import p239f.C5380a;
import p239f.C5387h;
import p239f.InterfaceC5381b;
import p247g.C5450d;

/* JADX INFO: loaded from: classes.dex */
public class ProxyBillingActivityV2 extends AbstractActivityC5187q {

    /* JADX INFO: renamed from: H */
    private AbstractC5382c f13471H;

    /* JADX INFO: renamed from: I */
    private AbstractC5382c f13472I;

    /* JADX INFO: renamed from: J */
    private AbstractC5382c f13473J;

    /* JADX INFO: renamed from: K */
    private ResultReceiver f13474K;

    /* JADX INFO: renamed from: L */
    private ResultReceiver f13475L;

    /* JADX INFO: renamed from: M */
    private ResultReceiver f13476M;

    /* JADX INFO: renamed from: C0 */
    final void m16783C0(C5380a c5380a) {
        Intent intentM24389a = c5380a.m24389a();
        int iM16929c = zzc.zzh(intentM24389a, "ProxyBillingActivityV2").m16929c();
        ResultReceiver resultReceiver = this.f13474K;
        if (resultReceiver != null) {
            resultReceiver.send(iM16929c, intentM24389a == null ? null : intentM24389a.getExtras());
        }
        if (c5380a.m24390b() != -1 || iM16929c != 0) {
            zzc.zzn("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + c5380a.m24390b() + " and billing's responseCode: " + iM16929c);
        }
        finish();
    }

    /* JADX INFO: renamed from: D0 */
    final void m16784D0(C5380a c5380a) {
        Intent intentM24389a = c5380a.m24389a();
        int iM16929c = zzc.zzh(intentM24389a, "ProxyBillingActivityV2").m16929c();
        ResultReceiver resultReceiver = this.f13475L;
        if (resultReceiver != null) {
            resultReceiver.send(iM16929c, intentM24389a == null ? null : intentM24389a.getExtras());
        }
        if (c5380a.m24390b() != -1 || iM16929c != 0) {
            zzc.zzn("ProxyBillingActivityV2", String.format("External offer dialog finished with resultCode: %s and billing's responseCode: %s", Integer.valueOf(c5380a.m24390b()), Integer.valueOf(iM16929c)));
        }
        finish();
    }

    /* JADX INFO: renamed from: E0 */
    final void m16785E0(C5380a c5380a) {
        Intent intentM24389a = c5380a.m24389a();
        Bundle extras = intentM24389a == null ? null : intentM24389a.getExtras();
        if (c5380a.m24390b() != -1) {
            if (extras == null) {
                extras = new Bundle();
            }
            zzc.zzn("ProxyBillingActivityV2", String.format("External offer flow finished with resultCode: %s", Integer.valueOf(c5380a.m24390b())));
            extras.putInt("INTERNAL_LOG_ERROR_REASON", zzie.ERROR_IN_ACTIVITY_RESULT.zza());
            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", String.format("External offer flow finished with error resultCode: %s", Integer.valueOf(c5380a.m24390b())));
        }
        int iM16929c = zzc.zzh(intentM24389a, "ProxyBillingActivityV2").m16929c();
        ResultReceiver resultReceiver = this.f13476M;
        if (resultReceiver != null) {
            resultReceiver.send(iM16929c, extras);
        } else {
            zzc.zzn("ProxyBillingActivityV2", "External offer flow result receiver is null");
        }
        if (iM16929c != 0) {
            zzc.zzn("ProxyBillingActivityV2", String.format("External offer flow finished with billing responseCode: %s", Integer.valueOf(iM16929c)));
        }
        finish();
    }

    @Override // p223d.AbstractActivityC5187q, p017C.AbstractActivityC0106g, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13471H = m23988A0(new C5450d(), new InterfaceC5381b() { // from class: com.android.billingclient.api.O
            @Override // p239f.InterfaceC5381b
            /* JADX INFO: renamed from: a */
            public final void mo12412a(Object obj) {
                this.f13463a.m16783C0((C5380a) obj);
            }
        });
        this.f13472I = m23988A0(new C5450d(), new InterfaceC5381b() { // from class: com.android.billingclient.api.P
            @Override // p239f.InterfaceC5381b
            /* JADX INFO: renamed from: a */
            public final void mo12412a(Object obj) {
                this.f13464a.m16784D0((C5380a) obj);
            }
        });
        this.f13473J = m23988A0(new C5450d(), new InterfaceC5381b() { // from class: com.android.billingclient.api.Q
            @Override // p239f.InterfaceC5381b
            /* JADX INFO: renamed from: a */
            public final void mo12412a(Object obj) {
                this.f13480a.m16785E0((C5380a) obj);
            }
        });
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.f13474K = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
            }
            if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                this.f13475L = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
            }
            if (bundle.containsKey("external_offer_flow_result_receiver")) {
                this.f13476M = (ResultReceiver) bundle.getParcelable("external_offer_flow_result_receiver");
                return;
            }
            return;
        }
        zzc.zzm("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.f13474K = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            this.f13471H.m24394a(new C5387h.a(pendingIntent).m24420a());
        } else if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.f13475L = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            this.f13472I.m24394a(new C5387h.a(pendingIntent2).m24420a());
        } else if (getIntent().hasExtra("external_offer_flow_pending_intent")) {
            PendingIntent pendingIntent3 = (PendingIntent) getIntent().getParcelableExtra("external_offer_flow_pending_intent");
            this.f13476M = (ResultReceiver) getIntent().getParcelableExtra("external_offer_flow_result_receiver");
            this.f13473J.m24394a(new C5387h.a(pendingIntent3).m24420a());
        }
    }

    @Override // p223d.AbstractActivityC5187q, p017C.AbstractActivityC0106g, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f13474K;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f13475L;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
        ResultReceiver resultReceiver3 = this.f13476M;
        if (resultReceiver3 != null) {
            bundle.putParcelable("external_offer_flow_result_receiver", resultReceiver3);
        }
    }
}
