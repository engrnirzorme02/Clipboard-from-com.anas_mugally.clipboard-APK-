package androidx.credentials.playservices;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.common.api.C3554b;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.AbstractC6119o;
import p114O2.AbstractC1125h;
import p114O2.C1119b;
import p114O2.C1120c;
import p114O2.C1124g;
import p114O2.C1127j;
import p114O2.C1128k;
import p139S.AbstractC1381a;
import p145S5.C1444v;
import p238e6.InterfaceC5367l;
import p243f3.AbstractC5435a;
import p259h3.C5633u;

/* JADX INFO: loaded from: classes.dex */
public class HiddenActivity extends Activity {

    /* JADX INFO: renamed from: c */
    public static final C2462a f9381c = new C2462a(null);

    /* JADX INFO: renamed from: a */
    private ResultReceiver f9382a;

    /* JADX INFO: renamed from: b */
    private boolean f9383b;

    /* JADX INFO: renamed from: androidx.credentials.playservices.HiddenActivity$a */
    public static final class C2462a {
        public /* synthetic */ C2462a(AbstractC6112h abstractC6112h) {
            this();
        }

        private C2462a() {
        }
    }

    /* JADX INFO: renamed from: androidx.credentials.playservices.HiddenActivity$b */
    static final class C2463b extends AbstractC6119o implements InterfaceC5367l {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f9385b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2463b(int i7) {
            super(1);
            this.f9385b = i7;
        }

        /* JADX INFO: renamed from: a */
        public final void m10811a(C1120c c1120c) {
            try {
                HiddenActivity.this.f9383b = true;
                HiddenActivity.this.startIntentSenderForResult(c1120c.m4927T().getIntentSender(), this.f9385b, null, 0, 0, 0, null);
            } catch (IntentSender.SendIntentException e7) {
                HiddenActivity hiddenActivity = HiddenActivity.this;
                ResultReceiver resultReceiver = hiddenActivity.f9382a;
                AbstractC6118n.m27184b(resultReceiver);
                hiddenActivity.m10810y(resultReceiver, "GET_UNKNOWN", "During begin sign in, one tap ui intent sender failure: " + e7.getMessage());
            }
        }

        @Override // p238e6.InterfaceC5367l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m10811a((C1120c) obj);
            return C1444v.f4971a;
        }
    }

    /* JADX INFO: renamed from: androidx.credentials.playservices.HiddenActivity$c */
    static final class C2464c extends AbstractC6119o implements InterfaceC5367l {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f9387b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2464c(int i7) {
            super(1);
            this.f9387b = i7;
        }

        /* JADX INFO: renamed from: a */
        public final void m10812a(C1128k c1128k) {
            try {
                HiddenActivity.this.f9383b = true;
                HiddenActivity.this.startIntentSenderForResult(c1128k.m4955T().getIntentSender(), this.f9387b, null, 0, 0, 0, null);
            } catch (IntentSender.SendIntentException e7) {
                HiddenActivity hiddenActivity = HiddenActivity.this;
                ResultReceiver resultReceiver = hiddenActivity.f9382a;
                AbstractC6118n.m27184b(resultReceiver);
                hiddenActivity.m10810y(resultReceiver, "CREATE_UNKNOWN", "During save password, found UI intent sender failure: " + e7.getMessage());
            }
        }

        @Override // p238e6.InterfaceC5367l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m10812a((C1128k) obj);
            return C1444v.f4971a;
        }
    }

    /* JADX INFO: renamed from: androidx.credentials.playservices.HiddenActivity$d */
    static final class C2465d extends AbstractC6119o implements InterfaceC5367l {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f9389b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2465d(int i7) {
            super(1);
            this.f9389b = i7;
        }

        /* JADX INFO: renamed from: a */
        public final void m10813a(PendingIntent result) {
            AbstractC6118n.m27187e(result, "result");
            try {
                HiddenActivity.this.f9383b = true;
                HiddenActivity.this.startIntentSenderForResult(result.getIntentSender(), this.f9389b, null, 0, 0, 0, null);
            } catch (IntentSender.SendIntentException e7) {
                HiddenActivity hiddenActivity = HiddenActivity.this;
                ResultReceiver resultReceiver = hiddenActivity.f9382a;
                AbstractC6118n.m27184b(resultReceiver);
                hiddenActivity.m10810y(resultReceiver, "CREATE_UNKNOWN", "During public key credential, found IntentSender failure on public key creation: " + e7.getMessage());
            }
        }

        @Override // p238e6.InterfaceC5367l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m10813a((PendingIntent) obj);
            return C1444v.f4971a;
        }
    }

    /* JADX INFO: renamed from: androidx.credentials.playservices.HiddenActivity$e */
    static final class C2466e extends AbstractC6119o implements InterfaceC5367l {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f9391b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2466e(int i7) {
            super(1);
            this.f9391b = i7;
        }

        /* JADX INFO: renamed from: a */
        public final void m10814a(PendingIntent pendingIntent) {
            try {
                HiddenActivity.this.f9383b = true;
                HiddenActivity.this.startIntentSenderForResult(pendingIntent.getIntentSender(), this.f9391b, null, 0, 0, 0, null);
            } catch (IntentSender.SendIntentException e7) {
                HiddenActivity hiddenActivity = HiddenActivity.this;
                ResultReceiver resultReceiver = hiddenActivity.f9382a;
                AbstractC6118n.m27184b(resultReceiver);
                hiddenActivity.m10810y(resultReceiver, "GET_UNKNOWN", "During get sign-in intent, one tap ui intent sender failure: " + e7.getMessage());
            }
        }

        @Override // p238e6.InterfaceC5367l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m10814a((PendingIntent) obj);
            return C1444v.f4971a;
        }
    }

    /* JADX INFO: renamed from: l */
    private final void m10797l() {
        Task taskAddOnFailureListener;
        C1119b c1119b = (C1119b) getIntent().getParcelableExtra("REQUEST_TYPE");
        int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
        if (c1119b != null) {
            Task taskBeginSignIn = AbstractC1125h.m4946b(this).beginSignIn(c1119b);
            final C2463b c2463b = new C2463b(intExtra);
            taskAddOnFailureListener = taskBeginSignIn.addOnSuccessListener(new OnSuccessListener() { // from class: R.g
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    HiddenActivity.m10798m(c2463b, obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: R.h
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    HiddenActivity.m10799n(this.f4589a, exc);
                }
            });
        } else {
            taskAddOnFailureListener = null;
        }
        if (taskAddOnFailureListener == null) {
            Log.i("HiddenActivity", "During begin sign in, params is null, nothing to launch for begin sign in");
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final void m10798m(InterfaceC5367l interfaceC5367l, Object obj) {
        interfaceC5367l.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final void m10799n(HiddenActivity hiddenActivity, Exception e7) {
        AbstractC6118n.m27187e(e7, "e");
        String str = ((e7 instanceof C3554b) && AbstractC1381a.f4881a.m5946b().contains(Integer.valueOf(((C3554b) e7).getStatusCode()))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
        ResultReceiver resultReceiver = hiddenActivity.f9382a;
        AbstractC6118n.m27184b(resultReceiver);
        hiddenActivity.m10810y(resultReceiver, str, "During begin sign in, failure response from one tap: " + e7.getMessage());
    }

    /* JADX INFO: renamed from: o */
    private final void m10800o() {
        Task taskAddOnFailureListener;
        C1127j c1127j = (C1127j) getIntent().getParcelableExtra("REQUEST_TYPE");
        int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
        if (c1127j != null) {
            Task taskSavePassword = AbstractC1125h.m4945a(this).savePassword(c1127j);
            final C2464c c2464c = new C2464c(intExtra);
            taskAddOnFailureListener = taskSavePassword.addOnSuccessListener(new OnSuccessListener() { // from class: R.c
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    HiddenActivity.m10801p(c2464c, obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: R.d
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    HiddenActivity.m10802q(this.f4585a, exc);
                }
            });
        } else {
            taskAddOnFailureListener = null;
        }
        if (taskAddOnFailureListener == null) {
            Log.i("HiddenActivity", "During save password, params is null, nothing to launch for create password");
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final void m10801p(InterfaceC5367l interfaceC5367l, Object obj) {
        interfaceC5367l.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final void m10802q(HiddenActivity hiddenActivity, Exception e7) {
        AbstractC6118n.m27187e(e7, "e");
        String str = ((e7 instanceof C3554b) && AbstractC1381a.f4881a.m5946b().contains(Integer.valueOf(((C3554b) e7).getStatusCode()))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
        ResultReceiver resultReceiver = hiddenActivity.f9382a;
        AbstractC6118n.m27184b(resultReceiver);
        hiddenActivity.m10810y(resultReceiver, str, "During save password, found password failure response from one tap " + e7.getMessage());
    }

    /* JADX INFO: renamed from: r */
    private final void m10803r() {
        Task taskAddOnFailureListener;
        C5633u c5633u = (C5633u) getIntent().getParcelableExtra("REQUEST_TYPE");
        int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
        if (c5633u != null) {
            Task taskM24669d = AbstractC5435a.m24642a(this).m24669d(c5633u);
            final C2465d c2465d = new C2465d(intExtra);
            taskAddOnFailureListener = taskM24669d.addOnSuccessListener(new OnSuccessListener() { // from class: R.a
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    HiddenActivity.m10804s(c2465d, obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: R.b
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    HiddenActivity.m10805t(this.f4583a, exc);
                }
            });
        } else {
            taskAddOnFailureListener = null;
        }
        if (taskAddOnFailureListener == null) {
            Log.w("HiddenActivity", "During create public key credential, request is null, so nothing to launch for public key credentials");
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final void m10804s(InterfaceC5367l interfaceC5367l, Object obj) {
        interfaceC5367l.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final void m10805t(HiddenActivity hiddenActivity, Exception e7) {
        AbstractC6118n.m27187e(e7, "e");
        String str = ((e7 instanceof C3554b) && AbstractC1381a.f4881a.m5946b().contains(Integer.valueOf(((C3554b) e7).getStatusCode()))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
        ResultReceiver resultReceiver = hiddenActivity.f9382a;
        AbstractC6118n.m27184b(resultReceiver);
        hiddenActivity.m10810y(resultReceiver, str, "During create public key credential, fido registration failure: " + e7.getMessage());
    }

    /* JADX INFO: renamed from: u */
    private final void m10806u() {
        Task taskAddOnFailureListener;
        C1124g c1124g = (C1124g) getIntent().getParcelableExtra("REQUEST_TYPE");
        int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
        if (c1124g != null) {
            Task signInIntent = AbstractC1125h.m4946b(this).getSignInIntent(c1124g);
            final C2466e c2466e = new C2466e(intExtra);
            taskAddOnFailureListener = signInIntent.addOnSuccessListener(new OnSuccessListener() { // from class: R.e
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    HiddenActivity.m10807v(c2466e, obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: R.f
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    HiddenActivity.m10808w(this.f4587a, exc);
                }
            });
        } else {
            taskAddOnFailureListener = null;
        }
        if (taskAddOnFailureListener == null) {
            Log.i("HiddenActivity", "During get sign-in intent, params is null, nothing to launch for get sign-in intent");
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final void m10807v(InterfaceC5367l interfaceC5367l, Object obj) {
        interfaceC5367l.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final void m10808w(HiddenActivity hiddenActivity, Exception e7) {
        AbstractC6118n.m27187e(e7, "e");
        String str = ((e7 instanceof C3554b) && AbstractC1381a.f4881a.m5946b().contains(Integer.valueOf(((C3554b) e7).getStatusCode()))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
        ResultReceiver resultReceiver = hiddenActivity.f9382a;
        AbstractC6118n.m27184b(resultReceiver);
        hiddenActivity.m10810y(resultReceiver, str, "During get sign-in intent, failure response from one tap: " + e7.getMessage());
    }

    /* JADX INFO: renamed from: x */
    private final void m10809x(Bundle bundle) {
        if (bundle != null) {
            this.f9383b = bundle.getBoolean("androidx.credentials.playservices.AWAITING_RESULT", false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public final void m10810y(ResultReceiver resultReceiver, String str, String str2) {
        AbstractC1381a.f4881a.m5947c(resultReceiver, str, str2);
        finish();
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i7, int i8, Intent intent) {
        super.onActivityResult(i7, i8, intent);
        ResultReceiver resultReceiver = this.f9382a;
        if (resultReceiver != null) {
            AbstractC1381a.f4881a.m5948d(resultReceiver, i7, i8, intent);
        }
        this.f9383b = false;
        finish();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        String stringExtra = getIntent().getStringExtra("TYPE");
        ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra("RESULT_RECEIVER");
        this.f9382a = resultReceiver;
        if (resultReceiver == null) {
            finish();
        }
        m10809x(bundle);
        if (this.f9383b) {
            return;
        }
        if (stringExtra != null) {
            switch (stringExtra.hashCode()) {
                case -441061071:
                    if (stringExtra.equals("BEGIN_SIGN_IN")) {
                        m10797l();
                        return;
                    }
                    break;
                case 15545322:
                    if (stringExtra.equals("CREATE_PUBLIC_KEY_CREDENTIAL")) {
                        m10803r();
                        return;
                    }
                    break;
                case 1246634622:
                    if (stringExtra.equals("CREATE_PASSWORD")) {
                        m10800o();
                        return;
                    }
                    break;
                case 1980564212:
                    if (stringExtra.equals("SIGN_IN_INTENT")) {
                        m10806u();
                        return;
                    }
                    break;
            }
        }
        Log.w("HiddenActivity", "Activity handed an unsupported type");
        finish();
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        AbstractC6118n.m27187e(outState, "outState");
        outState.putBoolean("androidx.credentials.playservices.AWAITING_RESULT", this.f9383b);
        super.onSaveInstanceState(outState);
    }
}
