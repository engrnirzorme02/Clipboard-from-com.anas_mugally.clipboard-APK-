package com.anas_mugally.clipboard.p221ui;

import android.app.Application;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Toast;
import androidx.databinding.AbstractC2473f;
import com.anas_mugally.clipboard.AbstractC3041D;
import com.anas_mugally.clipboard.C3034A;
import com.anas_mugally.clipboard.C3149w;
import com.anas_mugally.clipboard.R;
import com.anas_mugally.clipboard.p221ui.SettingActivity;
import com.android.billingclient.api.Purchase;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.textview.MaterialTextView;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p033E.C0247b;
import p111O.AbstractC1030Z;
import p111O.AbstractC1061m0;
import p111O.C0982A0;
import p111O.InterfaceC0993G;
import p145S5.AbstractC1430h;
import p145S5.C1444v;
import p145S5.InterfaceC1429g;
import p197a1.C2184c;
import p223d.AbstractC5158A;
import p223d.AbstractC5166I;
import p233e1.AbstractC5323u;
import p238e6.InterfaceC5356a;
import p238e6.InterfaceC5367l;
import p241f1.C5425w;
import p297m1.C6327h;
import p371v1.C7200a;

/* JADX INFO: loaded from: classes.dex */
public class SettingActivity extends AbstractViewOnClickListenerC3111a implements View.OnClickListener {

    /* JADX INFO: renamed from: o0 */
    public static final C3097a f12802o0 = new C3097a(null);

    /* JADX INFO: renamed from: p0 */
    private static final String f12803p0 = "notificationCenter";

    /* JADX INFO: renamed from: g0 */
    private boolean f12805g0;

    /* JADX INFO: renamed from: i0 */
    private C7200a f12807i0;

    /* JADX INFO: renamed from: m0 */
    private Handler f12811m0;

    /* JADX INFO: renamed from: n0 */
    private Runnable f12812n0;

    /* JADX INFO: renamed from: f0 */
    private final InterfaceC1429g f12804f0 = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: l1.d1
        @Override // p238e6.InterfaceC5356a
        public final Object invoke() {
            return Integer.valueOf(SettingActivity.m15590U2(this.f24013a));
        }
    });

    /* JADX INFO: renamed from: h0 */
    private final InterfaceC1429g f12806h0 = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: l1.e1
        @Override // p238e6.InterfaceC5356a
        public final Object invoke() {
            return Boolean.valueOf(SettingActivity.m15576G2(this.f24017a));
        }
    });

    /* JADX INFO: renamed from: j0 */
    private final InterfaceC1429g f12808j0 = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: l1.f1
        @Override // p238e6.InterfaceC5356a
        public final Object invoke() {
            return SettingActivity.m15579J2(this.f24020a);
        }
    });

    /* JADX INFO: renamed from: k0 */
    private final int f12809k0 = 1;

    /* JADX INFO: renamed from: l0 */
    private final InterfaceC1429g f12810l0 = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: l1.g1
        @Override // p238e6.InterfaceC5356a
        public final Object invoke() {
            return SettingActivity.m15615z2(this.f24024a);
        }
    });

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.SettingActivity$a */
    public static final class C3097a {
        public /* synthetic */ C3097a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final String m15617a() {
            return SettingActivity.f12803p0;
        }

        private C3097a() {
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.SettingActivity$b */
    public static final class C3098b implements C7200a.a {
        C3098b() {
        }

        @Override // p371v1.C7200a.a
        /* JADX INFO: renamed from: a */
        public void mo15618a(int i7, CharSequence errString) {
            AbstractC6118n.m27187e(errString, "errString");
        }

        @Override // p371v1.C7200a.a
        /* JADX INFO: renamed from: b */
        public void mo15619b() {
            new C2184c(SettingActivity.this).m8898y();
            SettingActivity.this.f12805g0 = true;
        }

        @Override // p371v1.C7200a.a
        /* JADX INFO: renamed from: c */
        public void mo15620c() {
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.SettingActivity$c */
    public static final class C3099c implements C7200a.b {
        C3099c() {
        }

        @Override // p371v1.C7200a.b
        /* JADX INFO: renamed from: a */
        public void mo15621a() {
            new C2184c(SettingActivity.this).m8898y();
            SettingActivity.this.f12805g0 = true;
        }

        @Override // p371v1.C7200a.b
        /* JADX INFO: renamed from: b */
        public void mo15622b() {
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.SettingActivity$d */
    public static final class RunnableC3100d implements Runnable {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ MaterialSwitch f12816b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ boolean f12817c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ CompoundButton.OnCheckedChangeListener f12818d;

        RunnableC3100d(MaterialSwitch materialSwitch, boolean z7, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
            this.f12816b = materialSwitch;
            this.f12817c = z7;
            this.f12818d = onCheckedChangeListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SettingActivity.this.isDestroyed() || SettingActivity.this.isFinishing()) {
                return;
            }
            try {
                this.f12816b.setOnCheckedChangeListener(null);
                this.f12816b.performClick();
                this.f12816b.setChecked(this.f12817c);
                this.f12816b.setOnCheckedChangeListener(this.f12818d);
                Handler handler = SettingActivity.this.f12811m0;
                if (handler != null) {
                    handler.postDelayed(this, 800L);
                }
            } catch (Exception unused) {
                SettingActivity.this.m15592W2();
                this.f12816b.setOnCheckedChangeListener(this.f12818d);
            }
        }
    }

    /* JADX INFO: renamed from: A2 */
    private final AbstractC5323u m15570A2() {
        Object value = this.f12810l0.getValue();
        AbstractC6118n.m27186d(value, "getValue(...)");
        return (AbstractC5323u) value;
    }

    /* JADX INFO: renamed from: B2 */
    private final boolean m15571B2() {
        return C3149w.f13206f.m16729c(this);
    }

    /* JADX INFO: renamed from: C2 */
    private final C3149w m15572C2() {
        return (C3149w) this.f12808j0.getValue();
    }

    /* JADX INFO: renamed from: D2 */
    private final boolean m15573D2() {
        return m15843T1().getBoolean(f12803p0, true);
    }

    /* JADX INFO: renamed from: E2 */
    private final int m15574E2() {
        return ((Number) this.f12804f0.getValue()).intValue();
    }

    /* JADX INFO: renamed from: F2 */
    private final boolean m15575F2() {
        return ((Boolean) this.f12806h0.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G2 */
    public static final boolean m15576G2(SettingActivity settingActivity) {
        return settingActivity.getIntent().getBooleanExtra("isFullScreenMode", false);
    }

    /* JADX INFO: renamed from: H2 */
    private final boolean m15577H2() {
        return isInMultiWindowMode();
    }

    /* JADX INFO: renamed from: I2 */
    private final boolean m15578I2() {
        return m15843T1().getBoolean(AbstractViewOnClickListenerC3111a.f12891X.m15852f(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J2 */
    public static final C3149w m15579J2(SettingActivity settingActivity) {
        C3149w.a aVar = C3149w.f13206f;
        Application application = settingActivity.getApplication();
        AbstractC6118n.m27186d(application, "getApplication(...)");
        return aVar.m16728b(application);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K2 */
    public static final C1444v m15580K2(String errorMessage) {
        AbstractC6118n.m27187e(errorMessage, "errorMessage");
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L2 */
    public static final void m15581L2(SettingActivity settingActivity, CompoundButton compoundButton, boolean z7) {
        AbstractC6118n.m27187e(compoundButton, "compoundButton");
        C3034A.f12453a.m15022I(settingActivity, z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M2 */
    public static final void m15582M2(SettingActivity settingActivity, final AbstractC5323u abstractC5323u, CompoundButton compoundButton, boolean z7) {
        AbstractC6118n.m27187e(compoundButton, "compoundButton");
        if (z7 && !settingActivity.m15571B2()) {
            AbstractActivityC3140d.m16464p1(settingActivity, new String[]{"android.permission.POST_NOTIFICATIONS"}, false, new InterfaceC5356a() { // from class: l1.W0
                @Override // p238e6.InterfaceC5356a
                public final Object invoke() {
                    return SettingActivity.m15583N2(abstractC5323u);
                }
            }, 2, null);
            abstractC5323u.f20379D.setChecked(false);
            return;
        }
        SharedPreferences.Editor editorM15844U1 = settingActivity.m15844U1();
        AbstractC6118n.m27184b(editorM15844U1);
        editorM15844U1.putBoolean(f12803p0, z7).apply();
        if (z7) {
            settingActivity.m15572C2().m16726l();
        } else {
            settingActivity.m15572C2().m16724e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N2 */
    public static final C1444v m15583N2(AbstractC5323u abstractC5323u) {
        Log.d("anas_permission", "functions");
        abstractC5323u.f20379D.setChecked(true);
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O2 */
    public static final void m15584O2(SettingActivity settingActivity, View view) {
        settingActivity.startActivity(new Intent(settingActivity.getApplication(), (Class<?>) AppIntroActivity.class).addFlags(settingActivity.m15574E2()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P2 */
    public static final void m15585P2(SettingActivity settingActivity, AbstractC5323u abstractC5323u, CompoundButton compoundButton, boolean z7) {
        AbstractC6118n.m27187e(compoundButton, "compoundButton");
        C3034A.f12453a.m15021H(settingActivity, z7);
        abstractC5323u.f20377B.setEnabled(!z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q2 */
    public static final void m15586Q2(SettingActivity settingActivity, View view) {
        settingActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R2 */
    public static final C1444v m15587R2(SettingActivity settingActivity, AbstractC5158A addCallback) {
        AbstractC6118n.m27187e(addCallback, "$this$addCallback");
        settingActivity.finishAndRemoveTask();
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: S2 */
    private final void m15588S2() {
        if (m15577H2()) {
            return;
        }
        AbstractC1061m0.m4703b(getWindow(), false);
        AbstractC1030Z.m4494t0(m15570A2().m10849k(), new InterfaceC0993G() { // from class: l1.V0
            @Override // p111O.InterfaceC0993G
            /* JADX INFO: renamed from: a */
            public final C0982A0 mo4369a(View view, C0982A0 c0982a0) {
                return SettingActivity.m15589T2(this.f23981a, view, c0982a0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T2 */
    public static final C0982A0 m15589T2(SettingActivity settingActivity, View view, C0982A0 windowInsets) {
        AbstractC6118n.m27187e(view, "view");
        AbstractC6118n.m27187e(windowInsets, "windowInsets");
        C0247b c0247bM4272f = windowInsets.m4272f(C0982A0.p.m4332e());
        AbstractC6118n.m27186d(c0247bM4272f, "getInsets(...)");
        MaterialToolbar toolbarMainActivity = settingActivity.m15570A2().f20388M;
        AbstractC6118n.m27186d(toolbarMainActivity, "toolbarMainActivity");
        toolbarMainActivity.setPadding(toolbarMainActivity.getPaddingLeft(), c0247bM4272f.f985b, toolbarMainActivity.getPaddingRight(), toolbarMainActivity.getPaddingBottom());
        if (C3034A.f12453a.m15018E(settingActivity)) {
            ScrollView scroll = settingActivity.m15570A2().f20376A;
            AbstractC6118n.m27186d(scroll, "scroll");
            scroll.setPadding(scroll.getPaddingLeft(), scroll.getPaddingTop(), c0247bM4272f.f986c, scroll.getPaddingBottom());
        }
        return C0982A0.f3748b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U2 */
    public static final int m15590U2(SettingActivity settingActivity) {
        return !settingActivity.m15575F2() ? 402653184 : 0;
    }

    /* JADX INFO: renamed from: V2 */
    private final void m15591V2() {
        C7200a.c cVar = C7200a.f28714h;
        String string = getString(R.string.fingerprint_authentication);
        AbstractC6118n.m27186d(string, "getString(...)");
        String string2 = getString(R.string.use_your_fingerprint_to_access_your_backup);
        AbstractC6118n.m27186d(string2, "getString(...)");
        String string3 = getString(R.string.cancel);
        AbstractC6118n.m27186d(string3, "getString(...)");
        this.f12807i0 = cVar.m31782a(this, string, string2, string3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W2 */
    public final void m15592W2() {
        Handler handler;
        Runnable runnable = this.f12812n0;
        if (runnable != null && (handler = this.f12811m0) != null) {
            handler.removeCallbacks(runnable);
        }
        this.f12812n0 = null;
        this.f12811m0 = null;
    }

    /* JADX INFO: renamed from: X2 */
    private final void m15593X2() {
        boolean z7 = m15845V1() || m15578I2();
        View viewInAppPurchasing = m15570A2().f20389N;
        AbstractC6118n.m27186d(viewInAppPurchasing, "viewInAppPurchasing");
        viewInAppPurchasing.setVisibility(z7 ? 0 : 8);
        MaterialTextView textviewInAppPurchasing = m15570A2().f20387L;
        AbstractC6118n.m27186d(textviewInAppPurchasing, "textviewInAppPurchasing");
        textviewInAppPurchasing.setVisibility(z7 ? 0 : 8);
        LinearLayout linearLayout = m15570A2().f20394z;
        AbstractC6118n.m27184b(linearLayout);
        linearLayout.setVisibility(m15845V1() ? 0 : 8);
        linearLayout.setOnClickListener(m15845V1() ? this : null);
        MaterialTextView materialTextView = m15570A2().f20391w;
        AbstractC6118n.m27184b(materialTextView);
        materialTextView.setVisibility(!m15845V1() && m15578I2() ? 0 : 8);
        materialTextView.setOnClickListener(materialTextView.getVisibility() == 0 ? this : null);
    }

    /* JADX INFO: renamed from: Y2 */
    private final void m15594Y2(MaterialSwitch materialSwitch, boolean z7, boolean z8, final CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener2 = new CompoundButton.OnCheckedChangeListener() { // from class: l1.X0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
                SettingActivity.m15595Z2(this.f23987a, onCheckedChangeListener, compoundButton, z9);
            }
        };
        materialSwitch.setChecked(z7);
        if (z8) {
            this.f12811m0 = new Handler(Looper.getMainLooper());
            RunnableC3100d runnableC3100d = new RunnableC3100d(materialSwitch, z7, onCheckedChangeListener2);
            this.f12812n0 = runnableC3100d;
            Handler handler = this.f12811m0;
            if (handler != null) {
                handler.post(runnableC3100d);
            }
        }
        materialSwitch.setOnCheckedChangeListener(onCheckedChangeListener2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z2 */
    public static final void m15595Z2(SettingActivity settingActivity, CompoundButton.OnCheckedChangeListener onCheckedChangeListener, CompoundButton view, boolean z7) {
        AbstractC6118n.m27187e(view, "view");
        settingActivity.m15592W2();
        onCheckedChangeListener.onCheckedChanged(view, z7);
    }

    /* JADX INFO: renamed from: y2 */
    private final void m15614y2() {
        C7200a c7200a = this.f12807i0;
        if (c7200a != null) {
            C7200a.m31774b(c7200a, 0, new C3098b(), new C3099c(), 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z2 */
    public static final AbstractC5323u m15615z2(SettingActivity settingActivity) {
        return (AbstractC5323u) AbstractC2473f.m10831j(settingActivity, R.layout.activity_setting);
    }

    @Override // com.anas_mugally.clipboard.p221ui.AbstractViewOnClickListenerC3111a
    /* JADX INFO: renamed from: W1 */
    public void mo15563W1(Purchase purchase) {
        AbstractC6118n.m27187e(purchase, "purchase");
        super.mo15563W1(purchase);
        Log.d("anas_purchasing", "invoke " + m15845V1());
        if (m15845V1()) {
            return;
        }
        Log.d("anas_purchasing", "invoke enter");
        m15593X2();
        setResult(-1);
    }

    @Override // com.anas_mugally.clipboard.p221ui.AbstractActivityC3140d
    /* JADX INFO: renamed from: k1 */
    protected void mo15616k1(String[] permissions) {
        AbstractC6118n.m27187e(permissions, "permissions");
        super.mo15616k1(permissions);
        m15570A2().f20379D.setEnabled(true);
    }

    @Override // com.anas_mugally.clipboard.p221ui.AbstractActivityC3140d, androidx.fragment.app.AbstractActivityC2592j, p223d.AbstractActivityC5187q, android.app.Activity
    protected void onActivityResult(int i7, int i8, Intent intent) throws FileNotFoundException {
        super.onActivityResult(i7, i8, intent);
        if (i8 == -1) {
            C2184c.b bVar = C2184c.f7064b;
            if (i7 == bVar.m8904b()) {
                C2184c c2184c = new C2184c(this);
                ContentResolver contentResolver = getContentResolver();
                AbstractC6118n.m27184b(intent);
                Uri data = intent.getData();
                AbstractC6118n.m27184b(data);
                OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(data);
                AbstractC6118n.m27184b(outputStreamOpenOutputStream);
                c2184c.m8896p(outputStreamOpenOutputStream);
                return;
            }
            if (i7 == bVar.m8905c()) {
                AbstractC6118n.m27184b(intent);
                intent.getData();
                C2184c c2184c2 = new C2184c(this);
                Uri data2 = intent.getData();
                AbstractC6118n.m27184b(data2);
                c2184c2.m8895A(data2);
                setResult(-1);
            }
        }
    }

    @Override // com.anas_mugally.clipboard.p221ui.AbstractViewOnClickListenerC3111a, android.view.View.OnClickListener
    public void onClick(View view) {
        super.onClick(view);
        AbstractC6118n.m27184b(view);
        switch (view.getId()) {
            case R.id.cancelSubscribe /* 2131296447 */:
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions"));
                    intent.setPackage("com.android.vending");
                    intent.addFlags(m15574E2());
                    startActivity(intent);
                } catch (Exception unused) {
                    Toast.makeText(this, R.string.error_open_app, 0).show();
                    return;
                }
                break;
            case R.id.customizeBubbleLayout /* 2131296507 */:
                startActivity(new Intent(this, (Class<?>) BubbleCustomizationActivity.class).addFlags(m15574E2()));
                break;
            case R.id.text_about_devs /* 2131297054 */:
                C3034A.f12453a.m15019F(this, "https://clipzboard.com/about-developer");
                break;
            case R.id.text_backup /* 2131297057 */:
                m15614y2();
                break;
            case R.id.text_error_report /* 2131297064 */:
                new C5425w(this).m24596f(true ^ m15845V1(), new InterfaceC5367l() { // from class: l1.U0
                    @Override // p238e6.InterfaceC5367l
                    public final Object invoke(Object obj) {
                        return SettingActivity.m15580K2((String) obj);
                    }
                });
                break;
            case R.id.text_my_app /* 2131297070 */:
                C3034A.f12453a.m15019F(this, AbstractC3041D.m15083h(this));
                break;
            case R.id.text_rate_app /* 2131297077 */:
                C6327h.f24159H0.m27281a().mo7649g2(m12232H0(), null);
                break;
            case R.id.text_restore /* 2131297078 */:
                new C2184c(this).m8897x();
                this.f12805g0 = true;
                break;
            case R.id.text_share_app /* 2131297084 */:
                Intent intent2 = new Intent("android.intent.action.SEND");
                intent2.setType("text/plain");
                intent2.putExtra("android.intent.extra.TEXT", getString(R.string.share_app_for_friend) + " \n \n" + AbstractC3041D.m15082g(this));
                intent2.addFlags(m15574E2());
                startActivity(intent2);
                break;
        }
    }

    @Override // com.anas_mugally.clipboard.p221ui.AbstractViewOnClickListenerC3111a, com.anas_mugally.clipboard.p221ui.AbstractActivityC3140d, androidx.fragment.app.AbstractActivityC2592j, p223d.AbstractActivityC5187q, p017C.AbstractActivityC0106g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        if (m15575F2()) {
            setTheme(R.style.Theme_SettingActivity);
        }
        super.onCreate(bundle);
        final AbstractC5323u abstractC5323uM15570A2 = m15570A2();
        if (m15575F2()) {
            AppBarLayout appBarMain = abstractC5323uM15570A2.f20390v;
            AbstractC6118n.m27186d(appBarMain, "appBarMain");
            appBarMain.setVisibility(0);
        }
        MaterialSwitch switchNotification = abstractC5323uM15570A2.f20379D;
        AbstractC6118n.m27186d(switchNotification, "switchNotification");
        m15594Y2(switchNotification, m15573D2() && m15571B2(), getIntent().getBooleanExtra("forEnableOrDisableNotification", false), new CompoundButton.OnCheckedChangeListener() { // from class: l1.T0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
                SettingActivity.m15582M2(this.f23975a, abstractC5323uM15570A2, compoundButton, z7);
            }
        });
        abstractC5323uM15570A2.f20393y.setOnClickListener(new View.OnClickListener() { // from class: l1.Y0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingActivity.m15584O2(this.f23991a, view);
            }
        });
        m15593X2();
        abstractC5323uM15570A2.f20381F.setOnClickListener(this);
        abstractC5323uM15570A2.f20385J.setOnClickListener(this);
        abstractC5323uM15570A2.f20392x.setOnClickListener(this);
        abstractC5323uM15570A2.f20380E.setOnClickListener(this);
        abstractC5323uM15570A2.f20386K.setOnClickListener(this);
        abstractC5323uM15570A2.f20384I.setOnClickListener(this);
        abstractC5323uM15570A2.f20382G.setOnClickListener(this);
        abstractC5323uM15570A2.f20383H.setOnClickListener(this);
        MaterialSwitch materialSwitch = abstractC5323uM15570A2.f20378C;
        C3034A c3034a = C3034A.f12453a;
        materialSwitch.setChecked(c3034a.m15040n(this));
        materialSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l1.Z0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
                SettingActivity.m15585P2(this.f23995a, abstractC5323uM15570A2, compoundButton, z7);
            }
        });
        MaterialSwitch materialSwitch2 = abstractC5323uM15570A2.f20377B;
        materialSwitch2.setChecked(c3034a.m15042q(this));
        materialSwitch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l1.a1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
                SettingActivity.m15581L2(this.f24001a, compoundButton, z7);
            }
        });
        m15570A2().f20388M.setNavigationOnClickListener(new View.OnClickListener() { // from class: l1.b1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingActivity.m15586Q2(this.f24004a, view);
            }
        });
        m15588S2();
        m15591V2();
        AbstractC5166I.m23950b(mo12238b(), this, false, new InterfaceC5367l() { // from class: l1.c1
            @Override // p238e6.InterfaceC5367l
            public final Object invoke(Object obj) {
                return SettingActivity.m15587R2(this.f24010a, (AbstractC5158A) obj);
            }
        }, 2, null);
    }

    @Override // androidx.appcompat.app.AbstractActivityC2242c, androidx.fragment.app.AbstractActivityC2592j, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        m15592W2();
        finishAndRemoveTask();
    }

    @Override // androidx.fragment.app.AbstractActivityC2592j, android.app.Activity
    protected void onPause() {
        super.onPause();
        m15592W2();
    }
}
