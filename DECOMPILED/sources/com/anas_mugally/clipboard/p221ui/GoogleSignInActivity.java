package com.anas_mugally.clipboard.p221ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC2473f;
import com.anas_mugally.clipboard.C3065o;
import com.anas_mugally.clipboard.R;
import com.anas_mugally.clipboard.p221ui.GoogleSignInActivity;
import com.anas_mugally.clipboard.p221ui.p222ai.utils.C3137d;
import com.google.android.gms.auth.api.signin.AbstractC3545a;
import com.google.android.gms.auth.api.signin.C3546b;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.C3554b;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AbstractC4854g;
import com.google.firebase.auth.AbstractC4880u;
import com.google.firebase.auth.AbstractC4885z;
import com.google.firebase.auth.FirebaseAuth;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p033E.C0247b;
import p111O.AbstractC1030Z;
import p111O.AbstractC1061m0;
import p111O.C0982A0;
import p111O.InterfaceC0993G;
import p145S5.C1444v;
import p223d.AbstractC5158A;
import p223d.AbstractC5166I;
import p233e1.AbstractC5315q;
import p238e6.InterfaceC5367l;
import p239f.AbstractC5382c;
import p239f.C5380a;
import p239f.InterfaceC5381b;
import p247g.C5449c;

/* JADX INFO: loaded from: classes.dex */
public final class GoogleSignInActivity extends AbstractViewOnClickListenerC3111a {

    /* JADX INFO: renamed from: j0 */
    public static final C3086a f12744j0 = new C3086a(null);

    /* JADX INFO: renamed from: f0 */
    private AbstractC5315q f12745f0;

    /* JADX INFO: renamed from: g0 */
    private C3546b f12746g0;

    /* JADX INFO: renamed from: h0 */
    private FirebaseAuth f12747h0;

    /* JADX INFO: renamed from: i0 */
    private AbstractC5382c f12748i0;

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.GoogleSignInActivity$a */
    public static final class C3086a {
        public /* synthetic */ C3086a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final Intent m15423a(Activity activity) {
            AbstractC6118n.m27187e(activity, "activity");
            return new Intent(activity, (Class<?>) GoogleSignInActivity.class);
        }

        private C3086a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A2 */
    public static final void m15397A2(GoogleSignInActivity googleSignInActivity, View view) {
        googleSignInActivity.setResult(1002);
        googleSignInActivity.finishAndRemoveTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B2 */
    public static final void m15398B2(GoogleSignInActivity googleSignInActivity, View view) {
        googleSignInActivity.mo12238b().m23939s();
    }

    /* JADX INFO: renamed from: C2 */
    private final void m15399C2() {
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
        getWindow().setFlags(512, 512);
    }

    /* JADX INFO: renamed from: D2 */
    private final void m15400D2(String str) {
        AbstractC5315q abstractC5315q = this.f12745f0;
        if (abstractC5315q == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5315q = null;
        }
        TextView textView = abstractC5315q.f20328F;
        textView.setText(str);
        textView.setVisibility(0);
    }

    /* JADX INFO: renamed from: E2 */
    private final void m15401E2() {
        AbstractC5315q abstractC5315q = this.f12745f0;
        if (abstractC5315q == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5315q = null;
        }
        abstractC5315q.f20324B.setVisibility(0);
        abstractC5315q.f20334x.setEnabled(false);
        abstractC5315q.f20335y.setEnabled(false);
        abstractC5315q.f20333w.setEnabled(false);
    }

    /* JADX INFO: renamed from: F2 */
    private final void m15402F2() {
        m15401E2();
        m15413q2();
        C3546b c3546b = this.f12746g0;
        AbstractC5382c abstractC5382c = null;
        if (c3546b == null) {
            AbstractC6118n.m27197o("googleSignInClient");
            c3546b = null;
        }
        Intent intentM17731d = c3546b.m17731d();
        AbstractC6118n.m27186d(intentM17731d, "getSignInIntent(...)");
        AbstractC5382c abstractC5382c2 = this.f12748i0;
        if (abstractC5382c2 == null) {
            AbstractC6118n.m27197o("signInLauncher");
        } else {
            abstractC5382c = abstractC5382c2;
        }
        abstractC5382c.m24394a(intentM17731d);
    }

    /* JADX INFO: renamed from: n2 */
    private final void m15410n2() {
        FirebaseAuth firebaseAuth = this.f12747h0;
        if (firebaseAuth == null) {
            AbstractC6118n.m27197o("auth");
            firebaseAuth = null;
        }
        AbstractC4880u abstractC4880uM21989e = firebaseAuth.m21989e();
        if (abstractC4880uM21989e == null || abstractC4880uM21989e.mo8712c0()) {
            return;
        }
        setResult(1001);
        finish();
    }

    /* JADX INFO: renamed from: o2 */
    private final void m15411o2(GoogleSignInAccount googleSignInAccount) {
        FirebaseAuth firebaseAuth = null;
        AbstractC4854g abstractC4854gM22063a = AbstractC4885z.m22063a(googleSignInAccount.m17691Y(), null);
        AbstractC6118n.m27186d(abstractC4854gM22063a, "getCredential(...)");
        FirebaseAuth firebaseAuth2 = this.f12747h0;
        if (firebaseAuth2 == null) {
            AbstractC6118n.m27197o("auth");
        } else {
            firebaseAuth = firebaseAuth2;
        }
        firebaseAuth.m21994j(abstractC4854gM22063a).addOnCompleteListener(this, new OnCompleteListener() { // from class: l1.Z
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                GoogleSignInActivity.m15412p2(this.f23994a, task);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p2 */
    public static final void m15412p2(GoogleSignInActivity googleSignInActivity, Task task) {
        AbstractC6118n.m27187e(task, "task");
        googleSignInActivity.m15414r2();
        if (task.isSuccessful()) {
            googleSignInActivity.setResult(1001);
            C3065o.f12624f.m15175a(googleSignInActivity).m15169k("email");
            googleSignInActivity.finish();
        } else {
            String string = googleSignInActivity.getString(R.string.authentication_failed);
            AbstractC6118n.m27186d(string, "getString(...)");
            googleSignInActivity.m15400D2(string);
        }
    }

    /* JADX INFO: renamed from: q2 */
    private final void m15413q2() {
        AbstractC5315q abstractC5315q = this.f12745f0;
        if (abstractC5315q == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5315q = null;
        }
        abstractC5315q.f20328F.setVisibility(8);
    }

    /* JADX INFO: renamed from: r2 */
    private final void m15414r2() {
        AbstractC5315q abstractC5315q = this.f12745f0;
        if (abstractC5315q == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5315q = null;
        }
        abstractC5315q.f20324B.setVisibility(8);
        abstractC5315q.f20334x.setEnabled(true);
        abstractC5315q.f20335y.setEnabled(true);
        abstractC5315q.f20333w.setEnabled(true);
    }

    /* JADX INFO: renamed from: s2 */
    private final boolean m15415s2() {
        return isInMultiWindowMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t2 */
    public static final C1444v m15416t2(GoogleSignInActivity googleSignInActivity, AbstractC5158A addCallback) {
        AbstractC6118n.m27187e(addCallback, "$this$addCallback");
        googleSignInActivity.setResult(0);
        addCallback.m23915j(false);
        googleSignInActivity.mo12238b().m23939s();
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: u2 */
    private final void m15417u2() {
        if (m15415s2()) {
            return;
        }
        AbstractC1061m0.m4703b(getWindow(), false);
        AbstractC5315q abstractC5315q = this.f12745f0;
        if (abstractC5315q == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5315q = null;
        }
        AbstractC1030Z.m4494t0(abstractC5315q.m10849k(), new InterfaceC0993G() { // from class: l1.Y
            @Override // p111O.InterfaceC0993G
            /* JADX INFO: renamed from: a */
            public final C0982A0 mo4369a(View view, C0982A0 c0982a0) {
                return GoogleSignInActivity.m15418v2(this.f23990a, view, c0982a0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v2 */
    public static final C0982A0 m15418v2(GoogleSignInActivity googleSignInActivity, View view, C0982A0 windowInsets) {
        AbstractC6118n.m27187e(view, "view");
        AbstractC6118n.m27187e(windowInsets, "windowInsets");
        C0247b c0247bM4272f = windowInsets.m4272f(C0982A0.p.m4332e());
        AbstractC6118n.m27186d(c0247bM4272f, "getInsets(...)");
        AbstractC5315q abstractC5315q = googleSignInActivity.f12745f0;
        if (abstractC5315q == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5315q = null;
        }
        ConstraintLayout layParent = abstractC5315q.f20323A;
        AbstractC6118n.m27186d(layParent, "layParent");
        layParent.setPadding(layParent.getPaddingLeft(), c0247bM4272f.f985b, layParent.getPaddingRight(), c0247bM4272f.f987d);
        return C0982A0.f3748b;
    }

    /* JADX INFO: renamed from: w2 */
    private final void m15419w2() {
        this.f12747h0 = FirebaseAuth.getInstance();
        GoogleSignInOptions googleSignInOptionsM17719a = new GoogleSignInOptions.C3544a(GoogleSignInOptions.f14470w).m17722d("187196074245-hghuqpqv4khukt4gmhsj215m3s7ud2ji.apps.googleusercontent.com").m17720b().m17719a();
        AbstractC6118n.m27186d(googleSignInOptionsM17719a, "build(...)");
        this.f12746g0 = AbstractC3545a.m17727a(this, googleSignInOptionsM17719a);
        this.f12748i0 = m23988A0(new C5449c(), new InterfaceC5381b() { // from class: l1.X
            @Override // p239f.InterfaceC5381b
            /* JADX INFO: renamed from: a */
            public final void mo12412a(Object obj) {
                GoogleSignInActivity.m15420x2(this.f23986a, (C5380a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x2 */
    public static final void m15420x2(GoogleSignInActivity googleSignInActivity, C5380a result) {
        AbstractC6118n.m27187e(result, "result");
        if (result.m24390b() != -1) {
            String string = googleSignInActivity.getString(R.string.google_sign_in_failed);
            AbstractC6118n.m27186d(string, "getString(...)");
            googleSignInActivity.m15400D2(string);
            googleSignInActivity.m15414r2();
            return;
        }
        Task taskM17729c = AbstractC3545a.m17729c(result.m24389a());
        AbstractC6118n.m27186d(taskM17729c, "getSignedInAccountFromIntent(...)");
        try {
            Object result2 = taskM17729c.getResult(C3554b.class);
            AbstractC6118n.m27184b(result2);
            googleSignInActivity.m15411o2((GoogleSignInAccount) result2);
        } catch (C3554b unused) {
            String string2 = googleSignInActivity.getString(R.string.google_sign_in_failed);
            AbstractC6118n.m27186d(string2, "getString(...)");
            googleSignInActivity.m15400D2(string2);
            googleSignInActivity.m15414r2();
        }
    }

    /* JADX INFO: renamed from: y2 */
    private final void m15421y2() {
        AbstractC5315q abstractC5315q = this.f12745f0;
        if (abstractC5315q == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5315q = null;
        }
        abstractC5315q.f20323A.setBackground(new C3137d(this, true).m16407d());
        abstractC5315q.f20334x.setOnClickListener(new View.OnClickListener() { // from class: l1.U
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GoogleSignInActivity.m15422z2(this.f23978a, view);
            }
        });
        abstractC5315q.f20335y.setOnClickListener(new View.OnClickListener() { // from class: l1.V
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GoogleSignInActivity.m15397A2(this.f23980a, view);
            }
        });
        abstractC5315q.f20333w.setOnClickListener(new View.OnClickListener() { // from class: l1.W
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GoogleSignInActivity.m15398B2(this.f23983a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z2 */
    public static final void m15422z2(GoogleSignInActivity googleSignInActivity, View view) {
        googleSignInActivity.m15402F2();
    }

    @Override // com.anas_mugally.clipboard.p221ui.AbstractViewOnClickListenerC3111a, com.anas_mugally.clipboard.p221ui.AbstractActivityC3140d, androidx.fragment.app.AbstractActivityC2592j, p223d.AbstractActivityC5187q, p017C.AbstractActivityC0106g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f12745f0 = (AbstractC5315q) AbstractC2473f.m10831j(this, R.layout.activity_google_sign_in);
        m15417u2();
        m15399C2();
        m15419w2();
        m15421y2();
        m15410n2();
        AbstractC5166I.m23950b(mo12238b(), this, false, new InterfaceC5367l() { // from class: l1.T
            @Override // p238e6.InterfaceC5367l
            public final Object invoke(Object obj) {
                return GoogleSignInActivity.m15416t2(this.f23974a, (AbstractC5158A) obj);
            }
        }, 2, null);
    }
}
