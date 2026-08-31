package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.view.AbstractC2266b;
import androidx.appcompat.view.C2265a;
import androidx.appcompat.view.C2271g;
import androidx.appcompat.view.C2272h;
import androidx.appcompat.view.menu.C2280e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.InterfaceC2310H;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p111O.AbstractC1030Z;
import p111O.AbstractC1057k0;
import p111O.C1053i0;
import p111O.InterfaceC1055j0;
import p111O.InterfaceC1059l0;
import p255h.AbstractC5520a;
import p255h.AbstractC5525f;
import p255h.AbstractC5529j;

/* JADX INFO: renamed from: androidx.appcompat.app.y */
/* JADX INFO: loaded from: classes.dex */
public class C2264y extends AbstractC2240a implements ActionBarOverlayLayout.InterfaceC2295d {

    /* JADX INFO: renamed from: D */
    private static final Interpolator f7462D = new AccelerateInterpolator();

    /* JADX INFO: renamed from: E */
    private static final Interpolator f7463E = new DecelerateInterpolator();

    /* JADX INFO: renamed from: a */
    Context f7467a;

    /* JADX INFO: renamed from: b */
    private Context f7468b;

    /* JADX INFO: renamed from: c */
    private Activity f7469c;

    /* JADX INFO: renamed from: d */
    ActionBarOverlayLayout f7470d;

    /* JADX INFO: renamed from: e */
    ActionBarContainer f7471e;

    /* JADX INFO: renamed from: f */
    InterfaceC2310H f7472f;

    /* JADX INFO: renamed from: g */
    ActionBarContextView f7473g;

    /* JADX INFO: renamed from: h */
    View f7474h;

    /* JADX INFO: renamed from: k */
    private boolean f7477k;

    /* JADX INFO: renamed from: l */
    d f7478l;

    /* JADX INFO: renamed from: m */
    AbstractC2266b f7479m;

    /* JADX INFO: renamed from: n */
    AbstractC2266b.a f7480n;

    /* JADX INFO: renamed from: o */
    private boolean f7481o;

    /* JADX INFO: renamed from: q */
    private boolean f7483q;

    /* JADX INFO: renamed from: t */
    boolean f7486t;

    /* JADX INFO: renamed from: u */
    boolean f7487u;

    /* JADX INFO: renamed from: v */
    private boolean f7488v;

    /* JADX INFO: renamed from: x */
    C2272h f7490x;

    /* JADX INFO: renamed from: y */
    private boolean f7491y;

    /* JADX INFO: renamed from: z */
    boolean f7492z;

    /* JADX INFO: renamed from: i */
    private ArrayList f7475i = new ArrayList();

    /* JADX INFO: renamed from: j */
    private int f7476j = -1;

    /* JADX INFO: renamed from: p */
    private ArrayList f7482p = new ArrayList();

    /* JADX INFO: renamed from: r */
    private int f7484r = 0;

    /* JADX INFO: renamed from: s */
    boolean f7485s = true;

    /* JADX INFO: renamed from: w */
    private boolean f7489w = true;

    /* JADX INFO: renamed from: A */
    final InterfaceC1055j0 f7464A = new a();

    /* JADX INFO: renamed from: B */
    final InterfaceC1055j0 f7465B = new b();

    /* JADX INFO: renamed from: C */
    final InterfaceC1059l0 f7466C = new c();

    /* JADX INFO: renamed from: androidx.appcompat.app.y$a */
    class a extends AbstractC1057k0 {
        a() {
        }

        @Override // p111O.InterfaceC1055j0
        /* JADX INFO: renamed from: b */
        public void mo4696b(View view) {
            View view2;
            C2264y c2264y = C2264y.this;
            if (c2264y.f7485s && (view2 = c2264y.f7474h) != null) {
                view2.setTranslationY(0.0f);
                C2264y.this.f7471e.setTranslationY(0.0f);
            }
            C2264y.this.f7471e.setVisibility(8);
            C2264y.this.f7471e.setTransitioning(false);
            C2264y c2264y2 = C2264y.this;
            c2264y2.f7490x = null;
            c2264y2.m9349w();
            ActionBarOverlayLayout actionBarOverlayLayout = C2264y.this.f7470d;
            if (actionBarOverlayLayout != null) {
                AbstractC1030Z.m4468g0(actionBarOverlayLayout);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.y$b */
    class b extends AbstractC1057k0 {
        b() {
        }

        @Override // p111O.InterfaceC1055j0
        /* JADX INFO: renamed from: b */
        public void mo4696b(View view) {
            C2264y c2264y = C2264y.this;
            c2264y.f7490x = null;
            c2264y.f7471e.requestLayout();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.y$c */
    class c implements InterfaceC1059l0 {
        c() {
        }

        @Override // p111O.InterfaceC1059l0
        /* JADX INFO: renamed from: a */
        public void mo4700a(View view) {
            ((View) C2264y.this.f7471e.getParent()).invalidate();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.y$d */
    public class d extends AbstractC2266b implements C2280e.a {

        /* JADX INFO: renamed from: c */
        private final Context f7496c;

        /* JADX INFO: renamed from: d */
        private final C2280e f7497d;

        /* JADX INFO: renamed from: e */
        private AbstractC2266b.a f7498e;

        /* JADX INFO: renamed from: f */
        private WeakReference f7499f;

        public d(Context context, AbstractC2266b.a aVar) {
            this.f7496c = context;
            this.f7498e = aVar;
            C2280e c2280eM9512X = new C2280e(context).m9512X(1);
            this.f7497d = c2280eM9512X;
            c2280eM9512X.mo9511W(this);
        }

        @Override // androidx.appcompat.view.menu.C2280e.a
        /* JADX INFO: renamed from: a */
        public boolean mo9231a(C2280e c2280e, MenuItem menuItem) {
            AbstractC2266b.a aVar = this.f7498e;
            if (aVar != null) {
                return aVar.mo9254d(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.C2280e.a
        /* JADX INFO: renamed from: b */
        public void mo9233b(C2280e c2280e) {
            if (this.f7498e == null) {
                return;
            }
            mo9358k();
            C2264y.this.f7473g.m9636l();
        }

        @Override // androidx.appcompat.view.AbstractC2266b
        /* JADX INFO: renamed from: c */
        public void mo9352c() {
            C2264y c2264y = C2264y.this;
            if (c2264y.f7478l != this) {
                return;
            }
            if (C2264y.m9335v(c2264y.f7486t, c2264y.f7487u, false)) {
                this.f7498e.mo9251a(this);
            } else {
                C2264y c2264y2 = C2264y.this;
                c2264y2.f7479m = this;
                c2264y2.f7480n = this.f7498e;
            }
            this.f7498e = null;
            C2264y.this.m9348u(false);
            C2264y.this.f7473g.m9632g();
            C2264y c2264y3 = C2264y.this;
            c2264y3.f7470d.setHideOnContentScrollEnabled(c2264y3.f7492z);
            C2264y.this.f7478l = null;
        }

        @Override // androidx.appcompat.view.AbstractC2266b
        /* JADX INFO: renamed from: d */
        public View mo9353d() {
            WeakReference weakReference = this.f7499f;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        @Override // androidx.appcompat.view.AbstractC2266b
        /* JADX INFO: renamed from: e */
        public Menu mo9354e() {
            return this.f7497d;
        }

        @Override // androidx.appcompat.view.AbstractC2266b
        /* JADX INFO: renamed from: f */
        public MenuInflater mo9355f() {
            return new C2271g(this.f7496c);
        }

        @Override // androidx.appcompat.view.AbstractC2266b
        /* JADX INFO: renamed from: g */
        public CharSequence mo9356g() {
            return C2264y.this.f7473g.getSubtitle();
        }

        @Override // androidx.appcompat.view.AbstractC2266b
        /* JADX INFO: renamed from: i */
        public CharSequence mo9357i() {
            return C2264y.this.f7473g.getTitle();
        }

        @Override // androidx.appcompat.view.AbstractC2266b
        /* JADX INFO: renamed from: k */
        public void mo9358k() {
            if (C2264y.this.f7478l != this) {
                return;
            }
            this.f7497d.m9528i0();
            try {
                this.f7498e.mo9253c(this, this.f7497d);
            } finally {
                this.f7497d.m9527h0();
            }
        }

        @Override // androidx.appcompat.view.AbstractC2266b
        /* JADX INFO: renamed from: l */
        public boolean mo9359l() {
            return C2264y.this.f7473g.m9634j();
        }

        @Override // androidx.appcompat.view.AbstractC2266b
        /* JADX INFO: renamed from: m */
        public void mo9360m(View view) {
            C2264y.this.f7473g.setCustomView(view);
            this.f7499f = new WeakReference(view);
        }

        @Override // androidx.appcompat.view.AbstractC2266b
        /* JADX INFO: renamed from: n */
        public void mo9361n(int i7) {
            mo9362o(C2264y.this.f7467a.getResources().getString(i7));
        }

        @Override // androidx.appcompat.view.AbstractC2266b
        /* JADX INFO: renamed from: o */
        public void mo9362o(CharSequence charSequence) {
            C2264y.this.f7473g.setSubtitle(charSequence);
        }

        @Override // androidx.appcompat.view.AbstractC2266b
        /* JADX INFO: renamed from: q */
        public void mo9363q(int i7) {
            mo9364r(C2264y.this.f7467a.getResources().getString(i7));
        }

        @Override // androidx.appcompat.view.AbstractC2266b
        /* JADX INFO: renamed from: r */
        public void mo9364r(CharSequence charSequence) {
            C2264y.this.f7473g.setTitle(charSequence);
        }

        @Override // androidx.appcompat.view.AbstractC2266b
        /* JADX INFO: renamed from: s */
        public void mo9365s(boolean z7) {
            super.mo9365s(z7);
            C2264y.this.f7473g.setTitleOptional(z7);
        }

        /* JADX INFO: renamed from: t */
        public boolean m9366t() {
            this.f7497d.m9528i0();
            try {
                return this.f7498e.mo9252b(this, this.f7497d);
            } finally {
                this.f7497d.m9527h0();
            }
        }
    }

    public C2264y(Activity activity, boolean z7) {
        this.f7469c = activity;
        View decorView = activity.getWindow().getDecorView();
        m9330C(decorView);
        if (z7) {
            return;
        }
        this.f7474h = decorView.findViewById(R.id.content);
    }

    /* JADX INFO: renamed from: B */
    private void m9329B() {
        if (this.f7488v) {
            this.f7488v = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f7470d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            m9334L(false);
        }
    }

    /* JADX INFO: renamed from: C */
    private void m9330C(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(AbstractC5525f.f21068p);
        this.f7470d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f7472f = m9336z(view.findViewById(AbstractC5525f.f21053a));
        this.f7473g = (ActionBarContextView) view.findViewById(AbstractC5525f.f21058f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(AbstractC5525f.f21055c);
        this.f7471e = actionBarContainer;
        InterfaceC2310H interfaceC2310H = this.f7472f;
        if (interfaceC2310H == null || this.f7473g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f7467a = interfaceC2310H.getContext();
        boolean z7 = (this.f7472f.mo9759q() & 4) != 0;
        if (z7) {
            this.f7477k = true;
        }
        C2265a c2265aM9367b = C2265a.m9367b(this.f7467a);
        m9342I(c2265aM9367b.m9368a() || z7);
        m9331G(c2265aM9367b.m9371e());
        TypedArray typedArrayObtainStyledAttributes = this.f7467a.obtainStyledAttributes(null, AbstractC5529j.f21225a, AbstractC5520a.f20965c, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(AbstractC5529j.f21275k, false)) {
            m9341H(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC5529j.f21265i, 0);
        if (dimensionPixelSize != 0) {
            m9340F(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: G */
    private void m9331G(boolean z7) {
        this.f7483q = z7;
        if (z7) {
            this.f7471e.setTabContainer(null);
            this.f7472f.mo9751i(null);
        } else {
            this.f7472f.mo9751i(null);
            this.f7471e.setTabContainer(null);
        }
        boolean z8 = false;
        boolean z9 = m9337A() == 2;
        this.f7472f.mo9762t(!this.f7483q && z9);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f7470d;
        if (!this.f7483q && z9) {
            z8 = true;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z8);
    }

    /* JADX INFO: renamed from: J */
    private boolean m9332J() {
        return this.f7471e.isLaidOut();
    }

    /* JADX INFO: renamed from: K */
    private void m9333K() {
        if (this.f7488v) {
            return;
        }
        this.f7488v = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f7470d;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        m9334L(false);
    }

    /* JADX INFO: renamed from: L */
    private void m9334L(boolean z7) {
        if (m9335v(this.f7486t, this.f7487u, this.f7488v)) {
            if (this.f7489w) {
                return;
            }
            this.f7489w = true;
            m9351y(z7);
            return;
        }
        if (this.f7489w) {
            this.f7489w = false;
            m9350x(z7);
        }
    }

    /* JADX INFO: renamed from: v */
    static boolean m9335v(boolean z7, boolean z8, boolean z9) {
        if (z9) {
            return true;
        }
        return (z7 || z8) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    private InterfaceC2310H m9336z(View view) {
        if (view instanceof InterfaceC2310H) {
            return (InterfaceC2310H) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: renamed from: A */
    public int m9337A() {
        return this.f7472f.mo9755m();
    }

    /* JADX INFO: renamed from: D */
    public void m9338D(boolean z7) {
        m9339E(z7 ? 4 : 0, 4);
    }

    /* JADX INFO: renamed from: E */
    public void m9339E(int i7, int i8) {
        int iMo9759q = this.f7472f.mo9759q();
        if ((i8 & 4) != 0) {
            this.f7477k = true;
        }
        this.f7472f.mo9753k((i7 & i8) | ((~i8) & iMo9759q));
    }

    /* JADX INFO: renamed from: F */
    public void m9340F(float f7) {
        AbstractC1030Z.m4486p0(this.f7471e, f7);
    }

    /* JADX INFO: renamed from: H */
    public void m9341H(boolean z7) {
        if (z7 && !this.f7470d.m9659x()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.f7492z = z7;
        this.f7470d.setHideOnContentScrollEnabled(z7);
    }

    /* JADX INFO: renamed from: I */
    public void m9342I(boolean z7) {
        this.f7472f.mo9758p(z7);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC2295d
    /* JADX INFO: renamed from: a */
    public void mo9343a() {
        if (this.f7487u) {
            this.f7487u = false;
            m9334L(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC2295d
    /* JADX INFO: renamed from: b */
    public void mo9344b() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC2295d
    /* JADX INFO: renamed from: c */
    public void mo9345c(boolean z7) {
        this.f7485s = z7;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC2295d
    /* JADX INFO: renamed from: d */
    public void mo9346d() {
        if (this.f7487u) {
            return;
        }
        this.f7487u = true;
        m9334L(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC2295d
    /* JADX INFO: renamed from: e */
    public void mo9347e() {
        C2272h c2272h = this.f7490x;
        if (c2272h != null) {
            c2272h.m9398a();
            this.f7490x = null;
        }
    }

    @Override // androidx.appcompat.app.AbstractC2240a
    /* JADX INFO: renamed from: g */
    public boolean mo9081g() {
        InterfaceC2310H interfaceC2310H = this.f7472f;
        if (interfaceC2310H == null || !interfaceC2310H.mo9752j()) {
            return false;
        }
        this.f7472f.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC2240a
    /* JADX INFO: renamed from: h */
    public void mo9082h(boolean z7) {
        if (z7 == this.f7481o) {
            return;
        }
        this.f7481o = z7;
        if (this.f7482p.size() <= 0) {
            return;
        }
        AbstractC2263x.m9328a(this.f7482p.get(0));
        throw null;
    }

    @Override // androidx.appcompat.app.AbstractC2240a
    /* JADX INFO: renamed from: i */
    public int mo9083i() {
        return this.f7472f.mo9759q();
    }

    @Override // androidx.appcompat.app.AbstractC2240a
    /* JADX INFO: renamed from: j */
    public Context mo9084j() {
        if (this.f7468b == null) {
            TypedValue typedValue = new TypedValue();
            this.f7467a.getTheme().resolveAttribute(AbstractC5520a.f20967e, typedValue, true);
            int i7 = typedValue.resourceId;
            if (i7 != 0) {
                this.f7468b = new ContextThemeWrapper(this.f7467a, i7);
            } else {
                this.f7468b = this.f7467a;
            }
        }
        return this.f7468b;
    }

    @Override // androidx.appcompat.app.AbstractC2240a
    /* JADX INFO: renamed from: l */
    public void mo9086l(Configuration configuration) {
        m9331G(C2265a.m9367b(this.f7467a).m9371e());
    }

    @Override // androidx.appcompat.app.AbstractC2240a
    /* JADX INFO: renamed from: n */
    public boolean mo9088n(int i7, KeyEvent keyEvent) {
        Menu menuMo9354e;
        d dVar = this.f7478l;
        if (dVar == null || (menuMo9354e = dVar.mo9354e()) == null) {
            return false;
        }
        menuMo9354e.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuMo9354e.performShortcut(i7, keyEvent, 0);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC2295d
    public void onWindowVisibilityChanged(int i7) {
        this.f7484r = i7;
    }

    @Override // androidx.appcompat.app.AbstractC2240a
    /* JADX INFO: renamed from: q */
    public void mo9091q(boolean z7) {
        if (this.f7477k) {
            return;
        }
        m9338D(z7);
    }

    @Override // androidx.appcompat.app.AbstractC2240a
    /* JADX INFO: renamed from: r */
    public void mo9092r(boolean z7) {
        C2272h c2272h;
        this.f7491y = z7;
        if (z7 || (c2272h = this.f7490x) == null) {
            return;
        }
        c2272h.m9398a();
    }

    @Override // androidx.appcompat.app.AbstractC2240a
    /* JADX INFO: renamed from: s */
    public void mo9093s(CharSequence charSequence) {
        this.f7472f.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC2240a
    /* JADX INFO: renamed from: t */
    public AbstractC2266b mo9094t(AbstractC2266b.a aVar) {
        d dVar = this.f7478l;
        if (dVar != null) {
            dVar.mo9352c();
        }
        this.f7470d.setHideOnContentScrollEnabled(false);
        this.f7473g.m9635k();
        d dVar2 = new d(this.f7473g.getContext(), aVar);
        if (!dVar2.m9366t()) {
            return null;
        }
        this.f7478l = dVar2;
        dVar2.mo9358k();
        this.f7473g.m9633h(dVar2);
        m9348u(true);
        return dVar2;
    }

    /* JADX INFO: renamed from: u */
    public void m9348u(boolean z7) {
        C1053i0 c1053i0Mo9756n;
        C1053i0 c1053i0Mo9631f;
        if (z7) {
            m9333K();
        } else {
            m9329B();
        }
        if (!m9332J()) {
            if (z7) {
                this.f7472f.mo9757o(4);
                this.f7473g.setVisibility(0);
                return;
            } else {
                this.f7472f.mo9757o(0);
                this.f7473g.setVisibility(8);
                return;
            }
        }
        if (z7) {
            c1053i0Mo9631f = this.f7472f.mo9756n(4, 100L);
            c1053i0Mo9756n = this.f7473g.mo9631f(0, 200L);
        } else {
            c1053i0Mo9756n = this.f7472f.mo9756n(0, 200L);
            c1053i0Mo9631f = this.f7473g.mo9631f(8, 100L);
        }
        C2272h c2272h = new C2272h();
        c2272h.m9401d(c1053i0Mo9631f, c1053i0Mo9756n);
        c2272h.m9405h();
    }

    /* JADX INFO: renamed from: w */
    void m9349w() {
        AbstractC2266b.a aVar = this.f7480n;
        if (aVar != null) {
            aVar.mo9251a(this.f7479m);
            this.f7479m = null;
            this.f7480n = null;
        }
    }

    /* JADX INFO: renamed from: x */
    public void m9350x(boolean z7) {
        View view;
        C2272h c2272h = this.f7490x;
        if (c2272h != null) {
            c2272h.m9398a();
        }
        if (this.f7484r != 0 || (!this.f7491y && !z7)) {
            this.f7464A.mo4696b(null);
            return;
        }
        this.f7471e.setAlpha(1.0f);
        this.f7471e.setTransitioning(true);
        C2272h c2272h2 = new C2272h();
        float f7 = -this.f7471e.getHeight();
        if (z7) {
            int[] iArr = {0, 0};
            this.f7471e.getLocationInWindow(iArr);
            f7 -= iArr[1];
        }
        C1053i0 c1053i0M4693l = AbstractC1030Z.m4463e(this.f7471e).m4693l(f7);
        c1053i0M4693l.m4691j(this.f7466C);
        c2272h2.m9400c(c1053i0M4693l);
        if (this.f7485s && (view = this.f7474h) != null) {
            c2272h2.m9400c(AbstractC1030Z.m4463e(view).m4693l(f7));
        }
        c2272h2.m9403f(f7462D);
        c2272h2.m9402e(250L);
        c2272h2.m9404g(this.f7464A);
        this.f7490x = c2272h2;
        c2272h2.m9405h();
    }

    /* JADX INFO: renamed from: y */
    public void m9351y(boolean z7) {
        View view;
        View view2;
        C2272h c2272h = this.f7490x;
        if (c2272h != null) {
            c2272h.m9398a();
        }
        this.f7471e.setVisibility(0);
        if (this.f7484r == 0 && (this.f7491y || z7)) {
            this.f7471e.setTranslationY(0.0f);
            float f7 = -this.f7471e.getHeight();
            if (z7) {
                int[] iArr = {0, 0};
                this.f7471e.getLocationInWindow(iArr);
                f7 -= iArr[1];
            }
            this.f7471e.setTranslationY(f7);
            C2272h c2272h2 = new C2272h();
            C1053i0 c1053i0M4693l = AbstractC1030Z.m4463e(this.f7471e).m4693l(0.0f);
            c1053i0M4693l.m4691j(this.f7466C);
            c2272h2.m9400c(c1053i0M4693l);
            if (this.f7485s && (view2 = this.f7474h) != null) {
                view2.setTranslationY(f7);
                c2272h2.m9400c(AbstractC1030Z.m4463e(this.f7474h).m4693l(0.0f));
            }
            c2272h2.m9403f(f7463E);
            c2272h2.m9402e(250L);
            c2272h2.m9404g(this.f7465B);
            this.f7490x = c2272h2;
            c2272h2.m9405h();
        } else {
            this.f7471e.setAlpha(1.0f);
            this.f7471e.setTranslationY(0.0f);
            if (this.f7485s && (view = this.f7474h) != null) {
                view.setTranslationY(0.0f);
            }
            this.f7465B.mo4696b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f7470d;
        if (actionBarOverlayLayout != null) {
            AbstractC1030Z.m4468g0(actionBarOverlayLayout);
        }
    }

    public C2264y(Dialog dialog) {
        m9330C(dialog.getWindow().getDecorView());
    }
}
