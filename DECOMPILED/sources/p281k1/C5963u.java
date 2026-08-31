package p281k1;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import android.view.WindowManager;
import com.anas_mugally.clipboard.C3034A;
import com.anas_mugally.clipboard.service.MyAccessibilityService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1430h;
import p145S5.InterfaceC1429g;
import p238e6.InterfaceC5356a;
import p302m6.AbstractC6406h;

/* JADX INFO: renamed from: k1.u */
/* JADX INFO: loaded from: classes.dex */
public final class C5963u {

    /* JADX INFO: renamed from: h */
    public static final b f23690h = new b(null);

    /* JADX INFO: renamed from: i */
    private static volatile C5963u f23691i;

    /* JADX INFO: renamed from: a */
    private final MyAccessibilityService f23692a;

    /* JADX INFO: renamed from: b */
    private WindowManager f23693b;

    /* JADX INFO: renamed from: c */
    private ClipboardManager f23694c;

    /* JADX INFO: renamed from: d */
    private final List f23695d;

    /* JADX INFO: renamed from: e */
    private String f23696e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC1429g f23697f;

    /* JADX INFO: renamed from: g */
    private final WindowManager.LayoutParams f23698g;

    /* JADX INFO: renamed from: k1.u$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo15233a(String str);
    }

    /* JADX INFO: renamed from: k1.u$b */
    public static final class b {
        public /* synthetic */ b(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C5963u m26928a() {
            C5963u c5963u;
            C5963u c5963u2 = C5963u.f23691i;
            if (c5963u2 != null) {
                return c5963u2;
            }
            synchronized (this) {
                c5963u = C5963u.f23691i;
                if (c5963u == null) {
                    c5963u = new C5963u(null);
                    C5963u.f23691i = c5963u;
                }
            }
            return c5963u;
        }

        private b() {
        }
    }

    public /* synthetic */ C5963u(AbstractC6112h abstractC6112h) {
        this();
    }

    /* JADX INFO: renamed from: f */
    private final View m26918f() {
        View view = new View(this.f23692a);
        view.setBackgroundColor(0);
        try {
            WindowManager windowManager = this.f23693b;
            if (windowManager != null) {
                windowManager.addView(view, this.f23698g);
            }
        } catch (Exception unused) {
        }
        return view;
    }

    /* JADX INFO: renamed from: h */
    private final int m26919h() {
        return ((Number) this.f23697f.getValue()).intValue();
    }

    /* JADX INFO: renamed from: j */
    private final void m26920j(String str) {
        Iterator it = this.f23695d.iterator();
        while (it.hasNext()) {
            try {
                ((a) it.next()).mo15233a(str);
            } catch (Exception e7) {
                e7.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: l */
    private final void m26921l(String str) {
        this.f23696e = str;
        if (str == null) {
            return;
        }
        m26920j(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final int m26922m() {
        return C3034A.f12453a.m15050y(false);
    }

    /* JADX INFO: renamed from: d */
    public final void m26923d(a observer) {
        AbstractC6118n.m27187e(observer, "observer");
        if (this.f23695d.contains(observer)) {
            return;
        }
        this.f23695d.add(observer);
    }

    /* JADX INFO: renamed from: e */
    public final void m26924e() {
        this.f23695d.clear();
        this.f23694c = null;
        this.f23693b = null;
        m26921l(null);
        f23691i = null;
    }

    /* JADX INFO: renamed from: g */
    public final String m26925g() {
        CharSequence text;
        String string;
        ClipData primaryClip;
        View viewM26918f = m26918f();
        try {
            ClipboardManager clipboardManager = this.f23694c;
            if (clipboardManager == null || !clipboardManager.hasPrimaryClip()) {
                WindowManager windowManager = this.f23693b;
                if (windowManager != null) {
                    windowManager.removeView(viewM26918f);
                }
                return null;
            }
            ClipboardManager clipboardManager2 = this.f23694c;
            ClipData.Item itemAt = (clipboardManager2 == null || (primaryClip = clipboardManager2.getPrimaryClip()) == null) ? null : primaryClip.getItemAt(0);
            WindowManager windowManager2 = this.f23693b;
            if (windowManager2 != null) {
                windowManager2.removeView(viewM26918f);
            }
            if (itemAt == null || (text = itemAt.getText()) == null || (string = text.toString()) == null) {
                return null;
            }
            return AbstractC6406h.m27594S0(string).toString();
        } catch (Exception e7) {
            WindowManager windowManager3 = this.f23693b;
            if (windowManager3 != null) {
                windowManager3.removeView(viewM26918f);
            }
            e7.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m26926i(boolean z7) {
        String strM26925g = m26925g();
        if (strM26925g == null || strM26925g.length() == 0) {
            return;
        }
        if (!AbstractC6118n.m27183a(strM26925g, this.f23696e) || z7) {
            m26921l(strM26925g);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m26927k(a observer) {
        AbstractC6118n.m27187e(observer, "observer");
        this.f23695d.remove(observer);
    }

    private C5963u() {
        MyAccessibilityService myAccessibilityServiceM15245a = MyAccessibilityService.f12639O.m15245a();
        AbstractC6118n.m27184b(myAccessibilityServiceM15245a);
        this.f23692a = myAccessibilityServiceM15245a;
        this.f23695d = new ArrayList();
        Object systemService = myAccessibilityServiceM15245a.getSystemService("window");
        AbstractC6118n.m27185c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f23693b = (WindowManager) systemService;
        Object systemService2 = myAccessibilityServiceM15245a.getSystemService("clipboard");
        AbstractC6118n.m27185c(systemService2, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.f23694c = (ClipboardManager) systemService2;
        this.f23697f = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: k1.t
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return Integer.valueOf(C5963u.m26922m());
            }
        });
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(0, 0, m26919h(), 48, -3);
        layoutParams.gravity = 17;
        this.f23698g = layoutParams;
    }
}
