package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.C2334U;
import androidx.appcompat.widget.InterfaceC2324T;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p111O.AbstractC1074t;
import p255h.AbstractC5523d;
import p255h.AbstractC5526g;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.b */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnKeyListenerC2277b extends AbstractC2283h implements InterfaceC2285j, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: M */
    private static final int f7616M = AbstractC5526g.f21083e;

    /* JADX INFO: renamed from: A */
    View f7617A;

    /* JADX INFO: renamed from: C */
    private boolean f7619C;

    /* JADX INFO: renamed from: D */
    private boolean f7620D;

    /* JADX INFO: renamed from: E */
    private int f7621E;

    /* JADX INFO: renamed from: F */
    private int f7622F;

    /* JADX INFO: renamed from: H */
    private boolean f7624H;

    /* JADX INFO: renamed from: I */
    private InterfaceC2285j.a f7625I;

    /* JADX INFO: renamed from: J */
    ViewTreeObserver f7626J;

    /* JADX INFO: renamed from: K */
    private PopupWindow.OnDismissListener f7627K;

    /* JADX INFO: renamed from: L */
    boolean f7628L;

    /* JADX INFO: renamed from: b */
    private final Context f7629b;

    /* JADX INFO: renamed from: c */
    private final int f7630c;

    /* JADX INFO: renamed from: d */
    private final int f7631d;

    /* JADX INFO: renamed from: e */
    private final int f7632e;

    /* JADX INFO: renamed from: f */
    private final boolean f7633f;

    /* JADX INFO: renamed from: r */
    final Handler f7634r;

    /* JADX INFO: renamed from: z */
    private View f7642z;

    /* JADX INFO: renamed from: s */
    private final List f7635s = new ArrayList();

    /* JADX INFO: renamed from: t */
    final List f7636t = new ArrayList();

    /* JADX INFO: renamed from: u */
    final ViewTreeObserver.OnGlobalLayoutListener f7637u = new a();

    /* JADX INFO: renamed from: v */
    private final View.OnAttachStateChangeListener f7638v = new b();

    /* JADX INFO: renamed from: w */
    private final InterfaceC2324T f7639w = new c();

    /* JADX INFO: renamed from: x */
    private int f7640x = 0;

    /* JADX INFO: renamed from: y */
    private int f7641y = 0;

    /* JADX INFO: renamed from: G */
    private boolean f7623G = false;

    /* JADX INFO: renamed from: B */
    private int f7618B = m9450F();

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$a */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!ViewOnKeyListenerC2277b.this.mo9453a() || ViewOnKeyListenerC2277b.this.f7636t.size() <= 0 || ((d) ViewOnKeyListenerC2277b.this.f7636t.get(0)).f7650a.m9830B()) {
                return;
            }
            View view = ViewOnKeyListenerC2277b.this.f7617A;
            if (view == null || !view.isShown()) {
                ViewOnKeyListenerC2277b.this.dismiss();
                return;
            }
            Iterator it = ViewOnKeyListenerC2277b.this.f7636t.iterator();
            while (it.hasNext()) {
                ((d) it.next()).f7650a.mo9454b();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$b */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = ViewOnKeyListenerC2277b.this.f7626J;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    ViewOnKeyListenerC2277b.this.f7626J = view.getViewTreeObserver();
                }
                ViewOnKeyListenerC2277b viewOnKeyListenerC2277b = ViewOnKeyListenerC2277b.this;
                viewOnKeyListenerC2277b.f7626J.removeGlobalOnLayoutListener(viewOnKeyListenerC2277b.f7637u);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$c */
    class c implements InterfaceC2324T {

        /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$c$a */
        class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ d f7646a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ MenuItem f7647b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ C2280e f7648c;

            a(d dVar, MenuItem menuItem, C2280e c2280e) {
                this.f7646a = dVar;
                this.f7647b = menuItem;
                this.f7648c = c2280e;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f7646a;
                if (dVar != null) {
                    ViewOnKeyListenerC2277b.this.f7628L = true;
                    dVar.f7651b.m9522e(false);
                    ViewOnKeyListenerC2277b.this.f7628L = false;
                }
                if (this.f7647b.isEnabled() && this.f7647b.hasSubMenu()) {
                    this.f7648c.m9504O(this.f7647b, 4);
                }
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.InterfaceC2324T
        /* JADX INFO: renamed from: f */
        public void mo9468f(C2280e c2280e, MenuItem menuItem) {
            ViewOnKeyListenerC2277b.this.f7634r.removeCallbacksAndMessages(null);
            int size = ViewOnKeyListenerC2277b.this.f7636t.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    i7 = -1;
                    break;
                } else if (c2280e == ((d) ViewOnKeyListenerC2277b.this.f7636t.get(i7)).f7651b) {
                    break;
                } else {
                    i7++;
                }
            }
            if (i7 == -1) {
                return;
            }
            int i8 = i7 + 1;
            ViewOnKeyListenerC2277b.this.f7634r.postAtTime(new a(i8 < ViewOnKeyListenerC2277b.this.f7636t.size() ? (d) ViewOnKeyListenerC2277b.this.f7636t.get(i8) : null, menuItem, c2280e), c2280e, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.InterfaceC2324T
        /* JADX INFO: renamed from: i */
        public void mo9469i(C2280e c2280e, MenuItem menuItem) {
            ViewOnKeyListenerC2277b.this.f7634r.removeCallbacksAndMessages(c2280e);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$d */
    private static class d {

        /* JADX INFO: renamed from: a */
        public final C2334U f7650a;

        /* JADX INFO: renamed from: b */
        public final C2280e f7651b;

        /* JADX INFO: renamed from: c */
        public final int f7652c;

        public d(C2334U c2334u, C2280e c2280e, int i7) {
            this.f7650a = c2334u;
            this.f7651b = c2280e;
            this.f7652c = i7;
        }

        /* JADX INFO: renamed from: a */
        public ListView m9470a() {
            return this.f7650a.mo9457k();
        }
    }

    public ViewOnKeyListenerC2277b(Context context, View view, int i7, int i8, boolean z7) {
        this.f7629b = context;
        this.f7642z = view;
        this.f7631d = i7;
        this.f7632e = i8;
        this.f7633f = z7;
        Resources resources = context.getResources();
        this.f7630c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(AbstractC5523d.f20999b));
        this.f7634r = new Handler();
    }

    /* JADX INFO: renamed from: B */
    private C2334U m9446B() {
        C2334U c2334u = new C2334U(this.f7629b, null, this.f7631d, this.f7632e);
        c2334u.m9938U(this.f7639w);
        c2334u.m9839L(this);
        c2334u.m9838K(this);
        c2334u.m9831D(this.f7642z);
        c2334u.m9834G(this.f7641y);
        c2334u.m9837J(true);
        c2334u.m9836I(2);
        return c2334u;
    }

    /* JADX INFO: renamed from: C */
    private int m9447C(C2280e c2280e) {
        int size = this.f7636t.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (c2280e == ((d) this.f7636t.get(i7)).f7651b) {
                return i7;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: D */
    private MenuItem m9448D(C2280e c2280e, C2280e c2280e2) {
        int size = c2280e.size();
        for (int i7 = 0; i7 < size; i7++) {
            MenuItem item = c2280e.getItem(i7);
            if (item.hasSubMenu() && c2280e2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: E */
    private View m9449E(d dVar, C2280e c2280e) {
        C2279d c2279d;
        int headersCount;
        int firstVisiblePosition;
        MenuItem menuItemM9448D = m9448D(dVar.f7651b, c2280e);
        if (menuItemM9448D == null) {
            return null;
        }
        ListView listViewM9470a = dVar.m9470a();
        ListAdapter adapter = listViewM9470a.getAdapter();
        int i7 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            c2279d = (C2279d) headerViewListAdapter.getWrappedAdapter();
        } else {
            c2279d = (C2279d) adapter;
            headersCount = 0;
        }
        int count = c2279d.getCount();
        while (true) {
            if (i7 >= count) {
                i7 = -1;
                break;
            }
            if (menuItemM9448D == c2279d.getItem(i7)) {
                break;
            }
            i7++;
        }
        if (i7 != -1 && (firstVisiblePosition = (i7 + headersCount) - listViewM9470a.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewM9470a.getChildCount()) {
            return listViewM9470a.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    /* JADX INFO: renamed from: F */
    private int m9450F() {
        return this.f7642z.getLayoutDirection() == 1 ? 0 : 1;
    }

    /* JADX INFO: renamed from: G */
    private int m9451G(int i7) {
        List list = this.f7636t;
        ListView listViewM9470a = ((d) list.get(list.size() - 1)).m9470a();
        int[] iArr = new int[2];
        listViewM9470a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f7617A.getWindowVisibleDisplayFrame(rect);
        if (this.f7618B == 1) {
            return (iArr[0] + listViewM9470a.getWidth()) + i7 > rect.right ? 0 : 1;
        }
        return iArr[0] - i7 < 0 ? 1 : 0;
    }

    /* JADX INFO: renamed from: H */
    private void m9452H(C2280e c2280e) {
        d dVar;
        View viewM9449E;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f7629b);
        C2279d c2279d = new C2279d(c2280e, layoutInflaterFrom, this.f7633f, f7616M);
        if (!mo9453a() && this.f7623G) {
            c2279d.m9480d(true);
        } else if (mo9453a()) {
            c2279d.m9480d(AbstractC2283h.m9572z(c2280e));
        }
        int iM9571q = AbstractC2283h.m9571q(c2279d, null, this.f7629b, this.f7630c);
        C2334U c2334uM9446B = m9446B();
        c2334uM9446B.mo9851p(c2279d);
        c2334uM9446B.m9833F(iM9571q);
        c2334uM9446B.m9834G(this.f7641y);
        if (this.f7636t.size() > 0) {
            List list = this.f7636t;
            dVar = (d) list.get(list.size() - 1);
            viewM9449E = m9449E(dVar, c2280e);
        } else {
            dVar = null;
            viewM9449E = null;
        }
        if (viewM9449E != null) {
            c2334uM9446B.m9939V(false);
            c2334uM9446B.m9936S(null);
            int iM9451G = m9451G(iM9571q);
            boolean z7 = iM9451G == 1;
            this.f7618B = iM9451G;
            c2334uM9446B.m9831D(viewM9449E);
            if ((this.f7641y & 5) != 5) {
                iM9571q = z7 ? viewM9449E.getWidth() : 0 - iM9571q;
            } else if (!z7) {
                iM9571q = 0 - viewM9449E.getWidth();
            }
            c2334uM9446B.m9848g(iM9571q);
            c2334uM9446B.m9841N(true);
            c2334uM9446B.m9849l(0);
        } else {
            if (this.f7619C) {
                c2334uM9446B.m9848g(this.f7621E);
            }
            if (this.f7620D) {
                c2334uM9446B.m9849l(this.f7622F);
            }
            c2334uM9446B.m9835H(m9573p());
        }
        this.f7636t.add(new d(c2334uM9446B, c2280e, this.f7618B));
        c2334uM9446B.mo9454b();
        ListView listViewMo9457k = c2334uM9446B.mo9457k();
        listViewMo9457k.setOnKeyListener(this);
        if (dVar == null && this.f7624H && c2280e.m9541z() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(AbstractC5526g.f21090l, (ViewGroup) listViewMo9457k, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(c2280e.m9541z());
            listViewMo9457k.addHeaderView(frameLayout, null, false);
            c2334uM9446B.mo9454b();
        }
    }

    @Override // p295m.InterfaceC6318e
    /* JADX INFO: renamed from: a */
    public boolean mo9453a() {
        return this.f7636t.size() > 0 && ((d) this.f7636t.get(0)).f7650a.mo9453a();
    }

    @Override // p295m.InterfaceC6318e
    /* JADX INFO: renamed from: b */
    public void mo9454b() {
        if (mo9453a()) {
            return;
        }
        Iterator it = this.f7635s.iterator();
        while (it.hasNext()) {
            m9452H((C2280e) it.next());
        }
        this.f7635s.clear();
        View view = this.f7642z;
        this.f7617A = view;
        if (view != null) {
            boolean z7 = this.f7626J == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f7626J = viewTreeObserver;
            if (z7) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f7637u);
            }
            this.f7617A.addOnAttachStateChangeListener(this.f7638v);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC2285j
    /* JADX INFO: renamed from: c */
    public void mo9432c(C2280e c2280e, boolean z7) {
        int iM9447C = m9447C(c2280e);
        if (iM9447C < 0) {
            return;
        }
        int i7 = iM9447C + 1;
        if (i7 < this.f7636t.size()) {
            ((d) this.f7636t.get(i7)).f7651b.m9522e(false);
        }
        d dVar = (d) this.f7636t.remove(iM9447C);
        dVar.f7651b.m9506R(this);
        if (this.f7628L) {
            dVar.f7650a.m9937T(null);
            dVar.f7650a.m9832E(0);
        }
        dVar.f7650a.dismiss();
        int size = this.f7636t.size();
        if (size > 0) {
            this.f7618B = ((d) this.f7636t.get(size - 1)).f7652c;
        } else {
            this.f7618B = m9450F();
        }
        if (size != 0) {
            if (z7) {
                ((d) this.f7636t.get(0)).f7651b.m9522e(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC2285j.a aVar = this.f7625I;
        if (aVar != null) {
            aVar.mo9249c(c2280e, true);
        }
        ViewTreeObserver viewTreeObserver = this.f7626J;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f7626J.removeGlobalOnLayoutListener(this.f7637u);
            }
            this.f7626J = null;
        }
        this.f7617A.removeOnAttachStateChangeListener(this.f7638v);
        this.f7627K.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC2285j
    /* JADX INFO: renamed from: d */
    public void mo9433d(boolean z7) {
        Iterator it = this.f7636t.iterator();
        while (it.hasNext()) {
            AbstractC2283h.m9570A(((d) it.next()).m9470a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // p295m.InterfaceC6318e
    public void dismiss() {
        int size = this.f7636t.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f7636t.toArray(new d[size]);
            for (int i7 = size - 1; i7 >= 0; i7--) {
                d dVar = dVarArr[i7];
                if (dVar.f7650a.mo9453a()) {
                    dVar.f7650a.dismiss();
                }
            }
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
        this.f7625I = aVar;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC2285j
    /* JADX INFO: renamed from: j */
    public void mo9456j(Parcelable parcelable) {
    }

    @Override // p295m.InterfaceC6318e
    /* JADX INFO: renamed from: k */
    public ListView mo9457k() {
        if (this.f7636t.isEmpty()) {
            return null;
        }
        List list = this.f7636t;
        return ((d) list.get(list.size() - 1)).m9470a();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC2285j
    /* JADX INFO: renamed from: l */
    public boolean mo9439l(SubMenuC2288m subMenuC2288m) {
        for (d dVar : this.f7636t) {
            if (subMenuC2288m == dVar.f7651b) {
                dVar.m9470a().requestFocus();
                return true;
            }
        }
        if (!subMenuC2288m.hasVisibleItems()) {
            return false;
        }
        mo9459n(subMenuC2288m);
        InterfaceC2285j.a aVar = this.f7625I;
        if (aVar != null) {
            aVar.mo9250d(subMenuC2288m);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC2285j
    /* JADX INFO: renamed from: m */
    public Parcelable mo9458m() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.AbstractC2283h
    /* JADX INFO: renamed from: n */
    public void mo9459n(C2280e c2280e) {
        c2280e.m9518c(this, this.f7629b);
        if (mo9453a()) {
            m9452H(c2280e);
        } else {
            this.f7635s.add(c2280e);
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC2283h
    /* JADX INFO: renamed from: o */
    protected boolean mo9460o() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f7636t.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                dVar = null;
                break;
            }
            dVar = (d) this.f7636t.get(i7);
            if (!dVar.f7650a.mo9453a()) {
                break;
            } else {
                i7++;
            }
        }
        if (dVar != null) {
            dVar.f7651b.m9522e(false);
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
        if (this.f7642z != view) {
            this.f7642z = view;
            this.f7641y = AbstractC1074t.m4771b(this.f7640x, view.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC2283h
    /* JADX INFO: renamed from: t */
    public void mo9462t(boolean z7) {
        this.f7623G = z7;
    }

    @Override // androidx.appcompat.view.menu.AbstractC2283h
    /* JADX INFO: renamed from: u */
    public void mo9463u(int i7) {
        if (this.f7640x != i7) {
            this.f7640x = i7;
            this.f7641y = AbstractC1074t.m4771b(i7, this.f7642z.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC2283h
    /* JADX INFO: renamed from: v */
    public void mo9464v(int i7) {
        this.f7619C = true;
        this.f7621E = i7;
    }

    @Override // androidx.appcompat.view.menu.AbstractC2283h
    /* JADX INFO: renamed from: w */
    public void mo9465w(PopupWindow.OnDismissListener onDismissListener) {
        this.f7627K = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.AbstractC2283h
    /* JADX INFO: renamed from: x */
    public void mo9466x(boolean z7) {
        this.f7624H = z7;
    }

    @Override // androidx.appcompat.view.menu.AbstractC2283h
    /* JADX INFO: renamed from: y */
    public void mo9467y(int i7) {
        this.f7620D = true;
        this.f7622F = i7;
    }
}
