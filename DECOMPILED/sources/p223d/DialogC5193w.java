package p223d;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC2641d0;
import androidx.lifecycle.AbstractC2650l;
import androidx.lifecycle.C2659u;
import androidx.lifecycle.InterfaceC2657s;
import kotlin.jvm.internal.AbstractC6118n;
import p010B0.AbstractC0054m;
import p010B0.C0047f;
import p010B0.C0049h;
import p010B0.InterfaceC0050i;

/* JADX INFO: renamed from: d.w */
/* JADX INFO: loaded from: classes.dex */
public class DialogC5193w extends Dialog implements InterfaceC2657s, InterfaceC5167J, InterfaceC0050i {

    /* JADX INFO: renamed from: a */
    private C2659u f19830a;

    /* JADX INFO: renamed from: b */
    private final C0049h f19831b;

    /* JADX INFO: renamed from: c */
    private final C5165H f19832c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC5193w(Context context, int i7) {
        super(context, i7);
        AbstractC6118n.m27187e(context, "context");
        this.f19831b = C0049h.f384c.m197b(this);
        this.f19832c = new C5165H(new Runnable() { // from class: d.v
            @Override // java.lang.Runnable
            public final void run() {
                DialogC5193w.m24012e(this.f19829a);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    private final C2659u m24011c() {
        C2659u c2659u = this.f19830a;
        if (c2659u != null) {
            return c2659u;
        }
        C2659u c2659u2 = new C2659u(this);
        this.f19830a = c2659u2;
        return c2659u2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final void m24012e(DialogC5193w dialogC5193w) {
        super.onBackPressed();
    }

    @Override // p010B0.InterfaceC0050i
    /* JADX INFO: renamed from: A */
    public C0047f mo198A() {
        return this.f19831b.m191b();
    }

    @Override // androidx.lifecycle.InterfaceC2657s
    /* JADX INFO: renamed from: P */
    public AbstractC2650l mo419P() {
        return m24011c();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC6118n.m27187e(view, "view");
        m24013d();
        super.addContentView(view, layoutParams);
    }

    @Override // p223d.InterfaceC5167J
    /* JADX INFO: renamed from: b */
    public final C5165H mo12238b() {
        return this.f19832c;
    }

    /* JADX INFO: renamed from: d */
    public void m24013d() {
        Window window = getWindow();
        AbstractC6118n.m27184b(window);
        View decorView = window.getDecorView();
        AbstractC6118n.m27186d(decorView, "getDecorView(...)");
        AbstractC2641d0.m12618a(decorView, this);
        Window window2 = getWindow();
        AbstractC6118n.m27184b(window2);
        View decorView2 = window2.getDecorView();
        AbstractC6118n.m27186d(decorView2, "getDecorView(...)");
        AbstractC5170M.m23952a(decorView2, this);
        Window window3 = getWindow();
        AbstractC6118n.m27184b(window3);
        View decorView3 = window3.getDecorView();
        AbstractC6118n.m27186d(decorView3, "getDecorView(...)");
        AbstractC0054m.m206a(decorView3, this);
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.f19832c.m23939s();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            C5165H c5165h = this.f19832c;
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            AbstractC6118n.m27186d(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
            c5165h.m23940v(onBackInvokedDispatcher);
        }
        this.f19831b.m193d(bundle);
        m24011c().m12651i(AbstractC2650l.a.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        AbstractC6118n.m27186d(bundleOnSaveInstanceState, "onSaveInstanceState(...)");
        this.f19831b.m194e(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        m24011c().m12651i(AbstractC2650l.a.ON_RESUME);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        m24011c().m12651i(AbstractC2650l.a.ON_DESTROY);
        this.f19830a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i7) {
        m24013d();
        super.setContentView(i7);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        AbstractC6118n.m27187e(view, "view");
        m24013d();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC6118n.m27187e(view, "view");
        m24013d();
        super.setContentView(view, layoutParams);
    }
}
