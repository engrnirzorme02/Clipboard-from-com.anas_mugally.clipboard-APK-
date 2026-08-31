package com.anas_mugally.clipboard.p221ui.accessibilitySetting;

import android.app.Application;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AbstractActivityC2242c;
import androidx.appcompat.app.DialogInterfaceC2241b;
import androidx.databinding.AbstractC2473f;
import androidx.lifecycle.AbstractC2658t;
import com.anas_mugally.clipboard.AbstractC3041D;
import com.anas_mugally.clipboard.AbstractC3081u;
import com.anas_mugally.clipboard.C3034A;
import com.anas_mugally.clipboard.C3065o;
import com.anas_mugally.clipboard.R;
import com.anas_mugally.clipboard.broadcastReceiver.ShowOrHidePrimaryBubbleReceiver;
import com.anas_mugally.clipboard.database.AppDatabase;
import com.anas_mugally.clipboard.p221ui.AppEnableProFeaturesActivity;
import com.anas_mugally.clipboard.p221ui.AppIntroActivity;
import com.anas_mugally.clipboard.p221ui.BubbleCustomizationActivity;
import com.anas_mugally.clipboard.p221ui.accessibilitySetting.AccessibilitySettingActivity;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.slider.Slider;
import com.google.android.material.textview.MaterialTextView;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.AbstractC6097l;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p000.C5379f;
import p033E.C0247b;
import p111O.AbstractC1030Z;
import p111O.AbstractC1047f0;
import p111O.AbstractC1061m0;
import p111O.C0982A0;
import p111O.InterfaceC0993G;
import p145S5.AbstractC1430h;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p145S5.InterfaceC1429g;
import p152T5.AbstractC1631j;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p223d.AbstractC5158A;
import p223d.AbstractC5166I;
import p233e1.AbstractC5283a;
import p238e6.InterfaceC5356a;
import p238e6.InterfaceC5367l;
import p238e6.InterfaceC5371p;
import p241f1.C5406d;
import p241f1.C5411i;
import p241f1.ViewOnClickListenerC5402G;
import p278j6.AbstractC5905g;
import p281k1.SharedPreferencesOnSharedPreferenceChangeListenerC5948g0;
import p318o6.AbstractC6672k;
import p318o6.C6656c0;
import p318o6.InterfaceC6624N;
import p405z3.C7611b;

/* JADX INFO: loaded from: classes.dex */
public class AccessibilitySettingActivity extends AbstractActivityC2242c implements View.OnClickListener {

    /* JADX INFO: renamed from: V */
    public static final C3112a f12918V = new C3112a(null);

    /* JADX INFO: renamed from: W */
    private static boolean f12919W;

    /* JADX INFO: renamed from: X */
    private static boolean f12920X;

    /* JADX INFO: renamed from: O */
    private C3113b f12921O;

    /* JADX INFO: renamed from: R */
    private AbstractC5283a f12924R;

    /* JADX INFO: renamed from: S */
    private Handler f12925S;

    /* JADX INFO: renamed from: T */
    private Runnable f12926T;

    /* JADX INFO: renamed from: P */
    private final InterfaceC1429g f12922P = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: n1.O
        @Override // p238e6.InterfaceC5356a
        public final Object invoke() {
            return AccessibilitySettingActivity.m15882H2(this.f24494a);
        }
    });

    /* JADX INFO: renamed from: Q */
    private final InterfaceC1429g f12923Q = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: n1.P
        @Override // p238e6.InterfaceC5356a
        public final Object invoke() {
            return AccessibilitySettingActivity.m15908Q2(this.f24495a);
        }
    });

    /* JADX INFO: renamed from: U */
    private final InterfaceC1429g f12927U = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: n1.Q
        @Override // p238e6.InterfaceC5356a
        public final Object invoke() {
            return Integer.valueOf(AccessibilitySettingActivity.m15959f3());
        }
    });

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.accessibilitySetting.AccessibilitySettingActivity$a */
    public static final class C3112a {
        public /* synthetic */ C3112a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final boolean m16032a() {
            return AccessibilitySettingActivity.f12919W;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m16033b() {
            return AccessibilitySettingActivity.f12920X;
        }

        /* JADX INFO: renamed from: c */
        public final void m16034c(boolean z7) {
            AccessibilitySettingActivity.f12920X = z7;
        }

        private C3112a() {
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.accessibilitySetting.AccessibilitySettingActivity$b */
    public final class C3113b {

        /* JADX INFO: renamed from: a */
        private final AbstractActivityC2242c f12928a;

        /* JADX INFO: renamed from: b */
        private boolean f12929b;

        /* JADX INFO: renamed from: c */
        private MaterialButton f12930c;

        /* JADX INFO: renamed from: d */
        private MaterialButton f12931d;

        /* JADX INFO: renamed from: e */
        private MaterialButton f12932e;

        /* JADX INFO: renamed from: f */
        private DialogInterfaceC2241b f12933f;

        /* JADX INFO: renamed from: g */
        private InterfaceC5356a f12934g;

        /* JADX INFO: renamed from: h */
        private InterfaceC5356a f12935h;

        /* JADX INFO: renamed from: i */
        final /* synthetic */ AccessibilitySettingActivity f12936i;

        public C3113b(AccessibilitySettingActivity accessibilitySettingActivity, AbstractActivityC2242c activity) {
            AbstractC6118n.m27187e(activity, "activity");
            this.f12936i = accessibilitySettingActivity;
            this.f12928a = activity;
        }

        /* JADX INFO: renamed from: f */
        private final void m16040f() {
            if (!AbstractC3041D.m15080e(this.f12936i)) {
                Application application = this.f12936i.getApplication();
                AbstractC6118n.m27186d(application, "getApplication(...)");
                if (AbstractC3081u.m15314a(application)) {
                    InterfaceC5356a interfaceC5356a = this.f12934g;
                    if (interfaceC5356a != null) {
                        interfaceC5356a.invoke();
                    }
                    m16050g();
                    return;
                }
            }
            Toast.makeText(this.f12928a, R.string.please_grant_all_permissions, 0).show();
        }

        /* JADX INFO: renamed from: j */
        private final void m16041j() {
            MaterialButton materialButton = this.f12932e;
            MaterialButton materialButton2 = null;
            if (materialButton == null) {
                AbstractC6118n.m27197o("doneButton");
                materialButton = null;
            }
            materialButton.setOnClickListener(new View.OnClickListener() { // from class: n1.V
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AccessibilitySettingActivity.C3113b.m16042k(this.f24499a, view);
                }
            });
            MaterialButton materialButton3 = this.f12930c;
            if (materialButton3 == null) {
                AbstractC6118n.m27197o("showOverAppsButton");
                materialButton3 = null;
            }
            final AccessibilitySettingActivity accessibilitySettingActivity = this.f12936i;
            materialButton3.setOnClickListener(new View.OnClickListener() { // from class: n1.W
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AccessibilitySettingActivity.C3113b.m16043l(this.f24500a, accessibilitySettingActivity, view);
                }
            });
            MaterialButton materialButton4 = this.f12931d;
            if (materialButton4 == null) {
                AbstractC6118n.m27197o("accessibilityButton");
            } else {
                materialButton2 = materialButton4;
            }
            final AccessibilitySettingActivity accessibilitySettingActivity2 = this.f12936i;
            materialButton2.setOnClickListener(new View.OnClickListener() { // from class: n1.X
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AccessibilitySettingActivity.C3113b.m16044m(this.f24502a, accessibilitySettingActivity2, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: k */
        public static final void m16042k(C3113b c3113b, View view) {
            c3113b.m16040f();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: l */
        public static final void m16043l(C3113b c3113b, AccessibilitySettingActivity accessibilitySettingActivity, View view) {
            c3113b.m16047q();
            if (AbstractC3041D.m15080e(accessibilitySettingActivity)) {
                C3034A.f12453a.m15030d(c3113b.f12928a);
                c3113b.f12929b = true;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: m */
        public static final void m16044m(C3113b c3113b, AccessibilitySettingActivity accessibilitySettingActivity, View view) {
            c3113b.m16047q();
            if (AbstractC3041D.m15080e(accessibilitySettingActivity)) {
                Toast.makeText(c3113b.f12928a, R.string.first_please_enbale_show_over_app, 0).show();
            } else {
                accessibilitySettingActivity.m15902O2();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: o */
        public static final void m16045o(C3113b c3113b, DialogInterface dialogInterface) {
            c3113b.m16047q();
        }

        /* JADX INFO: renamed from: p */
        private final void m16046p() {
            AccessibilitySettingActivity accessibilitySettingActivity = this.f12936i;
            Intent intent = new Intent(this.f12936i.getApplication(), (Class<?>) ShowOrHidePrimaryBubbleReceiver.class);
            intent.setAction("com.anas_mugally.clipboard.SHOW_HIDE_WITH_VALUE_PRIMARY_BUBBLE_ACTION");
            intent.putExtra("state", true);
            accessibilitySettingActivity.sendBroadcast(intent);
        }

        /* JADX INFO: renamed from: q */
        private final void m16047q() {
            MaterialButton materialButton = null;
            if (this.f12929b && this.f12936i.f12921O != null) {
                C5379f.m24387e(new C5379f(this.f12936i, new InterfaceC5356a() { // from class: n1.U
                    @Override // p238e6.InterfaceC5356a
                    public final Object invoke() {
                        return AccessibilitySettingActivity.C3113b.m16048r(this.f24498a);
                    }
                }), 0L, 1, null);
                this.f12929b = false;
            }
            Application application = this.f12936i.getApplication();
            AbstractC6118n.m27186d(application, "getApplication(...)");
            boolean zM15314a = AbstractC3081u.m15314a(application);
            MaterialButton materialButton2 = this.f12931d;
            if (materialButton2 == null) {
                AbstractC6118n.m27197o("accessibilityButton");
            } else {
                materialButton = materialButton2;
            }
            m16049s(materialButton, zM15314a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: r */
        public static final C1444v m16048r(C3113b c3113b) {
            MaterialButton materialButton = c3113b.f12930c;
            if (materialButton == null) {
                AbstractC6118n.m27197o("showOverAppsButton");
                materialButton = null;
            }
            c3113b.m16049s(materialButton, true);
            c3113b.m16046p();
            return C1444v.f4971a;
        }

        /* JADX INFO: renamed from: s */
        private final void m16049s(MaterialButton materialButton, boolean z7) {
            materialButton.setIconResource(z7 ? R.drawable.ic_round_check_circle_outline_24 : R.drawable.ic_round_error_outline_24);
            materialButton.setIconTintResource(z7 ? android.R.color.holo_green_light : android.R.color.holo_red_light);
            materialButton.setEnabled(!z7);
        }

        /* JADX INFO: renamed from: g */
        public final void m16050g() {
            DialogInterfaceC2241b dialogInterfaceC2241b = this.f12933f;
            if (dialogInterfaceC2241b != null) {
                dialogInterfaceC2241b.dismiss();
            }
            InterfaceC5356a interfaceC5356a = this.f12935h;
            if (interfaceC5356a != null) {
                interfaceC5356a.invoke();
            }
        }

        /* JADX INFO: renamed from: h */
        public final C3113b m16051h(InterfaceC5356a listener) {
            AbstractC6118n.m27187e(listener, "listener");
            this.f12935h = listener;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public final C3113b m16052i(InterfaceC5356a listener) {
            AbstractC6118n.m27187e(listener, "listener");
            this.f12934g = listener;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public final void m16053n() {
            View viewInflate = LayoutInflater.from(this.f12928a).inflate(R.layout.dialog_permissions, (ViewGroup) null);
            this.f12932e = (MaterialButton) viewInflate.findViewById(R.id.btnDone);
            this.f12930c = (MaterialButton) viewInflate.findViewById(R.id.btnShowOverApps);
            this.f12931d = (MaterialButton) viewInflate.findViewById(R.id.btnAccessibility);
            this.f12933f = new C7611b(this.f12928a).m33365P(R.string.required_permissions_title).mo9117u(viewInflate).mo9097a();
            m16041j();
            DialogInterfaceC2241b dialogInterfaceC2241b = this.f12933f;
            if (dialogInterfaceC2241b != null) {
                dialogInterfaceC2241b.show();
            }
            DialogInterfaceC2241b dialogInterfaceC2241b2 = this.f12933f;
            if (dialogInterfaceC2241b2 != null) {
                dialogInterfaceC2241b2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: n1.T
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        AccessibilitySettingActivity.C3113b.m16045o(this.f24497a, dialogInterface);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: t */
        public final void m16054t() {
            m16047q();
            m16040f();
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.accessibilitySetting.AccessibilitySettingActivity$c */
    static final class C3114c extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f12937a;

        /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.accessibilitySetting.AccessibilitySettingActivity$c$a */
        static final class a extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            int f12939a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ AccessibilitySettingActivity f12940b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AccessibilitySettingActivity accessibilitySettingActivity, InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
                this.f12940b = accessibilitySettingActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                return new a(this.f12940b, interfaceC1875e);
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
                return ((a) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                AbstractC2005b.m8369e();
                if (this.f12939a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
                AbstractC5283a abstractC5283a = null;
                this.f12940b.m15955e3(null);
                this.f12940b.m15951d3(false);
                AbstractC5283a abstractC5283a2 = this.f12940b.f12924R;
                if (abstractC5283a2 == null) {
                    AbstractC6118n.m27197o("binding");
                } else {
                    abstractC5283a = abstractC5283a2;
                }
                abstractC5283a.f20148P.setChecked(this.f12940b.m15879G2());
                this.f12940b.m15968h4();
                AccessibilitySettingActivity accessibilitySettingActivity = this.f12940b;
                Toast.makeText(accessibilitySettingActivity, accessibilitySettingActivity.getString(R.string.all_temporary_texts_cleared), 0).show();
                return C1444v.f4971a;
            }
        }

        C3114c(InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return AccessibilitySettingActivity.this.new C3114c(interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((C3114c) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            AbstractC2005b.m8369e();
            if (this.f12937a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1437o.m6082b(obj);
            AppDatabase.f12597p.m15148b(AccessibilitySettingActivity.this).mo15145F().mo14853b();
            AbstractC6672k.m28227d(AbstractC2658t.m12641a(AccessibilitySettingActivity.this), C6656c0.m28164c(), null, new a(AccessibilitySettingActivity.this, null), 2, null);
            return C1444v.f4971a;
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.accessibilitySetting.AccessibilitySettingActivity$d */
    public static final class RunnableC3115d implements Runnable {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ MaterialSwitch f12942b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ boolean f12943c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ CompoundButton.OnCheckedChangeListener f12944d;

        RunnableC3115d(MaterialSwitch materialSwitch, boolean z7, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
            this.f12942b = materialSwitch;
            this.f12943c = z7;
            this.f12944d = onCheckedChangeListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AccessibilitySettingActivity.this.isDestroyed() || AccessibilitySettingActivity.this.isFinishing()) {
                return;
            }
            try {
                this.f12942b.setOnCheckedChangeListener(null);
                this.f12942b.performClick();
                this.f12942b.setChecked(this.f12943c);
                this.f12942b.setOnCheckedChangeListener(this.f12944d);
                Handler handler = AccessibilitySettingActivity.this.f12925S;
                if (handler != null) {
                    handler.postDelayed(this, 800L);
                }
            } catch (Exception unused) {
                AccessibilitySettingActivity.this.m15964g4();
                this.f12942b.setOnCheckedChangeListener(this.f12944d);
            }
        }
    }

    /* JADX INFO: renamed from: A2 */
    private final boolean m15861A2() {
        return m16005r2().getBoolean(C3034A.f12453a.m15032f(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A3 */
    public static final void m15862A3(AccessibilitySettingActivity accessibilitySettingActivity, AbstractC5283a abstractC5283a, CompoundButton compoundButton, boolean z7) {
        AbstractC6118n.m27187e(compoundButton, "<unused var>");
        if (z7 && AbstractC3041D.m15080e(accessibilitySettingActivity)) {
            accessibilitySettingActivity.m15921U3();
            abstractC5283a.f20159w.setChecked(false);
        } else {
            if (AbstractC3041D.m15080e(accessibilitySettingActivity)) {
                return;
            }
            accessibilitySettingActivity.m15914S2(z7);
        }
    }

    /* JADX INFO: renamed from: B2 */
    private final boolean m15864B2() {
        return m16005r2().getBoolean(C3034A.f12453a.m15033g(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B3 */
    public static final void m15865B3(AccessibilitySettingActivity accessibilitySettingActivity, AbstractC5283a abstractC5283a, CompoundButton compoundButton, boolean z7) {
        AbstractC6118n.m27187e(compoundButton, "<unused var>");
        if (z7 && AbstractC3041D.m15080e(accessibilitySettingActivity)) {
            accessibilitySettingActivity.m15921U3();
            abstractC5283a.f20134B.setChecked(false);
        } else {
            if (AbstractC3041D.m15080e(accessibilitySettingActivity)) {
                return;
            }
            accessibilitySettingActivity.m15920U2(z7);
            abstractC5283a.f20139G.setEnabled(z7);
            LinearLayout layOverlayPosition = abstractC5283a.f20139G;
            AbstractC6118n.m27186d(layOverlayPosition, "layOverlayPosition");
            Iterator it = AbstractC1047f0.m4662a(layOverlayPosition).iterator();
            while (it.hasNext()) {
                ((View) it.next()).setEnabled(z7);
            }
        }
    }

    /* JADX INFO: renamed from: C2 */
    private final boolean m15867C2() {
        return m16005r2().getBoolean(C3034A.f12453a.m15037k(), true);
    }

    /* JADX INFO: renamed from: C3 */
    private final void m15868C3() {
        AbstractC5283a abstractC5283a = this.f12924R;
        if (abstractC5283a == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5283a = null;
        }
        abstractC5283a.f20143K.setOnClickListener(new View.OnClickListener() { // from class: n1.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccessibilitySettingActivity.m15871D3(this.f24528a, view);
            }
        });
    }

    /* JADX INFO: renamed from: D2 */
    private final boolean m15870D2() {
        return m16005r2().getBoolean("firstEnableAccessibilityService", true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D3 */
    public static final void m15871D3(AccessibilitySettingActivity accessibilitySettingActivity, View view) {
        accessibilitySettingActivity.m15899N2();
    }

    /* JADX INFO: renamed from: E2 */
    private final boolean m15873E2() {
        return isInMultiWindowMode();
    }

    /* JADX INFO: renamed from: E3 */
    private final void m15874E3() {
        new C7611b(this).mo9116t(getString(android.R.string.dialog_alert_title)).m33354E(R.string.re_enable_accessibility_service).m33361L(R.string.go_to_accessibility_setting, new DialogInterface.OnClickListener() { // from class: n1.J
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i7) {
                AccessibilitySettingActivity.m15877F3(this.f24487a, dialogInterface, i7);
            }
        }).m9118v();
    }

    /* JADX INFO: renamed from: F2 */
    private final boolean m15876F2() {
        return m16005r2().getBoolean(C3034A.f12453a.m15045t(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F3 */
    public static final void m15877F3(AccessibilitySettingActivity accessibilitySettingActivity, DialogInterface dialogInterface, int i7) {
        accessibilitySettingActivity.m15952d4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G2 */
    public final boolean m15879G2() {
        String strM16011t2 = m16011t2();
        return !(strM16011t2 == null || strM16011t2.length() == 0);
    }

    /* JADX INFO: renamed from: G3 */
    private final void m15880G3() {
        new C7611b(this).mo9116t(getString(android.R.string.dialog_alert_title)).m33354E(R.string.accessibility_post_enabled_dialog).m33361L(R.string.continue_text, new DialogInterface.OnClickListener() { // from class: n1.M
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i7) {
                AccessibilitySettingActivity.m15883H3(this.f24492a, dialogInterface, i7);
            }
        }).m33356G(R.string.skip_for_now, null).mo9100d(false).m9118v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H2 */
    public static final String[] m15882H2(AccessibilitySettingActivity accessibilitySettingActivity) {
        return accessibilitySettingActivity.getResources().getStringArray(R.array.keep_duration_options);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H3 */
    public static final void m15883H3(AccessibilitySettingActivity accessibilitySettingActivity, DialogInterface dialogInterface, int i7) {
        accessibilitySettingActivity.m15899N2();
    }

    /* JADX INFO: renamed from: I2 */
    private final void m15885I2() {
        m15888J2();
        AbstractC5283a abstractC5283a = this.f12924R;
        if (abstractC5283a == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5283a = null;
        }
        abstractC5283a.f20161y.setText(m15978k2());
        m15972i4(m15970i2());
        m15980k4(m15998p2());
    }

    /* JADX INFO: renamed from: I3 */
    private final void m15886I3() {
        final String[] strArr = {"15", "30", "50", "75", "100", "150", "200", "250", "500"};
        new C7611b(this).mo9116t(getString(R.string.count_of_notes_title)).m33364O(strArr, AbstractC1631j.m6751x(strArr, String.valueOf(m15970i2())), new DialogInterface.OnClickListener() { // from class: n1.r
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i7) {
                AccessibilitySettingActivity.m15889J3(strArr, this, dialogInterface, i7);
            }
        }).mo9112p(getString(R.string.save), null).mo9107k(getString(R.string.cancel), null).m9118v();
    }

    /* JADX INFO: renamed from: J2 */
    private final void m15888J2() {
        AbstractC5283a abstractC5283a = this.f12924R;
        if (abstractC5283a == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5283a = null;
        }
        boolean z7 = false;
        abstractC5283a.f20159w.setChecked(m15861A2() && !AbstractC3041D.m15080e(this));
        abstractC5283a.f20162z.setChecked(m15864B2());
        abstractC5283a.f20148P.setChecked(m15879G2());
        MaterialSwitch materialSwitch = abstractC5283a.f20134B;
        if (m15867C2() && !AbstractC3041D.m15080e(this)) {
            z7 = true;
        }
        materialSwitch.setChecked(z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J3 */
    public static final void m15889J3(String[] strArr, AccessibilitySettingActivity accessibilitySettingActivity, DialogInterface dialogInterface, int i7) {
        int i8 = Integer.parseInt(strArr[i7]);
        accessibilitySettingActivity.m15923V2(i8);
        accessibilitySettingActivity.m15972i4(i8);
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K2 */
    public static final void m15891K2(AccessibilitySettingActivity accessibilitySettingActivity, View view) {
        accessibilitySettingActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L2 */
    public static final C1444v m15893L2(AccessibilitySettingActivity accessibilitySettingActivity, AbstractC5158A addCallback) {
        AbstractC6118n.m27187e(addCallback, "$this$addCallback");
        accessibilitySettingActivity.finishAndRemoveTask();
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L3 */
    public static final void m15894L3(AccessibilitySettingActivity accessibilitySettingActivity, Slider slider, DialogInterface dialogInterface, int i7) {
        accessibilitySettingActivity.m15939a3(slider.getValue());
        accessibilitySettingActivity.m15976j4();
        dialogInterface.dismiss();
    }

    /* JADX INFO: renamed from: M2 */
    private final void m15896M2() {
        f12920X = true;
        C3065o.f12624f.m15175a(this).m15168j(this instanceof AccessibilitySettingFullActivity);
        startActivityForResult(new Intent("android.settings.ACCESSIBILITY_SETTINGS"), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M3 */
    public static final void m15897M3(DialogInterface dialogInterface, int i7) {
        dialogInterface.cancel();
    }

    /* JADX INFO: renamed from: N2 */
    private final void m15899N2() {
        startActivity(new Intent(getApplication(), (Class<?>) AppEnableProFeaturesActivity.class).addFlags(m16002q2()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N3 */
    public static final void m15900N3(AccessibilitySettingActivity accessibilitySettingActivity, DialogInterface dialogInterface, int i7) {
        accessibilitySettingActivity.m15939a3(35.0f);
        accessibilitySettingActivity.m15976j4();
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O2 */
    public final void m15902O2() {
        if (!m16029z2()) {
            new C5406d(this).m24510f(new C5406d.b() { // from class: n1.q
                @Override // p241f1.C5406d.b
                /* JADX INFO: renamed from: a */
                public final void mo24512a(View view) {
                    AccessibilitySettingActivity.m15905P2(this.f24525a, view);
                }
            }).m24511g();
        } else if (m15870D2()) {
            m15952d4();
        } else {
            m15874E3();
        }
    }

    /* JADX INFO: renamed from: O3 */
    private final C7611b m15903O3(String str, final String str2, final TextView textView) {
        C7611b c7611b = new C7611b(this);
        c7611b.mo9116t(str);
        c7611b.m33364O(m15966h2(), m15974j2(str2 + "feature"), new DialogInterface.OnClickListener() { // from class: n1.w
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i7) {
                AccessibilitySettingActivity.m15906P3(this.f24532a, textView, str2, dialogInterface, i7);
            }
        });
        c7611b.m33361L(R.string.save, new DialogInterface.OnClickListener() { // from class: n1.H
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i7) {
                AccessibilitySettingActivity.m15912R3(dialogInterface, i7);
            }
        });
        c7611b.mo9107k(getString(R.string.cancel), null);
        return c7611b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P2 */
    public static final void m15905P2(AccessibilitySettingActivity accessibilitySettingActivity, View it) {
        AbstractC6118n.m27187e(it, "it");
        accessibilitySettingActivity.m15902O2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P3 */
    public static final void m15906P3(AccessibilitySettingActivity accessibilitySettingActivity, TextView textView, String str, final DialogInterface dialogInterface, int i7) {
        SharedPreferences.Editor editorM16008s2 = accessibilitySettingActivity.m16008s2();
        if (editorM16008s2 != null) {
            editorM16008s2.putBoolean(str + "enable", i7 != 0);
            editorM16008s2.putString(str + "feature", (String) AbstractC1631j.m6750w(C3034A.f12453a.m15035i(), i7 - 1));
            editorM16008s2.apply();
        }
        textView.setText(accessibilitySettingActivity.m15966h2()[i7]);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: n1.b
            @Override // java.lang.Runnable
            public final void run() {
                AccessibilitySettingActivity.m15909Q3(dialogInterface);
            }
        }, 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q2 */
    public static final String[] m15908Q2(AccessibilitySettingActivity accessibilitySettingActivity) {
        return new String[]{accessibilitySettingActivity.getString(R.string.overlay_position_top), accessibilitySettingActivity.getString(R.string.overlay_position_bottom), accessibilitySettingActivity.getString(R.string.overlay_position_custom)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q3 */
    public static final void m15909Q3(DialogInterface dialogInterface) {
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: renamed from: R2 */
    private final void m15911R2(boolean z7) {
        SharedPreferences.Editor editorPutBoolean;
        SharedPreferences.Editor editorM16008s2 = m16008s2();
        if (editorM16008s2 == null || (editorPutBoolean = editorM16008s2.putBoolean(C3034A.f12453a.m15031e(), z7)) == null) {
            return;
        }
        editorPutBoolean.apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R3 */
    public static final void m15912R3(DialogInterface dialogInterface, int i7) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: renamed from: S2 */
    private final void m15914S2(boolean z7) {
        SharedPreferences.Editor editorPutBoolean;
        SharedPreferences.Editor editorM16008s2 = m16008s2();
        if (editorM16008s2 == null || (editorPutBoolean = editorM16008s2.putBoolean(C3034A.f12453a.m15032f(), z7)) == null) {
            return;
        }
        editorPutBoolean.apply();
    }

    /* JADX INFO: renamed from: S3 */
    private final void m15915S3() {
        final Long[] lArr = {86400000L, 259200000L, 604800000L, 2592000000L, 15552000000L, 31536000000L, -1L};
        C7611b c7611bM33365P = new C7611b(this).m33365P(R.string.chose_auto_save_section);
        String[] strArrM15982l2 = m15982l2();
        String[] strArrM15982l3 = m15982l2();
        AbstractC5283a abstractC5283a = this.f12924R;
        if (abstractC5283a == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5283a = null;
        }
        c7611bM33365P.m33364O(strArrM15982l2, AbstractC1631j.m6751x(strArrM15982l3, abstractC5283a.f20161y.getText().toString()), new DialogInterface.OnClickListener() { // from class: n1.x
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i7) {
                AccessibilitySettingActivity.m15918T3(this.f24535a, lArr, dialogInterface, i7);
            }
        }).m33356G(R.string.cancel, null).m9118v();
    }

    /* JADX INFO: renamed from: T2 */
    private final void m15917T2(boolean z7) {
        SharedPreferences.Editor editorPutBoolean;
        SharedPreferences.Editor editorM16008s2 = m16008s2();
        if (editorM16008s2 == null || (editorPutBoolean = editorM16008s2.putBoolean(C3034A.f12453a.m15033g(), z7)) == null) {
            return;
        }
        editorPutBoolean.apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T3 */
    public static final void m15918T3(AccessibilitySettingActivity accessibilitySettingActivity, Long[] lArr, DialogInterface dialogInterface, int i7) {
        String str = accessibilitySettingActivity.m15982l2()[i7];
        accessibilitySettingActivity.m15935Z2(str);
        accessibilitySettingActivity.m15932Y2(lArr[i7].longValue());
        AbstractC5283a abstractC5283a = accessibilitySettingActivity.f12924R;
        if (abstractC5283a == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5283a = null;
        }
        abstractC5283a.f20161y.setText(str);
        dialogInterface.dismiss();
    }

    /* JADX INFO: renamed from: U2 */
    private final void m15920U2(boolean z7) {
        SharedPreferences.Editor editorPutBoolean;
        SharedPreferences.Editor editorM16008s2 = m16008s2();
        if (editorM16008s2 == null || (editorPutBoolean = editorM16008s2.putBoolean(C3034A.f12453a.m15037k(), z7)) == null) {
            return;
        }
        editorPutBoolean.apply();
    }

    /* JADX INFO: renamed from: U3 */
    private final void m15921U3() {
        new C7611b(this).m33352C(R.drawable.ic_bubble).m33365P(R.string.show_over_other_app).m33354E(R.string.please_enbale_app_show_over_other_app).m33361L(R.string.go_to_setting, new DialogInterface.OnClickListener() { // from class: n1.S
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i7) {
                AccessibilitySettingActivity.m15924V3(this.f24496a, dialogInterface, i7);
            }
        }).m9118v();
    }

    /* JADX INFO: renamed from: V2 */
    private final void m15923V2(int i7) {
        SharedPreferences.Editor editorPutInt;
        SharedPreferences.Editor editorM16008s2 = m16008s2();
        if (editorM16008s2 == null || (editorPutInt = editorM16008s2.putInt(C3034A.f12453a.m15039m(), i7)) == null) {
            return;
        }
        editorPutInt.apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V3 */
    public static final void m15924V3(AccessibilitySettingActivity accessibilitySettingActivity, DialogInterface dialogInterface, int i7) {
        C3034A.f12453a.m15030d(accessibilitySettingActivity);
    }

    /* JADX INFO: renamed from: W2 */
    private final void m15926W2() {
        if (m15873E2()) {
            return;
        }
        AbstractC1061m0.m4703b(getWindow(), false);
        AbstractC5283a abstractC5283a = this.f12924R;
        if (abstractC5283a == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5283a = null;
        }
        AbstractC1030Z.m4494t0(abstractC5283a.m10849k(), new InterfaceC0993G() { // from class: n1.o
            @Override // p111O.InterfaceC0993G
            /* JADX INFO: renamed from: a */
            public final C0982A0 mo4369a(View view, C0982A0 c0982a0) {
                return AccessibilitySettingActivity.m15929X2(this.f24522a, view, c0982a0);
            }
        });
    }

    /* JADX INFO: renamed from: W3 */
    private final void m15927W3() {
        new C7611b(this).m33365P(R.string.overlay_position_title).m33364O(m15986m2(), m15994o2(), new DialogInterface.OnClickListener() { // from class: n1.E
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i7) {
                AccessibilitySettingActivity.m15930X3(this.f24483a, dialogInterface, i7);
            }
        }).m33356G(R.string.cancel, null).m9118v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X2 */
    public static final C0982A0 m15929X2(AccessibilitySettingActivity accessibilitySettingActivity, View view, C0982A0 windowInsets) {
        AbstractC6118n.m27187e(view, "view");
        AbstractC6118n.m27187e(windowInsets, "windowInsets");
        C0247b c0247bM4272f = windowInsets.m4272f(C0982A0.p.m4332e());
        AbstractC6118n.m27186d(c0247bM4272f, "getInsets(...)");
        AbstractC5283a abstractC5283a = accessibilitySettingActivity.f12924R;
        AbstractC5283a abstractC5283a2 = null;
        if (abstractC5283a == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5283a = null;
        }
        MaterialToolbar toolbarMainActivity = abstractC5283a.f20157Y;
        AbstractC6118n.m27186d(toolbarMainActivity, "toolbarMainActivity");
        toolbarMainActivity.setPadding(toolbarMainActivity.getPaddingLeft(), c0247bM4272f.f985b, toolbarMainActivity.getPaddingRight(), toolbarMainActivity.getPaddingBottom());
        if (C3034A.f12453a.m15018E(accessibilitySettingActivity)) {
            AbstractC5283a abstractC5283a3 = accessibilitySettingActivity.f12924R;
            if (abstractC5283a3 == null) {
                AbstractC6118n.m27197o("binding");
            } else {
                abstractC5283a2 = abstractC5283a3;
            }
            ScrollView scroll = abstractC5283a2.f20146N;
            AbstractC6118n.m27186d(scroll, "scroll");
            scroll.setPadding(scroll.getPaddingLeft(), scroll.getPaddingTop(), c0247bM4272f.f986c, scroll.getPaddingBottom());
        }
        return C0982A0.f3748b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X3 */
    public static final void m15930X3(AccessibilitySettingActivity accessibilitySettingActivity, DialogInterface dialogInterface, int i7) {
        accessibilitySettingActivity.m15943b3(i7);
        if (i7 == 2) {
            accessibilitySettingActivity.m16031K3();
        }
        accessibilitySettingActivity.m15976j4();
        dialogInterface.dismiss();
    }

    /* JADX INFO: renamed from: Y2 */
    private final void m15932Y2(long j7) {
        SharedPreferences.Editor editorPutLong;
        SharedPreferences.Editor editorM16008s2 = m16008s2();
        if (editorM16008s2 == null || (editorPutLong = editorM16008s2.putLong(C3034A.f12453a.m15043r(), j7)) == null) {
            return;
        }
        editorPutLong.apply();
    }

    /* JADX INFO: renamed from: Y3 */
    private final void m15933Y3() {
        C3113b c3113bM16051h = new C3113b(this, this).m16052i(new InterfaceC5356a() { // from class: n1.C
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return AccessibilitySettingActivity.m15936Z3(this.f24481a);
            }
        }).m16051h(new InterfaceC5356a() { // from class: n1.D
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return AccessibilitySettingActivity.m15940a4(this.f24482a);
            }
        });
        this.f12921O = c3113bM16051h;
        if (c3113bM16051h != null) {
            c3113bM16051h.m16053n();
        }
    }

    /* JADX INFO: renamed from: Z2 */
    private final void m15935Z2(String str) {
        SharedPreferences.Editor editorPutString;
        SharedPreferences.Editor editorM16008s2 = m16008s2();
        if (editorM16008s2 == null || (editorPutString = editorM16008s2.putString(C3034A.f12453a.m15044s(), str)) == null) {
            return;
        }
        editorPutString.apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z3 */
    public static final C1444v m15936Z3(AccessibilitySettingActivity accessibilitySettingActivity) {
        Application application = accessibilitySettingActivity.getApplication();
        AbstractC6118n.m27186d(application, "getApplication(...)");
        accessibilitySettingActivity.m15958f2(AbstractC3081u.m15314a(application));
        Toast.makeText(accessibilitySettingActivity, R.string.all_permision_greneted, 0).show();
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: a3 */
    private final void m15939a3(float f7) {
        SharedPreferences.Editor editorPutFloat;
        SharedPreferences.Editor editorM16008s2 = m16008s2();
        if (editorM16008s2 == null || (editorPutFloat = editorM16008s2.putFloat(C3034A.f12453a.m15036j(), f7)) == null) {
            return;
        }
        editorPutFloat.apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public static final C1444v m15940a4(AccessibilitySettingActivity accessibilitySettingActivity) {
        accessibilitySettingActivity.f12921O = null;
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: b3 */
    private final void m15943b3(int i7) {
        SharedPreferences.Editor editorPutInt;
        SharedPreferences.Editor editorM16008s2 = m16008s2();
        if (editorM16008s2 == null || (editorPutInt = editorM16008s2.putInt(C3034A.f12453a.m15038l(), i7)) == null) {
            return;
        }
        editorPutInt.apply();
    }

    /* JADX INFO: renamed from: b4 */
    private final void m15944b4() {
        String[] stringArray = getResources().getStringArray(R.array.pick_options_for_setting);
        AbstractC6118n.m27186d(stringArray, "getStringArray(...)");
        new C7611b(this).mo9116t(getString(R.string.pick_text_type_title)).m33364O(stringArray, m15998p2(), new DialogInterface.OnClickListener() { // from class: n1.t
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i7) {
                AccessibilitySettingActivity.m15948c4(this.f24529a, dialogInterface, i7);
            }
        }).mo9112p(getString(R.string.save), null).mo9107k(getString(R.string.cancel), null).m9118v();
    }

    /* JADX INFO: renamed from: c3 */
    private final void m15947c3(int i7) {
        SharedPreferences.Editor editorPutInt;
        SharedPreferences.Editor editorM16008s2 = m16008s2();
        if (editorM16008s2 == null || (editorPutInt = editorM16008s2.putInt(C3034A.f12453a.m15017D(), i7)) == null) {
            return;
        }
        editorPutInt.apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public static final void m15948c4(AccessibilitySettingActivity accessibilitySettingActivity, DialogInterface dialogInterface, int i7) {
        accessibilitySettingActivity.m15947c3(i7);
        SharedPreferencesOnSharedPreferenceChangeListenerC5948g0 sharedPreferencesOnSharedPreferenceChangeListenerC5948g0M26815b = SharedPreferencesOnSharedPreferenceChangeListenerC5948g0.f23553a0.m26815b();
        if (sharedPreferencesOnSharedPreferenceChangeListenerC5948g0M26815b != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC5948g0M26815b.m26810J0(i7);
        }
        accessibilitySettingActivity.m15980k4(i7);
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d3 */
    public final void m15951d3(boolean z7) {
        SharedPreferences.Editor editorM16008s2 = m16008s2();
        AbstractC6118n.m27184b(editorM16008s2);
        editorM16008s2.putBoolean(C3034A.f12453a.m15045t(), z7).apply();
    }

    /* JADX INFO: renamed from: d4 */
    private final void m15952d4() {
        new C7611b(this).m33365P(android.R.string.dialog_alert_title).mo9105i(getString(R.string.accessibility_how_to_enable, getString(R.string.app_name), getString(R.string.app_name))).m33361L(R.string.go_to_accessibility_setting, new DialogInterface.OnClickListener() { // from class: n1.N
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i7) {
                AccessibilitySettingActivity.m15956e4(this.f24493a, dialogInterface, i7);
            }
        }).m9118v();
    }

    /* JADX INFO: renamed from: e2 */
    private final void m15954e2() {
        Application application = getApplication();
        AbstractC6118n.m27186d(application, "getApplication(...)");
        AbstractC5283a abstractC5283a = null;
        AccessibilitySettingActivity accessibilitySettingActivity = AbstractC3081u.m15315b(application) ? this : null;
        AbstractC5283a abstractC5283a2 = this.f12924R;
        if (abstractC5283a2 == null) {
            AbstractC6118n.m27197o("binding");
        } else {
            abstractC5283a = abstractC5283a2;
        }
        abstractC5283a.f20140H.setOnClickListener(accessibilitySettingActivity);
        abstractC5283a.f20141I.setOnClickListener(accessibilitySettingActivity);
        abstractC5283a.f20142J.setOnClickListener(accessibilitySettingActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e3 */
    public final void m15955e3(String str) {
        SharedPreferences.Editor editorM16008s2 = m16008s2();
        AbstractC6118n.m27184b(editorM16008s2);
        editorM16008s2.putString(C3034A.f12453a.m15046u(), str).apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e4 */
    public static final void m15956e4(AccessibilitySettingActivity accessibilitySettingActivity, DialogInterface dialogInterface, int i7) {
        accessibilitySettingActivity.m15896M2();
    }

    /* JADX INFO: renamed from: f2 */
    private final void m15958f2(boolean z7) {
        m15911R2(z7);
        m15992n4();
        m15954e2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f3 */
    public static final int m15959f3() {
        return !f12919W ? 402653184 : 0;
    }

    /* JADX INFO: renamed from: f4 */
    private final void m15960f4(MaterialSwitch materialSwitch, boolean z7, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f12925S = new Handler(Looper.getMainLooper());
        RunnableC3115d runnableC3115d = new RunnableC3115d(materialSwitch, z7, onCheckedChangeListener);
        this.f12926T = runnableC3115d;
        Handler handler = this.f12925S;
        if (handler != null) {
            handler.post(runnableC3115d);
        }
    }

    /* JADX INFO: renamed from: g2 */
    private final void m15962g2() {
        AbstractC6672k.m28227d(AbstractC2658t.m12641a(this), C6656c0.m28163b(), null, new C3114c(null), 2, null);
    }

    /* JADX INFO: renamed from: g3 */
    private final void m15963g3() {
        AbstractC5283a abstractC5283a = this.f12924R;
        if (abstractC5283a == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5283a = null;
        }
        abstractC5283a.f20135C.setOnClickListener(new View.OnClickListener() { // from class: n1.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccessibilitySettingActivity.m15967h3(this.f24507a, view);
            }
        });
        abstractC5283a.f20160x.setOnClickListener(new View.OnClickListener() { // from class: n1.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccessibilitySettingActivity.m15971i3(this.f24508a, view);
            }
        });
        abstractC5283a.f20133A.setOnClickListener(new View.OnClickListener() { // from class: n1.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccessibilitySettingActivity.m15975j3(this.f24509a, view);
            }
        });
        abstractC5283a.f20144L.setOnClickListener(new View.OnClickListener() { // from class: n1.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccessibilitySettingActivity.m15983l3(this.f24510a, view);
            }
        });
        abstractC5283a.f20139G.setOnClickListener(new View.OnClickListener() { // from class: n1.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccessibilitySettingActivity.m15987m3(this.f24511a, view);
            }
        });
        abstractC5283a.f20137E.setOnClickListener(new View.OnClickListener() { // from class: n1.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccessibilitySettingActivity.m15991n3(this.f24512a, view);
            }
        });
        m15954e2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g4 */
    public final void m15964g4() {
        Handler handler;
        Runnable runnable = this.f12926T;
        if (runnable != null && (handler = this.f12925S) != null) {
            handler.removeCallbacks(runnable);
        }
        this.f12926T = null;
        this.f12925S = null;
    }

    /* JADX INFO: renamed from: h2 */
    private final String[] m15966h2() {
        String[] stringArray = getResources().getStringArray(R.array.op_type_long_pressed);
        AbstractC6118n.m27186d(stringArray, "getStringArray(...)");
        return stringArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h3 */
    public static final void m15967h3(AccessibilitySettingActivity accessibilitySettingActivity, View view) {
        Application application = accessibilitySettingActivity.getApplication();
        AbstractC6118n.m27186d(application, "getApplication(...)");
        if (AbstractC3081u.m15315b(application)) {
            accessibilitySettingActivity.m15886I3();
        } else {
            accessibilitySettingActivity.m15952d4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h4 */
    public final void m15968h4() {
        AbstractC5283a abstractC5283a = this.f12924R;
        if (abstractC5283a == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5283a = null;
        }
        abstractC5283a.f20133A.setEnabled(abstractC5283a.f20162z.isChecked() && abstractC5283a.f20148P.isEnabled() && abstractC5283a.f20148P.isChecked());
    }

    /* JADX INFO: renamed from: i2 */
    private final int m15970i2() {
        return m16005r2().getInt(C3034A.f12453a.m15039m(), 15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i3 */
    public static final void m15971i3(AccessibilitySettingActivity accessibilitySettingActivity, View view) {
        Application application = accessibilitySettingActivity.getApplication();
        AbstractC6118n.m27186d(application, "getApplication(...)");
        if (AbstractC3081u.m15315b(application)) {
            accessibilitySettingActivity.m15915S3();
        } else {
            accessibilitySettingActivity.m15915S3();
        }
    }

    /* JADX INFO: renamed from: i4 */
    private final void m15972i4(int i7) {
        AbstractC5283a abstractC5283a = this.f12924R;
        if (abstractC5283a == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5283a = null;
        }
        abstractC5283a.f20136D.setText(getString(R.string.count_of_notes_value, Integer.valueOf(i7)));
    }

    /* JADX INFO: renamed from: j2 */
    private final int m15974j2(String str) {
        String string = m16005r2().getString(str, null);
        if (string != null) {
            return AbstractC1631j.m6751x(C3034A.f12453a.m15035i(), string) + 1;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j3 */
    public static final void m15975j3(final AccessibilitySettingActivity accessibilitySettingActivity, View view) {
        new C7611b(accessibilitySettingActivity).m33365P(R.string.rest).m33354E(R.string.are_you_sure_rest_password_and_clear_all).m33361L(R.string.confirm, new DialogInterface.OnClickListener() { // from class: n1.v
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i7) {
                AccessibilitySettingActivity.m15979k3(this.f24531a, dialogInterface, i7);
            }
        }).m33356G(R.string.cancel, null).m9118v();
    }

    /* JADX INFO: renamed from: j4 */
    private final void m15976j4() {
        AbstractC5283a abstractC5283a = null;
        if (m15994o2() != 2) {
            AbstractC5283a abstractC5283a2 = this.f12924R;
            if (abstractC5283a2 == null) {
                AbstractC6118n.m27197o("binding");
            } else {
                abstractC5283a = abstractC5283a2;
            }
            abstractC5283a.f20150R.setText(m15986m2()[m15994o2()]);
            return;
        }
        AbstractC5283a abstractC5283a3 = this.f12924R;
        if (abstractC5283a3 == null) {
            AbstractC6118n.m27197o("binding");
        } else {
            abstractC5283a = abstractC5283a3;
        }
        abstractC5283a.f20150R.setText(getString(R.string.overlay_position_custom) + ' ' + ((int) m15990n2()) + '%');
    }

    /* JADX INFO: renamed from: k2 */
    private final String m15978k2() {
        String string = m16005r2().getString(C3034A.f12453a.m15044s(), (String) AbstractC1631j.m6723T(m15982l2()));
        if (string != null) {
            return string;
        }
        Object objT = AbstractC1631j.m6723T(m15982l2());
        AbstractC6118n.m27186d(objT, "last(...)");
        return (String) objT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k3 */
    public static final void m15979k3(AccessibilitySettingActivity accessibilitySettingActivity, DialogInterface dialogInterface, int i7) {
        accessibilitySettingActivity.m15962g2();
    }

    /* JADX INFO: renamed from: k4 */
    private final void m15980k4(int i7) {
        String string;
        SharedPreferencesOnSharedPreferenceChangeListenerC5948g0.a aVar = SharedPreferencesOnSharedPreferenceChangeListenerC5948g0.f23553a0;
        if (i7 == aVar.m26822i()) {
            string = getString(R.string.pick_show_actions);
        } else if (i7 == aVar.m26818e()) {
            string = getString(R.string.pick_clare);
        } else if (i7 == aVar.m26819f()) {
            string = getString(R.string.pick_extract_text);
        } else if (i7 == aVar.m26823j()) {
            string = getString(R.string.pick_show_clipboard_items);
        } else if (i7 == aVar.m26817d()) {
            string = getString(R.string.ai_text_processing);
        } else if (i7 == aVar.m26821h()) {
            string = getString(R.string.pick_set_last_clipboard_item);
        } else {
            string = i7 == aVar.m26820g() ? getString(R.string.pick_set_from_clipboard) : getString(R.string.pick_set_from_clipboard);
        }
        AbstractC6118n.m27184b(string);
        AbstractC5283a abstractC5283a = this.f12924R;
        if (abstractC5283a == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5283a = null;
        }
        abstractC5283a.f20145M.setText(string);
    }

    /* JADX INFO: renamed from: l2 */
    private final String[] m15982l2() {
        return (String[]) this.f12922P.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l3 */
    public static final void m15983l3(AccessibilitySettingActivity accessibilitySettingActivity, View view) {
        Application application = accessibilitySettingActivity.getApplication();
        AbstractC6118n.m27186d(application, "getApplication(...)");
        if (AbstractC3081u.m15315b(application)) {
            accessibilitySettingActivity.m15944b4();
        } else {
            accessibilitySettingActivity.m15952d4();
        }
    }

    /* JADX INFO: renamed from: l4 */
    private final void m15984l4(boolean z7) {
        AbstractC5283a abstractC5283a = this.f12924R;
        if (abstractC5283a == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5283a = null;
        }
        abstractC5283a.f20151S.setEnabled(z7);
        abstractC5283a.f20155W.setEnabled(z7);
        abstractC5283a.f20156X.setEnabled(z7);
        abstractC5283a.f20152T.setEnabled(z7);
        abstractC5283a.f20153U.setEnabled(z7);
        abstractC5283a.f20154V.setEnabled(z7);
        abstractC5283a.f20160x.setEnabled(z7 && abstractC5283a.f20162z.isChecked());
        m15968h4();
        abstractC5283a.f20135C.setEnabled(z7);
        LinearLayout autoSaveDurationLayout = abstractC5283a.f20160x;
        AbstractC6118n.m27186d(autoSaveDurationLayout, "autoSaveDurationLayout");
        Iterator it = AbstractC1047f0.m4662a(autoSaveDurationLayout).iterator();
        while (it.hasNext()) {
            ((View) it.next()).setEnabled(z7 && abstractC5283a.f20162z.isChecked());
        }
        abstractC5283a.f20139G.setEnabled(z7 && abstractC5283a.f20134B.isChecked());
        LinearLayout layOverlayPosition = abstractC5283a.f20139G;
        AbstractC6118n.m27186d(layOverlayPosition, "layOverlayPosition");
        Iterator it2 = AbstractC1047f0.m4662a(layOverlayPosition).iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).setEnabled(z7 && abstractC5283a.f20134B.isChecked());
        }
        LinearLayout countOfNotesLayout = abstractC5283a.f20135C;
        AbstractC6118n.m27186d(countOfNotesLayout, "countOfNotesLayout");
        Iterator it3 = AbstractC1047f0.m4662a(countOfNotesLayout).iterator();
        while (it3.hasNext()) {
            ((View) it3.next()).setEnabled(z7);
        }
        LinearLayout pickTextTypeLayout = abstractC5283a.f20144L;
        AbstractC6118n.m27186d(pickTextTypeLayout, "pickTextTypeLayout");
        Iterator it4 = AbstractC1047f0.m4662a(pickTextTypeLayout).iterator();
        while (it4.hasNext()) {
            ((View) it4.next()).setEnabled(z7);
        }
        abstractC5283a.f20144L.setEnabled(z7);
        abstractC5283a.f20140H.setEnabled(z7);
        abstractC5283a.f20141I.setEnabled(z7);
        abstractC5283a.f20142J.setEnabled(z7);
    }

    /* JADX INFO: renamed from: m2 */
    private final String[] m15986m2() {
        return (String[]) this.f12923Q.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m3 */
    public static final void m15987m3(AccessibilitySettingActivity accessibilitySettingActivity, View view) {
        Application application = accessibilitySettingActivity.getApplication();
        AbstractC6118n.m27186d(application, "getApplication(...)");
        if (AbstractC3081u.m15315b(application)) {
            accessibilitySettingActivity.m15927W3();
        } else {
            accessibilitySettingActivity.m15952d4();
        }
    }

    /* JADX INFO: renamed from: m4 */
    private final void m15988m4() {
        AbstractC5283a abstractC5283a = this.f12924R;
        if (abstractC5283a == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5283a = null;
        }
        MaterialTextView materialTextView = abstractC5283a.f20151S;
        String[] strArrM15966h2 = m15966h2();
        StringBuilder sb = new StringBuilder();
        C3034A c3034a = C3034A.f12453a;
        sb.append(c3034a.m15034h()[0]);
        sb.append("feature");
        materialTextView.setText(strArrM15966h2[m15974j2(sb.toString())]);
        abstractC5283a.f20155W.setText(m15966h2()[m15974j2(c3034a.m15034h()[1] + "feature")]);
        abstractC5283a.f20156X.setText(m15966h2()[m15974j2(c3034a.m15034h()[2] + "feature")]);
    }

    /* JADX INFO: renamed from: n2 */
    private final float m15990n2() {
        return AbstractC5905g.m26658f(m16005r2().getFloat(C3034A.f12453a.m15036j(), 35.0f), 1.0f, 99.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n3 */
    public static final void m15991n3(AccessibilitySettingActivity accessibilitySettingActivity, View view) {
        accessibilitySettingActivity.startActivity(new Intent(accessibilitySettingActivity.getApplication(), (Class<?>) BubbleCustomizationActivity.class).addFlags(accessibilitySettingActivity.m16002q2()));
    }

    /* JADX INFO: renamed from: n4 */
    private final void m15992n4() {
        Application application = getApplication();
        AbstractC6118n.m27186d(application, "getApplication(...)");
        boolean zM15315b = AbstractC3081u.m15315b(application);
        AbstractC5283a abstractC5283a = this.f12924R;
        if (abstractC5283a == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5283a = null;
        }
        abstractC5283a.f20159w.setEnabled(zM15315b);
        abstractC5283a.f20162z.setEnabled(zM15315b);
        abstractC5283a.f20148P.setEnabled(zM15315b);
        abstractC5283a.f20134B.setEnabled(zM15315b);
        m15984l4(zM15315b);
    }

    /* JADX INFO: renamed from: o2 */
    private final int m15994o2() {
        return m16005r2().getInt(C3034A.f12453a.m15038l(), 2);
    }

    /* JADX INFO: renamed from: o3 */
    private final void m15995o3() {
        AbstractC5283a abstractC5283a = this.f12924R;
        if (abstractC5283a == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5283a = null;
        }
        abstractC5283a.f20138F.setOnClickListener(new View.OnClickListener() { // from class: n1.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccessibilitySettingActivity.m15999p3(this.f24530a, view);
            }
        });
    }

    /* JADX INFO: renamed from: o4 */
    private final void m15996o4(MaterialSwitch materialSwitch, boolean z7, boolean z8, final CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener2 = new CompoundButton.OnCheckedChangeListener() { // from class: n1.p
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
                AccessibilitySettingActivity.m16000p4(this.f24523a, onCheckedChangeListener, compoundButton, z9);
            }
        };
        materialSwitch.setChecked(z7);
        if (z8) {
            m15960f4(materialSwitch, z7, onCheckedChangeListener2);
        }
        materialSwitch.setOnCheckedChangeListener(onCheckedChangeListener2);
    }

    /* JADX INFO: renamed from: p2 */
    private final int m15998p2() {
        return m16005r2().getInt(C3034A.f12453a.m15017D(), SharedPreferencesOnSharedPreferenceChangeListenerC5948g0.f23553a0.m26822i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p3 */
    public static final void m15999p3(AccessibilitySettingActivity accessibilitySettingActivity, View view) {
        Intent intent = new Intent(accessibilitySettingActivity, (Class<?>) AppIntroActivity.class);
        intent.addFlags(accessibilitySettingActivity.m16002q2());
        intent.putExtra("ONLY_PROFESSIONAL_FEATURES", true);
        accessibilitySettingActivity.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p4 */
    public static final void m16000p4(AccessibilitySettingActivity accessibilitySettingActivity, CompoundButton.OnCheckedChangeListener onCheckedChangeListener, CompoundButton view, boolean z7) {
        AbstractC6118n.m27187e(view, "view");
        accessibilitySettingActivity.m15964g4();
        onCheckedChangeListener.onCheckedChanged(view, z7);
    }

    /* JADX INFO: renamed from: q2 */
    private final int m16002q2() {
        return ((Number) this.f12927U.getValue()).intValue();
    }

    /* JADX INFO: renamed from: q3 */
    private final void m16003q3() {
        m16006r3();
        m15963g3();
    }

    /* JADX INFO: renamed from: r2 */
    private final SharedPreferences m16005r2() {
        SharedPreferences sharedPreferences = getSharedPreferences("SHARED_NAME", 0);
        AbstractC6118n.m27186d(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    /* JADX INFO: renamed from: r3 */
    private final void m16006r3() {
        final AbstractC5283a abstractC5283a = this.f12924R;
        if (abstractC5283a == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5283a = null;
        }
        abstractC5283a.f20162z.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: n1.j
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
                AccessibilitySettingActivity.m16009s3(this.f24513a, abstractC5283a, compoundButton, z7);
            }
        });
        abstractC5283a.f20148P.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: n1.k
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
                AccessibilitySettingActivity.m16012t3(this.f24515a, abstractC5283a, compoundButton, z7);
            }
        });
        abstractC5283a.f20159w.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: n1.m
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
                AccessibilitySettingActivity.m15862A3(this.f24518a, abstractC5283a, compoundButton, z7);
            }
        });
        abstractC5283a.f20134B.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: n1.n
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
                AccessibilitySettingActivity.m15865B3(this.f24520a, abstractC5283a, compoundButton, z7);
            }
        });
    }

    /* JADX INFO: renamed from: s2 */
    private final SharedPreferences.Editor m16008s2() {
        return m16005r2().edit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s3 */
    public static final void m16009s3(AccessibilitySettingActivity accessibilitySettingActivity, AbstractC5283a abstractC5283a, CompoundButton compoundButton, boolean z7) {
        AbstractC6118n.m27187e(compoundButton, "<unused var>");
        if (z7 && AbstractC3041D.m15080e(accessibilitySettingActivity)) {
            accessibilitySettingActivity.m15921U3();
            abstractC5283a.f20134B.setChecked(false);
            return;
        }
        if (AbstractC3041D.m15080e(accessibilitySettingActivity)) {
            return;
        }
        accessibilitySettingActivity.m15917T2(z7);
        abstractC5283a.f20148P.setEnabled(z7);
        accessibilitySettingActivity.m15968h4();
        abstractC5283a.f20160x.setEnabled(z7);
        LinearLayout autoSaveDurationLayout = abstractC5283a.f20160x;
        AbstractC6118n.m27186d(autoSaveDurationLayout, "autoSaveDurationLayout");
        Iterator it = AbstractC1047f0.m4662a(autoSaveDurationLayout).iterator();
        while (it.hasNext()) {
            ((View) it.next()).setEnabled(z7);
        }
    }

    /* JADX INFO: renamed from: t2 */
    private final String m16011t2() {
        return m16005r2().getString(C3034A.f12453a.m15046u(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t3 */
    public static final void m16012t3(final AccessibilitySettingActivity accessibilitySettingActivity, AbstractC5283a abstractC5283a, final CompoundButton chekBox, boolean z7) {
        AbstractC6118n.m27187e(chekBox, "chekBox");
        if (z7 && AbstractC3041D.m15080e(accessibilitySettingActivity)) {
            accessibilitySettingActivity.m15921U3();
            abstractC5283a.f20134B.setChecked(false);
            return;
        }
        if (AbstractC3041D.m15080e(accessibilitySettingActivity) || z7 == accessibilitySettingActivity.m15879G2()) {
            return;
        }
        final InterfaceC5356a interfaceC5356a = new InterfaceC5356a() { // from class: n1.y
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return AccessibilitySettingActivity.m16015u3(this.f24537a, chekBox);
            }
        };
        if (!accessibilitySettingActivity.m15879G2()) {
            interfaceC5356a.invoke();
            return;
        }
        C5411i c5411iM24530a = C5411i.f20591L0.m24530a(accessibilitySettingActivity.m15876F2());
        c5411iM24530a.m24527w2(new InterfaceC5356a() { // from class: n1.z
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return AccessibilitySettingActivity.m16024x3(chekBox, accessibilitySettingActivity);
            }
        });
        c5411iM24530a.m24528x2(new InterfaceC5356a() { // from class: n1.A
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return AccessibilitySettingActivity.m16027y3(interfaceC5356a);
            }
        });
        c5411iM24530a.m24529y2(new InterfaceC5371p() { // from class: n1.B
            @Override // p238e6.InterfaceC5371p
            public final Object invoke(Object obj, Object obj2) {
                return AccessibilitySettingActivity.m16030z3(this.f24479a, interfaceC5356a, (String) obj, (C5411i) obj2);
            }
        });
        c5411iM24530a.mo7649g2(accessibilitySettingActivity.m12232H0(), null);
    }

    /* JADX INFO: renamed from: u2 */
    private final void m16014u2(boolean z7) {
        if (z7) {
            Application application = getApplication();
            AbstractC6118n.m27186d(application, "getApplication(...)");
            if (!AbstractC3081u.m15314a(application) || AbstractC3041D.m15080e(this)) {
                AbstractC5283a abstractC5283a = null;
                if (AbstractC3041D.m15080e(this)) {
                    m15933Y3();
                    AbstractC5283a abstractC5283a2 = this.f12924R;
                    if (abstractC5283a2 == null) {
                        AbstractC6118n.m27197o("binding");
                    } else {
                        abstractC5283a = abstractC5283a2;
                    }
                    abstractC5283a.f20147O.setChecked(false);
                    return;
                }
                m15902O2();
                AbstractC5283a abstractC5283a3 = this.f12924R;
                if (abstractC5283a3 == null) {
                    AbstractC6118n.m27197o("binding");
                } else {
                    abstractC5283a = abstractC5283a3;
                }
                abstractC5283a.f20147O.setChecked(false);
                return;
            }
        }
        m15958f2(z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u3 */
    public static final C1444v m16015u3(final AccessibilitySettingActivity accessibilitySettingActivity, final CompoundButton compoundButton) {
        ViewOnClickListenerC5402G viewOnClickListenerC5402GM24501a = ViewOnClickListenerC5402G.f20569L0.m24501a(accessibilitySettingActivity.m16011t2(), accessibilitySettingActivity.m15876F2());
        viewOnClickListenerC5402GM24501a.m24499r2(new InterfaceC5356a() { // from class: n1.K
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return AccessibilitySettingActivity.m16018v3(compoundButton, accessibilitySettingActivity);
            }
        });
        viewOnClickListenerC5402GM24501a.m24500s2(new InterfaceC5371p() { // from class: n1.L
            @Override // p238e6.InterfaceC5371p
            public final Object invoke(Object obj, Object obj2) {
                return AccessibilitySettingActivity.m16021w3(this.f24490a, compoundButton, (String) obj, ((Boolean) obj2).booleanValue());
            }
        });
        viewOnClickListenerC5402GM24501a.mo7649g2(accessibilitySettingActivity.m12232H0(), null);
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: v2 */
    private final void m16017v2(int i7, TextView textView, String str) {
        Application application = getApplication();
        AbstractC6118n.m27186d(application, "getApplication(...)");
        if (AbstractC3081u.m15315b(application)) {
            m15903O3(str, C3034A.f12453a.m15034h()[i7], textView).m9118v();
        } else {
            m15952d4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v3 */
    public static final C1444v m16018v3(CompoundButton compoundButton, AccessibilitySettingActivity accessibilitySettingActivity) {
        compoundButton.setChecked(accessibilitySettingActivity.m15879G2());
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: w2 */
    private final void m16020w2() {
        this.f12924R = (AbstractC5283a) AbstractC2473f.m10831j(this, R.layout.activity_accessibility_setting);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w3 */
    public static final C1444v m16021w3(AccessibilitySettingActivity accessibilitySettingActivity, CompoundButton compoundButton, String str, boolean z7) {
        accessibilitySettingActivity.m15955e3(str);
        accessibilitySettingActivity.m15951d3(z7);
        compoundButton.setChecked(accessibilitySettingActivity.m15879G2());
        accessibilitySettingActivity.m15968h4();
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: x2 */
    private final void m16023x2() {
        Application application = getApplication();
        AbstractC6118n.m27186d(application, "getApplication(...)");
        boolean zM15315b = AbstractC3081u.m15315b(application);
        boolean booleanExtra = getIntent().getBooleanExtra("forEnableAccessibility", !zM15315b);
        AbstractC5283a abstractC5283a = this.f12924R;
        if (abstractC5283a == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5283a = null;
        }
        m15958f2(zM15315b);
        MaterialSwitch switchAccessibility = abstractC5283a.f20147O;
        AbstractC6118n.m27186d(switchAccessibility, "switchAccessibility");
        m15996o4(switchAccessibility, zM15315b && !abstractC5283a.f20147O.isChecked(), booleanExtra, new CompoundButton.OnCheckedChangeListener() { // from class: n1.c
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
                AccessibilitySettingActivity.m16026y2(this.f24506a, compoundButton, z7);
            }
        });
        m15868C3();
        m15995o3();
        m15988m4();
        m15976j4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x3 */
    public static final C1444v m16024x3(CompoundButton compoundButton, AccessibilitySettingActivity accessibilitySettingActivity) {
        compoundButton.setChecked(accessibilitySettingActivity.m15879G2());
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y2 */
    public static final void m16026y2(AccessibilitySettingActivity accessibilitySettingActivity, CompoundButton compoundButton, boolean z7) {
        AbstractC6118n.m27187e(compoundButton, "<unused var>");
        accessibilitySettingActivity.m16014u2(z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y3 */
    public static final C1444v m16027y3(InterfaceC5356a interfaceC5356a) {
        interfaceC5356a.invoke();
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: z2 */
    private final boolean m16029z2() {
        return m16005r2().getBoolean("isAcceptAccessibilityPolicy", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z3 */
    public static final C1444v m16030z3(AccessibilitySettingActivity accessibilitySettingActivity, InterfaceC5356a interfaceC5356a, String password, C5411i dialog) {
        AbstractC6118n.m27187e(password, "password");
        AbstractC6118n.m27187e(dialog, "dialog");
        if (AbstractC6118n.m27183a(password, accessibilitySettingActivity.m16011t2())) {
            dialog.mo12082T1();
            interfaceC5356a.invoke();
        } else {
            dialog.m24526B2();
        }
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: K3 */
    public final void m16031K3() {
        final Slider slider = new Slider(this);
        slider.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        slider.setStepSize(1.0f);
        slider.setValueFrom(2.0f);
        slider.setValueTo(99.0f);
        slider.setValue(m15990n2());
        FrameLayout frameLayout = new FrameLayout(this);
        int i7 = (int) (8 * frameLayout.getContext().getResources().getDisplayMetrics().density);
        frameLayout.setPadding(i7, 0, i7, 0);
        frameLayout.addView(slider);
        DialogInterfaceC2241b dialogInterfaceC2241bMo9097a = new C7611b(this).m33365P(R.string.overlay_position_title_dialog).mo9117u(frameLayout).m33361L(R.string.ok, new DialogInterface.OnClickListener() { // from class: n1.F
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                AccessibilitySettingActivity.m15894L3(this.f24484a, slider, dialogInterface, i8);
            }
        }).m33356G(R.string.cancel, new DialogInterface.OnClickListener() { // from class: n1.G
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                AccessibilitySettingActivity.m15897M3(dialogInterface, i8);
            }
        }).m33358I(R.string.rest, new DialogInterface.OnClickListener() { // from class: n1.I
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                AccessibilitySettingActivity.m15900N3(this.f24486a, dialogInterface, i8);
            }
        }).mo9097a();
        AbstractC6118n.m27186d(dialogInterfaceC2241bMo9097a, "create(...)");
        dialogInterfaceC2241bMo9097a.show();
    }

    @Override // androidx.fragment.app.AbstractActivityC2592j, p223d.AbstractActivityC5187q, android.app.Activity
    protected void onActivityResult(int i7, int i8, Intent intent) {
        super.onActivityResult(i7, i8, intent);
        if (i7 == 0) {
            Application application = getApplication();
            AbstractC6118n.m27186d(application, "getApplication(...)");
            boolean zM15314a = AbstractC3081u.m15314a(application);
            m15958f2(zM15314a);
            AbstractC5283a abstractC5283a = this.f12924R;
            if (abstractC5283a == null) {
                AbstractC6118n.m27197o("binding");
                abstractC5283a = null;
            }
            abstractC5283a.f20147O.setChecked(zM15314a);
            C3065o.f12624f.m15175a(this).m15166g(this instanceof AccessibilitySettingFullActivity, m15870D2());
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (AbstractC3041D.m15080e(this)) {
            m15921U3();
        }
        AbstractC5283a abstractC5283a = null;
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (numValueOf != null && numValueOf.intValue() == R.id.layTypeOpBack) {
            AbstractC5283a abstractC5283a2 = this.f12924R;
            if (abstractC5283a2 == null) {
                AbstractC6118n.m27197o("binding");
                abstractC5283a2 = null;
            }
            MaterialTextView textTypeOpBack = abstractC5283a2.f20151S;
            AbstractC6118n.m27186d(textTypeOpBack, "textTypeOpBack");
            AbstractC5283a abstractC5283a3 = this.f12924R;
            if (abstractC5283a3 == null) {
                AbstractC6118n.m27197o("binding");
            } else {
                abstractC5283a = abstractC5283a3;
            }
            m16017v2(0, textTypeOpBack, abstractC5283a.f20152T.getText().toString());
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.layTypeOpHome) {
            AbstractC5283a abstractC5283a4 = this.f12924R;
            if (abstractC5283a4 == null) {
                AbstractC6118n.m27197o("binding");
                abstractC5283a4 = null;
            }
            MaterialTextView textTypeOpHome = abstractC5283a4.f20155W;
            AbstractC6118n.m27186d(textTypeOpHome, "textTypeOpHome");
            AbstractC5283a abstractC5283a5 = this.f12924R;
            if (abstractC5283a5 == null) {
                AbstractC6118n.m27197o("binding");
            } else {
                abstractC5283a = abstractC5283a5;
            }
            m16017v2(1, textTypeOpHome, abstractC5283a.f20153U.getText().toString());
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.layTypeOpMenu) {
            AbstractC5283a abstractC5283a6 = this.f12924R;
            if (abstractC5283a6 == null) {
                AbstractC6118n.m27197o("binding");
                abstractC5283a6 = null;
            }
            MaterialTextView textTypeOpMenu = abstractC5283a6.f20156X;
            AbstractC6118n.m27186d(textTypeOpMenu, "textTypeOpMenu");
            AbstractC5283a abstractC5283a7 = this.f12924R;
            if (abstractC5283a7 == null) {
                AbstractC6118n.m27197o("binding");
            } else {
                abstractC5283a = abstractC5283a7;
            }
            m16017v2(2, textTypeOpMenu, abstractC5283a.f20154V.getText().toString());
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC2592j, p223d.AbstractActivityC5187q, p017C.AbstractActivityC0106g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        f12919W = this instanceof AccessibilitySettingFullActivity;
        super.onCreate(bundle);
        m16020w2();
        AbstractC5283a abstractC5283a = this.f12924R;
        AbstractC5283a abstractC5283a2 = null;
        if (abstractC5283a == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5283a = null;
        }
        AppBarLayout appBarMain = abstractC5283a.f20158v;
        AbstractC6118n.m27186d(appBarMain, "appBarMain");
        appBarMain.setVisibility(f12919W ? 0 : 8);
        AbstractC5283a abstractC5283a3 = this.f12924R;
        if (abstractC5283a3 == null) {
            AbstractC6118n.m27197o("binding");
        } else {
            abstractC5283a2 = abstractC5283a3;
        }
        abstractC5283a2.f20157Y.setNavigationOnClickListener(new View.OnClickListener() { // from class: n1.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccessibilitySettingActivity.m15891K2(this.f24504a, view);
            }
        });
        m16023x2();
        m15885I2();
        m16003q3();
        m15992n4();
        m15926W2();
        AbstractC5166I.m23950b(mo12238b(), this, false, new InterfaceC5367l() { // from class: n1.l
            @Override // p238e6.InterfaceC5367l
            public final Object invoke(Object obj) {
                return AccessibilitySettingActivity.m15893L2(this.f24517a, (AbstractC5158A) obj);
            }
        }, 2, null);
    }

    @Override // p223d.AbstractActivityC5187q, android.app.Activity
    protected void onNewIntent(Intent intent) {
        AbstractC6118n.m27187e(intent, "intent");
        super.onNewIntent(intent);
        if (intent.getBooleanExtra("fromAccessibility", false)) {
            m15880G3();
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC2592j, android.app.Activity
    protected void onResume() {
        super.onResume();
        m15885I2();
        C3113b c3113b = this.f12921O;
        if (c3113b != null) {
            c3113b.m16054t();
        }
    }

    @Override // androidx.appcompat.app.AbstractActivityC2242c, androidx.fragment.app.AbstractActivityC2592j, android.app.Activity
    protected void onStop() {
        super.onStop();
        m15964g4();
    }
}
