package androidx.credentials.playservices;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p139S.AbstractC1381a;

/* JADX INFO: loaded from: classes.dex */
public class IdentityCredentialApiHiddenActivity extends Activity {

    /* JADX INFO: renamed from: c */
    public static final C2467a f9392c = new C2467a(null);

    /* JADX INFO: renamed from: a */
    private ResultReceiver f9393a;

    /* JADX INFO: renamed from: b */
    private boolean f9394b;

    /* JADX INFO: renamed from: androidx.credentials.playservices.IdentityCredentialApiHiddenActivity$a */
    public static final class C2467a {
        public /* synthetic */ C2467a(AbstractC6112h abstractC6112h) {
            this();
        }

        private C2467a() {
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m10815a(Bundle bundle) {
        if (bundle != null) {
            this.f9394b = bundle.getBoolean("androidx.credentials.playservices.AWAITING_RESULT", false);
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i7, int i8, Intent intent) {
        super.onActivityResult(i7, i8, intent);
        ResultReceiver resultReceiver = this.f9393a;
        if (resultReceiver != null) {
            AbstractC1381a.f4881a.m5948d(resultReceiver, i7, i8, intent);
        }
        this.f9394b = false;
        finish();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) throws IntentSender.SendIntentException {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra("RESULT_RECEIVER");
        this.f9393a = resultReceiver;
        if (resultReceiver == null) {
            finish();
        }
        m10815a(bundle);
        if (this.f9394b) {
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("EXTRA_GET_CREDENTIAL_INTENT");
        if (pendingIntent != null) {
            startIntentSenderForResult(pendingIntent.getIntentSender(), AbstractC1381a.f4881a.m5945a(), null, 0, 0, 0, null);
            return;
        }
        ResultReceiver resultReceiver2 = this.f9393a;
        if (resultReceiver2 != null) {
            AbstractC1381a.f4881a.m5947c(resultReceiver2, "GET_UNKNOWN", "Internal error");
        }
        finish();
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        AbstractC6118n.m27187e(outState, "outState");
        outState.putBoolean("androidx.credentials.playservices.AWAITING_RESULT", this.f9394b);
        super.onSaveInstanceState(outState);
    }
}
