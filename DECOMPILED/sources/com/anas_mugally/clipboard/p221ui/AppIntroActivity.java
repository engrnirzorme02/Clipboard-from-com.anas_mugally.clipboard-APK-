package com.anas_mugally.clipboard.p221ui;

import android.os.Build;
import android.os.Bundle;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import com.anas_mugally.clipboard.C3065o;
import com.anas_mugally.clipboard.R;
import com.anas_mugally.clipboard.p221ui.AppIntroActivity;
import kotlin.jvm.internal.AbstractC6112h;
import p015B5.AbstractActivityC0091a;
import p023C5.C0148c;
import p145S5.AbstractC1430h;
import p145S5.InterfaceC1429g;
import p238e6.InterfaceC5356a;

/* JADX INFO: loaded from: classes.dex */
public final class AppIntroActivity extends AbstractActivityC0091a {

    /* JADX INFO: renamed from: s0 */
    public static final C3084a f12738s0 = new C3084a(null);

    /* JADX INFO: renamed from: q0 */
    private final long f12739q0 = System.currentTimeMillis();

    /* JADX INFO: renamed from: r0 */
    private final InterfaceC1429g f12740r0 = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: l1.o
        @Override // p238e6.InterfaceC5356a
        public final Object invoke() {
            return Boolean.valueOf(AppIntroActivity.m15366c2(this.f24051a));
        }
    });

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.AppIntroActivity$a */
    public static final class C3084a {
        public /* synthetic */ C3084a(AbstractC6112h abstractC6112h) {
            this();
        }

        private C3084a() {
        }
    }

    /* JADX INFO: renamed from: a2 */
    private final boolean m15364a2() {
        return ((Boolean) this.f12740r0.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: b2 */
    private final boolean m15365b2() {
        return isInMultiWindowMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c2 */
    public static final boolean m15366c2(AppIntroActivity appIntroActivity) {
        return appIntroActivity.getIntent().getBooleanExtra("ONLY_PROFESSIONAL_FEATURES", false);
    }

    /* JADX INFO: renamed from: d2 */
    private final void m15367d2() {
        if (m15365b2()) {
            return;
        }
        if (Build.VERSION.SDK_INT < 30) {
            getWindow().getDecorView().setSystemUiVisibility(5894);
            return;
        }
        getWindow().setDecorFitsSystemWindows(false);
        WindowInsetsController insetsController = getWindow().getInsetsController();
        if (insetsController != null) {
            insetsController.hide(WindowInsets.Type.statusBars() | WindowInsets.Type.navigationBars());
            insetsController.setSystemBarsBehavior(2);
        }
    }

    /* JADX INFO: renamed from: e2 */
    private final void m15368e2() {
        if (!m15364a2()) {
            m352j1(new C0148c.b().m671z(R.string.intro_1_hello_title).m668w(R.string.intro_1_hello_content).m663r(R.color.intro_slide_1).m664s(R.color.intro_slide_1).m669x(R.drawable.ic_launcher_foreground).m670y(false).m665t());
        }
        if (!m15364a2()) {
            m352j1(new C0148c.b().m671z(R.string.intro_2_ai_title).m668w(R.string.intro_2_ai_content).m663r(R.color.intro_slide_2).m664s(R.color.intro_slide_2).m669x(R.drawable.ic_ai_launcher_foreground).m670y(false).m665t());
        }
        m352j1(new C0148c.b().m671z(R.string.intro_3_bubble_title).m668w(R.string.intro_3_bubble_content).m663r(R.color.intro_slide_3).m664s(R.color.intro_slide_3).m662B(R.raw.intro_smart_floating_bubble).m670y(false).m665t());
        m352j1(new C0148c.b().m661A(getString(R.string.intro_4_text_temporary_title)).m668w(R.string.intro_4_text_temporary_content).m663r(R.color.intro_slide_4).m664s(R.color.intro_slide_4).m662B(R.raw.intro_automatic_text).m670y(false).m665t());
        m352j1(new C0148c.b().m661A(getString(R.string.intro_5_quick_access_title)).m668w(R.string.intro_5_quick_access_content).m663r(R.color.intro_slide_5).m664s(R.color.intro_slide_5).m662B(R.raw.intro_access_anywhere).m670y(false).m665t());
        m352j1(new C0148c.b().m661A(getString(R.string.intro_6_quick_share_and_past_title)).m668w(R.string.intro_6_quick_share_and_past_content).m663r(R.color.intro_slide_6).m664s(R.color.intro_slide_6).m662B(R.raw.intro_instant_sharing_pasting).m670y(false).m665t());
        m352j1(new C0148c.b().m671z(R.string.intro_7_screen_scanner_title).m668w(R.string.intro_7_screen_scanner_content).m663r(R.color.intro_slide_7).m664s(R.color.intro_slide_7).m662B(R.raw.intro_advanced_screen_scanner).m670y(false).m665t());
        if (!m15364a2()) {
            m352j1(new C0148c.b().m671z(R.string.intro_8_end_title).m668w(R.string.intro_8_end_content).m663r(R.color.intro_slide_8).m664s(R.color.intro_slide_8).m669x(R.drawable.ic_launcher_foreground).m670y(false).m665t());
        }
        if (m358u1().isEmpty()) {
            finishAndRemoveTask();
        }
    }

    @Override // android.app.Activity
    public void finish() {
        finishAndRemoveTask();
    }

    @Override // p015B5.AbstractActivityC0091a, androidx.fragment.app.AbstractActivityC2592j, p223d.AbstractActivityC5187q, p017C.AbstractActivityC0106g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m15368e2();
        m15367d2();
        m349H1(1);
    }

    @Override // p015B5.AbstractActivityC0091a, androidx.appcompat.app.AbstractActivityC2242c, androidx.fragment.app.AbstractActivityC2592j, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        C3065o.f12624f.m15175a(this).m15167i((System.currentTimeMillis() - this.f12739q0) / 1000.0d);
        finishAndRemoveTask();
    }
}
