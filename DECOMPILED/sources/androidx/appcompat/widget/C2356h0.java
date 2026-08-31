package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.C2280e;
import androidx.appcompat.view.menu.InterfaceC2285j;
import p111O.AbstractC1030Z;
import p111O.AbstractC1057k0;
import p111O.C1053i0;
import p255h.AbstractC5520a;
import p255h.AbstractC5524e;
import p255h.AbstractC5525f;
import p255h.AbstractC5527h;
import p255h.AbstractC5529j;
import p263i.AbstractC5659a;
import p295m.C6314a;

/* JADX INFO: renamed from: androidx.appcompat.widget.h0 */
/* JADX INFO: loaded from: classes.dex */
public class C2356h0 implements InterfaceC2310H {

    /* JADX INFO: renamed from: a */
    Toolbar f8244a;

    /* JADX INFO: renamed from: b */
    private int f8245b;

    /* JADX INFO: renamed from: c */
    private View f8246c;

    /* JADX INFO: renamed from: d */
    private View f8247d;

    /* JADX INFO: renamed from: e */
    private Drawable f8248e;

    /* JADX INFO: renamed from: f */
    private Drawable f8249f;

    /* JADX INFO: renamed from: g */
    private Drawable f8250g;

    /* JADX INFO: renamed from: h */
    private boolean f8251h;

    /* JADX INFO: renamed from: i */
    CharSequence f8252i;

    /* JADX INFO: renamed from: j */
    private CharSequence f8253j;

    /* JADX INFO: renamed from: k */
    private CharSequence f8254k;

    /* JADX INFO: renamed from: l */
    Window.Callback f8255l;

    /* JADX INFO: renamed from: m */
    boolean f8256m;

    /* JADX INFO: renamed from: n */
    private C2345c f8257n;

    /* JADX INFO: renamed from: o */
    private int f8258o;

    /* JADX INFO: renamed from: p */
    private int f8259p;

    /* JADX INFO: renamed from: q */
    private Drawable f8260q;

    /* JADX INFO: renamed from: androidx.appcompat.widget.h0$a */
    class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        final C6314a f8261a;

        a() {
            this.f8261a = new C6314a(C2356h0.this.f8244a.getContext(), 0, R.id.home, 0, 0, C2356h0.this.f8252i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C2356h0 c2356h0 = C2356h0.this;
            Window.Callback callback = c2356h0.f8255l;
            if (callback == null || !c2356h0.f8256m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f8261a);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.h0$b */
    class b extends AbstractC1057k0 {

        /* JADX INFO: renamed from: a */
        private boolean f8263a = false;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f8264b;

        b(int i7) {
            this.f8264b = i7;
        }

        @Override // p111O.AbstractC1057k0, p111O.InterfaceC1055j0
        /* JADX INFO: renamed from: a */
        public void mo4695a(View view) {
            this.f8263a = true;
        }

        @Override // p111O.InterfaceC1055j0
        /* JADX INFO: renamed from: b */
        public void mo4696b(View view) {
            if (this.f8263a) {
                return;
            }
            C2356h0.this.f8244a.setVisibility(this.f8264b);
        }

        @Override // p111O.AbstractC1057k0, p111O.InterfaceC1055j0
        /* JADX INFO: renamed from: c */
        public void mo4697c(View view) {
            C2356h0.this.f8244a.setVisibility(0);
        }
    }

    public C2356h0(Toolbar toolbar, boolean z7) {
        this(toolbar, z7, AbstractC5527h.f21096a, AbstractC5524e.f21035n);
    }

    /* JADX INFO: renamed from: D */
    private void m10065D(CharSequence charSequence) {
        this.f8252i = charSequence;
        if ((this.f8245b & 8) != 0) {
            this.f8244a.setTitle(charSequence);
            if (this.f8251h) {
                AbstractC1030Z.m4478l0(this.f8244a.getRootView(), charSequence);
            }
        }
    }

    /* JADX INFO: renamed from: E */
    private void m10066E() {
        if ((this.f8245b & 4) != 0) {
            if (TextUtils.isEmpty(this.f8254k)) {
                this.f8244a.setNavigationContentDescription(this.f8259p);
            } else {
                this.f8244a.setNavigationContentDescription(this.f8254k);
            }
        }
    }

    /* JADX INFO: renamed from: F */
    private void m10067F() {
        if ((this.f8245b & 4) == 0) {
            this.f8244a.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.f8244a;
        Drawable drawable = this.f8250g;
        if (drawable == null) {
            drawable = this.f8260q;
        }
        toolbar.setNavigationIcon(drawable);
    }

    /* JADX INFO: renamed from: G */
    private void m10068G() {
        Drawable drawable;
        int i7 = this.f8245b;
        if ((i7 & 2) == 0) {
            drawable = null;
        } else if ((i7 & 1) == 0 || (drawable = this.f8249f) == null) {
            drawable = this.f8248e;
        }
        this.f8244a.setLogo(drawable);
    }

    /* JADX INFO: renamed from: u */
    private int m10069u() {
        if (this.f8244a.getNavigationIcon() == null) {
            return 11;
        }
        this.f8260q = this.f8244a.getNavigationIcon();
        return 15;
    }

    /* JADX INFO: renamed from: A */
    public void m10070A(Drawable drawable) {
        this.f8250g = drawable;
        m10067F();
    }

    /* JADX INFO: renamed from: B */
    public void m10071B(CharSequence charSequence) {
        this.f8253j = charSequence;
        if ((this.f8245b & 8) != 0) {
            this.f8244a.setSubtitle(charSequence);
        }
    }

    /* JADX INFO: renamed from: C */
    public void m10072C(CharSequence charSequence) {
        this.f8251h = true;
        m10065D(charSequence);
    }

    @Override // androidx.appcompat.widget.InterfaceC2310H
    /* JADX INFO: renamed from: a */
    public void mo9743a(Menu menu, InterfaceC2285j.a aVar) {
        if (this.f8257n == null) {
            C2345c c2345c = new C2345c(this.f8244a.getContext());
            this.f8257n = c2345c;
            c2345c.m9444r(AbstractC5525f.f21059g);
        }
        this.f8257n.mo9436h(aVar);
        this.f8244a.m9912M((C2280e) menu, this.f8257n);
    }

    @Override // androidx.appcompat.widget.InterfaceC2310H
    /* JADX INFO: renamed from: b */
    public boolean mo9744b() {
        return this.f8244a.m9909D();
    }

    @Override // androidx.appcompat.widget.InterfaceC2310H
    /* JADX INFO: renamed from: c */
    public void mo9745c() {
        this.f8256m = true;
    }

    @Override // androidx.appcompat.widget.InterfaceC2310H
    public void collapseActionView() {
        this.f8244a.m9919f();
    }

    @Override // androidx.appcompat.widget.InterfaceC2310H
    /* JADX INFO: renamed from: d */
    public boolean mo9746d() {
        return this.f8244a.m9918d();
    }

    @Override // androidx.appcompat.widget.InterfaceC2310H
    /* JADX INFO: renamed from: e */
    public boolean mo9747e() {
        return this.f8244a.m9908C();
    }

    @Override // androidx.appcompat.widget.InterfaceC2310H
    /* JADX INFO: renamed from: f */
    public boolean mo9748f() {
        return this.f8244a.m9926y();
    }

    @Override // androidx.appcompat.widget.InterfaceC2310H
    /* JADX INFO: renamed from: g */
    public boolean mo9749g() {
        return this.f8244a.m9915R();
    }

    @Override // androidx.appcompat.widget.InterfaceC2310H
    public Context getContext() {
        return this.f8244a.getContext();
    }

    @Override // androidx.appcompat.widget.InterfaceC2310H
    public CharSequence getTitle() {
        return this.f8244a.getTitle();
    }

    @Override // androidx.appcompat.widget.InterfaceC2310H
    /* JADX INFO: renamed from: h */
    public void mo9750h() {
        this.f8244a.m9920g();
    }

    @Override // androidx.appcompat.widget.InterfaceC2310H
    /* JADX INFO: renamed from: i */
    public void mo9751i(AbstractC2339Y abstractC2339Y) {
        View view = this.f8246c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f8244a;
            if (parent == toolbar) {
                toolbar.removeView(this.f8246c);
            }
        }
        this.f8246c = abstractC2339Y;
    }

    @Override // androidx.appcompat.widget.InterfaceC2310H
    /* JADX INFO: renamed from: j */
    public boolean mo9752j() {
        return this.f8244a.m9925x();
    }

    @Override // androidx.appcompat.widget.InterfaceC2310H
    /* JADX INFO: renamed from: k */
    public void mo9753k(int i7) {
        View view;
        int i8 = this.f8245b ^ i7;
        this.f8245b = i7;
        if (i8 != 0) {
            if ((i8 & 4) != 0) {
                if ((i7 & 4) != 0) {
                    m10066E();
                }
                m10067F();
            }
            if ((i8 & 3) != 0) {
                m10068G();
            }
            if ((i8 & 8) != 0) {
                if ((i7 & 8) != 0) {
                    this.f8244a.setTitle(this.f8252i);
                    this.f8244a.setSubtitle(this.f8253j);
                } else {
                    this.f8244a.setTitle((CharSequence) null);
                    this.f8244a.setSubtitle((CharSequence) null);
                }
            }
            if ((i8 & 16) == 0 || (view = this.f8247d) == null) {
                return;
            }
            if ((i7 & 16) != 0) {
                this.f8244a.addView(view);
            } else {
                this.f8244a.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC2310H
    /* JADX INFO: renamed from: l */
    public void mo9754l(int i7) {
        m10075x(i7 != 0 ? AbstractC5659a.m25175b(getContext(), i7) : null);
    }

    @Override // androidx.appcompat.widget.InterfaceC2310H
    /* JADX INFO: renamed from: m */
    public int mo9755m() {
        return this.f8258o;
    }

    @Override // androidx.appcompat.widget.InterfaceC2310H
    /* JADX INFO: renamed from: n */
    public C1053i0 mo9756n(int i7, long j7) {
        return AbstractC1030Z.m4463e(this.f8244a).m4684b(i7 == 0 ? 1.0f : 0.0f).m4687e(j7).m4689g(new b(i7));
    }

    @Override // androidx.appcompat.widget.InterfaceC2310H
    /* JADX INFO: renamed from: o */
    public void mo9757o(int i7) {
        this.f8244a.setVisibility(i7);
    }

    @Override // androidx.appcompat.widget.InterfaceC2310H
    /* JADX INFO: renamed from: p */
    public void mo9758p(boolean z7) {
    }

    @Override // androidx.appcompat.widget.InterfaceC2310H
    /* JADX INFO: renamed from: q */
    public int mo9759q() {
        return this.f8245b;
    }

    @Override // androidx.appcompat.widget.InterfaceC2310H
    /* JADX INFO: renamed from: r */
    public void mo9760r() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.InterfaceC2310H
    /* JADX INFO: renamed from: s */
    public void mo9761s() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.InterfaceC2310H
    public void setIcon(int i7) {
        setIcon(i7 != 0 ? AbstractC5659a.m25175b(getContext(), i7) : null);
    }

    @Override // androidx.appcompat.widget.InterfaceC2310H
    public void setWindowCallback(Window.Callback callback) {
        this.f8255l = callback;
    }

    @Override // androidx.appcompat.widget.InterfaceC2310H
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f8251h) {
            return;
        }
        m10065D(charSequence);
    }

    @Override // androidx.appcompat.widget.InterfaceC2310H
    /* JADX INFO: renamed from: t */
    public void mo9762t(boolean z7) {
        this.f8244a.setCollapsible(z7);
    }

    /* JADX INFO: renamed from: v */
    public void m10073v(View view) {
        View view2 = this.f8247d;
        if (view2 != null && (this.f8245b & 16) != 0) {
            this.f8244a.removeView(view2);
        }
        this.f8247d = view;
        if (view == null || (this.f8245b & 16) == 0) {
            return;
        }
        this.f8244a.addView(view);
    }

    /* JADX INFO: renamed from: w */
    public void m10074w(int i7) {
        if (i7 == this.f8259p) {
            return;
        }
        this.f8259p = i7;
        if (TextUtils.isEmpty(this.f8244a.getNavigationContentDescription())) {
            m10076y(this.f8259p);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m10075x(Drawable drawable) {
        this.f8249f = drawable;
        m10068G();
    }

    /* JADX INFO: renamed from: y */
    public void m10076y(int i7) {
        m10077z(i7 == 0 ? null : getContext().getString(i7));
    }

    /* JADX INFO: renamed from: z */
    public void m10077z(CharSequence charSequence) {
        this.f8254k = charSequence;
        m10066E();
    }

    public C2356h0(Toolbar toolbar, boolean z7, int i7, int i8) {
        Drawable drawable;
        this.f8258o = 0;
        this.f8259p = 0;
        this.f8244a = toolbar;
        this.f8252i = toolbar.getTitle();
        this.f8253j = toolbar.getSubtitle();
        this.f8251h = this.f8252i != null;
        this.f8250g = toolbar.getNavigationIcon();
        C2348d0 c2348d0M10025v = C2348d0.m10025v(toolbar.getContext(), null, AbstractC5529j.f21225a, AbstractC5520a.f20965c, 0);
        this.f8260q = c2348d0M10025v.m10032g(AbstractC5529j.f21280l);
        if (z7) {
            CharSequence charSequenceM10041p = c2348d0M10025v.m10041p(AbstractC5529j.f21310r);
            if (!TextUtils.isEmpty(charSequenceM10041p)) {
                m10072C(charSequenceM10041p);
            }
            CharSequence charSequenceM10041p2 = c2348d0M10025v.m10041p(AbstractC5529j.f21300p);
            if (!TextUtils.isEmpty(charSequenceM10041p2)) {
                m10071B(charSequenceM10041p2);
            }
            Drawable drawableM10032g = c2348d0M10025v.m10032g(AbstractC5529j.f21290n);
            if (drawableM10032g != null) {
                m10075x(drawableM10032g);
            }
            Drawable drawableM10032g2 = c2348d0M10025v.m10032g(AbstractC5529j.f21285m);
            if (drawableM10032g2 != null) {
                setIcon(drawableM10032g2);
            }
            if (this.f8250g == null && (drawable = this.f8260q) != null) {
                m10070A(drawable);
            }
            mo9753k(c2348d0M10025v.m10036k(AbstractC5529j.f21260h, 0));
            int iM10039n = c2348d0M10025v.m10039n(AbstractC5529j.f21255g, 0);
            if (iM10039n != 0) {
                m10073v(LayoutInflater.from(this.f8244a.getContext()).inflate(iM10039n, (ViewGroup) this.f8244a, false));
                mo9753k(this.f8245b | 16);
            }
            int iM10038m = c2348d0M10025v.m10038m(AbstractC5529j.f21270j, 0);
            if (iM10038m > 0) {
                ViewGroup.LayoutParams layoutParams = this.f8244a.getLayoutParams();
                layoutParams.height = iM10038m;
                this.f8244a.setLayoutParams(layoutParams);
            }
            int iM10030e = c2348d0M10025v.m10030e(AbstractC5529j.f21250f, -1);
            int iM10030e2 = c2348d0M10025v.m10030e(AbstractC5529j.f21245e, -1);
            if (iM10030e >= 0 || iM10030e2 >= 0) {
                this.f8244a.m9911L(Math.max(iM10030e, 0), Math.max(iM10030e2, 0));
            }
            int iM10039n2 = c2348d0M10025v.m10039n(AbstractC5529j.f21315s, 0);
            if (iM10039n2 != 0) {
                Toolbar toolbar2 = this.f8244a;
                toolbar2.m9914O(toolbar2.getContext(), iM10039n2);
            }
            int iM10039n3 = c2348d0M10025v.m10039n(AbstractC5529j.f21305q, 0);
            if (iM10039n3 != 0) {
                Toolbar toolbar3 = this.f8244a;
                toolbar3.m9913N(toolbar3.getContext(), iM10039n3);
            }
            int iM10039n4 = c2348d0M10025v.m10039n(AbstractC5529j.f21295o, 0);
            if (iM10039n4 != 0) {
                this.f8244a.setPopupTheme(iM10039n4);
            }
        } else {
            this.f8245b = m10069u();
        }
        c2348d0M10025v.m10046x();
        m10074w(i7);
        this.f8254k = this.f8244a.getNavigationContentDescription();
        this.f8244a.setNavigationOnClickListener(new a());
    }

    @Override // androidx.appcompat.widget.InterfaceC2310H
    public void setIcon(Drawable drawable) {
        this.f8248e = drawable;
        m10068G();
    }
}
