package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.C2334U;
import p255h.AbstractC5523d;
import p255h.AbstractC5526g;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.l */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnKeyListenerC2287l extends AbstractC2283h implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, InterfaceC2285j, View.OnKeyListener {

    /* JADX INFO: renamed from: G */
    private static final int f7748G = AbstractC5526g.f21091m;

    /* JADX INFO: renamed from: A */
    ViewTreeObserver f7749A;

    /* JADX INFO: renamed from: B */
    private boolean f7750B;

    /* JADX INFO: renamed from: C */
    private boolean f7751C;

    /* JADX INFO: renamed from: D */
    private int f7752D;

    /* JADX INFO: renamed from: F */
    private boolean f7754F;

    /* JADX INFO: renamed from: b */
    private final Context f7755b;

    /* JADX INFO: renamed from: c */
    private final C2280e f7756c;

    /* JADX INFO: renamed from: d */
    private final C2279d f7757d;

    /* JADX INFO: renamed from: e */
    private final boolean f7758e;

    /* JADX INFO: renamed from: f */
    private final int f7759f;

    /* JADX INFO: renamed from: r */
    private final int f7760r;

    /* JADX INFO: renamed from: s */
    private final int f7761s;

    /* JADX INFO: renamed from: t */
    final C2334U f7762t;

    /* JADX INFO: renamed from: w */
    private PopupWindow.OnDismissListener f7765w;

    /* JADX INFO: renamed from: x */
    private View f7766x;

    /* JADX INFO: renamed from: y */
    View f7767y;

    /* JADX INFO: renamed from: z */
    private InterfaceC2285j.a f7768z;

    /* JADX INFO: renamed from: u */
    final ViewTreeObserver.OnGlobalLayoutListener f7763u = new a();

    /* JADX INFO: renamed from: v */
    private final View.OnAttachStateChangeListener f7764v = new b();

    /* JADX INFO: renamed from: E */
    private int f7753E = 0;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.l$a */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!ViewOnKeyListenerC2287l.this.mo9453a() || ViewOnKeyListenerC2287l.this.f7762t.m9830B()) {
                return;
            }
            View view = ViewOnKeyListenerC2287l.this.f7767y;
            if (view == null || !view.isShown()) {
                ViewOnKeyListenerC2287l.this.dismiss();
            } else {
                ViewOnKeyListenerC2287l.this.f7762t.mo9454b();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.l$b */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = ViewOnKeyListenerC2287l.this.f7749A;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    ViewOnKeyListenerC2287l.this.f7749A = view.getViewTreeObserver();
                }
                ViewOnKeyListenerC2287l viewOnKeyListenerC2287l = ViewOnKeyListenerC2287l.this;
                viewOnKeyListenerC2287l.f7749A.removeGlobalOnLayoutListener(viewOnKeyListenerC2287l.f7763u);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public ViewOnKeyListenerC2287l(Context context, C2280e c2280e, View view, int i7, int i8, boolean z7) {
        this.f7755b = context;
        this.f7756c = c2280e;
        this.f7758e = z7;
        this.f7757d = new C2279d(c2280e, LayoutInflater.from(context), z7, f7748G);
        this.f7760r = i7;
        this.f7761s = i8;
        Resources resources = context.getResources();
        this.f7759f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(AbstractC5523d.f20999b));
        this.f7766x = view;
        this.f7762t = new C2334U(context, null, i7, i8);
        c2280e.m9518c(this, context);
    }

    /* JADX INFO: renamed from: B */
    private boolean m9589B() {
        View view;
        if (mo9453a()) {
            return true;
        }
        if (this.f7750B || (view = this.f7766x) == null) {
            return false;
        }
        this.f7767y = view;
        this.f7762t.m9838K(this);
        this.f7762t.m9839L(this);
        this.f7762t.m9837J(true);
        View view2 = this.f7767y;
        boolean z7 = this.f7749A == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f7749A = viewTreeObserver;
        if (z7) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f7763u);
        }
        view2.addOnAttachStateChangeListener(this.f7764v);
        this.f7762t.m9831D(view2);
        this.f7762t.m9834G(this.f7753E);
        if (!this.f7751C) {
            this.f7752D = AbstractC2283h.m9571q(this.f7757d, null, this.f7755b, this.f7759f);
            this.f7751C = true;
        }
        this.f7762t.m9833F(this.f7752D);
        this.f7762t.m9836I(2);
        this.f7762t.m9835H(m9573p());
        this.f7762t.mo9454b();
        ListView listViewMo9457k = this.f7762t.mo9457k();
        listViewMo9457k.setOnKeyListener(this);
        if (this.f7754F && this.f7756c.m9541z() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f7755b).inflate(AbstractC5526g.f21090l, (ViewGroup) listViewMo9457k, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f7756c.m9541z());
            }
            frameLayout.setEnabled(false);
            listViewMo9457k.addHeaderView(frameLayout, null, false);
        }
        this.f7762t.mo9851p(this.f7757d);
        this.f7762t.mo9454b();
        return true;
    }

    @Override // p295m.InterfaceC6318e
    /* JADX INFO: renamed from: a */
    public boolean mo9453a() {
        return !this.f7750B && this.f7762t.mo9453a();
    }

    @Override // p295m.InterfaceC6318e
    /* JADX INFO: renamed from: b */
    public void mo9454b() {
        if (!m9589B()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC2285j
    /* JADX INFO: renamed from: c */
    public void mo9432c(C2280e c2280e, boolean z7) {
        if (c2280e != this.f7756c) {
            return;
        }
        dismiss();
        InterfaceC2285j.a aVar = this.f7768z;
        if (aVar != null) {
            aVar.mo9249c(c2280e, z7);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC2285j
    /* JADX INFO: renamed from: d */
    public void mo9433d(boolean z7) {
        this.f7751C = false;
        C2279d c2279d = this.f7757d;
        if (c2279d != null) {
            c2279d.notifyDataSetChanged();
        }
    }

    @Override // p295m.InterfaceC6318e
    public void dismiss() {
        if (mo9453a()) {
            this.f7762t.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC2285j
    /* JADX INFO: renamed from: e */
    public boolean mo9455e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC2285j
    /* JADX INFO: renamed from: h */
    public void mo9436h(InterfaceC2285j.a aVar) {
        this.f7768z = aVar;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC2285j
    /* JADX INFO: renamed from: j */
    public void mo9456j(Parcelable parcelable) {
    }

    @Override // p295m.InterfaceC6318e
    /* JADX INFO: renamed from: k */
    public ListView mo9457k() {
        return this.f7762t.mo9457k();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC2285j
    /* JADX INFO: renamed from: l */
    public boolean mo9439l(SubMenuC2288m subMenuC2288m) {
        if (subMenuC2288m.hasVisibleItems()) {
            C2284i c2284i = new C2284i(this.f7755b, subMenuC2288m, this.f7767y, this.f7758e, this.f7760r, this.f7761s);
            c2284i.m9585j(this.f7768z);
            c2284i.m9582g(AbstractC2283h.m9572z(subMenuC2288m));
            c2284i.m9584i(this.f7765w);
            this.f7765w = null;
            this.f7756c.m9522e(false);
            int iM9847e = this.f7762t.m9847e();
            int iM9850o = this.f7762t.m9850o();
            if ((Gravity.getAbsoluteGravity(this.f7753E, this.f7766x.getLayoutDirection()) & 7) == 5) {
                iM9847e += this.f7766x.getWidth();
            }
            if (c2284i.m9588n(iM9847e, iM9850o)) {
                InterfaceC2285j.a aVar = this.f7768z;
                if (aVar == null) {
                    return true;
                }
                aVar.mo9250d(subMenuC2288m);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC2285j
    /* JADX INFO: renamed from: m */
    public Parcelable mo9458m() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.AbstractC2283h
    /* JADX INFO: renamed from: n */
    public void mo9459n(C2280e c2280e) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f7750B = true;
        this.f7756c.close();
        ViewTreeObserver viewTreeObserver = this.f7749A;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f7749A = this.f7767y.getViewTreeObserver();
            }
            this.f7749A.removeGlobalOnLayoutListener(this.f7763u);
            this.f7749A = null;
        }
        this.f7767y.removeOnAttachStateChangeListener(this.f7764v);
        PopupWindow.OnDismissListener onDismissListener = this.f7765w;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i7, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i7 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC2283h
    /* JADX INFO: renamed from: r */
    public void mo9461r(View view) {
        this.f7766x = view;
    }

    @Override // androidx.appcompat.view.menu.AbstractC2283h
    /* JADX INFO: renamed from: t */
    public void mo9462t(boolean z7) {
        this.f7757d.m9480d(z7);
    }

    @Override // androidx.appcompat.view.menu.AbstractC2283h
    /* JADX INFO: renamed from: u */
    public void mo9463u(int i7) {
        this.f7753E = i7;
    }

    @Override // androidx.appcompat.view.menu.AbstractC2283h
    /* JADX INFO: renamed from: v */
    public void mo9464v(int i7) {
        this.f7762t.m9848g(i7);
    }

    @Override // androidx.appcompat.view.menu.AbstractC2283h
    /* JADX INFO: renamed from: w */
    public void mo9465w(PopupWindow.OnDismissListener onDismissListener) {
        this.f7765w = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.AbstractC2283h
    /* JADX INFO: renamed from: x */
    public void mo9466x(boolean z7) {
        this.f7754F = z7;
    }

    @Override // androidx.appcompat.view.menu.AbstractC2283h
    /* JADX INFO: renamed from: y */
    public void mo9467y(int i7) {
        this.f7762t.m9849l(i7);
    }
}
