package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import p111O.AbstractC1074t;
import p255h.AbstractC5523d;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.i */
/* JADX INFO: loaded from: classes.dex */
public class C2284i {

    /* JADX INFO: renamed from: a */
    private final Context f7735a;

    /* JADX INFO: renamed from: b */
    private final C2280e f7736b;

    /* JADX INFO: renamed from: c */
    private final boolean f7737c;

    /* JADX INFO: renamed from: d */
    private final int f7738d;

    /* JADX INFO: renamed from: e */
    private final int f7739e;

    /* JADX INFO: renamed from: f */
    private View f7740f;

    /* JADX INFO: renamed from: g */
    private int f7741g;

    /* JADX INFO: renamed from: h */
    private boolean f7742h;

    /* JADX INFO: renamed from: i */
    private InterfaceC2285j.a f7743i;

    /* JADX INFO: renamed from: j */
    private AbstractC2283h f7744j;

    /* JADX INFO: renamed from: k */
    private PopupWindow.OnDismissListener f7745k;

    /* JADX INFO: renamed from: l */
    private final PopupWindow.OnDismissListener f7746l;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.i$a */
    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            C2284i.this.mo9580e();
        }
    }

    public C2284i(Context context, C2280e c2280e, View view, boolean z7, int i7) {
        this(context, c2280e, view, z7, i7, 0);
    }

    /* JADX INFO: renamed from: a */
    private AbstractC2283h m9575a() {
        Display defaultDisplay = ((WindowManager) this.f7735a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        AbstractC2283h viewOnKeyListenerC2277b = Math.min(point.x, point.y) >= this.f7735a.getResources().getDimensionPixelSize(AbstractC5523d.f20998a) ? new ViewOnKeyListenerC2277b(this.f7735a, this.f7740f, this.f7738d, this.f7739e, this.f7737c) : new ViewOnKeyListenerC2287l(this.f7735a, this.f7736b, this.f7740f, this.f7738d, this.f7739e, this.f7737c);
        viewOnKeyListenerC2277b.mo9459n(this.f7736b);
        viewOnKeyListenerC2277b.mo9465w(this.f7746l);
        viewOnKeyListenerC2277b.mo9461r(this.f7740f);
        viewOnKeyListenerC2277b.mo9436h(this.f7743i);
        viewOnKeyListenerC2277b.mo9462t(this.f7742h);
        viewOnKeyListenerC2277b.mo9463u(this.f7741g);
        return viewOnKeyListenerC2277b;
    }

    /* JADX INFO: renamed from: l */
    private void m9576l(int i7, int i8, boolean z7, boolean z8) {
        AbstractC2283h abstractC2283hM9578c = m9578c();
        abstractC2283hM9578c.mo9466x(z8);
        if (z7) {
            if ((AbstractC1074t.m4771b(this.f7741g, this.f7740f.getLayoutDirection()) & 7) == 5) {
                i7 -= this.f7740f.getWidth();
            }
            abstractC2283hM9578c.mo9464v(i7);
            abstractC2283hM9578c.mo9467y(i8);
            int i9 = (int) ((this.f7735a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            abstractC2283hM9578c.m9574s(new Rect(i7 - i9, i8 - i9, i7 + i9, i8 + i9));
        }
        abstractC2283hM9578c.mo9454b();
    }

    /* JADX INFO: renamed from: b */
    public void m9577b() {
        if (m9579d()) {
            this.f7744j.dismiss();
        }
    }

    /* JADX INFO: renamed from: c */
    public AbstractC2283h m9578c() {
        if (this.f7744j == null) {
            this.f7744j = m9575a();
        }
        return this.f7744j;
    }

    /* JADX INFO: renamed from: d */
    public boolean m9579d() {
        AbstractC2283h abstractC2283h = this.f7744j;
        return abstractC2283h != null && abstractC2283h.mo9453a();
    }

    /* JADX INFO: renamed from: e */
    protected void mo9580e() {
        this.f7744j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f7745k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m9581f(View view) {
        this.f7740f = view;
    }

    /* JADX INFO: renamed from: g */
    public void m9582g(boolean z7) {
        this.f7742h = z7;
        AbstractC2283h abstractC2283h = this.f7744j;
        if (abstractC2283h != null) {
            abstractC2283h.mo9462t(z7);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m9583h(int i7) {
        this.f7741g = i7;
    }

    /* JADX INFO: renamed from: i */
    public void m9584i(PopupWindow.OnDismissListener onDismissListener) {
        this.f7745k = onDismissListener;
    }

    /* JADX INFO: renamed from: j */
    public void m9585j(InterfaceC2285j.a aVar) {
        this.f7743i = aVar;
        AbstractC2283h abstractC2283h = this.f7744j;
        if (abstractC2283h != null) {
            abstractC2283h.mo9436h(aVar);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m9586k() {
        if (!m9587m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* JADX INFO: renamed from: m */
    public boolean m9587m() {
        if (m9579d()) {
            return true;
        }
        if (this.f7740f == null) {
            return false;
        }
        m9576l(0, 0, false, false);
        return true;
    }

    /* JADX INFO: renamed from: n */
    public boolean m9588n(int i7, int i8) {
        if (m9579d()) {
            return true;
        }
        if (this.f7740f == null) {
            return false;
        }
        m9576l(i7, i8, true, true);
        return true;
    }

    public C2284i(Context context, C2280e c2280e, View view, boolean z7, int i7, int i8) {
        this.f7741g = 8388611;
        this.f7746l = new a();
        this.f7735a = context;
        this.f7736b = c2280e;
        this.f7740f = view;
        this.f7737c = z7;
        this.f7738d = i7;
        this.f7739e = i8;
    }
}
