package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzil;

/* JADX INFO: loaded from: classes.dex */
public class ProxyBillingActivity extends Activity {

    /* JADX INFO: renamed from: a */
    private ResultReceiver f13465a;

    /* JADX INFO: renamed from: b */
    private boolean f13466b;

    /* JADX INFO: renamed from: c */
    private boolean f13467c;

    /* JADX INFO: renamed from: d */
    private int f13468d;

    /* JADX INFO: renamed from: e */
    private long f13469e;

    /* JADX INFO: renamed from: f */
    private boolean f13470f;

    /* JADX INFO: renamed from: a */
    private zzie m16779a(int i7) {
        if (i7 == -1) {
            return zzie.NULL_DATA_WITH_OK_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT;
        }
        if (i7 == 0) {
            return zzie.NULL_DATA_WITH_CANCELLED_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT;
        }
        if (i7 == 3) {
            return zzie.NULL_DATA_WITH_PLAY_CANCELED_RESULT_CODE;
        }
        if (i7 != 4) {
            return i7 != 5 ? zzie.NULL_DATA_WITH_OTHER_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT : zzie.NULL_DATA_WITH_ON_CREATE_RUNTIME_EXCEPTION_RESULT_CODE;
        }
        return zzie.NULL_DATA_WITH_PLAY_CANCELED_WITHOUT_COMPLETE_ACTION_RESULT_CODE;
    }

    /* JADX INFO: renamed from: b */
    private Intent m16780b(String str) {
        Intent intent = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
        intent.setPackage(getApplicationContext().getPackageName());
        intent.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", str);
        return intent;
    }

    /* JADX INFO: renamed from: c */
    private Intent m16781c(zzie zzieVar, long j7) {
        Intent intentM16782d = m16782d();
        intentM16782d.putExtra("RESPONSE_CODE", 6);
        intentM16782d.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
        C3178d.a aVarM16923d = C3178d.m16923d();
        aVarM16923d.m16933d(6);
        aVarM16923d.m16931b("An internal error occurred.");
        C3178d c3178dM16930a = aVarM16923d.m16930a();
        int i7 = AbstractC3161I.f13425a;
        intentM16782d.putExtra("FAILURE_LOGGING_PAYLOAD", AbstractC3161I.m16762b(zzieVar, 2, c3178dM16930a, null, zzil.BROADCAST_ACTION_UNSPECIFIED).zzM());
        intentM16782d.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
        intentM16782d.putExtra("billingClientTransactionId", j7);
        intentM16782d.putExtra("wasServiceAutoReconnected", this.f13470f);
        return intentM16782d;
    }

    /* JADX INFO: renamed from: d */
    private Intent m16782d() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i7, int i8, Intent intent) {
        Intent intentM16781c;
        super.onActivityResult(i7, i8, intent);
        if (i7 == 100 || i7 == 110) {
            int iM16929c = zzc.zzh(intent, "ProxyBillingActivity").m16929c();
            int i9 = -1;
            if (i8 != -1) {
                zzc.zzn("ProxyBillingActivity", "Activity finished with resultCode " + i8 + " and billing's responseCode: " + iM16929c);
                i9 = i8;
            } else if (iM16929c != 0) {
                i8 = -1;
                zzc.zzn("ProxyBillingActivity", "Activity finished with resultCode " + i8 + " and billing's responseCode: " + iM16929c);
                i9 = i8;
            }
            if (intent == null) {
                zzc.zzn("ProxyBillingActivity", "Got null data with resultCode " + i9 + "!");
                intentM16781c = m16781c(m16779a(i9), this.f13469e);
            } else if (intent.getExtras() != null) {
                String string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                if (string != null) {
                    intentM16781c = m16780b(string);
                    intentM16781c.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                } else {
                    intentM16781c = m16782d();
                    intentM16781c.putExtras(intent.getExtras());
                    intentM16781c.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                }
                intentM16781c.putExtra("billingClientTransactionId", this.f13469e);
                intentM16781c.putExtra("wasServiceAutoReconnected", this.f13470f);
            } else {
                zzc.zzn("ProxyBillingActivity", "Got null bundle!");
                intentM16781c = m16781c(zzie.NULL_BUNDLE_IN_ACTIVITY_RESULT, this.f13469e);
            }
            if (i7 == 110) {
                intentM16781c.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            sendBroadcast(intentM16781c);
        } else if (i7 == 101) {
            int iZza = zzc.zza(intent, "ProxyBillingActivity");
            ResultReceiver resultReceiver = this.f13465a;
            if (resultReceiver != null) {
                resultReceiver.send(iZza, intent == null ? null : intent.getExtras());
            }
        } else {
            zzc.zzn("ProxyBillingActivity", "Got onActivityResult with wrong requestCode: " + i7 + "; skipping...");
        }
        this.f13466b = false;
        finish();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle != null) {
            zzc.zzm("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f13466b = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("in_app_message_result_receiver")) {
                this.f13465a = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.f13467c = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            this.f13468d = bundle.getInt("activity_code", 100);
            if (bundle.containsKey("billingClientTransactionId")) {
                this.f13469e = bundle.getLong("billingClientTransactionId");
            }
            if (bundle.containsKey("wasServiceAutoReconnected")) {
                this.f13470f = bundle.getBoolean("wasServiceAutoReconnected");
                return;
            }
            return;
        }
        zzc.zzm("ProxyBillingActivity", "Launching Play Store billing flow");
        this.f13468d = 100;
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.f13467c = true;
                this.f13468d = 110;
            }
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.f13465a = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
            this.f13468d = 101;
        } else {
            pendingIntent = null;
        }
        if (getIntent().hasExtra("billingClientTransactionId")) {
            this.f13469e = getIntent().getLongExtra("billingClientTransactionId", 0L);
        }
        if (getIntent().hasExtra("wasServiceAutoReconnected")) {
            this.f13470f = getIntent().getBooleanExtra("wasServiceAutoReconnected", false);
        }
        try {
            this.f13466b = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), this.f13468d, new Intent(), 0, 0, 0);
        } catch (IntentSender.SendIntentException e7) {
            zzc.zzo("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e7);
            ResultReceiver resultReceiver = this.f13465a;
            if (resultReceiver != null) {
                resultReceiver.send(0, null);
            } else {
                Intent intentM16781c = m16781c(zzie.INTENT_SENDER_EXCEPTION, this.f13469e);
                if (this.f13467c) {
                    intentM16781c.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                }
                sendBroadcast(intentM16781c);
            }
            this.f13466b = false;
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.f13466b) {
            Intent intentM16782d = m16782d();
            intentM16782d.putExtra("RESPONSE_CODE", 1);
            intentM16782d.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            if (this.f13467c) {
                intentM16782d.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            int i7 = this.f13468d;
            if (i7 == 110 || i7 == 100) {
                intentM16782d.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                intentM16782d.putExtra("billingClientTransactionId", this.f13469e);
            }
            sendBroadcast(intentM16782d);
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f13465a;
        if (resultReceiver != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f13466b);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.f13467c);
        bundle.putInt("activity_code", this.f13468d);
        bundle.putLong("billingClientTransactionId", this.f13469e);
        bundle.putBoolean("wasServiceAutoReconnected", this.f13470f);
    }
}
