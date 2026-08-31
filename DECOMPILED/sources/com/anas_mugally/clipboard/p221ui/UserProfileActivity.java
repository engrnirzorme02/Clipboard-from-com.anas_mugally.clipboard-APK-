package com.anas_mugally.clipboard.p221ui;

import android.R;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.AbstractC2473f;
import com.anas_mugally.clipboard.p221ui.UserProfileActivity;
import com.anas_mugally.clipboard.p221ui.p222ai.utils.C3137d;
import com.bumptech.glide.C3211k;
import com.bumptech.glide.ComponentCallbacks2C3202b;
import com.google.android.gms.auth.api.signin.AbstractC3545a;
import com.google.android.gms.auth.api.signin.C3546b;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AbstractC4880u;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.InterfaceC4881v;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p033E.C0247b;
import p091L1.C0821n;
import p111O.AbstractC1030Z;
import p111O.AbstractC1061m0;
import p111O.C0982A0;
import p111O.InterfaceC0993G;
import p145S5.C1444v;
import p223d.AbstractC5158A;
import p223d.AbstractC5166I;
import p233e1.AbstractC5331y;
import p238e6.InterfaceC5367l;
import p405z3.C7611b;

/* JADX INFO: loaded from: classes.dex */
public final class UserProfileActivity extends AbstractViewOnClickListenerC3111a {

    /* JADX INFO: renamed from: i0 */
    public static final C3107a f12875i0 = new C3107a(null);

    /* JADX INFO: renamed from: f0 */
    private AbstractC5331y f12876f0;

    /* JADX INFO: renamed from: g0 */
    private FirebaseAuth f12877g0;

    /* JADX INFO: renamed from: h0 */
    private AbstractC4880u f12878h0;

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.UserProfileActivity$a */
    public static final class C3107a {
        public /* synthetic */ C3107a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final Intent m15760a(Activity activity) {
            AbstractC6118n.m27187e(activity, "activity");
            return new Intent(activity, (Class<?>) UserProfileActivity.class);
        }

        private C3107a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A2 */
    public static final void m15732A2(UserProfileActivity userProfileActivity, View view) {
        userProfileActivity.m15738G2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B2 */
    public static final void m15733B2(UserProfileActivity userProfileActivity, View view) {
        userProfileActivity.m15735D2();
    }

    /* JADX INFO: renamed from: C2 */
    private final void m15734C2() {
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
    }

    /* JADX INFO: renamed from: D2 */
    private final void m15735D2() {
        new C7611b(this).m33365P(R.string.dialog_alert_title).m33354E(com.anas_mugally.clipboard.R.string.delete_account_confirmation).m33361L(com.anas_mugally.clipboard.R.string.delete_account, new DialogInterface.OnClickListener() { // from class: l1.P1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i7) {
                UserProfileActivity.m15736E2(this.f23959a, dialogInterface, i7);
            }
        }).m33356G(com.anas_mugally.clipboard.R.string.cancel, null).m9118v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E2 */
    public static final void m15736E2(final UserProfileActivity userProfileActivity, DialogInterface dialogInterface, int i7) {
        Task taskM22057T;
        FirebaseAuth firebaseAuth = userProfileActivity.f12877g0;
        if (firebaseAuth == null) {
            AbstractC6118n.m27197o("auth");
            firebaseAuth = null;
        }
        AbstractC4880u abstractC4880uM21989e = firebaseAuth.m21989e();
        if (abstractC4880uM21989e == null || (taskM22057T = abstractC4880uM21989e.m22057T()) == null) {
            return;
        }
        taskM22057T.addOnCompleteListener(new OnCompleteListener() { // from class: l1.Q1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                UserProfileActivity.m15737F2(this.f23962a, task);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F2 */
    public static final void m15737F2(UserProfileActivity userProfileActivity, Task task) {
        AbstractC6118n.m27187e(task, "task");
        if (task.isSuccessful()) {
            userProfileActivity.m15753t2();
        }
    }

    /* JADX INFO: renamed from: G2 */
    private final void m15738G2() {
        new C7611b(this).m33365P(com.anas_mugally.clipboard.R.string.sign_out_title).m33354E(com.anas_mugally.clipboard.R.string.sign_out_message).m33361L(com.anas_mugally.clipboard.R.string.sign_out, new DialogInterface.OnClickListener() { // from class: l1.O1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i7) {
                UserProfileActivity.m15739H2(this.f23956a, dialogInterface, i7);
            }
        }).m33356G(com.anas_mugally.clipboard.R.string.cancel, null).m9118v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H2 */
    public static final void m15739H2(UserProfileActivity userProfileActivity, DialogInterface dialogInterface, int i7) {
        userProfileActivity.m15753t2();
    }

    /* JADX INFO: renamed from: p2 */
    private final String m15749p2(long j7) {
        if (j7 <= 0) {
            String string = getString(com.anas_mugally.clipboard.R.string.unknown);
            AbstractC6118n.m27184b(string);
            return string;
        }
        String str = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()).format(new Date(j7));
        AbstractC6118n.m27184b(str);
        return str;
    }

    /* JADX INFO: renamed from: q2 */
    private final boolean m15750q2() {
        return isInMultiWindowMode();
    }

    /* JADX INFO: renamed from: r2 */
    private final void m15751r2() {
        AbstractC4880u abstractC4880u = this.f12878h0;
        if (abstractC4880u != null) {
            AbstractC5331y abstractC5331y = this.f12876f0;
            if (abstractC5331y == null) {
                AbstractC6118n.m27197o("binding");
                abstractC5331y = null;
            }
            if (abstractC4880u.mo8708Y() != null) {
                AbstractC6118n.m27184b(((C3211k) ((C3211k) ((C3211k) ComponentCallbacks2C3202b.m16995u(this).m17078s(abstractC4880u.mo8708Y()).m6957f0(new C0821n())).m6942U(com.anas_mugally.clipboard.R.drawable.ic_account_circle)).m6958g(com.anas_mugally.clipboard.R.drawable.ic_account_circle)).m17065w0(abstractC5331y.f20428y));
            } else {
                abstractC5331y.f20428y.setImageResource(com.anas_mugally.clipboard.R.drawable.ic_account_circle);
            }
            TextView textView = abstractC5331y.f20424G;
            String strMo8704U = abstractC4880u.mo8704U();
            if (strMo8704U == null) {
                strMo8704U = getString(com.anas_mugally.clipboard.R.string.no_name);
                AbstractC6118n.m27186d(strMo8704U, "getString(...)");
            }
            textView.setText(strMo8704U);
            TextView textView2 = abstractC5331y.f20423F;
            String strMo8705V = abstractC4880u.mo8705V();
            if (strMo8705V == null) {
                strMo8705V = getString(com.anas_mugally.clipboard.R.string.no_email);
                AbstractC6118n.m27186d(strMo8705V, "getString(...)");
            }
            textView2.setText(strMo8705V);
            TextView textView3 = abstractC5331y.f20419B;
            InterfaceC4881v interfaceC4881vMo8706W = abstractC4880u.mo8706W();
            textView3.setText(getString(com.anas_mugally.clipboard.R.string.account_created, m15749p2(interfaceC4881vMo8706W != null ? interfaceC4881vMo8706W.mo8733q() : 0L)));
            TextView textView4 = abstractC5331y.f20422E;
            InterfaceC4881v interfaceC4881vMo8706W2 = abstractC4880u.mo8706W();
            textView4.setText(getString(com.anas_mugally.clipboard.R.string.last_sign_in, m15749p2(interfaceC4881vMo8706W2 != null ? interfaceC4881vMo8706W2.mo8734v() : 0L)));
            abstractC5331y.f20421D.setText(abstractC4880u.mo8701a() ? getString(com.anas_mugally.clipboard.R.string.email_verified) : getString(com.anas_mugally.clipboard.R.string.email_not_verified));
            abstractC5331y.f20427x.setVisibility(abstractC4880u.mo8701a() ? 0 : 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s2 */
    public static final C1444v m15752s2(UserProfileActivity userProfileActivity, AbstractC5158A addCallback) {
        AbstractC6118n.m27187e(addCallback, "$this$addCallback");
        userProfileActivity.setResult(-1);
        addCallback.m23915j(false);
        userProfileActivity.mo12238b().m23939s();
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: t2 */
    private final void m15753t2() {
        AbstractC5331y abstractC5331y = this.f12876f0;
        FirebaseAuth firebaseAuth = null;
        if (abstractC5331y == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5331y = null;
        }
        abstractC5331y.f20418A.setVisibility(0);
        AbstractC5331y abstractC5331y2 = this.f12876f0;
        if (abstractC5331y2 == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5331y2 = null;
        }
        abstractC5331y2.f20426w.setEnabled(false);
        FirebaseAuth firebaseAuth2 = this.f12877g0;
        if (firebaseAuth2 == null) {
            AbstractC6118n.m27197o("auth");
        } else {
            firebaseAuth = firebaseAuth2;
        }
        firebaseAuth.m21995k();
        GoogleSignInOptions googleSignInOptionsM17719a = new GoogleSignInOptions.C3544a(GoogleSignInOptions.f14470w).m17722d(getString(com.anas_mugally.clipboard.R.string.default_web_client_id)).m17720b().m17719a();
        AbstractC6118n.m27186d(googleSignInOptionsM17719a, "build(...)");
        C3546b c3546bM17727a = AbstractC3545a.m17727a(this, googleSignInOptionsM17719a);
        AbstractC6118n.m27186d(c3546bM17727a, "getClient(...)");
        c3546bM17727a.signOut().addOnCompleteListener(new OnCompleteListener() { // from class: l1.R1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                UserProfileActivity.m15754u2(this.f23966a, task);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u2 */
    public static final void m15754u2(UserProfileActivity userProfileActivity, Task it) {
        AbstractC6118n.m27187e(it, "it");
        AbstractC5331y abstractC5331y = userProfileActivity.f12876f0;
        AbstractC5331y abstractC5331y2 = null;
        if (abstractC5331y == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5331y = null;
        }
        abstractC5331y.f20418A.setVisibility(8);
        AbstractC5331y abstractC5331y3 = userProfileActivity.f12876f0;
        if (abstractC5331y3 == null) {
            AbstractC6118n.m27197o("binding");
        } else {
            abstractC5331y2 = abstractC5331y3;
        }
        abstractC5331y2.f20426w.setEnabled(true);
        userProfileActivity.setResult(2001);
        userProfileActivity.finish();
    }

    /* JADX INFO: renamed from: v2 */
    private final void m15755v2() {
        if (m15750q2()) {
            return;
        }
        AbstractC1061m0.m4703b(getWindow(), false);
        AbstractC5331y abstractC5331y = this.f12876f0;
        if (abstractC5331y == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5331y = null;
        }
        AbstractC1030Z.m4494t0(abstractC5331y.m10849k(), new InterfaceC0993G() { // from class: l1.K1
            @Override // p111O.InterfaceC0993G
            /* JADX INFO: renamed from: a */
            public final C0982A0 mo4369a(View view, C0982A0 c0982a0) {
                return UserProfileActivity.m15756w2(this.f23944a, view, c0982a0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w2 */
    public static final C0982A0 m15756w2(UserProfileActivity userProfileActivity, View view, C0982A0 windowInsets) {
        AbstractC6118n.m27187e(view, "view");
        AbstractC6118n.m27187e(windowInsets, "windowInsets");
        C0247b c0247bM4272f = windowInsets.m4272f(C0982A0.p.m4332e());
        AbstractC6118n.m27186d(c0247bM4272f, "getInsets(...)");
        AbstractC5331y abstractC5331y = userProfileActivity.f12876f0;
        if (abstractC5331y == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5331y = null;
        }
        LinearLayout layParent = abstractC5331y.f20429z;
        AbstractC6118n.m27186d(layParent, "layParent");
        layParent.setPadding(layParent.getPaddingLeft(), c0247bM4272f.f985b, layParent.getPaddingRight(), c0247bM4272f.f987d);
        return C0982A0.f3748b;
    }

    /* JADX INFO: renamed from: x2 */
    private final void m15757x2() {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        this.f12877g0 = firebaseAuth;
        if (firebaseAuth == null) {
            AbstractC6118n.m27197o("auth");
            firebaseAuth = null;
        }
        AbstractC4880u abstractC4880uM21989e = firebaseAuth.m21989e();
        this.f12878h0 = abstractC4880uM21989e;
        if (abstractC4880uM21989e == null) {
            finish();
        }
    }

    /* JADX INFO: renamed from: y2 */
    private final void m15758y2() {
        AbstractC5331y abstractC5331y = this.f12876f0;
        AbstractC5331y abstractC5331y2 = null;
        if (abstractC5331y == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5331y = null;
        }
        abstractC5331y.f20429z.setBackground(new C3137d(this, true).m16407d());
        AbstractC5331y abstractC5331y3 = this.f12876f0;
        if (abstractC5331y3 == null) {
            AbstractC6118n.m27197o("binding");
        } else {
            abstractC5331y2 = abstractC5331y3;
        }
        abstractC5331y2.f20425v.setOnClickListener(new View.OnClickListener() { // from class: l1.L1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserProfileActivity.m15759z2(this.f23948a, view);
            }
        });
        abstractC5331y2.f20426w.setOnClickListener(new View.OnClickListener() { // from class: l1.M1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserProfileActivity.m15732A2(this.f23951a, view);
            }
        });
        abstractC5331y2.f20420C.setOnClickListener(new View.OnClickListener() { // from class: l1.N1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserProfileActivity.m15733B2(this.f23953a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z2 */
    public static final void m15759z2(UserProfileActivity userProfileActivity, View view) {
        userProfileActivity.mo12238b().m23939s();
    }

    @Override // com.anas_mugally.clipboard.p221ui.AbstractViewOnClickListenerC3111a, com.anas_mugally.clipboard.p221ui.AbstractActivityC3140d, androidx.fragment.app.AbstractActivityC2592j, p223d.AbstractActivityC5187q, p017C.AbstractActivityC0106g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f12876f0 = (AbstractC5331y) AbstractC2473f.m10831j(this, com.anas_mugally.clipboard.R.layout.activity_user_profile);
        m15755v2();
        m15734C2();
        m15757x2();
        m15758y2();
        m15751r2();
        AbstractC5166I.m23950b(mo12238b(), this, false, new InterfaceC5367l() { // from class: l1.J1
            @Override // p238e6.InterfaceC5367l
            public final Object invoke(Object obj) {
                return UserProfileActivity.m15752s2(this.f23941a, (AbstractC5158A) obj);
            }
        }, 2, null);
    }
}
